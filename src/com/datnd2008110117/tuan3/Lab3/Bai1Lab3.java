package com.datnd2008110117.tuan3.Lab3;

import java.util.Scanner;

public class Bai1Lab3 {
    public static void main(String[] args) {
        int q;
        boolean ok = true;

        Scanner Q = new Scanner(System.in);
        System.out.print("Nhập số Q: ");
        q = Q.nextInt();

        for(int i=2; i < q- 1; i++){
            if(q % i == 0){
                ok = false;
                break;
            }
        }
        
        if(ok == true){
            System.out.println(q + "là số nguyên tố ");
        }
        else{
            System.out.println(q + " không phải là số nguyên tố");
        }
    }
}
