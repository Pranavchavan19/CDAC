
package lab_task_18;

import java.util.Comparator;


public class NewClass1_name implements Comparator<employee>{

    @Override
    public int compare(employee o1, employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
//    @Override
//    public int compare(student o1, student o2) {
//      return o1.getName().compareTo(o2.getName());
//      
//    }
}
