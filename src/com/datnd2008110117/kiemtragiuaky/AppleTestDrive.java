package com.datnd2008110117.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDrive {

        Scanner dSTao = new Scanner(System.in);
        ArrayList<Apple> danhSachTao = new ArrayList<>();
    
    

    static void nhapDanhSachTao(){
        while(true){
            Apple apple = new Apple();
            apple.nhapThongTinTao();
            dSTao.nextDouble();
            
            danhSachTao
            .add(apple);

            System.out.println("    Nhập thêm: YES/NO ");


        }
    }
    
    static void xuatDanhSachTao(){
        for(Apple apple : danhSachTao ){
            apple.inThongTinTao();

        }
    }

    static void timMauTao(){
        System.out.println("    Màu Táo cần tìm là: ");
        for(Apple apple: danhSachTao){

            if(dSTao.nextString().equals(apple.mauSac))
            apple.inThongTinTao();
        }
    }
    
    
}
