package dao.impl;

import java.util.List;

import dao.AbstractDao;
import dao.KhachHangDao;

public class KhachHangImpl extends AbstractDao implements KhachHangDao {

	@Override
	public List<model.KhachHang> getListKhachHang() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.KhachHang> timKiem(String where_sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.KhachHang getKhachHangByMaKH(int maKH) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean themKhachHang(model.KhachHang kh) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatKhachHang(model.KhachHang kh) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaKhachHang(int maKH) {
		// TODO Auto-generated method stub
		return false;
	}

}
