package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ChiTietHoaDonPhongPK.class)
public class ChiTietHoaDonPhong implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name="MaPhong")
	private Phong phong;
	
	@Id
	@ManyToOne
	@JoinColumn(name="MaHD")
	private HoaDonPhong hoaDonPhong;
	
	public ChiTietHoaDonPhong() {
	
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
	
	
}
