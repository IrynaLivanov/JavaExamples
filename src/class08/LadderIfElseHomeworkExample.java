package class08;


import java.util.Scanner;

public class LadderIfElseHomeworkExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your numeric test score:");
        int score = sc.nextInt();
// we can write if(score >= 101) - it will work
        if (score > 100){
            System.out.println("Enter valid test score(0-100):");
            // else if (score <= -1)
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

