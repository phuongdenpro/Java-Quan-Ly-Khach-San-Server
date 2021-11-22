package dao.impl;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityTransaction;

import dao.AbstractDao;
import dao.ChiTietHoaDonPhongDao;
import model.ChiTietHoaDonPhong;

public class ChiTietHoaDonPhongImpl extends AbstractDao implements ChiTietHoaDonPhongDao {

	public ChiTietHoaDonPhongImpl() throws RemoteException {
		super();
	}

	@Override
	public List<ChiTietHoaDonPhong> getListChiTietHDPByDate(Date tuNgay, Date denNgay) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChiTietHoaDonPhong> getListChiTietHDPByMaHD(int maHD) throws RemoteException {
		String sql = "select * from ChiTietHoaDonPhong where maHD = " + maHD;
		return (List<ChiTietHoaDonPhong>) getList(sql, ChiTietHoaDonPhong.class);
	}

	@Override
	public List<ChiTietHoaDonPhong> getListChiTietHDPByMaKH(int maKH) throws RemoteException {
		String sql = "select * from ChiTietHoaDonPhong inner join HoaDonPhong on ChiTietHoaDonPhong.MaHD = HoaDonPhong.maHD inner join KhachHang on HoaDonPhong.MaKH = KhachHang.maKH where KhachHang.maKH ="+maKH;
		return (List<ChiTietHoaDonPhong>) getList(sql, ChiTietHoaDonPhong.class);
	//	return null;
	}

	@Override
	public List<ChiTietHoaDonPhong> getListChiTietHDPByMaKHAndDate(int maKH, Date tuNgay, Date denNgay)
			throws RemoteException {
//		String sql = "select * from ChiTietHoaDonPhong inner join HoaDonPhong on ChiTietHoaDonPhong.MaHD = HoaDonPhong.maHD inner join KhachHang on HoaDonPhong.MaKH = KhachHang.maKH"
//				+" where ngayGioNhan >='2021-11-16' and ngayGioNhan <= '2021-11-16' and KhachHang.maKH = 1";
//		return (List<ChiTietHoaDonPhong>) getList(sql, ChiTietHoaDonPhong.class);
		return null;
	}

	@Override
	public boolean themChiTietHDP(model.ChiTietHoaDonPhong cthdp) throws RemoteException {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();
			em.merge(cthdp.getHoaDonPhong());

			em.merge(cthdp.getPhong());
			em.persist(cthdp);
			tr.commit();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();

		}

		return false;
	}

	@Override
	public boolean xoaChiTietHDP(int id) throws RemoteException {
//		EntityTransaction tr = em.getTransaction();
//		
//		try {
//			tr.begin();
//			
//			em.remove(cthdp);
//			tr.commit();
//
//			return true;
//		}catch (Exception e) {
//			e.printStackTrace();
//			tr.rollback();
//			
//		}

		return false;
	}

	@Override
	public boolean xoaChiTietHDPByMaHD(int maHD) throws RemoteException {

		return false;
	}

	@Override
	public boolean capNhatChiTietHDP(ChiTietHoaDonPhongDao cthdp) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

}
