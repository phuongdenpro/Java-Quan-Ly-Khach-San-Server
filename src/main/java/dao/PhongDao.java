package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.KhachHang;
import model.Phong;

public interface PhongDao extends Remote {
	public List<Phong> getPhongTrong() throws RemoteException;
	public List<Phong> getPhongByMaLoaiPhong(int maLoaiPhong) throws RemoteException;
	public Phong getPhongByMaPhong(String maPhong) throws RemoteException;
	public List<Phong> getListPhong() throws RemoteException;
	public boolean themPhong(Phong phong) throws RemoteException;
	public boolean xoaPhong(String maPhong) throws RemoteException;
	public boolean suaPhong(Phong phong) throws RemoteException;
	public KhachHang getKHDangSuDungPhong(String maPhong) throws RemoteException;
	public KhachHang getKHDaDatPhong(String maPhong) throws RemoteException; // đã đặt phòng tại thời điểm hiện tại
	public boolean capNhatTinhTrangPhong(String MaPhong, int tinhTrang) throws RemoteException;
	public boolean kiemTraPhongTrong(String maPhong) throws RemoteException; // kiểm tra xem phòng đó còn trống tại thời điểm hiện tại không
}
