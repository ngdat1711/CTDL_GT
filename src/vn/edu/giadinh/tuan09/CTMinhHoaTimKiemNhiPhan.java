package vn.edu.giadinh.tuan09;



public class CTMinhHoaTimKiemNhiPhan {
    public static void main(String[] args){
        binarySearch ob = new binarySearch();
        int[] arr = {2,11,17,20};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if(result == -1)
            System.out.println("element not present");
        else
            System.out.println("element found at " + "index" + result);
    }   

    static void binarySearch(int[] arr, int x){
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int m = l + (r - 1) / 2;
            //check if x is present at mid
            if(arr[m] == x)
                return m;
            
            //if x greater 
            if(arr[m < x])
                l = m + 1;
            
            else
                r = m - 1;
            
        }
    }

    
}
