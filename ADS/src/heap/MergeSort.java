package heap;

public class MergeSort {

    void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i, j, k;
        i = start;
        j = mid + 1;
        k = 0;

        // compare and insret smaller element into temp
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }

        }
        // for remaining element of  first array (half part)
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // for remaining element of second array (half part)
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        //copy temp to origional key
        k = 0;
        for (i = start;i<=end;i++ )
        {
          arr[i]=temp[k++];
        }
    }

    void mergesort(int arr[], int start, int end) {
        if (start < end) {

            int mid = (start + end) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }

    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = {50, 10, 30, 60, 80, 20, 100};
        ms.mergesort(arr, 0, arr.length - 1);
         for(int no:arr)
        {
            System.out.println(no);
        
        }
    }

}
