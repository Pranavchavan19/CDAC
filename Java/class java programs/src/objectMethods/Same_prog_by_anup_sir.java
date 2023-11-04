
package objectMethods;

import java.util.LinkedHashSet;

class Student{
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }  
//
    @Override
    public String toString() {
        return "Name : "+name+" Age : "+age+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        Student stud=(Student)obj;
        return this.name.equals(stud.name) && this.age==stud.age;
    }
}
public class Same_prog_by_anup_sir {
    public static void main(String[] args) {
        Student s1=new Student("Ramesh", 40);
        Student s2=new Student("Ramesh", 40);
        Student s3=new Student("Suresh", 40);
        Student s4=new Student("Bhavesh", 45);
        
//        System.out.println(s1);
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.toString());
//        System.out.println(s1.hashCode());

          LinkedHashSet<Student> studs=new LinkedHashSet<>();
          studs.add(s1);
          studs.add(s2);
          studs.add(s3);
          studs.add(s4);
          System.out.println(studs);
    }
}
/*
objectMethods.Student@14
0001 0100
20
*/