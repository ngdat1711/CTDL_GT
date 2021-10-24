package vn.edu.giadinh.tuan07;

public class MyLinkedList1 {
    Node1 head = null;//danh sách rỗng
    Node1 tail = null;
    public MyLinkedList1(){}
    
    void add(int data){
        //tạo node mới 
        Node1 newNode = new Node1(data);

        if(head == null){// thêm 1 nút vào danh sách rỗng
            head = newNode;
            tail = newNode;
        }else{//danh sách không rỗng //thêm vào đuôi danh sách 
            
            tail.next = newNode;
            tail = newNode;
        }

    }
    void remove(){

    }
    void print(){
        Node1 current = head;
        if(head == null){
            System.out.println("danh sách rỗng");
            return;

        }else{
            System.out.println("các nút trong danh sách: ");
            while(current != null){

                System.out.println(current.data);
                current = current.next;
            }
        }


    }
    void find(){

    }
}
