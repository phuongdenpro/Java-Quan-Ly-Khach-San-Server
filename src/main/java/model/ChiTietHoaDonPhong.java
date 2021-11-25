package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ChiTietHoaDonPhong")
@IdClass(ChiTietHoaDonPhongPK.class)
public class ChiTietHoaDonPhong implements Serializable{

	@Id
	@ManyToOne
	@JoinColumn(name="MaHD")
	private HoaDonPhong hoaDonPhong;
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaPhong")
	private Phong phong;
	
	private double donGia;
	
	public ChiTietHoaDonPhong() {
		
	}
	
	public ChiTietHoaDonPhong(Phong phong, double donGia) {
		this.phong = phong;
		this.donGia = donGia;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

	public HoaDonPhong getHoaDonPhong() {
		return hoaDonPhong;
	}

	public void setHoaDonPhong(HoaDonPhong hoaDonPhong) {
		this.hoaDonPhong = hoaDonPhong;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDonPhong [phong=" + phong + ", hoaDonPhong=" + hoaDonPhong + "]";
	}
	
	
}
