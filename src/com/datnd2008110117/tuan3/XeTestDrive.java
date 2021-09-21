package com.datnd2008110117.tuan3;

public class XeTestDrive {
    public static void main(String[] args) {
        Xe xe;
        xe = new Xe();
        xe.tenChuXe = "Nguyễn Văn Tèo Em";
        xe.hangSanXuat = "Toyota";
        xe.dong = "Vios 2017";
        xe.soGiayPhepLaiXe = 12345678l;
        xe.dungTichXang = "42 lít ";
        
        xe.inThongTinXeHoi();

    }
    
}
