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

        System.out.println("Tên chủ Xe: "+ tenChuXe + "Hãng Sản Xuất: "+ hangSanXuat + "Dòng Xe: "+ dongxe + "giấy phép lưu hành xe" + giayPhep + "Dung tích Xăng: "+dungTichXang);
    }
    
}
