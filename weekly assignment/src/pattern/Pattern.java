
import java.util.Scanner;
public class Pattern {
 void etriangle() {
     Scanner sc=new Scanner(System.in);
     System.err.println("Enter size of pattern");
     int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
                System.out.println(" ");
        }
    }
    public static void main(String[] args) {
         Pattern j = new  Pattern();
        j.etriangle();
    }
    }
       
    
    

