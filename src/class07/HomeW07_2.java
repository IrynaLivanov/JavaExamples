package class07;
import java.util.Scanner;

public class HomeW07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of month from 1 to 12");
        int month = sc.nextInt();

        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month == 12) {
            System.out.println("\n 31 Days in this month.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("\n 30 Days in this month.");
        } else if ( month == 2){
            System.out.println("\n Either 28 or 29 Days in this month");

        }
    }
}
