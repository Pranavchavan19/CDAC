package newiotest.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable {

    String name;
    int age;
    transient String password;

    public student(String name, int age, String password) {
        this.name = name;
        this.age = age;

    }
}

public class TestSerilization {

    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("stud.ser"); 
                ObjectOutputStream oos = new ObjectOutputStream(fout)) {
            student student1 = new student("rameshji", 23, "Ramesh");
            oos.writeObject(student1);
            System.out.println("Objesct Serilized successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
