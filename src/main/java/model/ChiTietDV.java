package model;

import java.io.Serializable;
import java.sql.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ChiTietDVPK.class)
public class ChiTietDV implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name="MaDV")
	private DichVu dichVu;
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaHDDV")
	private HoaDonDV hoaDonDV;
	private int soLuong;
	
	public ChiTietDV() {

	}

	public ChiTietDV(DichVu dichVu, int soLuong) {
		this.dichVu = dichVu;
		setSoLuong(soLuong);

	}
	
	public ChiTietDV(int soLuong, HoaDonDV hoaDonDV, DichVu dichVu) {
		setSoLuong(soLuong);
		this.hoaDonDV = hoaDonDV;
		this.dichVu = dichVu;
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
