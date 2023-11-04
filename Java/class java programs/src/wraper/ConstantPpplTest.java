
package wraper;


public class ConstantPpplTest {
    public static void main(String[] args) {
        // For integrt family -128 to 127 (Bytes)
                System.err.println("----------------------------------Start --------------------------------");

        Byte b1=Byte.valueOf("127");
        Byte b2=Byte.valueOf("127");
         System.out.println(b1==b2);
         
             Short b11=Short.valueOf("125");  
             Short b22=Short.valueOf("125");// heap memory madhe jato
             System.out.println(b11==b22);

        Long b111= Long.valueOf("121");
        Long b222= Long.valueOf("121");
        System.out.println(b111==b222);
         
        Integer b1111= Integer.valueOf("121");
        Integer b2222= Integer.valueOf("121");
         System.out.println(b1111==b2222);


        
        
        System.err.println("----------------------------------End  --------------------------------");

        
 //ithe int ani long pending
        System.out.println("********************************************************************");
        System.err.println("----------------------------------Start --------------------------------");
// constant pool is not avaible 
 Float  m=Float.valueOf("123");
 Float  m1=Float.valueOf("123");
 System.out.println(m==m1);

        Double  j=Double.valueOf("123");
        Double j1=Double.valueOf("123");
 System.out.println(j==j1);
        System.err.println("----------------------------------End  --------------------------------");

System.err.println("----------------------------------Start --------------------------------");

     Boolean c1= Boolean.valueOf("true");
             Boolean c2= Boolean.valueOf("true");
              System.out.println(c1==c2);

Boolean c11= Boolean.valueOf("false");
Boolean c22= Boolean.valueOf("false");
  System.out.println(c11==c22);
        System.err.println("----------------------------------End --------------------------------");

//        // float ani double sathi nahi apply
//        // Range for character for constant pool 
//
      System.err.println("----------------------------------Start --------------------------------");


        System.err.println('\u0041');// unicode of A letter
        Character v1= Character.valueOf('A');
       Character v2= Character.valueOf('A');
       System.out.println(v1==v2);

       Character v11= Character.valueOf('\u0950');
        Character v22= Character.valueOf('\u0950'); // constant pool madhe jat nahi 
         System.out.println(v11==v22);
        System.err.println("----------------------------------End --------------------------------");

//
        System.err.println('\u0923');
    }
    
}
