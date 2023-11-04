/*
 Q1. .Write a java program to Create a collection of Employee class and sort
objects using comparable and comparator interfaces.

 */
package lab_task_18;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class NewClass {

    public static void main(String[] args) {
        Vector<employee> v = new Vector<>();

        employee s1 = new employee(3, "pranav", 950);

        employee s2 = new employee(7, "ypranav", 950);

        employee s3 = new employee(5, "wpranav", 59);

        employee s4 = new employee(4, "upranav", 75);

        employee s5 = new employee(6, "rpranav", 750);
        v.add(s1);  // 
        v.add(s2);
        v.add(s3);
        v.add(s4);
        v.add(s5);
       // System.out.println(v);
        // Collections.sort(v);
//         NewClass1_name g=new NewClass1_name ();
//         Collections.sort(v, g);
         NewClass1_id g1=new NewClass1_id();
           Collections.sort(v, g1);
        Iterator<employee> it=v.iterator();
        while(it.hasNext()){
          employee s=it.next();
            System.out.println("  id:  "+s.getId()+ "   name:   "+s.getName()+"    age :   "+s.getEmp_id());
        }
        

    }

}
