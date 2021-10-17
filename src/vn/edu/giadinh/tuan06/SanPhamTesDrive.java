package vn.edu.giadinh.tuan06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SanPhamTesDrive {
    public static void main(String[] args) {
        List<SanPham> dsSanPham;

        dsSanPham = new ArrayList<>();

        dsSanPham.add(new SanPham("mì hảo", 2000, 0, 0.1f));
        dsSanPham.add(new SanPham("Nước tương", 15000, 1000, 0.1f));
        dsSanPham.add(new SanPham("Bánh Ngọt", 500, 0, 0));
        
        /*inDanhSachSanPham(dsSanPham);
        sapXepTangDanTheoGia(dsSanPham);
        System.out.println("Sau khi sắp xếp");
        inDanhSachSanPham(dsSanPham);*/ 

        /*SanPham sanPham = timSanPhamTheoTen("mì hảo 100", dsSanPham);
        if(sanPham!= null){
            sanPham.inThongTin();
        }
        else{
            System.out.println("ko tìm thấy gì hết ");
        }*/
        String tenSanPham = "Mì hảo";
        xoaSanPham(tenSanPham, dsSanPham);
        inDanhSachSanPham(dsSanPham);
        
    }
    static void nhapSanPham(){
        //xử lý việc nhập
    }
    static void inDanhSachSanPham(List<SanPham> dsSanPham){

        for (SanPham sanPham : dsSanPham){
            sanPham.inThongTin();
        }
    }
    static void sapXepTangDanTheoGia(List<SanPham> dsSanPham){
        Comparator<SanPham> comp;
        comp = new Comparator<SanPham>(){

            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
            
        };
        Collections.sort(dsSanPham, comp);


    }
    //hàm
    static SanPham timSanPhamTheoTen(String tenSanPham, List<SanPham> dSanPhams){
        SanPham result = null;
        for (SanPham sanPham : dSanPhams) {
            if(sanPham.tenSanPham.equals(tenSanPham)){
                result = sanPham;
            }
            
        }
        return result;
    }
    static void xoaSanPham(String tenSanPham, List<SanPham> dsSanPham){
        SanPham sanPham = timSanPhamTheoTen(tenSanPham, dsSanPham);
        dsSanPham.remove(sanPham);
    }
    
}
