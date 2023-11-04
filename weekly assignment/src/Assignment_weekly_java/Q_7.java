/*7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous
Inner class).
*/
// Outer class
class Outer {
    private int outerVariable = 10;

    // Member Inner class
    class MemberInner {
        void display() {
            System.out.println("Member Inner: outerVariable = " + outerVariable);
        }
    }

    // Method with Local Inner class
    void localInnerMethod() {
        int localVariable = 5;

        class LocalInner {
            void display() {
                System.out.println("Local Inner: localVariable = " + localVariable);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    // Method with Anonymous Inner class
    void anonymousInnerMethod() {
        // Anonymous Inner class implementing a simple interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner: outerVariable = " + outerVariable);
            }
        };

        new Thread(runnable).start();
    }
}

public class Q_7 {
    public static void main(String[] args) {
        // Creating an instance of the Outer class
        Outer outerObj = new Outer();

        // Creating an instance of the Member Inner class
        Outer.MemberInner memberInner = outerObj.new MemberInner();
        memberInner.display();

        // Calling the method with Local Inner class
        outerObj.localInnerMethod();

        // Calling the method with Anonymous Inner class
        outerObj.anonymousInnerMethod();
    }
}
