
package generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class person
{

private String name;
private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }



private void showinfo()
{
    System.out.println("hello "+name+",your age is"+age);
}
//public void showinfo()
//{
//    System.out.println("hello "+name+",your age is"+age);
//}
}
public class ReflectionApi {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        //create class reference
        Class personCls=person.class;
        // ithe constructor  writen type ahe
      Constructor cons=  personCls.getDeclaredConstructor(String.class,int.class);
        Object object =cons.newInstance("Ramesh",23);
        
        Field fname=  personCls.getDeclaredField("name");// to update method
        fname.setAccessible(true); // access private property and update
        fname.set(object, "suresh");
        
        Method m=  personCls.getDeclaredMethod("showinfo");
      m.setAccessible(true);// private la access krto
      m.invoke(object);
      
    Field fage=  personCls.getDeclaredField("age");
    fage.setAccessible(true);
    int ag=fage.getInt(object);// downcasting chi garj nahi ithe int method ahe
        System.out.println(ag);
      
     String s=(String) fname.get(object);// downcasting kely
        System.out.println(s);
    }
        
    
    
}
