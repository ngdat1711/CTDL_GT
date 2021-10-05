package com.datnd2008110117.tuan2;

import java.util.Scanner;

public class Bai1Lab2 {
    public static void main(String[] args) {
        int a;
        int b;
        double c;

        Scanner heSo = new Scanner(System.in);

        System.out.print("Nhập a: ");
        a = heSo.nextInt();

        System.out.print("Nhập b: ");
        b = heSo.nextInt();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            c = (double)-b/a;
            System.out.println("Nghiệm của phương trình " + c);
        }

    }
    
}
