package vn.edu.giadinh.tuan05;

import java.util.ArrayList;
import java.util.List;

import vn.edu.giadinh.tuan04.Dog;

public class CTMinhHoaArrayList {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        //List bienTCArrList = new ArrayList();
        a.add("đạt");
        //a.add(true);
        a.add(1);
        a.add(new Dog(12,"hồng ", "tèo  "));

        Dog dog = (Dog)a.get(2);
        System.out.println("Dog name: "+ dog.name+ "Color: "+dog.color);

        a.add(1.5);
        System.out.println(a.get(0));

        
        
        Integer x = (Integer)a.get(2);
        for(Object object: a){
            System.out.println(a);
        }
        

        List<String> listStrings = new ArrayList<>();

        listStrings.add("tèo anh");
        //ArrayList<student> astudents = new ArrayList<>();
        //astudents.add
        
        ArrayList<String> ten = new ArrayList<String>();
        ten.add("Tèo anh");
        ten.add("tèo em");
        ten.add("tèo béo");
        ten.add("tèo gầy");

        String string = ten.get(2);
        {
            System.out.println(ten);
        }
        






    }
    
}
