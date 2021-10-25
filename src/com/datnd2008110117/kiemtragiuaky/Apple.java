package com.datnd2008110117.kiemtragiuaky;

import java.util.Scanner;

public class Apple {
    int ma;
    double khoiLuong;
    String mauSac;
    Scanner tao = new Scanner(System.in);

    public Apple(){}

    public Apple( int ID, double KL, String MS){
        ma = ID;
        khoiLuong = KL;
        mauSac = MS;

    }

    void inThongTinApple(){
        System.out.println("Mã số ID: " + ma);
        System.out.println("Khối lượng: " + khoiLuong + "gam");
        System.out.println("Màu Sắc của táo: " + mauSac);
        System.out.println("==================================");

    }

    public void nhapThongTinApple() {
        System.out.println("Mã id: ");
        ma = tao.nextInt();
        System.err.println("Khối Lượng: ");
        khoiLuong = tao.nextDouble();
        System.out.println("Màu sắc: ");
        mauSac = tao.nextLine();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

