package com.datnd2008110117.tuan2;

import java.util.Scanner;

public class Bai3Lab2 {
    public static void main(String[] args) {
        int soDien;

        Scanner tienDien = new Scanner(System.in);

        System.out.print("Số điện đã dùng trong tháng: ");
        soDien = tienDien.nextInt();

        if(soDien <= 50){
           System.out.println("Số tiền điện trong tháng phải đóng: " + (soDien*1000) + "VND");
        }
        else{
            System.out.println("Số tiền diện trong tháng phải đóng: " + (50 * 1000 + (soDien - 50) * 1200) + "VND");
        }


    }
    
}
