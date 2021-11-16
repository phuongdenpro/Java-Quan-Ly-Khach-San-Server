package dao.impl;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import dao.AbstractDao;
import dao.ChiTietDVDao;
import model.ChiTietDV;
import model.ChiTietHoaDonPhong;

public class ChiTietDVImpl extends AbstractDao implements ChiTietDVDao{

	public ChiTietDVImpl() throws RemoteException {
		super();
	}

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
	public List<ChiTietDV> getListChiTietDVByMaHDDV(int maHDDV) {
		String sql = "select * from ChiTietDV where maHDDV = " + maHDDV;
		System.out.println(sql);
		return (List<ChiTietDV>) getList(sql, ChiTietDV.class);
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
