package com.datnd2008110117.tuan5.Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//dựa theo bài 1 lab 5

public class Bai2Lab5 {
    public static void main(String[] args) {
        String hoVaTen;

        ArrayList<String> menu = new ArrayList<String>();
        menu = nhap();
        xuatHoVaTen(menu);
        sapXepGiamDan(menu);
        xuatNgauNhien(menu);
        Scanner bienTen = new Scanner(System.in);

        System.out.println("Họ và tên cần phải xóa: ");
        hoVaTen = bienTen.nextLine();
        xoa(menu);
    }

    //nhập họ và tên
    static ArrayList<String> nhap(){
        String x;

        ArrayList<String> danhSachNhapHoVaTen =new ArrayList<String>();
        Scanner hoVaTen = new Scanner(System.in);

        while (true){
            System.out.print(" Nhập Họ và Tên: ");
            x = hoVaTen.nextLine();
            danhSachNhapHoVaTen.add(x);

            System.out.print(" Nhập thêm (Y/N)? ");
            if(hoVaTen.nextLine().equals("N")){
                break;
            }
        }
        return danhSachNhapHoVaTen;
    }

    //xuất họ và tên
    static void xuatHoVaTen (ArrayList<String> danhSachXuatHoVaTen){
        System.out.println("Danh sách họ và tên: ");
        for (String string : danhSachXuatHoVaTen){
            System.out.println(" Xuất danh sách họ và tên: " + string);
        }
    }

    //Sắp xếp giảm dần
    static void sapXepGiamDan (ArrayList<String>danhSachGiamDanVaXuatDanhSach){
        Collections.sort(danhSachGiamDanVaXuatDanhSach);
            System.out.println("Sắp xếp Phần Tử Giảm Dần: "+ danhSachGiamDanVaXuatDanhSach);

        Collections.reverse(danhSachGiamDanVaXuatDanhSach);
            System.out.println(" Đảo các Phần Tử và Xuất Danh Sách: " + danhSachGiamDanVaXuatDanhSach);
    }

    //Xuất Ngẫu Nhiên
    static void xuatNgauNhien (ArrayList<String> danhSachXuatNgauNhien){
        Collections.shuffle(danhSachXuatNgauNhien);
            System.out.println(" Xuất danh sách Ngẫu Nhiên: " + danhSachXuatNgauNhien);
    }
    
    //Xóa DE TE LE 
    static void xoa(ArrayList<String> danhSachTimVaXoaHoTen){
            
        danhSachTimVaXoaHoTen.remove(danhSachTimVaXoaHoTen);

    }

}
    

