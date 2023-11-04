package homepractice;

class Outer {

    int y = 9;

  static class Inner  {

        int x = 6;

        void show() {

 Outer c=new Outer();
            System.out.println("sum=" + (x + c.y));
         }
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {
    
        Outer.Inner f =new Outer.Inner();
        f.show();
    }

}
