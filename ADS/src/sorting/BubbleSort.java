
package sorting;


public class BubbleSort {
    public void swap(int arr[],int i,int j)
    {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      
    }
    public void bubblesort(int arr[],int size)
    {
      for(int i=0;i<=size-1;i++)
      {
       for(int j=0;j<size-1-i;j++)
       {
         if(arr[j]>arr[j+1])
         {
          swap(arr,j,j+1);
         }
       }
       System.out.println(arr[i]);
      }
       
    
    }
    public static void main(String[] args) {
        int arr[]={25,5,20,10,50};
        BubbleSort v=new BubbleSort();
        v.bubblesort(arr, 5);
    }
    
}

//package sorting;
//
//
//public class BubbleSort {
//    public void swap(int arr[],int i,int j)
//    {
//      int temp=arr[i];
//      arr[i]=arr[j];
//      arr[j]=temp;
//      
//    }
//    public int[] bubblesort(int arr[])
//    {
//       int size = arr.length;
//      for(int i=0;i<size-1;i++)
//      {
//       for(int j=0;j<size-1-i;j++)
//       {
//         if(arr[j]>arr[j+1])
//         {
//          swap(arr,j,j+1);
//         }
//       }
//      }
//       
//      return arr;
//    }
//    public static void main(String[] args) {
//        int arr[]={25,5,20,10,50};
//        BubbleSort v=new BubbleSort();
//        int a[] = v.bubblesort(arr);
//        for (int i : a) {
//            System.out.println(i);
//        }
//    }
//    
//}
