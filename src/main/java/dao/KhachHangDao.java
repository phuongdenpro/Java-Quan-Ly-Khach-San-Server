package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.KhachHang;

public interface KhachHangDao extends Remote {
	public List<KhachHang> getListKhachHang() throws RemoteException;
	public List<KhachHang> timKiem(String where_sql) throws RemoteException; // where_sql = hoTen like N'%Nhan%' and soDienThoai like '%0987%'
	public KhachHang getKhachHangByMaKH(int maKH) throws RemoteException;
	public boolean themKhachHang(KhachHang kh) throws RemoteException;
	public boolean capNhatKhachHang(KhachHang kh) throws RemoteException;
	public boolean xoaKhachHang(int maKH) throws RemoteException;
}
