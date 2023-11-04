/*7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous
Inner class).
 */
package Assignment_weekly_java;

class Outer {

    int a = 6;

    class Member {

        int v = 9;

        void show() {
            System.out.println("add=" + (a + v));

        }

    }

}

public class Q_7_part_II {

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Member g = obj.new Member();
        g.show();

    }

}
