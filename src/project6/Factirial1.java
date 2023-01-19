package project6;
import java.util.Scanner;

public class Factirial1 {

        public static void main(String[] args) {
            /**
             * In math, the factorial of a positive integer n, denoted by n! is the product of all integers less than or equal to n.
             * Calculate factorial and output result to the console.
             * ex: 5! = 5 * 4 * 3 * 2 * 1
             * Enter a number:
             * 5
             * Factorial result: 120
             */

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int factorial = 1;
            for(int i = 1; i <= 1; i++  )

    {
        factorial = factorial * i;
    }
            System.out.println("The factorial of" + num + " is " + factorial);




            // TODO IMPLEMENT METHOD
        }
    }

