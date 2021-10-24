package com.datnd2008110117.tuan7;

public class MyLinkedList {
    Node head = null;//danh sách rỗng
    Node tail = null;
    public MyLinkedList(){}
    
    void add(int data){
        //tạo node mới 
        Node newNode = new Node(data);

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
        Node current = head;
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
    
