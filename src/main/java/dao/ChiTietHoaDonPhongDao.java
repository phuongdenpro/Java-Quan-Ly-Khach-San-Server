package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import model.ChiTietDV;
import model.ChiTietHoaDonPhong;

public interface ChiTietHoaDonPhongDao extends Remote{
	public List<ChiTietHoaDonPhong> getListChiTietHDPByDate(Date tuNgay, Date denNgay) throws RemoteException;
	public List<ChiTietHoaDonPhong> getListChiTietHDPByMaHD(int maHD) throws RemoteException;
	public boolean themChiTietHDP(ChiTietHoaDonPhong cthdp) throws RemoteException;
	public boolean xoaChiTietHDP(int id) throws RemoteException;
	public boolean xoaChiTietHDPByMaHD(int maHD) throws RemoteException;
	public boolean capNhatChiTietHDP(ChiTietHoaDonPhongDao cthdp) throws RemoteException;
	
	
}
