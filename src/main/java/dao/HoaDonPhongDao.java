package dao;

import java.sql.Date;
import java.util.List;

import model.HoaDonPhong;

public interface HoaDonPhongDao {
	public List<HoaDonPhong> getListHoaDonPhong();
	public List<HoaDonPhong> getListHoaDonPhongByDate(Date tuNgay, Date denNgay);
	public List<HoaDonPhong> getListHoaDonPhongByMaKH(int maKH);
	public List<HoaDonPhong> getListHoaDonPhongByMaKH(int maKH, Date tuNgay, Date denNgay);
	public boolean themHoaDonPhong(HoaDonPhong hdp);
	public boolean xoaHoaDonPhong(int maHD);
	public boolean capNhatTinhTrang(int maHD, int tinhTrang);
	public HoaDonPhong getHDPbyMaPhong(String maPhong); // lấy hóa đơn của phòng trong thời điểm hiện tại
	public List<HoaDonPhong> getListHDPByTinhTrang();
}
