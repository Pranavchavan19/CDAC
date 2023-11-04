
package objectInsideMethod;
public class Test1 {
    String objName;
    
    public Test1(String objName){
        this.objName = objName;
    }
    protected void finalize(){
        System.out.println(objName+" is destroy");
    }
    public static void main(String[] args){
        Test1 t1 = new Test1("t1");
        Test1 t2 = new Test1("t2");
        t1 = t2;
        System.gc();
    }
}
