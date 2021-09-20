package vn.edu.giadinh.tuan03;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        
        //cow = new Cow();
        cow = new Cow(15);
        System.out.println("weight" + cow.weight);


       cow = new Cow (5);
       System.out.println("weight" + cow.weight);
       //cow.weight = 15;

        cow = new Cow(25.5 , "Tay Ban Nha" , " Den ");
        System.out.println("weight: "+cow.weight + " Breed " + cow.breed +" Color " + cow.color);
    

    }
    
}