
package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class datemanu {

    
    public static void main(String[] args) {
       
          String sDate="2021/10/23";
          SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
          try{
           Date dt=sdf.parse(sDate);
              System.out.println(dt);
          
          }
          catch (Exception e)
          {
              System.out.println(e);
          }
    }
    
}
