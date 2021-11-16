package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietDVPK implements Serializable {
	private DichVu dichVu;
	private HoaDonDV hoaDonDV;
	
	public ChiTietDVPK() {
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(dichVu, hoaDonDV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietDVPK other = (ChiTietDVPK) obj;
		return Objects.equals(dichVu, other.dichVu) && Objects.equals(hoaDonDV, other.hoaDonDV);
	}

	
}
