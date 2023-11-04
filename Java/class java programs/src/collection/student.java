package collection;

public class student  implements Comparable<student>{
    private int id;
    private String name;
    private int age;

    public student(int id,String name, int age) {
        this.id=id;
        this.name = name;
        this.age = age;
    }
    // converring object to to string
@Override
    public int compareTo(student o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "id: "+id+"name: "+name +" age : "+age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getId()
    {
    return id;
    }

    
  
 

 

}
