/*
 Q3.Write a Java program to insert an element into the array list at the first
position.
 */
package lab_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Q_3 {
    public static void main(String[] args) {
        List f= new ArrayList();
       f.add(46);
       f.add(47);
       f.add(49);
       f.add(84);
       f.add(0, 666);
     
       // System.out.println( f);
       Iterator g= f.iterator()  ;
       while(g.hasNext())
       {
           System.out.println(g.next());
       }
        
    }
    
}
