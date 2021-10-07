package com.datnd2008110117.tuan2;

import java.util.Scanner;

public class Bai2Lab2 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        double a1;
        double a2;
        double delta;
        Scanner pTB2 = new Scanner(System.in);

        System.out.print("Nhập X: ");
        x = pTB2.nextInt();

        System.out.print("Nhập Y: ");
        y = pTB2.nextInt();

        System.out.print("Nhập Z: ");
        z = pTB2.nextInt();

        if(x == 0){
            if(y == 0){
                if(z == 0)
                    System.out.println("Phương trình vô số nghiệm");
        
                else
                    System.out.println("Phương trình vô nghiệm");
            }
        
            else{
                a1 = (double)-x/z;
                System.out.println("Phương trình có nghiệm" + a1);
            }
        }

        else{

            delta = Math.pow(y, 2) - 4 * x * z;
            if(delta > 0){

                System.out.println("Phương trình có 2 nghiệm phân biệt");
                a1 = (double)( - y + Math.sqrt(delta)) / 2 * x;
            
                System.out.printf("+ a1 = %.2f", a1);
                a2 = (double)( - y - Math.sqrt(delta)) / 2 * x;
            
                System.out.printf("+ a2 = %.2f", a2);
            }

            else{
                if(delta < 0)
                    System.out.println("Phương trình vô nghiệm");
                else{
                    a1 = a2 = (double) - y / 2 * x;
                    System.out.printf("Phương trình có nghiệm kép a1 = a2 = %.2f" + a1);
                }
            }
        }
    }  

}
    

