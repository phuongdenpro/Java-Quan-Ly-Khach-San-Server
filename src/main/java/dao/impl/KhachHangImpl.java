package dao.impl;

import java.rmi.RemoteException;
import java.util.List;

import dao.AbstractDao;
import dao.KhachHangDao;
import model.KhachHang;

public class KhachHangImpl extends AbstractDao implements KhachHangDao {

	public KhachHangImpl() throws RemoteException {
		super();
	}

	@Override
	public List<KhachHang> getListKhachHang() {
		String sql = "select * from KhachHang";
		return (List<KhachHang>) getList(sql, KhachHang.class);
	}

	@Override
	public List<model.KhachHang> timKiem(String where_sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.KhachHang getKhachHangByMaKH(int maKH) {
		String sql = "Select * from KhachHang where maKH = "+maKH;
		return (KhachHang) getSingle(sql, KhachHang.class);
	}

	@Override
	public boolean themKhachHang(model.KhachHang kh) {
		return them(kh);
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
