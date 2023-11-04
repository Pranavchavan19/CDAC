/*Q2.Write a Java program to iterate through all elements in an array list.*/
package lab_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Q_2 {
    public static void main(String[] args) {
        List h=new ArrayList();
        h.add(3);
        h.add("pranav");
        h.add(4.4);
        h.add('f');
        //System.out.println(h);
        Iterator f=h.iterator();
       // System.out.println(f.next());
       while(f.hasNext())
       {
           System.out.println(f.next());
       }
        
    }
    
}
