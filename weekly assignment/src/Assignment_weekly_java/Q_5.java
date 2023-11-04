/*5.Write a Java program to demonstrate Upcasting Vs Downcasting*/
package Assignment_weekly_java;

 class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Q_5 {
    public static void main(String[] args) {
         // Upcasting
        Animal animal = new Dog(); // Upcasting from Dog to Animal
        animal.eat(); // This works

        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting from Animal to Dog
            dog.bark(); // This works
        }
    
    }
    
}
