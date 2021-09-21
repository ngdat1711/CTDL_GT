package com.datnd2008110117.tuan3;

public class Book {
    
    //1.Thuoc Tinh
    double gia;
    String nhaXuatBan;
    double namXuatBan;
    double giaBan;
    int soLuong;
    
    //2.Phuong Thuc
    //<Kieu tra ve> <ten ham> <(danh sach tham so)>{....}
    void inThongTinSach(){

        System.out.println("Giá Sách Của Hãng: " + gia);
        System.out.println("Nhà Xuất Bản: " + nhaXuatBan);
        System.out.println("Năm Xuất Bản: " + namXuatBan);
        System.out.println("Giá Bán Của Nhà Sách: " + giaBan);
        System.out.println("Số Lượng: " + soLuong);
    } 

}
