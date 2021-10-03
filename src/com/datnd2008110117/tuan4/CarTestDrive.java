package com.datnd2008110117.tuan4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CarTestDrive {
    public static void main(String[] args) {
        
        Car[] danhSachCar = new Car[2];


        Scanner varInput = new Scanner(System.in);
        System.out.println(" Nhập danh sách car ");

        for(int i = 0; i< danhSachCar.length; i++){
            System.out.println("Nhập tên chủ xe thứ " + (i+1));

            System.out.print(" Tên chủ xe: ");
            String tenChuXe = varInput.nextLine();

            System.out.print(" Hãng Sản XUất: ");
            String hangSanXuat = varInput.nextLine();

            System.out.print(" Dòng Xe: ");
            String dongXe = varInput.nextLine();

            System.out.print("Mã Số Giấy phép lưu hành xe: ");
            String giayPhep = varInput.nextLine();

            System.out.print(" Dung Tích Xăng: ");
            int dungTichXang = varInput.nextInt();

            danhSachCar[i] = new Car(tenChuXe, hangSanXuat, dongXe, giayPhep, dungTichXang);;
        }
        
        System.out.println("===In danh sách chủ xe sau khi nhập======");
        for(Car car : danhSachCar){

            car.inThongTinChuXe();
        }

        List list = Arrays.asList(danhSachCar);

        Comparator comparator = new Comparator<Car>(){
            
            @Override
            public int compare(Car o1, Car o2){

                return Integer.compare(o1.dungTichXang, o2.dungTichXang);

            }
        };
        list.sort(comparator);

        System.out.println("===In danh sách sau khi sắp xếp======");
        for(Car car : danhSachCar){

            car.inThongTinChuXe();
        }

    }
    
}
