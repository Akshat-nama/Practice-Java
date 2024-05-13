package generics;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        CustomArrayList list = new CustomArrayList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        list.add(70);
//        list.add(80);
//        list.add(90);
//        list.add(100);
//        list.add(110);
//
//        System.out.println("My current list is " + list);
//
//        System.out.println("The size of list is " + list.size());
//
//        System.out.println("We have removed the "+ list.remove());
//
//        list.set(2,11);
//
//        System.out.println("Updated list " + list);


        CustomArrayGenList<String> list2  = new CustomArrayGenList<>();
        list2.add("Hi");
        list2.set(1,"Akshat");
        list2.size();
        System.out.println(list2.toString());
        System.out.println("I have removed "+  list2.remove());



    }

}
