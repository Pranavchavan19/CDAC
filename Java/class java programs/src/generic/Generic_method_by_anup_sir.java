package generic;

import java.util.List;

public class Generic_method_by_anup_sir {
    
//    public static <E>void showData(E arr[]){
//        for(E s:arr)
//            System.out.println(s);
//    }
  
//    public static <E>void showData(List<E> lst){
//        for(E s:lst)
//            System.out.println(s);
//    }
      //upper bound
//    public static void showData(List<? extends Number> lst){
//        for(Number s:lst)
//            System.out.println(s);
//    }
    //Lower bound
    public static void showData(List<? super Integer> lst){
        for(Object s:lst)
            System.out.println(s);
    }
   
    public static void main(String[] args) {
//        String names[]={"Ramesh","Suresh","Dinesh","Mahesh"};
//        Integer ages[]={23,24,25,35};
//        showData(names);
//        showData(ages);

//        List lst1=List.of("Ramesh","Suresh","Dinesh","Mahesh");
        List<Integer> lst2=List.of(23,24,25,35);
        List<Number> lst3=List.of(23.23,24.22,25.11,35.66);
//        showData(lst1);
        showData(lst2);
        showData(lst3);
    }
}
