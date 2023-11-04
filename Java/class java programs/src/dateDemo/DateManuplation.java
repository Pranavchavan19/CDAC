
package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateManuplation {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d); // by default format
     //   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
          SimpleDateFormat sdf=new SimpleDateFormat("dd MMM,yyyy hh:mm:ss");
        //for converting date to string
        String strDate=sdf.format(d);
         System.out.println(strDate);//string format
    }
    
}
