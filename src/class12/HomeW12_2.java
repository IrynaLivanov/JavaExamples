package class12;
import java.util.Scanner;

// Write a program to check given number is odd or even using function

public class HomeW12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for check odd or even");
        int num = sc.nextInt();
        getOddEven(num);
    }

    public static int getOddEven(int num) {
        if (num % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        return num;
    }
}






