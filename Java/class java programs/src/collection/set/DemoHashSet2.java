
package collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class DemoHashSet2 {
    public static void main(String[] args) {
        List<Integer> lst =Arrays.asList(10,10,20,30,30,40,40,50);// duplicate allow
        System.out.println(lst);
//       Set<Integer> st=new HashSet<>();
//       st.addAll(lst);
//        System.out.println(st);
//        List<Integer> stt=new LinkedList<>();
//        stt.addAll(lst);
      List<Integer>  lst1=new ArrayList<>();
       lst.addAll(lst1);
        System.out.println(lst1);
    }
    
}
