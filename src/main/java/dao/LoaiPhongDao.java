package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.LoaiPhong;

public interface LoaiPhongDao extends Remote {
	public List<LoaiPhong> getDSLoaiPhong() throws RemoteException;
	public LoaiPhong getLoaiPhongByMa(int maLoaiPhong) throws RemoteException;
	public List<LoaiPhong> getLoaiPhongByName(String name) throws RemoteException;
	public boolean themLoaiPhong(LoaiPhong loaiPhong) throws RemoteException;
	public boolean xoaLoaiPhong(int maLoaiPhong) throws RemoteException;
	public boolean capNhatLoaiPhong(LoaiPhong loaiPhong) throws RemoteException;
	public int getSoLuongPhongByMaLoaiPhong(int maLoaiPhong) throws RemoteException;
}
