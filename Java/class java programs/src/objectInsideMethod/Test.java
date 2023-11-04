
package objectInsideMethod;


public class Test {
    String objName;

    public Test(String objName) {
        this.objName = objName;
    }
           
            static void show(){
    }
            
protected void finilize(){
    System.out.println("destory");
    
}

    public static void main(String[] args) {
        Test t1=new Test("t1");
        Test t2=new Test("t2");
        t1=t2;
        System.gc();

        
    }
       
}
