package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoaiPhong implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int maLoaiPhong;
    private String tenLoaiPhong;
    private Double donGia;
	 
	@OneToMany(mappedBy = "loaiPhong")
	private List<Phong> dsPhong;

	public LoaiPhong() {
	
	}
	
    public LoaiPhong(int maLoaiPhong, String tenLoaiPhong, Double donGia) {
        this.maLoaiPhong = maLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        setDonGia(donGia);
    }
    
    public LoaiPhong(String tenLoaiPhong, Double donGia) {
        this.maLoaiPhong = maLoaiPhong;
        this.tenLoaiPhong = tenLoaiPhong;
        setDonGia(donGia);
    }


    public int getMaLoaiPhong() {
        return maLoaiPhong;
    }

    public void setMaLoaiPhong(int maLoaiPhong) {

        this.maLoaiPhong = maLoaiPhong;
    }

    public String getTenLoaiPhong() {
        return tenLoaiPhong;
    }

    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        if (donGia < 0)
            donGia = 0.0;
        this.donGia = donGia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tenLoaiPhong == null) ? 0 : tenLoaiPhong.hashCode());
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
        LoaiPhong other = (LoaiPhong) obj;
        if (tenLoaiPhong == null) {
            if (other.tenLoaiPhong != null)
                return false;
        } else if (!tenLoaiPhong.equals(other.tenLoaiPhong))
            return false;
        return true;
    }

}
