package collection;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class DemoArray {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();  //generic <Integer>
        lst.add(23);
        lst.add(22);
        lst.add(24);
        lst.add(14);
        lst.add(74);
        lst.add(44);
        //   System.out.println(lst.get(2)+5);//it is not accessing ,to check only

        Collections.sort(lst); // when u not used this one then it gives wrong
        
        int pos = Collections.binarySearch(lst, 494);
        
      boolean b=  Collections.disjoint(lst, Arrays.asList(22,200,300));//doni madhe coommon nashi pahije
       
      //  Collections.copy(lst, Arrays.asList(100,200,300));
      
      System.out.println(b);
        
        
        
        
        
        
        System.out.println("position " + pos);
      //  List<Integer> lst1=Arrays.asList(100,200,300);
        System.out.println("**************************************************");

//        for (Integer i : lst)// for accessing the data
//        {
//            System.out.println(i);
//            //System.out.println(i+5);
//        }
//        
          System.out.println("**************************************************");
 
          List<String> lst1=Arrays.asList("janimahesh","panu","suru","jani");
 
          Collections.sort(lst1);// sorting the data by using collection sort
        for (String i : lst1)// for accessing the data
        {
            System.out.println(i);
            //System.out.println(i+5);
        }
    }

}
