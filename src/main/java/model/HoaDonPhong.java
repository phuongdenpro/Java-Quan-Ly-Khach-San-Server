package model;

import java.io.Serializable;
import java.sql.*;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import utils.Ngay;

@Entity
public class HoaDonPhong implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maHD;
    private int tinhTrang;
    private Date ngayGioNhan;
    private Date ngayGioTra;

    @ManyToOne
	@JoinColumn(name="MaKH")
    private KhachHang khachHang;
    
    @OneToMany(mappedBy = "hoaDonPhong")
	private List<ChiTietHoaDonPhong> dsChiTietHoaDonPhong;
    
    
    
    
    
    public HoaDonPhong() {
	
	}

    public HoaDonPhong(int maHD, int tinhTrang, Date ngayGioNhan, Date ngayGioTra, KhachHang khachHang) {
        this.maHD = maHD;
        this.tinhTrang = tinhTrang;
        this.ngayGioNhan = ngayGioNhan;
        this.ngayGioTra = ngayGioTra;
        this.khachHang = khachHang;
    }
    
    public HoaDonPhong(Date ngayGioNhan, Date ngayGioTra, KhachHang khachHang, List<ChiTietHoaDonPhong> dscthdp) {
        this.ngayGioNhan = ngayGioNhan;
        this.ngayGioTra = ngayGioTra;
        this.khachHang = khachHang;
        this.dsChiTietHoaDonPhong = dscthdp;
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

    public Date getNgayGioNhan() {
        return ngayGioNhan;
    }

    public void setNgayGioNhan(Date ngayGioNhan) {
        this.ngayGioNhan = ngayGioNhan;
    }

    public Date getNgayGioTra() {
        return ngayGioTra;
    }

    public void setNgayGioTra(Date ngayGioTra) {
        this.ngayGioTra = ngayGioTra;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }
    
    public List<ChiTietHoaDonPhong> getDsChiTietHoaDonPhong() {
		return dsChiTietHoaDonPhong;
	}

	public void setDsChiTietHoaDonPhong(List<ChiTietHoaDonPhong> dsChiTietHoaDonPhong) {
		this.dsChiTietHoaDonPhong = dsChiTietHoaDonPhong;
	}
	
	public int getID() {
		return this.maHD;
	}

	@Override
	public String toString() {
		return "HoaDonPhong [maHD=" + maHD + ", tinhTrang=" + tinhTrang + ", ngayGioNhan=" + ngayGioNhan
				+ ", ngayGioTra=" + ngayGioTra + ", dsChiTietHoaDonPhong=" + dsChiTietHoaDonPhong + ", khachHang="
				+ khachHang + "]";
	}

//	public int compareDate(Date d1, Date d2) {
//        if (d1.toString().equals(d2.toString()))
//            return 0;
//
//        if (d1.before(d2))
//            return -1;
//
//        return 1;
//    }
	
    

//  public double tinhTongTien(){
//      double tongTien = phong.getLoaiPhong().getDonGia()*tinhSoNgay();
//      System.out.println(tongTien);
//      tongTien = tongTien - khachHang.getSoLanDatPhong()*3*(tongTien/100);
//      return tongTien;
//  }

//  public int tinhSoNgay(){
//      // System.out.print(ngayGioTra.getTime());
//      // System.out.print(ngayGioNhan.getTime());
//      long d = ngayGioTra.getTime() - ngayGioNhan.getTime();
//      System.out.println(ngayGioTra.compareTo(ngayGioNhan));
//      
//      return (int)d/86400000 + 1;
//  }
}
