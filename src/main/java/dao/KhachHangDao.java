package dao;

import java.util.List;

import model.KhachHang;

public interface KhachHangDao {
	public List<KhachHang> getListKhachHang();
	public List<KhachHang> timKiem(String where_sql); // where_sql = hoTen like N'%Nhan%' and soDienThoai like '%0987%'
	public KhachHang getKhachHangByMaKH(int maKH);
	public boolean themKhachHang(KhachHang kh);
	public boolean capNhatKhachHang(KhachHang kh);
	public boolean xoaKhachHang(int maKH);
}
