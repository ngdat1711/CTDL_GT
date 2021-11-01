package vn.edu.giadinh.tuan09;

import java.util.Arrays;

public class CTMinhHoaSearch {
    public static void main(String[] args) {
        int[] arr = {17,11,20,02};
        int x = 11;
        System.out.println("danh sánh tìm kiếm ban đầu" + Arrays.toString(arr));
        int result = search(arr, x);
        if(result == -1)
            System.out.println("danh sách asu khi tìm kiếm" + Arrays.toString(arr));
        else
            System.out.println();
    }
    static boolean search(int[] arr,int x){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                return i;
        }
        return - 1;
    }
}
