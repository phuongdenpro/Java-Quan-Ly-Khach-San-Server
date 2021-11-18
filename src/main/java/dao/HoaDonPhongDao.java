package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.List;

import model.HoaDonPhong;

public interface HoaDonPhongDao extends Remote {
	public List<HoaDonPhong> getListHoaDonPhong() throws RemoteException;
	public HoaDonPhong getHDPbyMaHD(int maHD) throws RemoteException;
	public List<HoaDonPhong> getListHoaDonPhongByDate(Date tuNgay, Date denNgay) throws RemoteException;
	public List<HoaDonPhong> getListHoaDonPhongByMaKH(int maKH) throws RemoteException;
	public List<HoaDonPhong> getListHoaDonPhongByMaKH(int maKH, Date tuNgay, Date denNgay) throws RemoteException;
	public boolean themHoaDonPhong(HoaDonPhong hdp) throws RemoteException;
	public boolean xoaHoaDonPhong(int maHD) throws RemoteException;
	public boolean capNhatHoaDonPhong(HoaDonPhong hdp) throws RemoteException;
	public HoaDonPhong getHDPbyMaPhong(String maPhong) throws RemoteException; // lấy hóa đơn của phòng trong thời điểm hiện tại
	public List<HoaDonPhong> getListHDPByTinhTrang() throws RemoteException;
	public List<HoaDonPhong> getListHDPByMaPhong(String maPhong) throws RemoteException;
	public List<HoaDonPhong> getListHDPByMaPhong(String maPhong, Date d1, Date d2) throws RemoteException; 
	public List<HoaDonPhong> getListHDPDaDatHoacDangOByMaPhong(String maPhong, Date d1, Date d2) throws RemoteException;
	public List<HoaDonPhong> timKiemHDP(String where_sql) throws RemoteException;
	public String getError() throws RemoteException;
}
