package class09;
import java.util.Scanner;

public class HomeW09_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit;
        double amount1, amount2, amount3;


        System.out.println("Please enter the power consumed in units");
        unit = sc.nextInt();

        if (unit > 0 && unit <= 200) {
            amount1 = unit * 0.50;
            System.out.println("Your total bill is " + amount1);

        } else if (unit >= 201 && unit <= 400) {
            amount2 = (unit * 0.65) + 100;
            System.out.println("Your total bill is " + amount2);

        } else if (unit >= 401 && unit <= 600) {
            amount3 = (unit * 0.80) + 230;
            System.out.println("Your total bill is " + amount3);

        }else{
            System.out.println("Check twice before enter metered units.");
        }
    }
}
