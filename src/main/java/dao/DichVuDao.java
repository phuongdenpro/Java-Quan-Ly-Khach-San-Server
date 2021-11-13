package dao;

import java.util.List;

import model.DichVu;

public interface DichVuDao {
	public List<DichVu> getListDichVu();
	public List<DichVu> timKiemByName(String tenDV); // tìm kiếm tương đối
	public boolean themDichVu(DichVu dv);
	public boolean capNhatDichVu(DichVu dv);
	public boolean xoaDichVu(int maDV);
	
}
