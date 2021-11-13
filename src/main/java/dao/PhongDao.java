package dao;

import java.util.List;

import model.KhachHang;
import model.Phong;

public interface PhongDao {
	public List<Phong> getPhongTrong();
	public List<Phong> getPhongByMaLoaiPhong(int maLoaiPhong);
	public Phong getPhongByMaPhong(String maPhong);
	public List<Phong> getListPhong();
	public boolean themPhong(Phong phong);
	public boolean xoaPhong(String maPhong);
	public boolean suaPhong(Phong phong);
	public KhachHang getKHDangSuDungPhong(String maPhong);
	public KhachHang getKHDaDatPhong(String maPhong); // đã đặt phòng tại thời điểm hiện tại
	public boolean capNhatTinhTrangPhong(String MaPhong, int tinhTrang);
	public boolean kiemTraPhongTrong(String maPhong); // kiểm tra xem phòng đó còn trống tại thời điểm hiện tại không
}
