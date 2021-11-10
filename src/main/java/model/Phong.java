package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Phong implements Serializable{
    private String maPhong;
    private int sucChua;
    private int soGiuong;
    private String viTri;
    private int tinhTrang;
    private LoaiPhong loaiPhong;

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
