
package inheritance;
 class Father{
    int x=31;
    void fun(){
        System.out.println("Parant ="+x);
    }
}
class Child1 extends Father{
     int x=32;
    void fun1(){
        System.out.println("child 1 ="+x);
    }
}
class Child2  extends Father{
     int x=33;
    void fun2(){
        System.out.println("child 2 ="+x);
    }
}
class Child3 extends Father{
     int x=34;
    void fun3(){
        System.out.println("child 3 ="+x);
    }
}

public class HiraricalInheritance {
    public static void main(String[] args) {
       Child1 e=new Child1(); 
        e.fun();
        e.fun1();
        Child2 e1=new Child2(); 
         e1.fun();
        e1.fun2();
        Child3 e2=new Child3(); 
        e2.fun();
        e2.fun3();
        
    }
    
}
