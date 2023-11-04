
package lab_task_18;

import java.util.Comparator;


public class NewClass1_id  implements Comparator<employee>{

    @Override
    public int compare(employee o1, employee o2) {
  return o1.getId()-o2.getId();    }
    
}
