package vn.edu.giadinh.tuan06;

import org.graalvm.compiler.debug.CSVUtil.Escape;

public class SanPham {
    
    String tenSanPham;
    double donGia;
    double giamGia;
    float thueNhapKhau;
    //hàm tạo
    SanPham(){

    }

    /**
     * @param tenSanPham
     * @param donGia
     * @param giamGia
     * @param thueNhapKhau
     */
    public SanPham(String tenSanPham, double donGia, double giamGia, float thueNhapKhau) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.thueNhapKhau = thueNhapKhau;
    }

    //in thông tin
    // hàm
    void inThongTin(){
        System.out.println("====================================");
        System.out.print("  |Tên SP: " + tenSanPham + "|");
        System.out.print("  |Đơn giá: " + donGia + "|");
        System.out.print("  |Giảm giá: " + giamGia + "|");
        System.out.println("  |Thuế Nhập Khẩu: " + thueNhapKhau + "|");
    }
    public boolean equals(SanPham other){
        boolean match = true;

        if((tenSanPham.equals(other.tenSanPham)) && 
        donGia == other.donGia){
            match = true;

        }else match = false;
        return match;
    }
}
