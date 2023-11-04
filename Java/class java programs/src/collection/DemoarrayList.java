package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoarrayList {

    public static void main(String[] args) {
        List lst = new ArrayList();       
        System.out.println("it collect all different type of data in the form of object--->");
        lst.add(23);// auto boxing 
        lst.add(new Integer(23));//  boxing previous one
        lst.add(23.4);
        lst.add("soft polynomials");
        lst.add(new Date()); //object 
        // System.out.println(lst);// it is get collection only
        System.out.println("Access the data by for loop");
        for (Object o : lst) //to access the things
        {
            System.out.println(o);

        }
        System.out.println("*********************************************************************");
        System.out.println("Access the data by iterator");

        Iterator it = lst.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("*********************************************************************");

    }

}
