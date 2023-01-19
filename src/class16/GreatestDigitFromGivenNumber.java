package class16;
import java.util.Scanner;


public class GreatestDigitFromGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the whole number");
        int num = sc.nextInt();
        int max = num % 10;


        while (num != 0) {     // first - separate each digit
            int lastDigit = num % 10;
            if(lastDigit > max){
                max = lastDigit;
            }
            num = num / 10;
            }
        System.out.println(max);
        }
    }
