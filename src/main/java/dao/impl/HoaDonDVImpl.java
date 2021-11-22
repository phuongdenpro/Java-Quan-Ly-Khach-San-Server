package dao.impl;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityTransaction;

import dao.AbstractDao;
import dao.HoaDonDVDao;
import model.ChiTietDV;
import model.ChiTietHoaDonPhong;
import model.HoaDonDV;
import model.HoaDonPhong;
import model.KhachHang;

public class HoaDonDVImpl extends AbstractDao implements HoaDonDVDao{

	public HoaDonDVImpl() throws RemoteException {
		super();
	}

	@Override
	public List<model.HoaDonDV> getListHDDV() {
		String sql = "select * from HoaDonDV";
		return (List<model.HoaDonDV>) getList(sql, HoaDonDV.class);
	}

	@Override
	public model.HoaDonDV getHDDVbyMaHDDV(int maHDDV) {
		String sql = "select * from HoaDonDV where maHDDV = "+maHDDV;
		return (HoaDonDV) getSingle(sql, HoaDonDV.class);
	}

	@Override
	public int themHoaDonDV(model.HoaDonDV hddv) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();

//			hdp
			
			em.persist(hddv);
			System.out.println(hddv.getMaHDDV());
//			thêm cthd
			List<ChiTietDV> dscthddv = hddv.getDsChiTietDV();
			em.clear();
			dscthddv.forEach(cthddv -> {
//				System.out.
				cthddv.setHoaDonDV(hddv);
				em.merge(cthddv);
				
			});
			em.flush();
			tr.commit();

			return hddv.getMaHDDV();
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			
		}
		
		return -1;
	}

	@Override
	public boolean capNhatHoaDonDV(model.HoaDonDV hddv) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();

//			hddv
			List<ChiTietDV> dscthddv = hddv.getDsChiTietDV();
			hddv.setDsChiTietDV(null);
			em.merge(hddv);
			
			dscthddv.forEach(cthddv -> {
				cthddv.setHoaDonDV(hddv);
				em.merge(cthddv);
			});
			em.flush();
			tr.commit();

			return true;
		}catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			
		}
		return false;
	}

	@Override
	public boolean xoaHoaDonDV(int maHDDV) {
		// TODO Auto-generated method stub
		return xoa(maHDDV, HoaDonDV.class);
	}

	@Override
	public List<model.HoaDonDV> getHDDVByMaPhong(String maPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.HoaDonDV> getHDDVByMaPhongAndDate(String maPhong, Date tuNgay, Date denNgay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean capNhatTinhTrang(model.HoaDonDV hddv) {
		return capNhat(hddv);
	}
	
	@Override
	public List<model.HoaDonDV> timKiemHDDV(String where_sql) throws RemoteException {
		String sql = "select * \r\n"
				+ "from HoaDonDV\r\n"
				+ "inner join KhachHang\r\n"
				+ "on HoaDonDV.maKH = KhachHang.maKH\r\n"
				+ "where "+where_sql;
		return (List<model.HoaDonDV>) getList(sql, model.HoaDonDV.class);
	}

	@Override
	public HoaDonDV getHDDVChuaThanhToanByMaKH(int maKH) throws RemoteException {
		String sql = "select * \r\n"
				+ "from HoaDonDV\r\n"
				+ "inner join KhachHang\r\n"
				+ "on HoaDonDV.maKH = KhachHang.maKH\r\n"
				+ "where tinhTrang = 0 and KhachHang.maKH = "+maKH;
		return (HoaDonDV) getSingle(sql, model.HoaDonDV.class);
	}

}
