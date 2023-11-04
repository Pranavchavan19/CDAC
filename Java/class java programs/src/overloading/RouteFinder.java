
package overloading;


import java.util.*;
public class RouteFinder {
   
    void route(String src, String vai, String dest){
       
        System.out.println("Moving from "+src+ " to "+dest+" via "+vai);
       
    }
    void route(String src, String dest){
        System.out.println("Moving from "+src+ " to "+dest);
       
    }
    void route(String dest){
        System.out.println("Moving  to "+dest);
       
    }
   
    public static void main(String[] ar){
        RouteFinder rf = new RouteFinder();
       
        System.out.println("Please Enter choice : ");
       
        System.out.println("1. for distination only ");
       
        System.out.println("2. for destinanation and source");
       
        System.out.println("3. for source via and destinantion");
       
       
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
       
        int choice=sc1.nextInt();
        switch(choice){
            case 1:{
                System.out.println("distination only ");
                String d=sc.nextLine();
                rf.route(d);
                break;
            }
            case 2:{
                System.out.println("source and destinnation");
                String s=sc.nextLine();
                String d=sc.nextLine();
               
                rf.route(s,d);
                break;
               
            }
            case 3:{
                System.out.println("Enter Scource via and destinantion ");
                String s=sc.nextLine();
                String v=sc.nextLine();
                String d=sc.nextLine();                
                rf.route(s,v,d);
                break;
               
            }
            default:
               
     
        }
    }
   
   
}