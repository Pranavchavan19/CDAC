
package serilization_deserilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class seri implements  Serializable
{
  String name;
  int age;
   transient String password;
   seri(String name,int age,String password)
   {
       this.name=name;
       this.age=age;
       this.password=password;
   
   }


}

public class serilization {
    public static void main(String[] args) {
        try
        {
            FileOutputStream j=new FileOutputStream("nwe.ser");
             ObjectOutputStream ob= new ObjectOutputStream(j);
             seri b=new seri("panu", 23,"pass@123");
             ob.writeObject(b);
             System.out.println("serilization succees-->");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        
        }
    }
    
}
