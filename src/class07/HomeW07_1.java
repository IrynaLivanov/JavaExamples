package class07;
import java.util.Scanner;

public class HomeW07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any whole number");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive number.");
        } else if (num < 0) {
            System.out.println(num + " is negative number.");
        } else {
            System.out.println("It is Zero.");
        }
    }
}
