package collection;

import java.util.ArrayList;
import java.util.List;

public class add {

    public static void main(String[] args) {
        List lst = new ArrayList();
        List lst1 = new ArrayList();

        lst1.add('1');
        lst1.add('2');
        lst1.add('3');
        lst1.add('1');// allow duplicacy

        lst.add('D');
        lst.add('A');
        lst.add('B');
        lst.add('D');// allow duplicacy

        lst.add(3, 'c');
         lst.addAll(lst1);
        lst.remove(0);
        lst.add(0, lst1);

        System.out.println(lst);  // it follow sequence
       System.out.println(lst1);  // it follow sequence
       System.out.println(lst.get(3));
        System.out.println(lst.contains('b'));
    }

}
