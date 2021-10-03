package com.datnd2008110117.tuan4;

public class Car {

    String tenChuXe;
    String hangSanXuat;
    String dongxe;
    String giayPhep;
    int dungTichXang;

    public Car(){}

    public Car(String t, String h, String dx, String gp, int dtx){

        tenChuXe = t;
        hangSanXuat = h;
        dongxe = dx;
        giayPhep = gp;
        dungTichXang = dtx;
    }
    void inThongTinChuXe(){

        System.out.println("Tên chủ Xe: "+ tenChuXe);
        System.out.println("Hãng Sản Xuất: "+ hangSanXuat);
        System.out.println("Dòng Xe: "+ dongxe);
        System.out.println("Mã số giấy phép lưu hành xe" + giayPhep);
        System.out.println("Dung tích Xăng: "+dungTichXang);
    }

    
}
