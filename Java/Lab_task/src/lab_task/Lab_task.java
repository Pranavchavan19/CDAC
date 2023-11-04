/*Q1. Write a Java program to create a new array list, add some colors
(string) and print out the collection.
*/
package lab_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Lab_task {

    
    public static void main(String[] args) {
        List d=new ArrayList();
        d.add("red");
        d.add("red");
        d.add("black");
        d.add("pink");
       // System.out.println(d);
        Iterator <Object> h= d.iterator();
        while(h.hasNext())
        {
            System.out.println(h.next());
        }
      
    }
    
}
