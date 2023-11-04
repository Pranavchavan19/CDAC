
 /*  1.Write a Java program that creates two threads to find and print even and odd numbers from 1
to 20. .*/
package oct31;

class even extends Thread
{
   public void run()
   {
       for(int i=1;i<=10;i++)
   {
       if(i%2==0){
       System.out.println(i);
       }
   
   }
   
   }
}
class odd extends Thread
{
 public void run()
   {
       for(int i=1;i<=10;i++)
   {
       if(i%2!=0){
       System.out.println("i");
       }
   
   }
   
   }
}
public class Q1 {
    public static void main(String[] args) {
        even o=new even();
        odd o1=new odd();
        Thread t1=new Thread(o);
        Thread t2=new Thread(o1);
        
        t1.start();
        t2.start();
        
        
    }
    
}
