package vn.edu.giadinh.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {

        //tạo ds Sinh Viên
        SinhVien[] danhSachSV = new SinhVien[2];

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
            varInput.nextLine();//nhận vào phím ENTER

            System.out.print("  Quê Quán: ");
            String queQuan = varInput.nextLine();

            danhSachSV[i] = new SinhVien(MSSV, hoTen, tuoi, queQuan);
        }


        //In Danh Sách Sinh Viên
        System.out.println("======In danh sách SV sau khi nhập=======");
        for (SinhVien sinhVien : danhSachSV){

            sinhVien.inThongTinSV();

        }
        

        List list = Arrays.asList(danhSachSV);
        
        //Bộ so sánh
        Comparator comparator = new Comparator<SinhVien>(){

            @Override
            public int compare(SinhVien o1, SinhVien o2){

                return Integer.compare(o1.tuoi, o2.tuoi);

            }
            
        };

        //list.sort(/**truyền vào đây đối số cần thiết để so sánh  */);
        list.sort(comparator);

        //In Danh Sách Sinh Viên
        System.out.println("======In danh sách SV sau khi so sánh=======");
        for (SinhVien sinhVien : danhSachSV){

            sinhVien.inThongTinSV();

        }
        
        //varInput.nextLine();//nhận vào phím ENTER

    }

    
}
