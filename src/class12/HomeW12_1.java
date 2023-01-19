package class12;
import java.util.Scanner;
//Write a program to take three numbers from user
// and find reverse of the greatest number (3 digit number)

public class HomeW12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first three digit number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second three digit number");
        int num2 = sc.nextInt();

        System.out.println("Enter the third three digit number");
        int num3 = sc.nextInt();
        int greatestNum = 0;

        if (num1 > num2 && num1 > num2) {
            greatestNum = num1;
        } else if (num2 > num3) {
            greatestNum = num2;
        } else {
            greatestNum = num3;}
        System.out.println("The greatest number is " + greatestNum);

        int rev = 0;
        int num = greatestNum;
        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;

        lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        num = num / 10;
        System.out.println("The reverse of the greatest number is " + rev);}
}

