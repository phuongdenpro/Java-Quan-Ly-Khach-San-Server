package dao.impl;

import java.sql.Date;
import java.util.List;

import dao.AbstractDao;
import dao.HoaDonPhongDao;

public class HoaDonPhongImpl  extends AbstractDao implements HoaDonPhongDao{

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaHoaDonPhong(int maHD) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatTinhTrang(int maHD, int tinhTrang) {
		// TODO Auto-generated method stub
		return false;
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

}
