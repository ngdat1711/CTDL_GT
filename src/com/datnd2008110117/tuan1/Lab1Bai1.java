package com.datnd2008110117.tuan1;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args){

        String hoTen;
        double diemTB;

        Scanner thongTinCaNhan = new Scanner(System.in);

        System.out.print("Họ Và Tên: ");
        hoTen = thongTinCaNhan.nextLine();

        System.out.print("Điểm Trung Bình: ");
        diemTB = thongTinCaNhan.nextDouble();
        
        System.out.printf("%s: %.2f điểm " ,hoTen , diemTB);
    }

    
}
