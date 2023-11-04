
package wraper;

public class Testwrapper {
    public static void main(String[] args) {
        int x=10;
        /*Integer i=new Integer(x); // Boxing
        int a=i.intValue();            // UnBoxing*/
        
        
        Integer i=x;                 // AutoBoxing
        int a=i;                     // AutoUnBoxing
        System.out.println("primitive x= "+x);
        System.out.println("Reference x= "+i);
        
        // String to correspnding numeric value
        String age="25";
       System.err.println("age="+age+5);
        int age1=Integer.parseInt(age);
      //  Integer.valueOf(age);     value of method
        System.err.println(age1+5); // addition
 
    }
    
}
