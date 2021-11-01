package vn.edu.giadinh.tuan09;

import java.util.Arrays;

public class CTMinhHoaSapXepChen {
    public static void main(String[] args) {
        int[] arr = {17, 11, 20, 2};
        System.out.println("danh sách ban đầu" + Arrays.toString(arr));
        chen(arr);
        System.out.println("Danh sách sau khi chèn" + Arrays.toString(arr));
    }
    static void chen(int [] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            /*move  elements of arr[0..i-1], that are greater than key ,to one 
            position ahead oftheir current position*/
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
}
