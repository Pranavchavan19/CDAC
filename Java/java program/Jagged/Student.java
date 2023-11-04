

import java.util.Scanner;
 class Student{
    int m1,m2,m3,m4,m5;
    float total=0;
    float per=0;
    Scanner sc=new Scanner(System.in);
    void sub()
    {
        System.out.print("\nEnter the Subjects marks Out Of 50 :");
        System.out.print("\nEnter the 5 subjects marks:");
        m1=sc.nextInt();
       
        m2=sc.nextInt();
       
        m3=sc.nextInt();
        
        m4=sc.nextInt();
         
        m5=sc.nextInt();
      
    }
    void total()
    {
          System.out.print("\nTotal Marks:");
       total= m1+m2+m3+m4+m5;
         System.out.print(total);


    }
    void percentage()
    {
         System.out.print("\n%=");
         per=((total/250))*100;
        System.out.print(per);
        if(per>=90)
        {
              System.out.print("\nGrade :"+"A+");
        }
        else if(per>=80)
        {
             System.out.print("\nGrade :"+"A");
        }
        else if(per>=70)
        {
           System.out.print("\nGrade :"+"B+");
        }
        else if(per>=60)
        {
             System.out.print("\nGrade :"+"B");
        }
        else if(per>=50)
        {
             System.out.print("\nGrade :"+"c");
        }
        else  if(per>=40)
        {
              System.out.print("\nGrade :"+"Fail");
        }
        else
        {
             System.out.print("\nGrade :"+"You Need To Improve your self");
        }

    }
	 
	 
public static void main(String ar[]){
    //System.out.print("\nEnter student name");
    Student s=new Student();
    s.sub();
    s.total();
    s. percentage();

}
}	



