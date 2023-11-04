
package objectInsideMethod;


public class Test3 {
    protected void finalize(){
        System.out.println("Object is destoryed");
    
    }
    public static void main(String[] args) {
        new Test3();
        System.gc();
        
    }
    
}
