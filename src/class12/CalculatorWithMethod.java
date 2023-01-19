package class12;

import java.util.Scanner;

// Reusable function we need
// add (int a, int b)
//sub (int a, int b)
// mul (int a, int b)

public class CalculatorWithMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();

        System.out.println("Please enter your operation: ");
        String operation = sc.next();

        switch (operation.toLowerCase()){
            case "add":
            case "+":
                add (num1, num2);    //add(a + b)
                break;

            case "sub":
            case "-":
               sub (num1, num2 );
                break;

            case "mul":
            case "*":
                mul(num1, num2);
                break;

            default:
                System.out.println("Please choose right operation");
        }
    }
    static void add (int num1, int num2) {  // static void add ( int a + int b)
        System.out.println(num1 + num2);     // System.out.println( a + b);
    }
    static void sub (int num1, int num2){
        System.out.println(num1 - num2);
    }
    static void mul (int num1, int num2){
        System.out.println(num1 * num2);
    }

}













