package objectMethods;

import java.util.LinkedHashSet;

public class Linked_hash_prog {

    public static void main(String[] args) {
        LinkedHashSet<Integer> studs = new LinkedHashSet<>();
        studs.add(12);
        studs.add(12);
        studs.add(132);
        studs.add(132);
        System.out.println(studs);//avoid duplicate integer
        
    }

}
