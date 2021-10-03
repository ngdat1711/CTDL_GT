package com.datnd2008110117.tuan4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class WorkerTestDrive {

    public static void main(String[] args) {
        Worker[] danhSachNhanVien = new Worker[2];

        Scanner varInput = new Scanner(System.in);
        System.out.println("Nhập Tên Nhân Viên ");

        for(int i = 0; i< danhSachNhanVien.length; i++){

            System.out.println("Nhập Tên Công Nhân Thứ " + (i+1));

            System.out.print(" Tên Nhân Viên: ");
            String nameWorker = varInput.nextLine();

            System.out.print(" Lương: ");
            int luong = varInput.nextInt();

            System.out.print(" Địa chỉ: ");
            String address = varInput.nextLine();
            varInput.nextLine();

            System.out.print(" Bộ phân làm việc của nhân viên: ");
            String boPhan = varInput.nextLine();

            System.out.print(" Ngày Tháng Năm Sinh: ");
            String ngayThang = varInput.nextLine();

            danhSachNhanVien[i] = new Worker(nameWorker, luong, address, boPhan, ngayThang);  
        }
        
        //in danh sach nhan vien
        System.out.println("======In danh sách Nhân Viên sau khi nhập=======");
        for (Worker worker : danhSachNhanVien){

            worker.inThongTinWorker();

        }
        List list = Arrays.asList(danhSachNhanVien);

        Comparator comparator = new Comparator<Worker>(){

            @Override
            public int compare(Worker o1, Worker o2){

                return Integer.compare(o1.luong, o2.luong);
            }

        };

        list.sort(comparator);

        System.out.println("======In danh sách Lương của Nhân Viên sau khi so sánh =======");
        for (Worker worker : danhSachNhanVien){

            worker.inThongTinWorker();

        }
        
    }
    
}
