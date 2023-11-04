
package generic;

class Container
{
  //String contain;
   Object contain;

    public Container(Object contain) {
        this.contain = contain;
    }

    public  Object getContain() {// object cha thilani string 
        return contain;
       //  return Object;
    }

  public void showType()
  {
      System.out.println(contain.getClass().getName());
  }
}
public class GenericClass {
    public static void main(String[] args) {
        Container c=new Container("Cdac");
      // Container c=new Container(23);
      String s=(String)c.getContain();
        System.out.println(c.getContain());
        c.showType();
        
    }
    
}
