package objectMethods;

import java.util.LinkedHashSet;
import java.util.Objects;

class student {

    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int hashCode() {
//       return this.age;
//    }
    
    @Override
    public int hashCode() {
        return this.age;
      
    }
  //return this.name;  it is not taken due to return int
    @Override
    public String toString() {
        return "name : " + name + "\nAge :" + age + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        student stud = (student) obj;  // downcasting
        return this.name.equals(stud.name) && (this.age == stud.age);// implent equals method of object class

    }

}

public class TestEqualsHasTostring {

    public static void main(String[] args) {
        student s1 = new student("panu", 33);
        student s11 = new student("panu", 33);
        student s111 = new student("panu", 33);
        student s1111 = new student("panu", 34);

        LinkedHashSet<student> studs = new LinkedHashSet<>();

          studs.add(s1);
          studs.add(s11);
          studs.add(s111);
          studs.add(s1111);
          System.out.println(studs);
          System.out.println(s1.hashCode());


    }

}
