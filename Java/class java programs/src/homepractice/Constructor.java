
package homepractice;
class cons{
    
cons(){
    int a=10;
    System.out.println("a="+a);
}
cons(int x){
int a=x;

    System.out.println("a="+a);
}
cons(int x,int y)
{
    
int a=x+y;
    System.out.println("a="+a);
}
}
public class Constructor {
    public static void main(String[] args) {
        cons h=new cons();
        cons h1=new cons(4,5);
        cons h2=new cons (2);
        
    }
    
}
