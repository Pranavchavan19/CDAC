
package generic;

import java.util.List;


public class GenericMethod {     
    // lower bond
public static  void showData(List<? super Integer>lst)// <? extends Number> arr[]
    {
     for (Object s:lst)  // objicet is parent class of integer
     {
         System.out.println(s);
        // number class chi derived class ahe and Double also
     }
    }



// upper bond
//      public static  void showData(List<? extends Number>list)// <? extends Number> arr[]
//    {
//     for (Number s:list)
//     {
//         System.out.println(s);
//        // number class chi derived class ahe and Double also
//     }
//    }
    
//    public static <E> void showData(E arr[])// generic using
//    {
//     for (E s:arr)
//     {
//         System.out.println(s);
//     }
//    }
//       public static void showData(String arr[])
//    {
//     for (String s:arr)
//     {
//         System.out.println(s);
//     }
//    }
//     public static void showData(Integer arr[])
//    {
//     for (Integer s:arr)
//     {
//         System.out.println(s);
//     }
//    }
    public static void main(String[] args) {
//        String names []={"Ramesh","Suresh","Dinesh","Mahesh","\n"};
//        Integer ages []={33,4,66,77,8};
//        showData(names);
//        showData(ages);
        List lst1=List.of(23,44,66,77,8,9);
       // List lst2=List.of(23,88.44,66,77.77,8,9);
        List <Number>lst2=List.of(23,88.44,66,77.77,8,9);// ithe Number cha thikani jr double parent nahi integer cha
        showData(lst2);
    }
    
}
