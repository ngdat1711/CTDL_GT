package com.datnd2008110117.tuan1;

import java.util.Scanner;

public class Bai4Lab1 {
    public static void main(String[] args) {
        double delta;
        int x;
        int y; 
        int z;
        
        Scanner canBac2 = new Scanner(System.in);

        System.out.print("Nhập cạnh X: ");
        x = canBac2.nextInt();

        System.out.print("Nhập cạnh Y: ");
        y = canBac2.nextInt();

        System.out.print("Nhập cạnh Z: ");
        z = canBac2.nextInt();

        delta = Math.pow(y, 2) - 4 * x * z;
        System.out.println("Căn Delta: " + delta);

    }
    
}
