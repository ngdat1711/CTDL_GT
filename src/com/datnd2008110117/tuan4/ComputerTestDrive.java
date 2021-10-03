package com.datnd2008110117.tuan4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComputerTestDrive{

    public static void main(String[] args) {
        //tạo ds Sinh Viên
        Computer[] danhSachComputer = new Computer[2];

        //Nhập vào từ bàn phím
        Scanner varInput = new Scanner (System.in);
        System.out.println(" Nhập danh sách máy tính ");


        for(int i = 0; i< danhSachComputer.length; i++){
            System.out.println("Nhập tên máy tính  thứ " + (i+1));

            System.out.print("  Nhà Sản Xuất: ");
            String nhaSanXuat = varInput.nextLine();

            System.out.print("  Năm sản xuất: ");
            int namSanXuat = varInput.nextInt();
            varInput.nextLine();

            System.out.print("  Hệ điều hành: ");
            String heDieuHanh = varInput.nextLine();

            System.out.print(" RAM : ");
            String Ram = varInput.nextLine();

            System.out.print(" CPU: ");
            String Cpu = varInput.nextLine();

            System.out.print(" Giá bán: ");
            int gia = varInput.nextInt();
            varInput.nextLine();

            System.out.print(" Năm bảo hành: ");
            String namBaoHanh = varInput.nextLine();


            danhSachComputer[i] = new Computer(nhaSanXuat, namSanXuat, heDieuHanh, Ram, Cpu, gia, namBaoHanh);
        }


        //In Danh Sách Sinh Viên
        System.out.println("======In danh sách SV sau khi nhập=======");
        for (Computer sinhVien : danhSachComputer){

            sinhVien.inThongTinComputer();

        }
        

        List list = Arrays.asList(danhSachComputer);
        
        //Bộ so sánh
        Comparator comparator = new Comparator<Computer>(){

            @Override
            public int compare(Computer o1, Computer o2){

                return Integer.compare(o1.gia, o2.gia);

            }
            
        };

        //list.sort(/**truyền vào đây đối số cần thiết để so sánh  */);
        list.sort(comparator);

        //In Danh Sách Sinh Viên
        System.out.println("======In danh sách SV sau khi so sánh=======");
        for (Computer computer : danhSachComputer){

            computer.inThongTinComputer();

        }
    }
}


