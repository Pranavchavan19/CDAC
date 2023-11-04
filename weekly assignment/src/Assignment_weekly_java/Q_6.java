/*6.Write a java program to create a demo application to understand the role of access modifiers.
*/
package Assignment_weekly_java;


// A class with different access modifiers
class AccessModifiersDemo {
    // Public variable - accessible from anywhere
    public int publicVariable = 10;

    // Default (package-private) variable - accessible within the same package
    int defaultVariable = 20;

    // Private variable - accessible only within the same class
    private int privateVariable = 30;

    // Protected variable - accessible within the same package and subclasses
    protected int protectedVariable = 40;

    // Public method - accessible from anywhere
    public void publicMethod() {
        System.out.println("Public Method");
    }

    // Default method - accessible within the same package
    void defaultMethod() {
        System.out.println("Default Method");
    }

    // Private method - accessible only within the same class
    private void privateMethod() {
        System.out.println("Private Method");
     
    }
    
    // Protected method - accessible within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
}

public class Q_6 {
    public static void main(String[] args) {
        // Creating an instance of AccessModifiersDemo
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Accessing public members
        System.out.println("Public Variable: " + obj.publicVariable);
        obj.publicMethod();

        // Accessing default members (within the same package)
        System.out.println("Default Variable: " + obj.defaultVariable);
        obj.defaultMethod();

        // Accessing private members (only within the same class)
        // This will result in a compilation error
         //System.out.println("Private Variable: " + obj.privateVariable);
        // obj.privateMethod();

        // Accessing protected members (within the same package and subclasses)
        System.out.println("Protected Variable: " + obj.protectedVariable);
        obj.protectedMethod();
       
    }

    
}

