
package recurssion;

public class Factorial {
    
    int fact(int n){
        if (n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Factorial r1 = new Factorial();
        System.out.println( r1.fact(10));
    }
}