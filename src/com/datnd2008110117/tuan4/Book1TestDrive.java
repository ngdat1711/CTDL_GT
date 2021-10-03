package com.datnd2008110117.tuan4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Book1TestDrive {
    public static void main(String[] args) {
        
        Book1[] danhSachBook1 = new Book1[2];

        Scanner varInput = new Scanner(System.in);
        System.out.println("Nhập Dữ Liệu Sách ");

        for(int i = 0; i < danhSachBook1.length; i++){

            System.out.println("Nhập cuốn sách thứ "+  (i+1) );

            System.out.print(" Giá bán Sách: ");
            double gia = varInput.nextDouble();

            System.out.print(" Năm Xuất Bản: ");
            double namXuatBan = varInput.nextDouble();
            varInput.nextLine();

            System.out.print(" Nhà Xuất Bản: ");
            String nhaXuatBan = varInput.nextLine();

            System.out.print(" Số lượng: ");
            int soLuong = varInput.nextInt();

            danhSachBook1[i] = new Book1(gia, namXuatBan, nhaXuatBan, soLuong);
        }

        System.out.println("========in thong tin sau khi nhap=======");
        for(Book1 book1: danhSachBook1){

            book1.inThongTinBook1();
        }

        List list = Arrays.asList(danhSachBook1);

        Comparator comparator = new Comparator<Book1>(){

            @Override
            public int compare(Book1 o1, Book1 o2){
                return Integer.compare(o1.soLuong, o2.soLuong);

            }
        };
        

        list.sort(comparator);

        System.out.println("========in thong tin sau khi so sanh=======");
        for(Book1 book1: danhSachBook1){

            book1.inThongTinBook1();
        }


    }


    
}
