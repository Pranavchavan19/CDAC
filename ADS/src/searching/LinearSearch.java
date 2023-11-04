
package searching;


public class LinearSearch {
    public int linearSearch (int arr[],int key)
    {
        int i;
        for( i=0;i<arr.length;i++)
        {
        if(arr[i]==key)
        {
         return 1;
        }
        
        }
    return 0;
    
    }
    public static void main(String[] args) {
        int page_number[]={86,91,34,50,0};
        int key=86;
        LinearSearch obj=new LinearSearch();
        if(obj.linearSearch(page_number, key)==1)
       
        {
            System.out.println("search Found");
        }
        
        else
        {
          System.out.println("search Not Found");

        }
    }
    
}
