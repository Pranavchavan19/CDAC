package abstration;

import java.util.Scanner;
abstract class LivingThing {

    void eyes() {
        System.out.println("Two Eyes ");
    }
    void mouth() {
        System.out.println("One mouth ");
        System.out.println("enter choice");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(s);
    }
    abstract void legs();
}
class Human extends LivingThing {

    @Override
    void legs() {
        System.out.println("four legs ");
    }

   
}
class Animal extends LivingThing {
    @Override
    void legs() {
        System.out.println("four legs ");
    }
}
public class Abstraction {

    public static void main(String[] args) {
        LivingThing it; // creating object referce
        System.out.println("Property of Human=");
        it = new Human();  // initilizing it variable with method
        it.eyes();
        it.legs();
        it.mouth();
        System.out.println("Property of Animal=");
        it = new Animal();
        it.eyes();
        it.legs();
        it.mouth();
        
    }

}
