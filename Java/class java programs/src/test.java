
import collection.student;
import java.util.Iterator;
import java.util.Vector;


public class test {
    public static void main(String[] args) {
        Vector <stu> j=new Vector <>();
        stu f=new stu((float) 2.2, 'g');
        stu f2=new stu((float)5.5,'j');
        
        j.add(f);
        j.add(f2);
        
        
        Iterator <stu> vvv =j.iterator();
        while(vvv.hasNext())
        {
          stu s=vvv.next();
            System.out.println(s.getAge());
        
        }
    }
    
}
