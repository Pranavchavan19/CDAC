package InnerClass;

class Outers {

    int a = 20;

    class InnernonStatic {

        int b = 15;

        void display() {
            System.out.println("I am non Static Inner class.." + (b + a));
        }
    }
}

public class Test_NonStaticInner {

    public static void main(String[] args) {
        Outers o = new Outers();
        Outers.InnernonStatic obj = o.new InnernonStatic();
        obj.display();
    }

}
