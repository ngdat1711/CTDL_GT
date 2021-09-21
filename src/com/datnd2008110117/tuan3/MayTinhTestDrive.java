package com.datnd2008110117.tuan3;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        
        MayTinh mayTinh;
        mayTinh = new MayTinh();
        mayTinh.nhaSanXuat = "MSI - Micro-Star International";
        mayTinh.namSanXuat = 2019;
        mayTinh.heDieuHanh = "Microsoft Windows";
        mayTinh.ram = "16GB";
        mayTinh.chip = "InTel(R) Core(TM) i5-9300H";
        mayTinh.gia = "20000000VND";
        mayTinh.namBaoHanh = "2 năm";


        mayTinh.inThongTinMayTinh();
    }
    
}
