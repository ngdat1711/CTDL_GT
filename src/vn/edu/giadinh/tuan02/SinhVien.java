package vn.edu.giadinh.tuan02;

import java.util.Date;

public class SinhVien {

    //1.Thuoc tinh

    String MSSV;
    String tenSinhVien;
    int tuoi;
    boolean gioiTinh;
    String queQuan;
    Date ngaySinh;

    //2.Phuong Thuc
    //<Kieu tra ve> <ten ha> <(danh sach tham so)>{......}
    void inThongTinSinhVien(){
        System.out.println("Ma so sinh vien: "+ MSSV);
        System.out.println("Ten sinh vien:"+ tenSinhVien);
        System.out.println("Tuoi: "+ tuoi);
        System.out.println("Que Quan"+ queQuan);



    }
    
}
