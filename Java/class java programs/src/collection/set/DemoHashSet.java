
package collection.set;

import java.util.*;


public class DemoHashSet {
    public static void main(String[] args) {
       Set<Integer> st=new HashSet<>();// it does not takeduplicate , and not give in sequence order
      //   Set<Integer> st=new LinkedHashSet<>();// it is give sequence order
       // Set<Integer> st=new TreeSet<>();// it gives order in asending format ny nature
        st.add(10);
        st.add(30);
        st.add(30);
        st.add(20);
        st.add(70);
        System.out.println(st);
        for(Integer f:st)// for acces but list iterator ne acces hot nahi yala
        {
        
            System.out.println(f);
        }
    }
    
}
