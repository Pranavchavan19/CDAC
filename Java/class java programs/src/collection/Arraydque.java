
package collection;

import java.util.PriorityQueue;


public class Arraydque {
    public static void main(String[] args) {
         Arraydque<String> g = new ArrayDque();
        
        g.add("mahesh");
        g.add("gahesh");
        g.add("jahesh");
        g.add("lahesh");
        System.out.println(g);//natural sorting
//                for(String s:g)
//                {
//                   String p= g.peek();
//                    System.out.println(p);
//                }

        String s = g.poll();
        System.out.println(s);
        System.out.println(g);
        String s1 = g.poll();
        System.out.println(s1);
        System.out.println(g);

        String s2 = g.poll();
        System.out.println(s2);
        System.out.println(g);

       // String s3 = g.poll();
       // System.out.println(s3);
       // System.out.println(g);

        //System.out.println(g);//natural sorting

    }
    
}
