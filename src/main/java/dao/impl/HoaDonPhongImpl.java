package dao.impl;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;

import dao.AbstractDao;
import dao.HoaDonPhongDao;
import model.ChiTietHoaDonPhong;
import model.HoaDonPhong;
import model.KhachHang;
import utils.Ngay;

public class HoaDonPhongImpl  extends AbstractDao implements HoaDonPhongDao{

	public HoaDonPhongImpl() throws RemoteException {
		super();
	}

	@Override
	public List<model.HoaDonPhong> getListHoaDonPhong() {
		// TODO Auto-generated method stub
		return null;
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
	public boolean themHoaDonPhong(model.HoaDonPhong hdp) {
		EntityTransaction tr = em.getTransaction();
//		try {
			tr.begin();
			
			if(em.find(KhachHang.class, hdp.getKhachHang().getMaKH()) == null) {
//				kh
				em.persist(hdp.getKhachHang());
				em.flush();
			}
			
//			hdp
			em.persist(hdp);
//			em.flush();
			
			System.out.println(hdp.getMaHD());
//			thêm cthd
			hdp.getDsChiTietHoaDonPhong().forEach(cthdp -> {
				
				cthdp.setHoaDonPhong(hdp);
//				em.persist(cthdp);
				try {
					new ChiTietHoaDonPhongImpl().themChiTietHDP(cthdp);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			});
//			
			tr.commit();

			return true;
//		}catch (Exception e) {
//			e.printStackTrace();
//			tr.rollback();
//			
//		}
		
//		return false;
	}

	@Override
	public boolean xoaHoaDonPhong(int maHD) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatHoaDonPhong(HoaDonPhong hdp) {
		return capNhat(hdp);
	}

	@Override
	public model.HoaDonPhong getHDPbyMaPhong(String maPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.HoaDonPhong> getListHDPByTinhTrang() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) throws RemoteException {
		KhachHang kh = new KhachHangImpl().getKhachHangByMaKH(1);
		
		List<ChiTietHoaDonPhong> dscthdp = new ArrayList<ChiTietHoaDonPhong>();
		dscthdp.add(new ChiTietHoaDonPhong(new PhongImpl().getPhongByMaPhong("P101")));
		HoaDonPhong hdp = new HoaDonPhong(Ngay.homNay(), Ngay.homNay(), kh, dscthdp);
		HoaDonPhongDao hoaDonPhongDao = new HoaDonPhongImpl();
		System.out.println(hoaDonPhongDao.themHoaDonPhong(hdp));
	}

	@Override
	public HoaDonPhong getHDPbyMaHD(int maHD) throws RemoteException {
		String sql = "select * from HoaDonPhong where maHD = "+maHD;
		return (HoaDonPhong) getSingle(sql, HoaDonPhong.class);
	}

}
