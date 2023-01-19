package class16;
import java.util.Scanner;

// Write a program to find factors of the given number
//Input - 6
//Output - 1 2 3 6

public class HomeW16_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the whole number");
        int num = sc.nextInt();

// check for every number between 1 to the number taken from user(num),
// whether it divides num. If 'i' divides num, it means 'i' is a factor of num.


        for (int i = 1; i <= num; i++){
            if(num % i == 0){

                System.out.println(i);
            }

        }

    }
}

