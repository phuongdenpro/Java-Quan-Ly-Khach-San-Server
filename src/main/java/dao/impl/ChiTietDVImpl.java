package dao.impl;

import java.sql.Date;
import java.util.List;

import dao.AbstractDao;
import dao.ChiTietDVDao;

public class ChiTietDVImpl extends AbstractDao implements ChiTietDVDao{

	@Override
	public List<model.ChiTietDV> getListChiTietDVByDate(Date tuNgay, Date denNgay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.ChiTietDV> getListChiTietDVByMaKH(int maKH, Date tuNgay, Date denNgay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<model.ChiTietDV> getListChiTietDVByMaHDDV(int maHDDV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean themChiTietDV(model.ChiTietDV ctdv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaChiTietDV(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoaChiTietDVByMaHDDV(int maHDDV) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhatChiTietDV(model.ChiTietDV ctdv) {
		// TODO Auto-generated method stub
		return false;
	}

}
