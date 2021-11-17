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
	
	public ChiTietHoaDonPhong() {
	
	}
	
	public ChiTietHoaDonPhong(Phong phong) {
		this.phong = phong;
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
