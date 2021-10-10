package com.datnd2008110117.tuan5.Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1Lab5 {
    public static void main(String[] args) {
        ArrayList<Double> n = new ArrayList<Double>();
        n = nhapSo();
        xuatSo(n);
    }
    
    static ArrayList<Double> nhapSo(){
        ArrayList<Double> danhSachHeSo =new ArrayList<Double>();
        Scanner heSo = new Scanner(System.in);
        while (true){
            System.out.print("Nhập 1 số vào từ bàn phím: ");
            Double x = heSo.nextDouble();

            danhSachHeSo.add(x);
            heSo.nextLine();
            
            System.out.print("Nhập thêm(Y/N)? ");
            if(heSo.nextLine().equals("N")){
                break;
            }

        }
        return danhSachHeSo;
    }

    static void xuatSo(ArrayList<Double> danhSachHeSo2){
        double tongSo = 0;
        System.out.println("Các phần tử list: ");
        
        for (Double double1 : danhSachHeSo2) {
            System.out.println("Xuất phần tử trong list: " + double1);
            tongSo = tongSo + double1;
        }

        System.out.println("Tổng các phần tử list:  " + tongSo);

    }
    
}
