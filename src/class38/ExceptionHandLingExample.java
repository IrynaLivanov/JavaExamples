package class38;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandLingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers ");
        try {
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1 / num2);
        }catch(InputMismatchException e) {
            System.out.println("Please enter number only");
        }catch(ArithmeticException exception){
            System.out.println("Please enter the number except Zero");
        }
        System.out.println("Nice to see you");
        }
    }

