package class10;

import java.util.Scanner;

public class HomeWork09_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the whole amount of bills");
        int amount = sc.nextInt();

        System.out.println((amount / 500 ) + " notes of 500");
        amount = amount % 500;
        System.out.println((amount / 100 ) + " notes of 100");
        amount = amount % 100;
        System.out.println((amount / 20 ) + " notes of 20");
        amount = amount % 20;
        System.out.println((amount / 10 ) + " notes of 10");
        amount = amount % 10;
        System.out.println((amount / 5 ) + " notes of 5");
        amount = amount % 5;
        System.out.println((amount / 2 ) + " notes of 2");
        amount = amount % 2;
        System.out.println(amount + " notes of 1");

        }
    }
