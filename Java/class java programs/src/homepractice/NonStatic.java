package homepractice;

class A {

    int y = 9;

    class B {

        int x = 6;

        void show() {
            System.out.println("sum=" + (x + y));
        }

    }
}

public class NonStatic {

    public static void main(String[] args) {
        A o = new A();
        A.B obj = o.new B();
        obj.show();
    }
}
