package class18;

//Write a program to check given number is prime or not
//input - 13
// output - prime

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the whole number");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i <num; i++) {
            if (num % i == 0) {
               count++;
                break;
            }
        }
        if (count == 0){

                System.out.println("prime");
            }else{
        System.out.println("not prime");

        }

    }
}



