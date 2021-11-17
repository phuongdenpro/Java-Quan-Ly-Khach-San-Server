package model;

import java.io.Serializable;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class HoaDonDV implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHDDV;
	private int tinhTrang;
	@Column(name = "NgayGioLap")
	private Date ngayGioDat;
	
	@OneToMany(mappedBy = "hoaDonDV")
	private List<ChiTietDV> dsChiTietDV;
	
	@ManyToOne
	@JoinColumn(name="MaKH")
	private KhachHang khachHang;

	public HoaDonDV(int maHDDV, Date ngayGioDat, KhachHang khachHang) {
		this.maHDDV = maHDDV;
		this.ngayGioDat = ngayGioDat;
		this.khachHang = khachHang;
	}

	public HoaDonDV() {

	}
	

	public HoaDonDV(int maHDDV, KhachHang khachHang, Date ngayGioDat, int tinhTrang) {
		this.maHDDV = maHDDV;
		this.ngayGioDat = ngayGioDat;
		this.tinhTrang = tinhTrang;
		this.khachHang = khachHang;
	}


	public int getMaHDDV() {
		return maHDDV;
	}

	public int getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public void setMaHDDV(int maHDDV) {
		this.maHDDV = maHDDV;
	}

	public Date getNgayGioDat() {
		return ngayGioDat;
	}

	public void setNgayGioDat(Date ngayGioDat) {
		this.ngayGioDat = ngayGioDat;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	
	public int getID() {
		return this.maHDDV;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maHDDV;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDonDV other = (HoaDonDV) obj;
		if (maHDDV != other.maHDDV)
			return false;
		return true;
	}



}
