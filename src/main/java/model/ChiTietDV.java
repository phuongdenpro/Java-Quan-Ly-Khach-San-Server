package model;

import java.io.Serializable;
import java.sql.*;

import javax.persistence.CascadeType;
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
	@JoinColumn(name="MaHDDV")
	private HoaDonDV hoaDonDV;
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaDV")
	private DichVu dichVu;
	
	private int soLuong;
	private double donGia;
	
	public ChiTietDV() {

	}

	public ChiTietDV(DichVu dichVu, int soLuong, double donGia) {
		this.dichVu = dichVu;
		setSoLuong(soLuong);
		this.donGia = donGia;
	}
	
	public ChiTietDV(HoaDonDV hoaDonDV, DichVu dichVu, int soLuong, double donGia) {
		setSoLuong(soLuong);
		this.hoaDonDV = hoaDonDV;
		this.dichVu = dichVu;
		this.donGia = donGia;
	}
	
	

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
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
