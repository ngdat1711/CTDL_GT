package com.datnd2008110117.tuan4;

public class Book1 {

    double gia;
    double namXuatBan;
    String nhaXuatBan;
    int soLuong;


    public Book1(){}
    
    public Book1(double g, double nam, String nha, int sl){

        gia = g;
        namXuatBan = nam;
        nhaXuatBan = nha;
        soLuong = sl;

    }
    
   void inThongTinBook1(){

    System.out.println(" Giá bán: " + gia);
    System.out.println("Năm Xuất Bản: " + namXuatBan);
    System.out.println("Nhà Xuất Bản: " + nhaXuatBan);
    System.out.println("Số Lượng: " + soLuong);
   }



    
}
