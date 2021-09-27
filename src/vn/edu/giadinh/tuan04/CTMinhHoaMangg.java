package vn.edu.giadinh.tuan04;

import java.util.Arrays;

public class CTMinhHoaMangg {
    
    public static void main(String[] args) {
        
        int[] mangSoNguyen;// chưa chỉ định số phần tử
        

        mangSoNguyen = new int[5];//=> mảng trong java là 1 kiểu tham chiếu đối tượng


        double mangSoThuc[] = new double[10];
        
        // trước khi dùng thì phải xác định số phần tử của mảng
        mangSoNguyen[0] = 2;

        //Khai báo có giá trị khởi tạo cho mảng
        double diemMonHoc[] = new double[]{10.5, 5.5, 3.0, 4.5};
        System.out.println("Mảng Điểm môn học: "+ Arrays.toString(diemMonHoc));

        diemMonHoc[0] = diemMonHoc[1];
        //System.out.println("Điểm môn học: "+ diemMonHoc);
        
        System.out.println("Mảng Điểm môn học: "+ Arrays.toString(diemMonHoc));

        System.out.println("Số phần tử của mảng điểm môn học: "+  diemMonHoc.length);
        
        //cách 2 
        String dsTenSinhVien[] = {"tèo", "tí", "tỉnh"};

        //dùng vòng lặp để duyệt mảng
        for(int i=0; i < diemMonHoc.length; i++){

            System.out.println(diemMonHoc[i]);
        }
        System.out.println("==============FOR-EACH============");
        //FOR-EACH
        for(double diem : diemMonHoc){

            System.out.println(diem);
        }

    }
}
