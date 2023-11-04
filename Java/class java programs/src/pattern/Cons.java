
 package pattern;

import java.util.Scanner;

public class Cons {
    void route(String   s,String s1,String s3){
        System.err.println("Moving from  "+s+"to  "+s1+"by "+s3);
    }
    void route(String   s,String s1){
        System.err.println("Moving from "+s+"to "+s1);
    }
    void route(String   s){
        System.err.println("Moving from "+s);
    }

    public static void main(String[] args) {
        
         Cons f=new  Cons();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        
        System.out.println("Please Enter choice : ");
       
        System.out.println("1. form distination only ");
       
        System.out.println("2. form destinanation and source");
       
        System.out.println("3. form source via and destinantion");
       
        int choice=sc1.nextInt();
        switch (choice) {
            case 1: System.out.println("1. form distination only ");
               String v=sc.nextLine();
               f.route(v);
                break;
                
                case 2:   System.out.println("2. form destinanation and source");
               String v1=sc.nextLine();
                String v3=sc.nextLine();
               f.route(v1,v3);
                break;
                
                case 3:  System.out.println("3. form source via and destinantion");
               String v2=sc.nextLine();
               String v5=sc.nextLine();
               String v6=sc.nextLine();
               f.route(v2,v5,v6);
                break;
                
            default:
                System.out.println("You Enter wrong value");
                
        }
    }
}
