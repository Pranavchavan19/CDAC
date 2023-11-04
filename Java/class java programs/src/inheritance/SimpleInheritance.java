
package inheritance;

class parent{
  int a=1;
 void show(){
     
     System.out.println("a="+a);
 }
}
class child extends parent{
int b=3;
 void show1(){

 System.out.println("b="+b);
}
}

public class SimpleInheritance {
    public static void main(String[] args) {
        child g=new   child();
        g.show();
        g.show1();
        
    }
    
}
