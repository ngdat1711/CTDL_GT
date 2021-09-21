package com.datnd2008110117.tuan3;

public class NhanVien {
    
    String tenNhanVien;
    double luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;

    void inThongTinNhanVien(){

        System.out.println("Tên Nhân Viên: " + tenNhanVien );
        System.out.println("Lương Chính Thức: " + luong);
        System.out.println("Địa chỉ Nhà Của Nhân Viên: " + diaChi);
        System.out.println("Bộ Phận Làm Việc Của Nhân Viên: " + boPhanLamViec);
        System.out.println("Ngày Tháng Năm Sinh của Nhân VIên: " + ngaySinh);
    }
}
