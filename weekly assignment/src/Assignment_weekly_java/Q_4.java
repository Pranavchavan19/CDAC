/*4.Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Rectangle that extend the GeometricShape
class and implement the respective methods to calculate the area and perimeter of each shape.*/

package Assignment_weekly_java;

import java.util.Scanner;

abstract class GeometricShape
{
  
    abstract void area();
    abstract void perimeter();
    

}
class Triangle extends GeometricShape
{

    @Override
    void area() {
        System.err.println("Enter the length and breadth of Triangle");
        Scanner sc=new Scanner(System.in);
       float a= sc.nextInt();
       float b= sc.nextInt();
      
        System.out.println("Area Of Triangle Is=");
        System.out.println(0.5*(a*b));

    }

    @Override
    void perimeter() {
          System.err.println("Enter the length and breadth ,heigth of Triangle");
        Scanner sc=new Scanner(System.in);
       float a= sc.nextInt();
       float b= sc.nextInt();
        float c= sc.nextInt();
      
        System.out.println(" perimeterOf Triangle Is=");
        System.out.println(a+b+c);

    }

}
class Rectangle  extends GeometricShape
{

    @Override
    void area() {
          System.err.println("Enter the length and breadth of Rectangle");
        Scanner sc=new Scanner(System.in);
       float a= sc.nextInt();
       float b= sc.nextInt();
      
        System.out.println("Area Of Rectangle Is=");
        System.out.println(a*b);

    }

    @Override
    void perimeter() {
          System.err.println("Enter the length and breadth of perimeter");
        Scanner sc=new Scanner(System.in);
       float a= sc.nextInt();
       float b= sc.nextInt();
      
        System.out.println("perimeter Of Rectangle Is=");
        System.out.println(2*(a*b));

    }


}

public class Q_4 {
    public static void main(String[] args) {
        GeometricShape f;
        System.out.println("Description for Tringle");
        f=new Triangle();
        f.area();
        f.perimeter();
       
        System.out.println("************************************************************************");
                System.out.println("Description for Rectangle");

        f=new Rectangle();
        f.area();
        f.perimeter();
        
    }
    
}
