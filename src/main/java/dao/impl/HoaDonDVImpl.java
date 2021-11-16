package dao.impl;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import dao.AbstractDao;
import dao.HoaDonDVDao;
import model.HoaDonDV;
import model.HoaDonPhong;

public class HoaDonDVImpl extends AbstractDao implements HoaDonDVDao{

	public HoaDonDVImpl() throws RemoteException {
		super();
	}

	@Override
	public List<model.HoaDonDV> getListHDDV() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.HoaDonDV getHDDVbyMaHDDV(int maHDDV) {
		String sql = "select * from HoaDonDV where maHDDV = "+maHDDV;
		return (HoaDonDV) getSingle(sql, HoaDonDV.class);
	}

	@Override
	public boolean themHoaDonDV(model.HoaDonDV hd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatHoaDonDV(model.HoaDonDV hd) {
		// TODO Auto-generated method stub
		return capNhat(hd);
	}

	@Override
	public boolean xoaHoaDonDV(int maHDDV) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean capNhatTinhTrang(int maHDDV, int tinhTrang) {
		// TODO Auto-generated method stub
		return false;
	}

}
