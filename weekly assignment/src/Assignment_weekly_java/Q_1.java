/*1.Build a class which has references to other classes. Instantiate these reference variables and
invoke instance methods.*/

package Assignment_weekly_java;

class Add
{
    int a=7;
    int v=6;
    void add1(){
        System.out.println("value of a="+(a+v));
    
    }
}
class Sub 
{
    int b=7;
    int v=6;
    void add1(){
        System.out.println("value of a="+(b-v));
    
    }

}
public class Q_1
{
    public static void main(String[] args) {
        Add obj =new Add();
        obj.add1();
        
        Sub d=new Sub();
        d.add1();
      
       
        
    }
    
} 
    

