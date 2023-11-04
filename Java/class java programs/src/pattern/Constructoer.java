/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;


public class Constructoer {
    public int a;
    Constructoer ()
    {
        a=10;
        System.out.println("value= "+a);
    }
    Constructoer (int x){
        a=x;
        System.out.println("value= "+a);
    }
    Constructoer (int x,int y){
        a=x-y;
        System.out.println("value= "+a);
    }
    public static void main(String[] args) {
        Constructoer g =new Constructoer();
        Constructoer g1 =new Constructoer(500);
        Constructoer g2 =new Constructoer(1,19);
        
    }
    
}
