package com.datnd2008110117.tuan3;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        book = new Book();
        book.gia = 100500d;
        book.nhaXuatBan = "Kim Dong";
        book.namXuatBan = 2020d;
        book.giaBan = 150000d;
        book.soLuong = 100;
        
        
        book.inThongTinSach();
    }
    
}
