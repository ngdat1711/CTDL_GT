package com.datnd2008110117.tuan3.Lab3;

import java.util.Scanner;

public class Bai4Lab3 {
    public static void main(String[] args) {
        Scanner diemHS = new Scanner(System.in);

        System.out.print("Số Học Sinh cần nhập thông tin: ");
        int n = diemHS.nextInt();

        String hoVaTen[] = new String[n];
        double diem[] = new double[n];
        
        for(int i = 0;i < n;i++){
            System.out.printf("  Nhập Họ và Tên Học Sinh thứ %d: ", i+1);
            hoVaTen[i] =diemHS.nextLine();
            diemHS.nextLine();

            System.out.printf("  Nhập điểm Học Sinh thứ %d: ", i+1);
            diem[i] = diemHS.nextDouble();
        }

        for(int i = 0;i < n - 1;i++){
            for(int j = i + 1;j < n;j++){
                if(diem[i] > diem[j]){
                    
                    double so = diem[i];
                    diem[i] = diem[j];
                    diem[j] = so;

                    String hS = hoVaTen[i];
                    hoVaTen[i] = hoVaTen[j];
                    hoVaTen[j] = hS;
                }
            }
        }

        for(int i = 0;i < n;i++){
            if(diem[i] < 5){
                System.out.printf("\nHọc Sinh thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học Sinh Yếu", hoVaTen[i], diem[i]);
            }
            else if(diem[i] <= 6.5){
                System.out.printf("\nHọc Sinh thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học Sinh Trung Bình", hoVaTen[i], diem[i]);
            }
            else if(diem[i] <= 7.5){
                System.out.printf("\nHọc Sinh thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học Sinh Tiên Tiến", hoVaTen[i], diem[i]);
            }
            else if(diem[i] <= 9){
                System.out.printf("\nHọc Sinh thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học Sinh Giỏi", hoVaTen[i], diem[i]);
            }
            else if(diem[i] >= 9){
                System.out.printf("\nHọc Sinh thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học Sinh Xuất Sắc", hoVaTen[i], diem[i]);
            }  
        }   
    }
}

        

