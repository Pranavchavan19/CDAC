//
//package sorting;
//
//
//public class SelectionSort {
//    
//    public void swap(int arr[],int i,int j)
//    {
//      int temp=arr[i];
//      arr[i]=arr[j];
//      arr[j]=temp;
//      
//    }
//    int size,arr[];
//   
//    public void selectionsort(int arr[],int size)
//    {
//       for(int i=0;i<size;i++)
//       {
//        for(int j=i+1;j<size;j++)
//        {
//          if(arr[i]>arr[j])
//          {
//           swap(arr,i,j);
//          
//          }
//        }
//           System.out.println(arr[i]+" ");
//       
//       }
//    }
//    public static void main(String[] args) {
//        int arr[]={44,66,77,8,1};
//        
//        SelectionSort ob=new SelectionSort();
//        ob.selectionsort(arr, 5);
// 
//    }
//    
//}

package sorting;


public class SelectionSort {
    
    public void swap(int arr[],int i,int j)
    {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      
    }
    int size,arr[];
   
    public int [] selectionsort(int arr[])
    {
        int size=arr.length;
       for(int i=0;i<size;i++)
       {
        for(int j=i+1;j<size;j++)
        {
          if(arr[i]>arr[j])
          {
           swap(arr,i,j);
          
          }
        }
         //  System.out.println(arr[i]+" ");
       
       }
       return arr;
    }
    public static void main(String[] args) {
        int arr[]={44,66,77,8,1};
        
      SelectionSort ob=new SelectionSort();
       int []a=  ob.selectionsort(arr);
        for (int i : a) {
            System.out.println(i);
        }
 
    }
    
}
