package class11;
import java.util.Locale;
import java.util.Scanner;
// Write a program to design calculator using Switch Statement (Add, Sub, Mul, Div, Mod)
//Example
// Input 10         30
//       20          10
//       Add         Mul
// Output
//         30         300


public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter your operation:");
        String operation = sc.next();

        switch(operation.toLowerCase()){
            case "add":
            case "+":
                System.out.println(num1 + num2);
                break;

            case "sub":
            case "-":
                System.out.println(num1 - num2);
                break;

            case "mul":
            case "*":
                System.out.println(num1 * num2);
                break;

            case "div":
            case "/":
                System.out.println(num1 / num2);
                break;

            case "mod":
            case "%":
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Enter the correct operation.");
        }

    }


}
