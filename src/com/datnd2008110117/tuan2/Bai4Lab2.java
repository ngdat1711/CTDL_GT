package com.datnd2008110117.tuan2;

import java.util.Scanner;
public class Bai4Lab2 {
    public static void main(String[] args) {
        System.out.println("=================MENU=================");
        System.out.println(" >>1.Giải phương trình bậc nhất");
        System.out.println(" >>2.Giải phương trình bậc 2 ");
        System.out.println(" >>3.Tính Tiền Điện ");
        System.out.println(" >>4.Kết thúc");
        System.out.println("=================MENU=================");

        int luaChon;
        System.out.print("Lựa chọn chức năng: ");
        Scanner menu = new Scanner(System.in);
        luaChon = menu.nextInt();

        switch(luaChon){
            case 1: giaiPTBac1(); break;
            case 2: giaiPTBac2(); break;
            case 3: tinhTienDien(); break;
            case 4: System.out.println(" Hết Rồi Nha !!!!! ");
        }
    }

    static void giaiPTBac1(){
        int a, b;
        double c;

        Scanner PTBac1 = new Scanner(System.in);

        System.out.print("Nhập A: ");
        a = PTBac1.nextInt();
        System.out.print("Nhập B: ");
        b = PTBac1.nextInt();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương Trình Vô Số Nghiệm");
            }
            else{
                System.out.println("Phương Trình Vô Nghiệm");
            }
        }
        else{
            c = (double) - b / a;   
            System.out.printf("Nghiệm Của Phương Trình %dx + %d = 0 là %.2f ",a ,b ,c );
        }
    }

    static void giaiPTBac2(){
        int x, y, z;
        double x1, x2, delta;

        Scanner PTBac2 = new Scanner(System.in);

        System.out.print("Nhập X: ");
        x = PTBac2.nextInt();

        System.out.print("Nhập Y: ");
        y = PTBac2.nextInt();

        System.out.print("Nhập Z: ");
        z = PTBac2.nextInt();

        if(x == 0){
            if(y == 0){
                if(z == 0)
                    System.out.println("Phương Trình Vô Số Nghiệm");
                else
                    System.out.println("Phương Trình Vô Nghiệm");
            }
            else{
                x1 = (double) - x / z;
                System.out.println("Phương Trình Có Nghiệm");
            }
        }
        else{

            delta = Math.pow(y, 2) - 4 * x * z;
            if(delta > 0 ){
                System.out.println("Phương Trình Có 2 Nghiệm Phân Biệt");
                x1 = (double)( - y + Math.sqrt(delta)) / 2 * x;

                System.out.print("+ x1 = %.2f" + x1);
                x2 = (double)( - y - Math.sqrt(delta)) / 2 * x;

                System.out.println("+ x2 = %.2f" + x2);
            }
            else{
                if(delta < 0)
                    System.out.println("Phương Trình Vô Nghiệm");
                else{
                    x1 = x2 = (double) - y / 2 * x;
                    System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f" + x1);
                }
            }
        }
    } 

    static void tinhTienDien(){
        int soDien;

        Scanner TienDien = new Scanner(System.in);
        
        System.out.print("Số điện đã dùng trong tháng: ");
        soDien = TienDien.nextInt();

        if(soDien <= 100){
            System.out.println("Số tiền điện trong tháng phải đóng: " + (soDien*500) + "VND");
        }
        else{
            System.out.println("Số tiền diện trong tháng phải đóng: " + (100 * 500 + (soDien - 50) * 1600) + "VND");
        }
    }
}
