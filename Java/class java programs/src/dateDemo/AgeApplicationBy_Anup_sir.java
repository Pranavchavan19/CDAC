package dateDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class AgeApplicationBy_Anup_sir {

    public static void main(String[] args) {
        System.out.println("Enter your date of birth 'date/month/year'");
        Scanner sc=new Scanner(System.in);
        //==>23/12/2012
        String dob=sc.next();
        String arr[]=dob.split("/");
        
        int d=Integer.parseInt(arr[0]);
        int m=Integer.parseInt(arr[1]);
        int y=Integer.parseInt(arr[2]);
        
        LocalDate birthDate=LocalDate.of(y, m, d);
        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        System.out.println(today.getMonth());
//        System.out.println(today.getMonthValue());
//        System.out.println(today.getDayOfMonth());
//        System.out.println(today.getDayOfYear());
//        System.out.println(today.plusWeeks(3));
        System.out.println(today.isAfter(LocalDate.of(2021, 10, 23)));

        Period p=Period.between(birthDate, today);
                System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days");
    }
}
