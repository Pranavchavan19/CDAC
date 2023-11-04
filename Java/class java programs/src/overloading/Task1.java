
package overloading;

import java.util.Scanner;

public class Task1 {
    void route(String s,String code,String code1)
    {
        System.out.println("City Name = "+s+"by  = "+code+"last dest "+code1);
    }
    void route(String s,int code)
    {
    }
    void route(String s)
    {
    }
    public static void main(String[] args) {
        System.err.println("Enter  your loction of string");
        Scanner sc=new Scanner(System.in);
                
         Task1 f=new Task1();
         
         String s=sc.nextLine();
//         String code=sc.nextLine();
//         String code1=sc.nextLine();
         
         f.route(s);
        
        
    }
    
}
