package com.datnd2008110117.tuan1;

import java.util.Scanner;

public class Bai3Lab1 {
    public static void main(String[] args) {
        double canh;
        //double theTich;

        Scanner c = new Scanner(System.in);

        System.out.print("Nhập cạnh của khối Lập Phương: ");
        canh = c.nextInt();
        //theTich = canh * canh * canh;
        //Math.pow(canh, 3);

        //System.out.println("Thể tích khối lập phương: " + theTich + "m3");
        System.out.println("Thể tích khối lập phương: "+ Math.pow(canh, 3));
        
    }
    
}
