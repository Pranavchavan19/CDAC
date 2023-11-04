package objectMethods;

import java.util.LinkedHashSet;
import java.util.Objects;

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Name : " + name + " Age : " + age + "\n";
//    }
//    @Override
//    public boolean equals(Object obj) {
//        Student stud = (Student) obj;
//        return this.name.equals(stud.name) && this.age == stud.age;
//    }
    @Override
    public String toString() {
        return "Name :" + name + "Age :" + age + "\n";
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        Student stud =(Student)obj;
        return this.name.equals(stud.name)  && this.age == stud.age;
       
        
    }
    

}

public class NewClass {

    public static void main(String[] args) {
        Student s1 = new Student("Ramesh", 40);
        Student s2 = new Student("Ramesh", 40);
        Student s3 = new Student("Suresh", 40);
        Student s4 = new Student("Bhavesh", 45);

        System.out.println("print s1--->" + s1);
        System.out.print("compare s1 & s2 = "); // it gives fale 
        System.out.println(s1 == s2);
        System.out.print("compare s1 & s2 = ");
        System.out.println(s1.equals(s2));
        System.out.print("print s1 as same with use of s1.toStringmethod");
        System.out.println(s1.toString());
        System.out.print("hashcode value-->");

        System.out.println(s1.hashCode());
        System.out.print("hashcode value-->");
        System.out.println(s4.hashCode());
    }
}
