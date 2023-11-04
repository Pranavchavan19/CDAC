package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

import java.util.Queue;

public class Queue_demo {

    public static void main(String[] args) {
//        Queue<String> g= new PriorityQueue<>();
//        g.add("Aranva");
//        g.add("Dwapnil");
//        g.add("Cahesh");
//        g.add("Eritam");
//        g.add("Ballavi");
//        
//        
//     
//      System.out.println(g);
     
//       String p= g.poll();
//       
//        
//        System.out.println(p);
//        
//          System.out.println(g);

//            Queue<String> v= new ArrayDeque<>();
//            v.add("Abc");
//            v.add("Pqr");
//            v.add("Aaa");
//            
//            System.out.println(v);
        PriorityQueue<String> g = new PriorityQueue();
        
        g.add("A");
        g.add("D");
        g.add("C");
        g.add("m");
        g.add("e");
        g.add("k");
        g.add("l");
        g.add("f");
        g.add("h");
        g.add("i");
        g.add("j");
        g.add("g");
        g.add("B");
        
       System.out.println(g);
        
   //     System.out.println(g);//natural sorting
//                for(String s:g)
//                {
//                   String p= g.peek();
//                    System.out.println(p);
//                }
//  for(String s66:g)
//  {
//      System.out.println(s66);
//  
//  }
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
//
//        String s2 = g.poll();
//        System.out.println(s2);
//        System.out.println(g);

       // String s3 = g.poll();
       // System.out.println(s3);
       // System.out.println(g);

        //System.out.println(g);//natural sorting

    }

}
