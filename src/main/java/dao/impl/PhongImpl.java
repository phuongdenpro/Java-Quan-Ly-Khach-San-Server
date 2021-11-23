package dao.impl;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import dao.AbstractDao;
import dao.PhongDao;
import model.HoaDonPhong;
import model.Phong;
import utils.Ngay;

public class PhongImpl extends AbstractDao implements PhongDao {

	public PhongImpl(EntityManagerFactory factory) throws RemoteException {
		super(factory);
	}

	@Override
	public List<model.Phong> getPhongTrong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.Phong> getPhongByMaLoaiPhong(int maLoaiPhong) {
		String sql = "select * from Phong where maLoaiPhong = " + maLoaiPhong;
		return (List<Phong>) getList(sql, Phong.class);
	}

	@Override
	public model.Phong getPhongByMaPhong(String maPhong) {
		String sql = "select * from Phong where maPhong like '" + maPhong +"'";
		return (Phong) getSingle(sql, Phong.class);
	}

	@Override
	public List<Phong> getListPhong() {
		String sql = "select * from Phong";
		return (List<Phong>) getList(sql, Phong.class);
	}

	@Override
	public boolean themPhong(Phong phong) throws RemoteException{
		
		return them(phong);
	}

	@Override
	public boolean xoaPhong(String maPhong) {
		// TODO Auto-generated method stub
		return xoa(maPhong, Phong.class);
	}

	@Override
	public boolean suaPhong(Phong phong) {
		// TODO Auto-generated method stub
		return capNhat(phong);
	}

	@Override
	public model.KhachHang getKHDangSuDungPhong(String maPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.KhachHang getKHDaDatPhong(String maPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean capNhatTinhTrangPhong(String MaPhong, int tinhTrang) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kiemTraPhongTrong(String maPhong, Date d1, Date d2) throws RemoteException {
		String sql = "select * from Phong";
		List<HoaDonPhong> dshdp = new HoaDonPhongImpl(factory).getListHDPDaDatHoacDangOByMaPhong(maPhong, d1, d2);
		if(dshdp.size() == 0)
			return true;
		else 
			return false;
	}

	@Override
	public int getTinhTrangPhongHomNay(String maPhong) throws RemoteException {
		String sql = "select * \r\n"
				+ "from HoaDonPhong as hdp\r\n"
				+ "inner join ChiTietHoaDonPhong as cthdp\r\n"
				+ "on hdp.maHD = cthdp.maHD\r\n"
				+ "where  maPhong like '"+ maPhong +"' and not (ngayGioNhan > '"+ Ngay.homNay() +"' or ngayGioTra < '"+ Ngay.homNay() +"')";
		
		List<HoaDonPhong> dshdp = (List<HoaDonPhong>) getList(sql, HoaDonPhong.class);
		if(dshdp.size() == 0)
			return 0;
		
		boolean dangO = false;
		boolean duocDat = false;
		for(HoaDonPhong hdp: dshdp) {
			if(hdp.getTinhTrang() == 1) // dang o
				dangO = true;
			else if(hdp.getTinhTrang() == 0) // da duoc dat
				duocDat = true;
		}
		
		if(dangO)
			return 2;
		if(duocDat)
			return 1;
		
		return 0;
	}

}
