
package inheritance;
class GrandParent{
    int x=100;
    void test(){
        System.out.println("x= "+x);
    }

}
class Father extends GrandParent{
int x=2;
void show(){
    System.out.println("x="+x);
}
}
class Son extends Father{
    int x=5;
void show1(){
    System.out.println("x="+x);
}
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
       // GrandParent r=new GrandParent ();
       // r.test();
       Son r1=new Son();
        r1.show();
        r1.test();
        r1.show1();
        
    }
    
}
