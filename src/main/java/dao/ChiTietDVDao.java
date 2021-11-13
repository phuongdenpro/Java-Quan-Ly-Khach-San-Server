package dao;

import java.sql.Date;
import java.util.List;

import model.ChiTietDV;

public interface ChiTietDVDao {
	public List<ChiTietDV> getListChiTietDVByDate(Date tuNgay, Date denNgay);
	public List<ChiTietDV> getListChiTietDVByMaKH(int maKH, Date tuNgay, Date denNgay);
	public List<ChiTietDV> getListChiTietDVByMaHDDV(int maHDDV);
	public boolean themChiTietDV(ChiTietDV ctdv);
	public boolean xoaChiTietDV(int id);
	public boolean xoaChiTietDVByMaHDDV(int maHDDV);
	public boolean capNhatChiTietDV(ChiTietDV ctdv);
	
	
}
