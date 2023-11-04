
package recurssion;


public class BinaryRecursection {
    public static int fibo(int n)
    {
     if(n<=1)
     
      return n;
     
     return fibo(n-1)+fibo(n-2);
     
     
    }
    public static void main(String[] args) {
        
        System.out.println(fibo(5));
       
        for(int i=0;i<5;i++)
       
        System.out.print(fibo(i)+" ");
        
    }
    
}
