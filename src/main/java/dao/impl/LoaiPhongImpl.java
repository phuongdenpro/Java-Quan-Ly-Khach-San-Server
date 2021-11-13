package dao.impl;

import java.util.List;

import dao.AbstractDao;
import dao.LoaiPhongDao;

public class LoaiPhongImpl extends AbstractDao implements LoaiPhongDao {

	@Override
	public List<model.LoaiPhong> getDSLoaiPhong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public model.LoaiPhong getLoaiPhongByMa(int maLoaiPhong) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.LoaiPhong> getLoaiPhongByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean themLoaiPhong(model.LoaiPhong loaiPhong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaLoaiPhong(int maLoaiPhong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatLoaiPhong(model.LoaiPhong loaiPhong) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSoLuongPhongByMaLoaiPhong(int maLoaiPhong) {
		// TODO Auto-generated method stub
		return 0;
	}

}
