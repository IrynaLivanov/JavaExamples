package class07;
import java.util.Scanner;

public class HomeW07_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your numeric test score:");
        int score = sc.nextInt();

         if (score > 100){
        System.out.println("Enter valid test score(0-100):");
         } else if (score < 0){
             System.out.println("Enter valid test score(0-100):");

         } else if (score >= 90){
            System.out.println("Your grade is A+");
         } else if (score >= 80){
                System.out.println("Your grade is A");
         } else if (score >= 70){
                    System.out.println("Your grade is B+");
         } else if (score >= 60){
                        System.out.println("Your grade is B");
         } else if (score >= 50){
                            System.out.println("Your grade is C+");
         } else if (score >= 40){
                                System.out.println("Your grade is C");
         } else {
                                    System.out.println("Failed");}
         }

        }

