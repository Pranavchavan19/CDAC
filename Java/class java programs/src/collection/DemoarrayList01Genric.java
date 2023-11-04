package collection;

import java.util.*;
import java.util.List;

public class DemoarrayList01Genric {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();  //generic <Integer>
        lst.add(23);
        lst.add(44);
        lst.add(44);
        lst.add(44);
        lst.add(44);
        lst.add(44);
        System.out.println(lst);
        System.out.println("***********************************************************************");
        ArrayList<String> lst1 = new ArrayList<>();
        lst1.add("pranav");
        lst1.add("pritam");
        lst1.add("pallavi");
        lst1.add("dipak");
        lst1.add("swapnil");
        System.out.println(lst1);
        System.out.println("***********************************************************************");
        ArrayList<Character> lst2 = new ArrayList<>();
        lst2.add('a');
        lst2.add('b');
        lst2.add('c');
        lst2.add('d');
        System.out.println(lst2);
        System.out.println("***********************************************************************");
//        ArrayList<Double> u = new ArrayList<>();
//        u.add(4.4);
ArrayList<Float> u = new ArrayList<>();
u.add(4.4f);
     
    }

}
