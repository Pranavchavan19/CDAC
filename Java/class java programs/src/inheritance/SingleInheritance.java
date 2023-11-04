// has a relation
package inheritance;

class parent {
    int a=6;
}
class  child extends parent{
    
   int b=5; 
   void show()
   {
      int c=a+b;
       System.out.println("addition="+c);
   }
}

        
public class SingleInheritance {
    public static void main(String[] args) {
//        parent d =new parent();
//        System.out.println("a="+d.a);
        child d1=new child();
//        System.out.println("b="+d1.b);
        d1.show();
    }
    
}
