package vn.edu.giadinh.tuan06;

import java.util.ArrayList;
import java.util.Collections;

public class CTMinhHoaBai2Lab4 {
    public static void main(String[] args) {
        ArrayList hoTen = new ArrayList<>();
        hoTen.add("mit");
        hoTen.add("đặc");
        hoTen.add("tây");
        System.out.println(hoTen);
        Collections.shuffle(hoTen);
        System.out.println(hoTen);
    }
    
}
