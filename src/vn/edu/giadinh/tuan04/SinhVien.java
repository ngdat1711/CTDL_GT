package vn.edu.giadinh.tuan04;

public class SinhVien {
    
    String MSSV;
    String  hoTen;
    int tuoi;
    String queQuan;

    public SinhVien(){}
    
    public SinhVien(String m, String h, int t, String q){

        MSSV = m;
        hoTen = h;
        tuoi = t;
        queQuan = q;

    }
    void inThongTinSV(){

        System.out.println("Mã Số Sinh Viên: " + MSSV);
        System.out.println("Họ và Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Quê Quán: " + queQuan);
    }
    
}
