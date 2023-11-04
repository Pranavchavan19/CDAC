
package islandOfIsolated;
public class IslandOfIsolated {
    IslandOfIsolated i;
    protected void finalize(){
        System.out.println("Object is destoryed");
    }
    public static void main(String[] args) {
        IslandOfIsolated t1=new IslandOfIsolated();
        IslandOfIsolated t2=new IslandOfIsolated();
        t1.i=t2;
        t2.i=t1;
        t1=null;
        t2=null;  // ek delete kela tari dusara pvas anto memory madhe karan connected ahet
        System.gc();
    }
    
}
