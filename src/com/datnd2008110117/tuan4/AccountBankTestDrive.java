package com.datnd2008110117.tuan4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AccountBankTestDrive {
    public static void main(String[] args) {
        AccountBank[] danhSachAccountBank = new AccountBank[2];

        Scanner varInput = new Scanner(System.in);
        System.out.println("Nhập tên chủ tài khoản ");

        for(int i = 0; i< danhSachAccountBank.length; i++){
            System.out.println("Nhập tên tài khoản thứ " + (i+1));

            System.out.println(" Tên tài Khoản: ");
            String tenTaiKhoan = varInput.nextLine();

            System.out.println(" Số tài khoản: ");
            int soTaiKhoan = varInput.nextInt();

            System.out.println(" Số dư trong tài khoản: ");
            int soDuTaiKhoan = varInput.nextInt();

            danhSachAccountBank[i] = new AccountBank(tenTaiKhoan, soTaiKhoan, soDuTaiKhoan);
            
        }
       
        System.out.println("======In thông tin khách hàng=====");
        for(AccountBank accountBank : danhSachAccountBank){

            accountBank.inThongTinAccount();
        }

        List list = Arrays.asList(danhSachAccountBank);

        Comparator comparator = new Comparator<AccountBank>(){

            @Override
            public int compare(AccountBank o1, AccountBank o2){

                return Integer.compare(o1.soDuTaiKhoan, o2.soDuTaiKhoan);
            };
        }
        list.sort(comparator);
    }
    
}
