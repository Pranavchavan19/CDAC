package exception;

public class TestThrows {

    int a = 10, b = 2;

    void show() throws Exception  {
        System.out.println(a / b);
        System.out.println("Pranav ");
        Class.forName("");  // run time exception

    }
//    void show() throws Exception
//    {
//        System.out.println(a/b);
//        class.forName("");
//    
//    }

    void display() {
        System.out.println("display()");

    }

    void test() {
        System.out.println("test()");
        display();

    }

}
