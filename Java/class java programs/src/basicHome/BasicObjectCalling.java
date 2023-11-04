
package basicHome;

import static basicHome.object.fun1;
import static basicHome.object.fun2;

class object{
   static int a=3;
    static int b=4;
    static void fun1(){
        System.out.println("b="+b);
    }
    static  void fun2(){
        System.out.println("a="+a);
    }
    
}
public class BasicObjectCalling {
    public static void main(String[] args) {
        object f=new object();
        f.fun1();// calling with class object
        f.fun2();// calling with class object
       fun2();// calling with diret function method due to static
       fun1();// calling with diret function method due to static
    }
    
}
