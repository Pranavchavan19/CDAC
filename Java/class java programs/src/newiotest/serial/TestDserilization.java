
package newiotest.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TestDserilization {
    public static void main(String[] args) {
        try(FileInputStream fin=new FileInputStream("stud.ser");
                ObjectInputStream ois= new ObjectInputStream(fin) ){
      student s=(student)  ois.readObject();
            System.out.println("Name :"+s.name);
                System.out.println("Age :"+s.age);
            System.err.println("Password :"+s.password);
        }
        catch (Exception e)
        {
         e.getMessage();
        }
    }
    
}
