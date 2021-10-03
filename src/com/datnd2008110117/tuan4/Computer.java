package com.datnd2008110117.tuan4;

public class Computer {
    String nhaSanXuat;
    int namSanXuat;
    String heDieuHanh;
    String Ram;
    String Cpu;
    int gia;
    String namBaoHanh;

    public Computer(){}

    public Computer(String NhaSX, int NamSX, String HDH, String R, String C, int g, String NBH){

        nhaSanXuat = NhaSX;
        namSanXuat = NamSX;
        heDieuHanh = HDH;
        Ram = R;
        Cpu = C;
        gia = g;
        namBaoHanh = NBH;
    }

    void inThongTinComputer(){

        System.out.println("Nhà Sản Xuất: " + nhaSanXuat);
        System.out.println("Năm Sản Xuất: " + namBaoHanh);
        System.out.println("Hệ Điều Hành: " + heDieuHanh);
        System.out.println("RAM: " + Ram);
        System.out.println("CPU: " + Cpu);
        System.out.println("Giá Bán: " + gia);
        System.out.println("Bảo Hành Tới Năm  " + namBaoHanh);

    }



    
}
