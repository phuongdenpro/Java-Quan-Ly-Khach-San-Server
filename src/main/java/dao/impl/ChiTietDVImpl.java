package dao.impl;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import dao.AbstractDao;
import dao.ChiTietDVDao;
import model.ChiTietDV;
import model.ChiTietHoaDonPhong;
import utils.Ngay;

public class ChiTietDVImpl extends AbstractDao implements ChiTietDVDao{

	public ChiTietDVImpl() throws RemoteException {
		super();
	}
	@Override
	public List<ChiTietDV> getListChiTietDV() throws RemoteException {
		// TODO Auto-generated method stub
		String sql = "select * from ChiTietDV inner join HoaDonDV on ChiTietDV.MaHDDV = HoaDonDV.maHDDV inner join KhachHang on HoaDonDV.MaKH = KhachHang.maKH ";	
		return (List<ChiTietDV>) getList(sql, ChiTietDV.class);
	}


	@Override
	public List<model.ChiTietDV> getListChiTietDVByDate(Date tuNgay, Date denNgay) throws RemoteException{
		// TODO Auto-generated method stub
			String sql = "select * from ChiTietDV inner join HoaDonDV on ChiTietDV.MaHDDV = HoaDonDV.maHDDV inner join KhachHang on HoaDonDV.MaKH = KhachHang.maKH\r\n" + 
					"where NgayGioLap >='"+tuNgay+"' and NgayGioLap <= '"+denNgay+"'";	
		return (List<ChiTietDV>) getList(sql, ChiTietDV.class);
	}
	
	@Override
	public List<model.ChiTietDV> getListChiTietDVByMaKH(int maKH) throws RemoteException{
		// TODO Auto-generated method stub
		String sql = "select * from ChiTietDV inner join HoaDonDV on ChiTietDV.MaHDDV = HoaDonDV.maHDDV inner join KhachHang on HoaDonDV.MaKH = KhachHang.maKH\r\n" + 
				"where KhachHang.maKH = "+maKH;
		return (List<ChiTietDV>) getList(sql, ChiTietDV.class);
	}

	@Override
	public List<model.ChiTietDV> getListChiTietDVByMaKHAndDate(int maKH, Date tuNgay, Date denNgay) throws RemoteException{
		// TODO Auto-generated method stub
		String sql = "select * from ChiTietDV inner join HoaDonDV on ChiTietDV.MaHDDV = HoaDonDV.maHDDV inner join KhachHang on HoaDonDV.MaKH = KhachHang.maKH\r\n" + 
				"where NgayGioLap >='"+tuNgay+"' and NgayGioLap <= '"+denNgay+"' and KhachHang.maKH = "+maKH;	
	return (List<ChiTietDV>) getList(sql, ChiTietDV.class);
	}

	@Override
	public List<ChiTietDV> getListChiTietDVByMaHDDV(int maHDDV) {
		String sql = "select * from ChiTietDV where maHDDV = " + maHDDV;
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
	@Override
	public List<ChiTietDV> getListChiTietDVByMaKH(int maKH, Date tuNgay, Date denNgay) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}



}
