package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.DichVu;

public interface DichVuDao extends Remote {
	public List<DichVu> getListDichVu() throws RemoteException;
	public List<DichVu> timKiemByName(String tenDV) throws RemoteException; // tìm kiếm tương đối
	public boolean themDichVu(DichVu dv) throws RemoteException;
	public boolean capNhatDichVu(DichVu dv) throws RemoteException;
	public boolean xoaDichVu(int maDV) throws RemoteException;
	public List<DichVu> timKiemDichVu(String key, String val) throws RemoteException;
	
}
