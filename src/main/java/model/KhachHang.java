package model;

import java.io.Serializable;
import java.sql.*;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KhachHang implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKH;
	@Column(columnDefinition = "NVARCHAR(50)")
	private String tenKH;
	private String cmnd;
	private String soDienThoai;
	private Date ngayHetHan;
	@Column(columnDefinition = "NVARCHAR(50)")
	private String loaiKH;
	private int soLanDatPhong = 0;
	
	@OneToMany(mappedBy = "khachHang")
	private List<HoaDonPhong> dsHoaDon;
	
	@OneToMany(mappedBy = "khachHang")
	private List<HoaDonDV> dsHoaDonDV;
	
	public KhachHang() {
	
	}

	public KhachHang(int maKH, String tenKH, String cmnd, String soDienThoai, Date ngayHetHan, String loaiKH, int soLanDatPhong) {
		setMaKH(maKH);
		setTenKH(tenKH);
		setCmnd(cmnd);
		this.soDienThoai = soDienThoai;
		this.ngayHetHan = ngayHetHan;
		this.loaiKH = loaiKH;
		setSoLanDatPhong(soLanDatPhong);
	}
	
	public KhachHang(String tenKH, String cmnd, String soDienThoai, Date ngayHetHan, String loaiKH) {
		setTenKH(tenKH);
		setCmnd(cmnd);
		this.soDienThoai = soDienThoai;
		this.ngayHetHan = ngayHetHan;
		this.loaiKH = loaiKH;
		setSoLanDatPhong(0);
	}



	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		if (tenKH.equals(""))
			tenKH = "Chưa cập nhật";
		this.tenKH = tenKH;
	}

	public int getSoLanDatPhong() {
		return soLanDatPhong;
	}

	public void setSoLanDatPhong(int soLanDatPhong) {
		if (soLanDatPhong <= 0)
			soLanDatPhong = 0;
		this.soLanDatPhong = soLanDatPhong;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		if (cmnd.equals(""))
			cmnd = "Chưa cập nhật";
		this.cmnd = cmnd;
	}

	public Date getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public String getLoaiKH() {
		return loaiKH;
	}

	public void setLoaiKH(String loaiKH) {
		if (!(loaiKH.equalsIgnoreCase("Việt Nam")) || !(loaiKH.equalsIgnoreCase("Nước ngoài")))
			loaiKH = "Việt Nam";
		this.loaiKH = loaiKH;
	}

	

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	public int getID() {
		return this.maKH;
	}

	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", cmnd=" + cmnd + ", soDienThoai=" + soDienThoai
				+ ", ngayHetHan=" + ngayHetHan + ", loaiKH=" + loaiKH + ", soLanDatPhong=" + soLanDatPhong
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maKH;
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
		KhachHang other = (KhachHang) obj;
		if (maKH != other.maKH)
			return false;
		return true;
	}

}
