
package dateDemo;

import java.time.LocalDate;


public class todays_date_format {
    public static void main(String[] args) {
         LocalDate today = LocalDate.now();
         System.out.println(today);
        System.err.println(today.minusMonths(6));//it previous date  ,, month,year
    
    }
    
}
