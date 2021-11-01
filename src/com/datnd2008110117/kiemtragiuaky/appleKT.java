package com.datnd2008110117.kiemtragiuaky;

import java.util.Scanner;

public class appleKT {
    public static void main(String[] args) {
        
    AppleTestDrive taoApple = new AppleTestDrive();
    Scanner varInput = new Scanner(System.in);

    do {
        System.out.println("================MENU================");
        System.out.println(" 1>  Nhập Danh Sách Apple           |");
        System.out.println(" 2>  Xuất Danh Sách Apple           |");
        System.out.println(" 3>  Tìm Theo Màu                   |");
        System.out.println(" 4> Kết Thúc.                      |");
        System.out.println("====================================");

        System.out.println("Chọn chức năng 1-4: ");
        int key = varInput.nextInt();

        switch (key) {
        case 1:
            taoApple.nhapDanhSachTao();
            break;
        case 2:
            taoApple.xuatDanhSachTao();
            break;
        case 3:
            taoApple.timMauTao();
            break;
        case 4:
            System.out.println("Kết Thúc!");
            
            System.exit(0);
            break;
        }

        System.out.println("Quay về MENU YES/NO?: ");
        varInput.nextLine();

    } 
    
    while (varInput.nextLine().equals("YES"));
}
    
}
