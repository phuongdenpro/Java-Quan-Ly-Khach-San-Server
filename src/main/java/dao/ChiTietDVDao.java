package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import model.ChiTietDV;

public interface ChiTietDVDao extends Remote{
	public List<ChiTietDV> getListChiTietDVByDate(Date tuNgay, Date denNgay) throws RemoteException;
	public List<ChiTietDV> getListChiTietDVByMaKH(int maKH, Date tuNgay, Date denNgay) throws RemoteException;
	public List<ChiTietDV> getListChiTietDVByMaHDDV(int maHDDV) throws RemoteException;
	public boolean themChiTietDV(ChiTietDV ctdv) throws RemoteException;
	public boolean xoaChiTietDV(int id) throws RemoteException;
	public boolean xoaChiTietDVByMaHDDV(int maHDDV) throws RemoteException;
	public boolean capNhatChiTietDV(ChiTietDV ctdv) throws RemoteException;
	
	
}
