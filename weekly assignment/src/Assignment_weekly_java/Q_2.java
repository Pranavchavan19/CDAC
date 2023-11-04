
/*
 2. Write a program in java to create a class name studinfo accept the student
information by the member method getdata and inherit it in the base class name marks create
method to get marks in derived class and calculate the percentage and display the complete
information of student do this for three students.

 */
package Assignment_weekly_java;

import java.util.Scanner;

class Studinfo {

    static void getdata1() {
        System.err.println("Enter student name");
        String s;
        String s1;
        Scanner sc1 = new Scanner(System.in);
        System.err.println("Enter student Class");
        Scanner sc2 = new Scanner(System.in);
        s = sc1.nextLine();
        s1 = sc2.nextLine();

        System.err.println("Mr.pranav");
        System.err.println("Enter the Marks of 6 subjects");
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        System.err.println("Marathi=" + m1);
        int m2 = sc.nextInt();
        System.err.println("Hindi=" + m2);
        int m3 = sc.nextInt();
        System.err.println("Englidh=" + m3);
        int m4 = sc.nextInt();
        System.err.println("math=" + m4);
        int m5 = sc.nextInt();
        System.err.println("history=" + m5);
        int m6 = sc.nextInt();
        System.err.println("science=" + m6);
        float total = (m1 + m2 + m3 + m4 + m5 + m6);
        System.out.println("Total marks os Subject=" + total);
        System.err.println("Percentage=" + (total / 6));

    }

    static void getdata2() {
        System.err.println("Enter student name");
        String s;
        String s1;
        Scanner sc1 = new Scanner(System.in);
        System.err.println("Enter student Class");
        Scanner sc2 = new Scanner(System.in);
        s = sc1.nextLine();
        s1 = sc2.nextLine();
        System.err.println("Mr.Raman");
        System.err.println("Enter the Marks of 6 subjects");
        Scanner sc = new Scanner(System.in);

        float m1 = sc.nextInt();
        System.err.println("Marathi=" + m1);
        float m2 = sc.nextInt();
        System.err.println("Hindi=" + m2);
        int m3 = sc.nextInt();
        System.err.println("Englidh=" + m3);
        int m4 = sc.nextInt();
        System.err.println("math=" + m4);
        int m5 = sc.nextInt();
        System.err.println("history=" + m5);
        int m6 = sc.nextInt();
        System.err.println("science=" + m6);
        float total = (m1 + m2 + m3 + m4 + m5 + m6);
        System.out.println("Total marks os Subject=" + total);
        System.err.println("Percentage=" + (total / 6));

    }

    static void getdata3() {
        System.err.println("Enter student name");
        String s;
        String s1;
        Scanner sc1 = new Scanner(System.in);
        System.err.println("Enter student Class");
        Scanner sc2 = new Scanner(System.in);
        s = sc1.nextLine();
        s1 = sc2.nextLine();
        System.err.println("Mr.Swpnil");
        System.err.println("Enter the Marks of 6 subjects");
        Scanner sc = new Scanner(System.in);

        float m1 = sc.nextInt();
        System.err.println("Marathi=" + m1);
        float m2 = sc.nextInt();
        System.err.println("Hindi=" + m2);
        float m3 = sc.nextInt();
        System.err.println("Englidh=" + m3);
        float m4 = sc.nextInt();
        System.err.println("math=" + m4);
        float m5 = sc.nextInt();
        System.err.println("history=" + m5);
        float m6 = sc.nextInt();
        System.err.println("science=" + m6);
        float total = (m1 + m2 + m3 + m4 + m5 + m6);
        System.out.println("Total marks os Subject=" + total);
        System.err.println("Percentage=" + (total / 6));

    }

}

public class Q_2 extends Studinfo {

    static void marks() {
        getdata1();
        getdata2();
        getdata3();

    }

    public static void main(String[] args) {

        System.err.println("Enter your choice  upto 3");
        System.err.println("Enter  1 for Student 1  ");
        System.err.println("Enter  2 for Student 2  ");
        System.err.println("Enter  3 for  Student 3 ");

        Scanner sc = new Scanner(System.in);

        int choice;
        choice = sc.nextInt();
        switch (choice) {
            case 1:

                Q_2 t = new Q_2();
                getdata1();

                break;
            case 2:

                Q_2 t1 = new Q_2();
                getdata2();
                break;
            case 3:

                Q_2 t3 = new Q_2();
                getdata3();
                break;
            default:
                throw new AssertionError();
        }
    }
}
