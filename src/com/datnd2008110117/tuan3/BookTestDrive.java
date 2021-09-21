package com.datnd2008110117.tuan3;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        book = new Book();
        book.gia = 100500;
        book.nhaXuatBan = "Kim Dong";
        book.namXuatBan = 2020;
        book.giaBan = 150000;
        book.soLuong = 100;
        
        
        book.inThongTinSach();
    }
    
}
