package overloading;
public class Constructor {
    public int a;
    Constructor()
    {
        a=10;
        System.out.println("default constructor==>"+a);
    }
    Constructor(int x)
            {
               a=x;
               System.out.println("constructor with 1 parameter==>"+a);
            }
    Constructor(int x,int y)
            {
               a=x+y;
               System.out.println("constructor with 2 parameter==>"+a);
            }
    public static void main(String[] args) {
        
        Constructor c=new Constructor();
        Constructor c1=new Constructor(500);
        Constructor c2=new Constructor(15,15);
    }
}