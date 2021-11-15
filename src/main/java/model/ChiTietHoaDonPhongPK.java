package model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonPhongPK implements Serializable{
	private Phong phong;
	private HoaDonPhong hoaDonPhong;
	
	public ChiTietHoaDonPhongPK() {
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(hoaDonPhong, phong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHoaDonPhongPK other = (ChiTietHoaDonPhongPK) obj;
		return Objects.equals(hoaDonPhong, other.hoaDonPhong) && Objects.equals(phong, other.phong);
	}
	
	
}
