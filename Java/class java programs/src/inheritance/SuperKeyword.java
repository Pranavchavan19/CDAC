
package inheritance;
class A{
int a=10;

}
class b extends A{
    int a=4;
   void show(){
       
       System.out.println("a="+a);//4
       System.out.println("a="+super.a);//10
   }
            
}
public class SuperKeyword {
    public static void main(String[] args) {
        b s=new b();
        s.show();
        
    }
    
}
