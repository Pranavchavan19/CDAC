

package exception;


public class Exception_Demo_2 {
    public static void main(String[] args) {
        TestThrows tt=new TestThrows();
//        tt.show();
        tt.test();
       // tt.display();
        try{
            tt.show();
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
