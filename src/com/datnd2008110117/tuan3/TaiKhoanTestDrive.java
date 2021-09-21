package com.datnd2008110117.tuan3;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        
        TaiKhoan taiKhoan;
        taiKhoan = new TaiKhoan();
        taiKhoan.tenChuTaiKhoan = "Nguyễn Văn Tèo Anh";
        taiKhoan.soTaiKhoan = "21092021";
        taiKhoan.soDuTrongTaiKhoan = "Còn 1000000VND";

        taiKhoan.inThongTinChuTaiKhoanNganHang();
    }
    
}
