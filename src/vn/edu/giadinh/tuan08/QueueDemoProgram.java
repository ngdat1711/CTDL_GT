package vn.edu.giadinh.tuan08;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;

        queue = new LinkedList<>();
        //queue.add(3);

        queue.add(8);
        queue.add(10);
        queue.add(2);

        //lấy ra 1 phần tử trong queue

        System.out.println(queue);
        
        int phanTuLayRa = queue.remove();
        System.out.println("Phần Tử được lấy ra từ Queue " + phanTuLayRa);
        System.out.println("Phần tử còn lại");
        System.out.println(queue);

        /*int phanTuLayRaa = queue.remove();
        System.out.println("Phần Tử được lấy ra từ Queue " + phanTuLayRaa);
        System.out.println("Phần tử còn lại");
        System.out.println(queue);*/

        //thăm 1 phần tử của queue - không lấy ra
        int phanTuDuocTham = queue.peek();
        System.out.println("Phần tử vừa được thăm");
        System.out.println("Phần tử còn lại trong queue sau thăm");
        System.out.println(queue);

        
        
        
        
        
        
        
        
        
        
        
        
        
        //Cài đặt Linked List - queue
            //thêm 1 phần tử vào cuối
            //lấy 1 phần tử đầu
            //xóa 1 phần tử ở đầu   

        //Dùng Linked List để cài đặt cấu trúc stack
        //Cài đặt Linked List
            //thêm 1 phần tử vào cuối
            //lấy 1 phần tử cuối
            //xóa 1 phần tử ở cuối 
    }
    
}
