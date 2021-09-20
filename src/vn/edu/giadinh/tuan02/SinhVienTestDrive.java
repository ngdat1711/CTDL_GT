package vn.edu.giadinh.tuan02;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sinhVien;//Khai bao bien ten la sinhVien tham chieu doi tuong kieu SinhVien
        sinhVien = new SinhVien();//Tao doi tuong sinh vien trong vung nho heap
        sinhVien.MSSV = " 2008110117";
        sinhVien.queQuan = " Thanh Hoa";
        sinhVien.tenSinhVien = " Nguyen Dinh Dat";
        sinhVien.tuoi = 18;

        sinhVien.inThongTinSinhVien();

    }
    
}
