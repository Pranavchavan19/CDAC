
package Labassignment;


public class sorted {
    public static void main(String[] args) {
        String names="Ramesh, Suresh, Dinesh, Bhavesh, Ganesh";
        String n[]=names.split(", ");
        for( String name : n)
        {
            System.out.println(name);
        }
        for(int i=0;i<n.length;i++)
        {
         for(int j=i+1;j<n.length;j++)
         {
         if(n[i].compareToIgnoreCase(n[i])>0)
         {
             String temp=n[i];
             n[i]=n[j];
             n[j]=temp;
         }
         
         }
         
        }
                System.out.println("sorted order");
               for(String name :n)
               {
                     System.out.println(name);

               }
        
    }
    
}
