package class18;

import java.util.Scanner;

public class FindFactorsOfGivenNumber {
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


