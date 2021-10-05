package vn.edu.giadinh.tuan05;

public class CTMinhHoaMang1 {

    public static void main(String[] args) {
        
        //int [] mangSoNguyen = new int[10];

        int[] arr = {3,5,7,9};//n=4
        int newMang = 8;//phần tử cần thêm vào
        int n = arr.length;//chiều dài mảng cũ
        int[] newArr = new int[n+1];//tạo mảng mới

        for(int i = 0;i < n; i ++){
            newArr[i] = arr[i];
        }

        System.out.println(" in mảng cũ");
        for(int a: arr){
            System.out.println(a);
        }

        newArr[n] = newMang;
        System.out.println("in mảng mới ");
        for (int a: newArr){
            System.out.println(a);
        }

    }
    
}
