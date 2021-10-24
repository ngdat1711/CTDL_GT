package vn.edu.giadinh.tuan07;

public class Node1 {
    // nội dung 
    int data;
    // liên kết  đến nút tiếp theo
    //tham chiếu 
    Node1 next;//biến tham chiếu kiểu Node
    public Node1(){
    }
    public Node1(int d){
        data = d;
    }
    public Node1 (int d, Node1 n){
        data = d;
        next = n;
    }
}
