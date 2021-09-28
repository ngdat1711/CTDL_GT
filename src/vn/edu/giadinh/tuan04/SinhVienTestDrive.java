package vn.edu.giadinh.tuan04;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {

        //tạo ds Sinh Viên
        SinhVien[] danhSachSV = new SinhVien[4];

        //Nhập vào từ bàn phím
        Scanner varInput = new Scanner (System.in);
        System.out.println(" Nhập vào ds Sinh Vien ");


        for(int i = 0; i< danhSachSV.length; i++){
            System.out.println("Nhập tên sinh viên thứ " + (i+1));

            System.out.print("  Mã Số Sinh Viên: ");
            String MSSV = varInput.nextLine();

            System.out.print("  Họ và Tên: ");
            String hoTen = varInput.nextLine();//enter

            System.out.print("  Tuổi: ");
            int tuoi = varInput.nextInt();
            varInput.nextLine();

            System.out.print("  Quê Quán: ");
            String queQuan = varInput.nextLine();

            


            danhSachSV[i] = new SinhVien(MSSV, hoTen, tuoi, queQuan);

            
            //varInput.nextLine();//nhận vào phím ENTER




        }
    }

    
}
