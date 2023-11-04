
package dateDemo;

import java.time.LocalDate;




import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Todayminus {

    public static void main(String[] args) {
       
        LocalDate today = LocalDate.now();
        System.out.println(today.getMonthValue());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println( today.getDayOfYear()); //it gives total days in year
    

//        System.out.println(today);
//        System.err.println(today.minusMonths(6));//it previous date  ,, month,year
//         System.err.println(today.plusDays(4));
//         System.out.println(today);
//         System.out.println(today.isLeapYear());
          // System.out.println(today.isAfter(today));
          // System.out.println(today.plusWeeks(3));
    }

}

    

