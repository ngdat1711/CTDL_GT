package com.datnd2008110117.tuan3;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanVien;
        nhanVien = new NhanVien();
        nhanVien.tenNhanVien = "Nguyễn Văn Tèo";
        nhanVien.luong = 5500000;
        nhanVien.diaChi = "1/2/3 Phường An Lạc,Quận Bình Tân, TPHCM";
        nhanVien.boPhanLamViec = "Nhân Viên Bán Hàng";
        nhanVien.ngaySinh = "1/2/2000";

        nhanVien.inThongTinNhanVien();
    }
    
}
