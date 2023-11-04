/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homepractice;

import java.util.Scanner;

 class over{
   void   over1( String s)
     {
         System.err.println("Starting point ="+s);
     }
     void over1(String s,String last){
         System.out.println("starting point="+s+"Last point ="+last);
     
     }
    void  over1(String s,String last,String mid)
     {
         System.out.println("Starting point ="+s+ " last point ="+last+" Mid point ="+mid);
     }
}
public class Overloading1 {
    public static void main(String[] args) {
        /*over1  o= new over("latur");
        over1  o1=new over("latur  ","pune");
        over1  o2=new over("latur  ","pune","mumbai");*/   //without using scanner class
        System.out.println("Enter your Staring poitn");
        Scanner sc=new Scanner(System.in);
        over s1=new over();
        
        
          String s=sc.nextLine();
          String last=sc.nextLine();
          String mid=sc.nextLine();
          s1.over1(s);
          //System.out.println(" Staring poitn  "+s+" last point ="+last);
          s1.over1(s, last);
         // System.out.println("  Staring poitn "+s+"  last point"+last+" middle"+mid);
          s1.over1(s, last, mid);

      
                
   
    }
    
}
