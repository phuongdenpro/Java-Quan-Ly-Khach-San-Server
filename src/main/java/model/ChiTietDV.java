package model;

import java.io.Serializable;
import java.sql.*;

public class ChiTietDV implements Serializable{
	private DichVu dichVu;
	private HoaDonDV hoaDonDV;
	private int soLuong;
	private Date ngayGioDat;
	

	public ChiTietDV(int soLuong, HoaDonDV hoaDonDV, DichVu dichVu) {

	}

	public ChiTietDV(DichVu dichVu, int soLuong) {
		this.dichVu = dichVu;
		setSoLuong(soLuong);

	}
	
	public ChiTietDV(int soLuong, Date ngayGioDat, HoaDonDV hoaDonDV, DichVu dichVu) {
		setSoLuong(soLuong);
		this.ngayGioDat = ngayGioDat;
		this.hoaDonDV = hoaDonDV;
		this.dichVu = dichVu;
	}
	
	public Date getNgayGioDat() {
		return ngayGioDat;
	}

	public void setNgayGioDat(Date ngayGioDat) {
		this.ngayGioDat = ngayGioDat;
	}


	public DichVu getDichVu() {
		return dichVu;
	}

	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong < 0)
			soLuong = 0;
		this.soLuong = soLuong;
	}

	public HoaDonDV getHoaDonDV() {
		return hoaDonDV;
	}

	public void setHoaDonDV(HoaDonDV hoaDonDV) {
		this.hoaDonDV = hoaDonDV;
	}

	

	

}
