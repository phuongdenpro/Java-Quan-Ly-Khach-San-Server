package dao.impl;

import java.util.List;

import dao.AbstractDao;
import dao.PhongDao;

public class PhongImpl extends AbstractDao implements PhongDao {

	@Override
	public List<model.Phong> getPhongTrong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.Phong> getPhongByMaLoaiPhong(int maLoaiPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.Phong getPhongByMaPhong(String maPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.Phong> getListPhong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean themPhong(model.Phong phong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaPhong(String maPhong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean suaPhong(model.Phong phong) {
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
