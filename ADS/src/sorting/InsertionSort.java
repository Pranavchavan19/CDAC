//package sorting;
//
//
//
//public class InsertionSort {
//    
//    public int[] InsertionSort(int arr[],int size){
//        for(int i=1 ; i<size;i++){
//            int value = arr[i];
//            int index = i;
//            while(index >0 && arr[index-1] >value){
//                arr[index]=arr[index-1];
//                index--;
//            }
//            arr[index] = value;
//            
//        }
//        return arr;
//}
//    
//    
//    public static void main(String[] args) {
//        InsertionSort isd = new InsertionSort();
//       int arr[]={50,80,10,60,70,90};
//       int a[]=isd.InsertionSort(arr, 6);
//       for(int i:a){
//           System.out.println(i);
//       }
//    }
//}
package sorting;



public class InsertionSort {
    
    public int [] InsertionSort(int arr[],int size){
        for(int i=1 ; i<size;i++){
            int value = arr[i];
            int index = i;
            while(index >0 && arr[index-1] >value){
                arr[index]=arr[index-1];
                index--;
                     
            }
          
           arr[index] = value;
                    
            
           
        }
       return arr;
}
    
    
    public static void main(String[] args) {
       // InsertionSort isd = new InsertionSort();
       int arr[]={50,80,10,60,70,90};
       InsertionSort n=new InsertionSort();
      int a[]= n.InsertionSort(arr, 6);
      for(int i:a)
      {
          System.out.println(i);
      }
      
      
       }
    }
