package exception;

public class Exception_demo_01 {

    int a = 10, b = 0;
    int[] a1 = {1, 2, 33};

    void show() {
        System.out.println("C");
        try {

            System.out.println(a / b);
            
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());

        }
        
        try {
              System.out.println("f");  // its  not print becaue of exc
            System.out.println("D");
            System.out.println("E");
           
            a1[5] = 55;
           
            
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        /* catch () {
            System.out.println(e.getMessage());

        } */ //        catch (Exception e) {
        //            System.out.println(e.getMessage());
        //
        //        } 
        //        catch (ArrayIndexOutOfBoundsException e) {
        //            System.out.println(e.getMessage());
        //
        //        } 
        finally {
  

        }

    }

    public static void main(String[] args) {
        System.out.println("A");

        Exception_demo_01 obj = new Exception_demo_01();
        System.out.println("B");
        obj.show();
        

    }
}
