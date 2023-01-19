package class10;

import java.util.Scanner;

public class HomeW10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three digit number (100 - 999)");
        int num = sc.nextInt();

        int remainder = num % 10;
        int reverse = num / 10 ;

        if (num <= 99 || num >= 1000) {
            System.out.println("Enter correct number");}

        else {
            reverse = (reverse % 10);
            num = num / 100;

            System.out.println(" The reverse number is :" + remainder + reverse + num);

        }
    }
}
