
package collection.set;

import java.util.HashMap;
import java.util.*;
import static javax.management.Query.value;


public class MapDemo {
    public static void main(String[] args) {
       //Map<Integer,String> mp=new HashMap<>();// it folow order but not follow sequence
      //   Map<Integer,String> mp=new LinkedHashMap<>();// it follow sequence
        Map<Integer,String> mp=new TreeMap<>();// it gives sorted format on the basis of key
        mp.put(101, "Ramesh");
        mp.put(102, "Suresh");
        mp.put(103, "Mahesh");
        mp.put(105, "Dinesh");
        mp.put(104, "bhavesh");
     //   System.out.println(mp);
     for(Integer i:mp.keySet())// for accces  it is not part of coollection
     {
       String val=mp.get(i);
         System.out.println("key : "+i+" Value : "+val+"ji");
     }
     for(String i:mp.values())// for accces  it is not part of coollection
     {
      
         System.out.println(i);
     }
      // mp.entrySet();
    }
    
}
