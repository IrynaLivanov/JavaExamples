package class15;

import java.util.Scanner;

public class FactorialOfGivenNumbr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++){
            result = result * i;
        }

        System.out.println(result);
    }
}
