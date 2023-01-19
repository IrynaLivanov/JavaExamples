package class11;
import java.util.Scanner;
//Task #1 - Write a program to get a number and print day name as per below mapping
//0 - Sunday
//1 - Monday
//2 - Tuesday....
//6 - Saturday

public class HomeW11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the day's number of the week from 0 to 6 ( 0 is Sunday) ");
        int num = sc.nextInt();

        switch (num) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueasday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Enter valid number");

        }
    }
}
