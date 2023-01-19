package class18;

import java.util.Scanner;

// palindrome number is a number that is the same after reverse
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the whole number");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;
// get the number to check for palindrome
// hold the number in temporary variable
// do reverse

        while (num != 0){
    int lastDigit = num % 10;
    rev = rev * 10 + lastDigit;
    num = num / 10;
        }
        if (originalNum == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");

        }
        //compare the reverse number with temporary num
        // if both number are the same, print "palindrome"
        // else "not palindrome"
    }
}







