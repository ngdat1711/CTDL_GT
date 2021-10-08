package com.datnd2008110117.tuan3.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3Lab3 {
    public static void main(String[] args) {
        int tong = 0;
        int dem = 0;
        
        int a[] = new int[7];

        Scanner mangSoNguyen = new Scanner(System.in);

        for(int n = 0; n < a.length; n++){
            System.out.print("Nhập phẩn tử thứ " + (n+1) + ": ");
            a[n] = mangSoNguyen.nextInt();
        }

        System.out.println("Các Phần tử trong mảng: " + Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("Các Phần tử trong mảng sau khi sắp xếp: " + Arrays.toString(a));

        int min = a[0];
        for(int n = 1; n < a.length; n++){
            min = Math.min(min, a[n]);
        }
        System.out.println("Số phần tử nhỏ nhất "+ min);

        int max = a[0];
        for(int n = 1; n < a.length; n++){
            max = Math.max(max, a[n]);
        }
        System.out.println("Số phần tử lớn nhất "+ max);
        
        for(int n = 0; n< a.length; n++){
            if(a[n] % 3 == 0){
                tong = tong + a[n];
                dem = dem + 1;
            }
        }
        float tinhTBCong =(float) tong / dem;
        System.out.println("Trung bình cộng chia hết cho 3: " + tinhTBCong);
    }
    
}
