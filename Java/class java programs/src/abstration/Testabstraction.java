package abstration;

import java.util.Scanner;

abstract class LivingThing {

    void eyes() {
        System.out.println("Two Eyes ");

    }

    void mouth() {
        System.out.println("One mouth ");

    }

    abstract void legs();

}

class Human extends LivingThing {

    @Override
    void legs() {
        System.out.println("two legs ");
    }

}

class Animal extends LivingThing {

    @Override
    void legs() {
        System.out.println("four legs ");

    }
}

public class Testabstraction {

    static void showproperty(LivingThing t) {
        t.eyes();
        t.mouth();
        t.legs();

    }

    public static void main(String[] args) {

        System.out.println("Enter whose property want to know ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if (choice.equals("Human")) {
            showproperty(new Human());

        } else {
            showproperty(new Animal());

        }

    }

}
