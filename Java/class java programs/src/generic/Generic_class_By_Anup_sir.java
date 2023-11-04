package generic;

import java.util.List;

class Container<T,V>{
    T contain;

    public Container(T contain) {
        this.contain = contain;
    }

    public T getContain() {
        return contain;
    }
    public List showData(List<? super V> data){
        return data;
    }
    public void showType(){
        System.out.println(contain.getClass().getName());
    }
}
public class Generic_class_By_Anup_sir {
    public static void main(String[] args) {
        Container<String,Integer> c=new Container<>("Cdac");
        String s=c.getContain();
        System.out.println(s);
        System.out.println(c.showData(List.of(102,23,34,45)));
       List<Number> lst=List.of(102.23,23.33,34.44,45.55);
        System.out.println(c.showData(lst));
//       System.out.println(c.showData(new Object(12.23)));
        c.showType();
    }
}
