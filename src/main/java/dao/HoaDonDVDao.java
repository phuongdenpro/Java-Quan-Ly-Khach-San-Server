package dao;

import java.sql.Date;
import java.util.List;

import model.HoaDonDV;

public interface HoaDonDVDao {
	public List<HoaDonDV> getListHDDV();
	public HoaDonDV getHDDVbyMaHDDV(int maHDDV);
	public boolean themHoaDonDV(HoaDonDV hd);
	public boolean capNhatHoaDonDV(HoaDonDV hd);
	public boolean xoaHoaDonDV(int maHDDV);
	public List<HoaDonDV> getHDDVByMaPhong(String maPhong); // lấy hóa đơn dịch vụ cho phòng tại thời điểm đó
	public List<HoaDonDV> getHDDVByMaPhongAndDate(String maPhong, Date tuNgay, Date denNgay); // lấy hóa đơn dịch vụ cho phòng
	public boolean capNhatTinhTrang(int maHDDV, int tinhTrang);
}
