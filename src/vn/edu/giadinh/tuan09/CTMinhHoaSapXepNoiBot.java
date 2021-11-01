package vn.edu.giadinh.tuan09;

import java.util.Arrays;

public class CTMinhHoaSapXepNoiBot {
    public static void main(String[] args) {
        int[] arr = {17, 11, 20 ,2};
        System.out.println("danh sách ban đầu " + Arrays.toString(arr));
        noiBot(arr);
        System.out.println("danh sách sau khi nổi bọt" + Arrays.toString(arr));
    }
    

    static void noiBot(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1;j < (n - 1) ; j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j - i];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
