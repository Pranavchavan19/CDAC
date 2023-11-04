package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class studentcollcetion {

    public static void main(String[] args) {
        Vector<student> v = new Vector<>();
        student s1 = new student(102,"pranav", 23);//obj of student class
        student s2 = new student(101,"pallavi", 23);
        student s3 = new student(105,"mahesh", 23);
        student s4 = new student(103,"dipali", 243);
        student s5 = new student(109,"pranav", 3);
   

        v.add(s1);  // 
        v.add(s2);
        v.add(s3);
        v.add(s4);
        v.add(s5);
        Collections.sort(v);// error due to upward student type
        
       // System.out.println(v.get(1).getName());
       
       
       Student_sortingByName ss=new Student_sortingByName();
        Collections.sort(v, ss);
        student_sortingbyage dd=new student_sortingbyage();
        Collections.sort(v, dd);
        
        Iterator<student> it=v.iterator();
        while(it.hasNext()){
          student s=it.next();
            System.out.println("  id:  "+s.getId()+ "   name:   "+s.getName()+"    age :   "+s.getAge());
        }
        

    }

}
