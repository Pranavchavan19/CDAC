
package collection;

import java.util.Comparator;


public class student_sortingbyage  implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return o1.getAge()-o2.getAge();
    }
    
}
