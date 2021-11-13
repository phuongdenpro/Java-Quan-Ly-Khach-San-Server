package dao;

import java.util.List;

import model.LoaiPhong;

public interface LoaiPhongDao {
	public List<LoaiPhong> getDSLoaiPhong();
	public LoaiPhong getLoaiPhongByMa(int maLoaiPhong);
	public List<LoaiPhong> getLoaiPhongByName(String name);
	public boolean themLoaiPhong(LoaiPhong loaiPhong);
	public boolean xoaLoaiPhong(int maLoaiPhong);
	public boolean capNhatLoaiPhong(LoaiPhong loaiPhong);
	public int getSoLuongPhongByMaLoaiPhong(int maLoaiPhong);
}
