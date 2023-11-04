package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class StudentNaturalsort {

    public static void main(String[] args) {
        // Vector<student> v = new Vector<>();
       // PriorityQueue<student> v = new PriorityQueue<>(new Student_sortingByName());
          PriorityQueue<student> v = new PriorityQueue<>();
        student s1 = new student(102, "pranav", 23);//obj of student class
        student s2 = new student(101, "pallavi", 23);
        student s3 = new student(105, "mahesh", 23);
        student s4 = new student(103, "dipali", 243);
        student s5 = new student(109, "pranav", 3);

        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        v.add(s5);

        Iterator<student> it = v.iterator();
        while (it.hasNext()) {
            student s = it.next();
            System.out.println("  id:  " + s.getId() + "   name:   " + s.getName() + "    age :   " + s.getAge());
        }

    }
}
