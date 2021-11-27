USE QLKS
GO

INSERT INTO dbo.KhachHang
	(tenKH, cmnd, soDienThoai, ngayHetHan, loaiKH)
VALUES
	(N'Chí Phèo', N'123123123', '0987654321', '20230101', N'Việt Nam'),
	(N'Xuân Tóc Đỏ', N'123123123', '0987654322', '20220501', N'Việt Nam'),
	(N'Lão Hạc', N'123123123', '0987654333', '20230106', N'Việt Nam'),
	(N'John Wick', N'123123123', '0987655555', '20240513', N'Nước ngoài'),
	(N'Tony Stark', N'123123123', '0987654399', '20240206', N'Nước ngoài')
GO

-- Insert rows into table 'dbo.DichVu'
INSERT INTO dbo.DichVu
	(tenDV, donGia)
VALUES
	(N'Bún bò Huế', 30000),
	-- Ăn uống
	(N'Hũ tiếu gõ', 20000),
	-- Ăn uống
	(N'Mì 2 trứng', 17000),
	(N'Gửi xe', 5000),
	(N'Rửa xe', 30000),
	(N'Giặt, ủi là', 20000),
	(N'Xe đưa đón sân bay', 100000),
	(N'Cho thuê xe tự lái', 120000),
	(N'Trông trẻ', 30000),
	(N'Spa', 300000),
	(N'Đánh golf, tennis', 200000)
-- GO

-- INSERT INTO dbo.HoaDonDV
-- 	(maKH, ngayGioLap, TinhTrang)
-- VALUES
-- 	(1, '2021-05-19', 1),
-- 	(2, '2021-05-15', 1),
-- 	(3, '2021-05-19', 0)

-- INSERT INTO dbo.ChiTietDV
-- 	(MaHDDV, MaDV, SoLuong, NgayGioDat)
-- VALUES
-- 	(1, 1, 1, '2021-05-16'),
-- 	(1, 2, 2, '2021-05-16'),
-- 	(1, 4, 2, '2021-05-16'),
-- 	(2, 4, 1, '2021-05-02'),
-- 	(2, 5, 1, '2021-05-03'),
-- 	(2, 6, 2, '2021-05-05'),
-- 	(3, 8, 2, '2021-05-18'),
-- 	(3, 10, 2, '2021-05-19')
-- GO

INSERT INTO dbo.LoaiPhong
	(TenLoaiPhong, donGia)
VALUES
	(N'Phòng đơn', 20000),
	(N'Phòng đôi', 50000)
GO

INSERT INTO dbo.Phong
	(MaPhong, SoGiuong, SucChua, TinhTrang, ViTri, MaLoaiPhong)
VALUES
	(N'P101', 1, 2, 0, N'Tầng 1', 1),
	(N'P102', 1, 2, 0, N'Tầng 1', 1),
	(N'P103', 2, 4, 0, N'Tầng 1', 2),
	(N'P201', 2, 4, 0, N'Tầng 2', 2),
	(N'P202', 2, 2, 0, N'Tầng 2', 2),
	(N'P203', 1, 1, 0, N'Tầng 2', 1),
	(N'P301', 2, 4, 0, N'Tầng 2', 2),
	(N'P302', 2, 2, 0, N'Tầng 2', 2),
	(N'P303', 1, 1, 0, N'Tầng 2', 1)
GO

-- INSERT INTO dbo.HoaDonPhong
-- 	(MaKH, MaPhong, tinhTrang, NgayGioNhan, NgayGioTra)
-- VALUES
-- 	(1, N'P101', 1, '2021-05-16', '2021-05-16'),
-- 	(2, N'P102', 1, '2021-05-02', '2021-05-07'),
-- 	(3, N'P103', 2, '2021-05-16', NULL),
-- 	(5, N'P201', 0, '2021-05-30', '2021-06-10'),
-- 	(4, N'P201', 0, '2021-06-15', NULL)
-- GO
INSERT INTO dbo.HoaDonPhong (ngayGioNhan, ngayGioTra, tinhTrang, maKH)
	values ('11-16-2021', '11-16-2021', 0, 1);

INSERT INTO dbo.ChiTietHoaDonPhong (maHD, maPhong, donGia) values(1, 'P101', 20000);
INSERT INTO dbo.ChiTietHoaDonPhong (maHD, maPhong, donGia) values(1, 'P102', 20000);

INSERT INTO dbo.HoaDonDV (ngayGioLap, tinhTrang, maKH)
	values ('11-18-2021', 0, 2),
			('11-17-2021', 0, 1),
			('11-16-2021', 1, 1);

INSERT INTO dbo.ChiTietDV (maHDDV, maDV, soLuong, donGia) values(1, 1, 3, 11000);
INSERT INTO dbo.ChiTietDV (maHDDV, maDV, soLuong, donGia) values(1, 2, 5, 10000);
INSERT INTO dbo.ChiTietDV (maHDDV, maDV, soLuong, donGia) values(2, 3, 10, 13000);
INSERT INTO dbo.ChiTietDV (maHDDV, maDV, soLuong, donGia) values(2, 4, 5, 10000);
INSERT INTO dbo.ChiTietDV (maHDDV, maDV, soLuong, donGia) values(3, 5, 4, 12000);
INSERT INTO dbo.ChiTietDV (maHDDV, maDV, soLuong, donGia) values(3, 6, 5, 10000);
INSERT INTO dbo.ChiTietDV (maHDDV, maDV, soLuong, donGia) values(3, 1, 5, 11000);
	