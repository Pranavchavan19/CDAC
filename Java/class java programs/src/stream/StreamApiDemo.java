
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamApiDemo {
    public static void main(String[] args) {
//        List<String> lst=List.of("Ramesh","suresh","Dinesh","bhavesh","mahesh");
//        for(String s:lst)
//        {
//            System.out.println(s);
//        }
//        
//        System.out.println("*************************************************************");
//       // lst.stream().forEach(e->System.out.println(e));
//        lst.stream().forEach(System.out::println);// method reference


         List<Integer> lst=List.of(12,11,11,10,33,55,6);
         System.out.println(lst);
        //  lst.stream().forEach(e->System.out.println(e));
        
//      List<Integer> evenlst=  lst.stream().filter(i->i%2==0).collect(Collectors.toList());
//     // lst.stream().filter(i->i%2==0).collect(Collectors.toList());
//      lst.stream().filter(i->i>20).collect(Collectors.toList());
//       System.out.println(evenlst);
//       
       
   //   lst.stream().filter(i->i%2==0).collect(Collectors.toList());
          
        
       //  lst.stream().map(i->i+5).forEach(  System.out::println);//operation
         
         
         
//         lst.stream().map(i->i+5).collect(collector);
 // lst.stream().sorted().forEach(System.out::println);//assending
   //lst.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);//dissending
   
  Integer i= lst.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(i);
        
        
        Integer i1= lst.stream().min((x,y)->x.compareTo(y)).get();// minimum
        System.out.println(i1);
        
        String arr[]={"Ramesh","suresh","Dinesh","bhavesh","mahesh"};
        Arrays.stream(arr).filter(e->e.startsWith("R")).forEach(System.out::println);
         
    }

 
    
}
