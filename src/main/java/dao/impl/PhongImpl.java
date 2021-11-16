package dao.impl;

import java.rmi.RemoteException;
import java.util.List;

import dao.AbstractDao;
import dao.PhongDao;
import model.Phong;

public class PhongImpl extends AbstractDao implements PhongDao {

	public PhongImpl() throws RemoteException {
		super();
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
		them(phong);
		return false;
	}

	@Override
	public boolean xoaPhong(String maPhong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean suaPhong(Phong phong) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean kiemTraPhongTrong(String maPhong) {
		// TODO Auto-generated method stub
		return false;
	}

}
