package class15;

import java.util.Scanner;

//Write a program to print each digit of the number into a separate line in reverse order
public class HomeW15_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the whole number");
        int num = sc.nextInt();

        while (num != 0){
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}

