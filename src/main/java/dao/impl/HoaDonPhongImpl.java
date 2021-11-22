package dao.impl;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;

import dao.AbstractDao;
import dao.HoaDonPhongDao;
import model.ChiTietDV;
import model.ChiTietHoaDonPhong;
import model.HoaDonPhong;
import model.KhachHang;
import utils.Ngay;

public class HoaDonPhongImpl  extends AbstractDao implements HoaDonPhongDao{

	private String error;


	public HoaDonPhongImpl() throws RemoteException {
		super();
	}

	@Override
	public List<model.HoaDonPhong> getListHoaDonPhong() {
		String sql = "select * from HoaDonPhong";
		return (List<HoaDonPhong>) getList(sql, HoaDonPhong.class);
	}

	@Override
	public List<model.HoaDonPhong> getListHoaDonPhongByDate(Date tuNgay, Date denNgay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.HoaDonPhong> getListHoaDonPhongByMaKH(int maKH) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.HoaDonPhong> getListHoaDonPhongByMaKH(int maKH, Date tuNgay, Date denNgay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int themHoaDonPhong(model.HoaDonPhong hdp) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			
			error = "";
			List<ChiTietHoaDonPhong> dscthdp = hdp.getDsChiTietHoaDonPhong();
			
			dscthdp.forEach(cthdp -> {
				String sql = "select * \r\n"
						+ "from HoaDonPhong as hdp\r\n"
						+ "inner join ChiTietHoaDonPhong as cthdp\r\n"
						+ "on hdp.maHD = cthdp.maHD\r\n"
						+ "where tinhTrang != 2 and hdp.maHD != "+ hdp.getMaHD() +" and maPhong like '"+ cthdp.getPhong().getMaPhong() +"' and not (ngayGioNhan > '"+ hdp.getNgayGioTra() +"' or ngayGioTra < '"+ hdp.getNgayGioNhan() +"')";

				int n = ((List<HoaDonPhong>) getList(sql, HoaDonPhong.class)).size();
				if(n > 0) {
					if(!error.equals("")) {
						error += ", ";
					}
					error += cthdp.getPhong().getMaPhong();
				}
					
			});
			if(!error.equals("")) {
				error = "Phòng: "+ error + " không trống trong thời điểm bạn chọn";
				return -1;
			}
			
			if(em.find(KhachHang.class, hdp.getKhachHang().getMaKH()) == null) {
//				kh
				em.persist(hdp.getKhachHang());
				em.flush();
			}
			
//			hdp
			
			em.persist(hdp);
			System.out.println(hdp.getMaHD());
//			thêm cthd
			
			em.clear();
			dscthdp.forEach(cthdp -> {
				cthdp.setHoaDonPhong(hdp);
				em.merge(cthdp);
				
			});
			em.flush();
			tr.commit();

			return hdp.getMaHD();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			
		}
		
		return -1;
	}

	@Override
	public boolean xoaHoaDonPhong(int maHD) {
		// TODO Auto-generated method stub
		return xoa(maHD, HoaDonPhong.class);
	}

	@Override
	public boolean capNhatHoaDonPhong(HoaDonPhong hdp) throws RemoteException {
		
		error = "";
		List<ChiTietHoaDonPhong> dscthdp = hdp.getDsChiTietHoaDonPhong();
		
		dscthdp.forEach(cthdp -> {
			String sql = "select * \r\n"
					+ "from HoaDonPhong as hdp\r\n"
					+ "inner join ChiTietHoaDonPhong as cthdp\r\n"
					+ "on hdp.maHD = cthdp.maHD\r\n"
					+ "where tinhTrang != 2 and hdp.maHD != "+ hdp.getMaHD() +" and maPhong like '"+ cthdp.getPhong().getMaPhong() +"' and not (ngayGioNhan > '"+ hdp.getNgayGioTra() +"' or ngayGioTra < '"+ hdp.getNgayGioNhan() +"')";

			int n = ((List<HoaDonPhong>) getList(sql, HoaDonPhong.class)).size();
			if(n > 0) {
				if(!error.equals("")) {
					error += ", ";
				}
				error += cthdp.getPhong().getMaPhong();
			}
				
		});
		if(!error.equals("")) {
			error = "Phòng: "+ error + " không trống trong thời điểm bạn chọn";
			return false;
		}
		
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			hdp.setDsChiTietHoaDonPhong(null);
			em.merge(hdp);
			
			dscthdp.forEach(cthdp -> {
				cthdp.setHoaDonPhong(hdp);
				em.merge(cthdp);
			});
			em.flush();
			tr.commit();

			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
//		return capNhat(hdp);
	}

	@Override
	public model.HoaDonPhong getHDPbyMaPhong(String maPhong) {
		String sql = "select * \r\n"
				+ "from HoaDonPhong as hdp\r\n"
				+ "inner join ChiTietHoaDonPhong as cthdp\r\n"
				+ "on hdp.maHD = cthdp.maHD\r\n"
				+ "where  maPhong like '"+ maPhong +"' and not (ngayGioNhan > '"+ Ngay.homNay() +"' or ngayGioTra < '"+ Ngay.homNay() +"')";
		System.out.println();
		return (HoaDonPhong) getSingle(sql, HoaDonPhong.class);
	}

	@Override
	public List<model.HoaDonPhong> getListHDPByTinhTrang() {
		// TODO Auto-generated method stub
		return null;
	}
	


	@Override
	public HoaDonPhong getHDPbyMaHD(int maHD) throws RemoteException {
		String sql = "select * from HoaDonPhong where maHD = "+maHD;
		return (HoaDonPhong) getSingle(sql, HoaDonPhong.class);
	}

	@Override
	public List<HoaDonPhong> getListHDPByMaPhong(String maPhong) throws RemoteException {
		String sql = "select * \r\n"
				+ "from HoaDonPhong as hdp\r\n"
				+ "inner join ChiTietHoaDonPhong as cthdp\r\n"
				+ "on hdp.maHD = cthdp.maHD\r\n"
				+ "where maPhong like '"+ maPhong +"'";
		return (List<HoaDonPhong>) getList(sql, HoaDonPhong.class);
	}
	
	@Override
	public List<HoaDonPhong> getListHDPByMaPhong(String maPhong, Date d1, Date d2) throws RemoteException {
		String sql = "select * \r\n"
				+ "from HoaDonPhong as hdp\r\n"
				+ "inner join ChiTietHoaDonPhong as cthdp\r\n"
				+ "on hdp.maHD = cthdp.maHD\r\n"
				+ "where maPhong like '"+ maPhong +"' and not (ngayGioNhan > '"+ d2 +"' or ngayGioTra < '"+ d1 +"')";
		System.out.println(sql);
		return (List<HoaDonPhong>) getList(sql, HoaDonPhong.class);
	}
	

	@Override
	public List<HoaDonPhong> getListHDPDaDatHoacDangOByMaPhong(String maPhong, Date d1, Date d2) throws RemoteException {
		String sql = "select * \r\n"
				+ "from HoaDonPhong as hdp\r\n"
				+ "inner join ChiTietHoaDonPhong as cthdp\r\n"
				+ "on hdp.maHD = cthdp.maHD\r\n"
				+ "where tinhTrang != 2 and maPhong like '"+ maPhong +"' and not (ngayGioNhan > '"+ d2 +"' or ngayGioTra < '"+ d1 +"')";
		System.out.println(sql);
		return (List<HoaDonPhong>) getList(sql, HoaDonPhong.class);
	}
	
	@Override
	public List<HoaDonPhong> timKiemHDP(String where_sql) throws RemoteException {
		String sql = "select * \r\n"
				+ "from HoaDonPhong\r\n"
				+ "inner join KhachHang\r\n"
				+ "on HoaDonPhong.maKH = KhachHang.maKH\r\n"
				+ "where "+where_sql;
		return (List<HoaDonPhong>) getList(sql, HoaDonPhong.class);
	}
	

	public String getError() {
		return this.error;
	}
	
	public static void main(String[] args) throws RemoteException {
//		KhachHang kh = new KhachHangImpl().getKhachHangByMaKH(1);
//		
//		List<ChiTietHoaDonPhong> dscthdp = new ArrayList<ChiTietHoaDonPhong>();
//		dscthdp.add(new ChiTietHoaDonPhong(new PhongImpl().getPhongByMaPhong("P101")));
//		HoaDonPhong hdp = new HoaDonPhong(Ngay.homNay(), Ngay.homNay(), kh, dscthdp);
//		HoaDonPhongDao hoaDonPhongDao = new HoaDonPhongImpl();
//		System.out.println(hoaDonPhongDao.themHoaDonPhong(hdp));
	}
}
