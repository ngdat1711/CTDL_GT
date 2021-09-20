package vn.edu.giadinh.tuan03;

import java.util.Scanner;

public class ChuongTrinhLab2Bai4 {

    public static void main(String[] args) {
        System.out.println("======Menu======");
        System.out.println(">>1.Giai Phuong Trinh Bac I ");
        System.out.println(">>2.Giai Phuong Trinh Bac II ");
        System.out.println(">>3.Tinh Tien Dien ");
        System.out.println("======Menu======");
        int suLuaChon;
        System.out.println("Lua Chon Chuc Nang: ");
        Scanner bienNhap;
        bienNhap  = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();


        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTBacII(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Chon Chuc Nang Khac ");

        }
    }

    static void giaiPTBacI(){

        float a = 0, b = 0;

        if (a==0){
            if (b==0){
                System.out.println("PT vo so nghiem...");
            }
        }
    
    }

    static void giaiPTBacII(){
        System.out.println("Trien Khai code GPTBII.... ");
    }

    static void tinhTienDien(){
        System.out.println("Trien Khai code Tinh Tien Dien");
    }
}

