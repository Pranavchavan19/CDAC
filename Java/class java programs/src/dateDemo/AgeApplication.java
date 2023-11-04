package dateDemo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.LocalDateTime;

public class AgeApplication {

    public static void main(String[] args) {
        System.err.println("Enter Your Dtae of Birth--->'date/month/year'");
        Scanner sc = new Scanner(System.in);
        //-->
        String dob = sc.next();
        String arr[] = dob.split("/");
//        for(String s:arr)
//        {
//            System.out.println(s);  // it iterate above date format
//        }

        int d = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(y, m, d);//convertion string to date

        Period p = Period.between(birthDate, today);//difference and retun period
        System.err.println("You are  " + p.getYears() + "years , " + p.getMonths() + "month , " + p.getDays() + "days  ");

    }

}
