
/* class Jagged{
  
   
    public static void main(String ar[])
    {
     int ja[][]=new int [3][];
     ja[0]={1,2,3,4,5};
     ja[1]={1,2,3};
     ja[2]={1,2,3,4};
     System.out.print(ja[][]);

     
    }
}*/
/*import java.util.Scanner;
class Jagged{
   int arr[][]=new int [3][];
   void takeinput() {
   arr[0]=new int [5];
   arr[1]=new int [2];
   arr[2]=new int [4];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter "+(arr[0].length)+(arr[1].length)+(arr[2].length)+"nos");
   for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i];j++)
    {
        arr[i][j]=sc.nextInt();
    }

   }
   }
   void showoutput() {
    System.out.println("\nOutput of Array is:");
    for(int i=0;i<arr.length;i++)
   {
    for(int j=0;j<arr[i].length;j++){
      System.out.print(arr[i][j]+"\t");
    }
   
   
    System.out.println();
   }
}
    public static void main(String ar[]) {
    Jagged j=new Jagged();
    j.takeinput();
    j.showoutput();
    }
}*/
import java.util.Scanner;
 class Jagged{

int arr[][]=new int[3][];
   
	 void takeInput(){
     arr[0]=new int [5];
     arr[1]=new int [2];
	 arr[2]=new int [4];
	 
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter "+(arr[0].length+arr[1].length+arr[2].length)+"+nos");
		 for (int i=0;i<arr.length;i++){
		 
		 for(int j=0;j<arr[i].length;j++){
			 arr[i][j]=sc.nextInt();
		 }
		 }
		 showOutput();
	 }
	 void showOutput(){
		 System.out.println("\n\noutput Array is ...");
		 for(int i=0;i<arr.length;i++){
			 for(int j=0;j<arr[i].length;j++){
				 System.out.print(arr[i][j]+"\t");
			 }
			 System.out.println();
		 }
	 }
	 
public static void main(String ar[]){
	Jagged jd=new Jagged();
	jd.takeInput();
	jd.showOutput();
}
	
}


