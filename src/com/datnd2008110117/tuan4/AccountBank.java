package com.datnd2008110117.tuan4;

public class AccountBank {
    String tenTaiKhoan;
    int soTaiKhoan;
    int soDuTaiKhoan;

    public AccountBank(){}

    public AccountBank(String TTK, int STK, int SDTK){

        tenTaiKhoan = TTK;
        soTaiKhoan = STK;
        soDuTaiKhoan = SDTK;
    }
    void inThongTinAccount(){

        System.out.println("Tên tài khoản: ");
        System.out.println("Số tài khoản");
        System.out.println("Số dư còn trong tài khoản: ");
    }

    
}
