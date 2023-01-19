package class13;
import java.util.Scanner;
import java.util.Scanner;
// Write a program to find greatest number out of four using the method

public class HomeW13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        System.out.println("Enter the fourth number");
        int d = sc.nextInt();

        int result = getTheGreatestNumber( a, b, c, d);
        System.out.println(result + " is the greatest number");
    }
    static int getTheGreatestNumber(int a, int b, int c, int d) {

        if (a > b && a > c && a > d) {
            return a;
        } else if (b > c && b > b) {
            return b;
        } else if (c > d) {
            return c;
        } else {
            return d;
        }
    }

}