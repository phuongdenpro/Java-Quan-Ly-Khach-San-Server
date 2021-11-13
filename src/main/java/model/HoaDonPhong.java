package model;

import java.io.Serializable;
import java.sql.*;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HoaDonPhong implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int maHD;
    private int tinhTrang;
    @Column(columnDefinition = "Datetime")
    private LocalDateTime ngayGioNhan;
    @Column(columnDefinition = "Datetime")
    private LocalDateTime ngayGioTra;

    @ManyToOne
	@JoinColumn(name="MaPhong")
    private Phong phong;
    
    @ManyToOne
	@JoinColumn(name="MaKH")
    private KhachHang khachHang;
    
    public HoaDonPhong() {
	
	}

    public HoaDonPhong(int maHD, int tinhTrang, LocalDateTime ngayGioNhan, LocalDateTime ngayGioTra, Phong phong, KhachHang khachHang) {
        this.maHD = maHD;
        this.tinhTrang = tinhTrang;
        this.ngayGioNhan = ngayGioNhan;
        this.ngayGioTra = ngayGioTra;
        this.phong = phong;
        this.khachHang = khachHang;
    }
    
    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public LocalDateTime getNgayGioNhan() {
        return ngayGioNhan;
    }

    public void setNgayGioNhan(LocalDateTime ngayGioNhan) {
        this.ngayGioNhan = ngayGioNhan;
    }

    public LocalDateTime getNgayGioTra() {
        return ngayGioTra;
    }

    public void setNgayGioTra(LocalDateTime ngayGioTra) {
        this.ngayGioTra = ngayGioTra;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

//    public double tinhTongTien(){
//        double tongTien = phong.getLoaiPhong().getDonGia()*tinhSoNgay();
//        System.out.println(tongTien);
//        tongTien = tongTien - khachHang.getSoLanDatPhong()*3*(tongTien/100);
//        return tongTien;
//    }

//    public int tinhSoNgay(){
//        // System.out.print(ngayGioTra.getTime());
//        // System.out.print(ngayGioNhan.getTime());
//        long d = ngayGioTra.getTime() - ngayGioNhan.getTime();
//        System.out.println(ngayGioTra.compareTo(ngayGioNhan));
//        
//        return (int)d/86400000 + 1;
//    }
    
    public int compareDate(Date d1, Date d2) {
        if (d1.toString().equals(d2.toString()))
            return 0;

        if (d1.before(d2))
            return -1;

        return 1;
    }
}
