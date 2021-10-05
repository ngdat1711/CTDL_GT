package com.datnd2008110117.tuan1;

import java.util.Scanner;

public class Bai2Lab1 {
    public static void main(String[] args) {
        int chieuDai;
        int chieuRong;
        int chuVi;
        int dienTich;

        Scanner tinh = new Scanner(System.in);

        System.out.print("Nhập vào chiều dài: ");
        chieuDai = tinh.nextInt();

        System.out.print("Nhập vào chiều rộng: ");
        chieuRong = tinh.nextInt();

        chuVi = (chieuDai + chieuRong)*2;
        dienTich = chieuDai * chieuRong;
        
        System.out.println("Chu vi hình chữ nhật: " + chuVi+ "cm");
        System.out.println("Diện Tích hình chữ nhật: " + dienTich + "m2");
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật: " + Math.min(chieuDai, chieuRong));

    }

    
}
