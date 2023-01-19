package class08;
import java.util.Scanner;
//print greatest number out of tree numbers
// input - 10, 20, 30 output - 30
public class LogicalOperatorExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();


        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the greatest");
        } else {
            System.out.println(num3 + " is the greatest");
        }
    }
}