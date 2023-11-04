
package heap;

public class QuickSort {
    int pindex;
      void swap(int arr[],int i,int j)
    {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    int partition(int arr[],int start,int end)
    {
      pindex=start;
      int pivot=arr[end];
      for(int i=start;i<end;i++)
      {
       if(arr[i]<pivot)
       {
        swap(arr,i,pindex);
        pindex++;
       }
      
      }
        swap(arr,pindex,end);
        return pindex;
    }
    
    void quicksort(int arr[],int start,int end)
    {
      if(start<end)
      {
       pindex=partition(arr, start, end);
          quicksort(arr, start, pindex-1);
          quicksort(arr, pindex+1, end);
      }
    }
    public static void main(String[] args) {
        QuickSort i=new QuickSort();
         int arr[]={50,10,30,60,80,20,100};
         i.quicksort(arr, 0, arr.length-1);
         for (int j : arr) 
        {
            System.out.println(j);
        }
        
    }
    
}
