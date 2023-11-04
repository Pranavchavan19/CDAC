
package homepractice;

class outer{
    void fun(){
        System.out.println("i am don");
    }
}
class inner{
    outer d=new outer(){
        @Override
        void fun() {
            System.out.println("i am don2");
        }
        
    };
}
public class NewClass {
    public static void main(String[] args) {
    inner  d1=new inner();
       d1.d.fun();
    }
    
}
