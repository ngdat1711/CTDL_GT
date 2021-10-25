package com.datnd2008110117.kiemtragiuaky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {

        Apple[] danhSachApple = new Apple[3];

        Scanner tao = new Scanner(System.in);

        System.out.println("    Nhập bao nhiêu quả táo ");
        double soLuong = tao.nextDouble();

        for(int i = 0;i< soLuong; i++){
            System.out.println("Nhập quả táo thứ " + (i+1));

            System.out.println("ID: ");
            int ma = tao.nextInt();

            System.out.println("Khối Lượng: ");
            double khoiLuong = tao.nextDouble();

            System.out.println("Màu Sắc: ");
            String mauSac = tao.nextLine();
            tao.nextLine();

            danhSachApple[i] = new Apple(ma, khoiLuong, mauSac);
        }
    }


    
    static void timTao(int ma, double khoiLuong, String mauSac){
        Apple result = null;
        for(Apple apple : danhSachApple){
            if(apple.ma.equals)
        }
    }

       

        



    
}

