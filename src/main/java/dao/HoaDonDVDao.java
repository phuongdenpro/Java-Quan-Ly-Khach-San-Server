package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import model.HoaDonDV;
import model.HoaDonPhong;

public interface HoaDonDVDao extends Remote {
	public List<HoaDonDV> getListHDDV() throws RemoteException;
	public HoaDonDV getHDDVbyMaHDDV(int maHDDV) throws RemoteException;
	public int themHoaDonDV(HoaDonDV hddv) throws RemoteException;
	public boolean capNhatHoaDonDV(HoaDonDV hd) throws RemoteException;
	public boolean xoaHoaDonDV(int maHDDV) throws RemoteException;
	public List<HoaDonDV> getHDDVByMaPhong(String maPhong) throws RemoteException; // lấy hóa đơn dịch vụ cho phòng tại thời điểm đó
	public List<HoaDonDV> getHDDVByMaPhongAndDate(String maPhong, Date tuNgay, Date denNgay) throws RemoteException; // lấy hóa đơn dịch vụ cho phòng
	public boolean capNhatTinhTrang(HoaDonDV hddv) throws RemoteException;
	public List<HoaDonDV> timKiemHDDV(String where_sql) throws RemoteException;
	public HoaDonDV getHDDVChuaThanhToanByMaKH(int maKH) throws RemoteException;
}
