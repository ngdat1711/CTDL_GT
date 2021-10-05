package com.datnd2008110117.tuan1;

import java.util.Scanner;

public class Bai1Lab1 {
    public static void main(String[] args) {
    
        Scanner bienNhap = new Scanner(System.in);

        System.out.print("Họ Và Tên: ");
        String hoTen = bienNhap.nextLine();

        System.out.print("Điểm TB: ");
        double diemTB = bienNhap.nextDouble();

        System.out.printf("%s %f điểm",hoTen , diemTB);
        
    }
    
}
