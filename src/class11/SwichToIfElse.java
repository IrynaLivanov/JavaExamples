package class11;
import java.util.Scanner;

public class SwichToIfElse {

//Print given number in word (0-5).if -else condition

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number from 0 to 5.");
        int number = sc.nextInt();

        if (number == 0){
            System.out.println("Zero");
        } else if ( number ==2) {
            System.out.println("Two");
        }else if ( number ==3) {
            System.out.println("Three");
        }else if ( number ==4) {
            System.out.println("Four");
        }else if ( number ==5) {
            System.out.println("Five");
        }else if ( number ==1) {
            System.out.println("One");
        }else {
            System.out.println("Enter again");
        }
    }
}