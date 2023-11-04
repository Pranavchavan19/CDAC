
package collection;

import java.util.Comparator;


public class Student_sortingByName implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
      return o1.getName().compareTo(o2.getName());
      
    }
    
    
}
