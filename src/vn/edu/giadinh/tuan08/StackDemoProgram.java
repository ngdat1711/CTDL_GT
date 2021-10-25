package vn.edu.giadinh.tuan08;

import java.util.Stack;

import vn.edu.giadinh.tuan04.SinhVien;

public class StackDemoProgram {
    public static void main(String[] args) {
        
        Stack<String> stack;

        stack = new Stack<>();
        
        //thêm phần tử vào stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Data Structure And Algotithm");
        System.out.println(stack);

        //lấy ra 1 phần tử từ đỉnh Stack (xóa phần tử ra khỏi Stack) 
        String poped = stack.pop();
        System.out.println("Đã lấy ra từ danh sách stack" + poped);
        System.out.println("Phần Tử Còn Lại Của Stack");
        System.out.println(stack);

        /*String popedd = stack.pop();
        System.out.println("Đã lấy ra từ danh sách stack" + popedd);
        System.out.println("Phần Tử Còn Lại Của Stack");
        System.out.println(stack);*/


        //thăm phần tử đỉnh // không loại khỏi danh sách
        String phanTuDuocTham = stack.peek();
        System.out.println("Thăm nút đỉnh " + phanTuDuocTham);

        //sau khi thăm
        System.out.println(stack);

        Stack<SinhVien> stack2;
    }
    
}
