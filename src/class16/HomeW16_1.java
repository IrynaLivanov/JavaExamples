package class16;
import java.util.Scanner;

// Write a program to print sum of each digits from the given number
//Input - 43634
//Output - 20

public class HomeW16_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the whole number");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            num = num / 10;{
                sum = sum + lastDigit;

        }
    }
        System.out.println(sum);

        }


    }
