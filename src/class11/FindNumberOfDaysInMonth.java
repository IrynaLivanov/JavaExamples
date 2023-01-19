package class11;

import java.util.Scanner;
public class FindNumberOfDaysInMonth {
    public static void main(String[] args) {


        System.out.println("Enter month number 1,2 or 11");
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("In this month 31 days.");
                break;
            case 2:
                System.out.println("In this month 28/29 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println("In this month 30 days.");
                break;

            default:
                System.out.println("Enter number from 1 to 12 only");

        }
    }
}
