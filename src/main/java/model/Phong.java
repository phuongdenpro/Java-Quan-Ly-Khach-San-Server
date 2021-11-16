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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Phong implements Serializable{
	@Id
    private String maPhong;
    private int sucChua;
    private int soGiuong;
    @Column(columnDefinition = "NVARCHAR(50)")
    private String viTri;
    private int tinhTrang;
    
    @ManyToOne
	@JoinColumn(name="maLoaiPhong")
    private LoaiPhong loaiPhong;
    
    
    @OneToMany(mappedBy = "phong")
	private List<ChiTietHoaDonPhong> dsChiTietHoaDonPhong;
    
    public Phong() {
	
	}

    public Phong(String maPhong, int sucChua, int soGiuong, String viTri, int tinhTrang, LoaiPhong loaiPhong) {
        this.maPhong = maPhong;
        setSucChua(sucChua);
        setSoGiuong(soGiuong);
        this.viTri = viTri;
        this.tinhTrang = tinhTrang;
        this.loaiPhong = loaiPhong;
    }


    public Phong(String maPhong, LoaiPhong loaiPhong) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        if (sucChua <= 0)
            sucChua = 1;
        this.sucChua = sucChua;
    }

    public int getSoGiuong() {
        return soGiuong;
    }

    public void setSoGiuong(int soGiuong) {
        if (soGiuong <= 0)
            soGiuong = 1;
        this.soGiuong = soGiuong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

}
