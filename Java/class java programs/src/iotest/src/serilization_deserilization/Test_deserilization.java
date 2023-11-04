package serilization_deserilization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test_deserilization {

    public static void main(String[] args) {
        try {
//            FileOutputStream j1=new FileOutputStream("nwe.ser");
//             ObjectOutputStream ob1= new ObjectOutputStream(j1);
//             seri s=(seri)  ob;
            FileInputStream j1 = new FileInputStream("nwe.ser");
            ObjectInputStream j = new ObjectInputStream(j1);
            seri s = (seri) j.readObject();
            System.out.println("name--->" + s.name);
            System.out.println("age--->" + s.age);
            System.out.println("password--->" + s.password);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
