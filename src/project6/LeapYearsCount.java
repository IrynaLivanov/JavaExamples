package project6;
import java.util.Scanner;
public class LeapYearsCount {
    public static void main(String[] args) {

        //        * We have a customer who was born on a leap date (04.28.1950). In 2010 she turned 60,
        //        * but officially she is 15 years old, since there were only 15 leap years between 1950 and 2010.
        //        *
        //        * Write a program that takes two years and counts the number of leap years between two years
//         *
        //        * Example output:
        //        * Enter first year: 1950
        //        * Enter second year: 2010
//         *
        //        * Number of leap years: 15


        Scanner sc = new Scanner(System.in);
        int startYear;
        int endDate;
        int count = 0;
        int year;


        System.out.println("Enter first year");
        startYear = sc.nextInt();
        System.out.println("Enter the last year");
        endDate = sc.nextInt();


        // TODO WRITE YOUR CODE HERE
        while (startYear != 0) {
            year = (endDate - startYear) / 4;
            count++;

            System.out.println(year);
            break;
        }
        countLeapYearsBetweenYears(startYear, endDate);

    }

    public static int countLeapYearsBetweenYears(int startYear, int endYear) {
        if (startYear % 400 == 0 || startYear % 4 == 0) {
            System.out.println(startYear + "is a leap year");
        } else if (startYear % 100 == 0) {
            System.out.println(startYear + "is not leap year");

        } else {
            System.out.println(startYear + "is not a leap year");

            // TODO IMPLEMENT METHOD

        }
        return startYear;

    }
}

