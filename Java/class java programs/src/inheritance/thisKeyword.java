
package inheritance;
class A{
int a=10;
void show(){
    int a=100;
    System.out.println("a="+a); // 100
    
     System.out.println("a="+this.a); //10
     
}
}

public class thisKeyword {
    public static void main(String[] args) {
      A s=new A();
      s.show();
    }
    
}
