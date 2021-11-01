package vn.edu.giadinh.tuan09;

import java.util.Arrays;

public class CTMinhHoaSapXep {
    public static void main(String[] args){

        int[] arr = {17, 11, 20, 02};
        System.out.println("danh sách ban đầu" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("danh sách sau khi sắp xếp" + Arrays.toString(arr));
    }
  
    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j <arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j; 
                }
                    
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }        
}