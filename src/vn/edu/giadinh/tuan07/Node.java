package vn.edu.giadinh.tuan07;

public class Node {
    // nội dung 
    int data;
    // liên kết  đến nút tiếp theo
    //tham chiếu 
    Node next;//biến tham chiếu kiểu Node
    public Node(){
    }
    public Node(int d){
        data = d;
    }
    public Node (int d, Node n){
        data = d;
        next = n;
    }
}
