package com.datnd2008110117.tuan4;

public class Worker {

    String nameWork;
    int luong;
    String address;
    String boPhan;
    String ngayThang;

    public Worker(){}

    public Worker(String nW, int l, String add, String b, String n){

        nameWork = nW;
        luong = l;
        address = add;
        boPhan = b;
        ngayThang = n;
    }
    void inThongTinWorker(){

        System.out.println("Tên Nhân Viên: " + nameWork);
        System.out.println("Lương Hàng Tháng: " + luong);
        System.out.println("Địa Chỉ của Nhân Viên: " + address);
        System.out.println("Bộ phận làm việc: " + boPhan);
        System.out.println("Ngày tháng năm sinh: " + ngayThang);
    }
    
    
}
