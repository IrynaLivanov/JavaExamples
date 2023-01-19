package class09;
import java.util.Scanner;

public class HomeW09_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the whole amount of bills");
        int amount = sc.nextInt();

        if (amount >= 500) {
            System.out.println("Total number of 500 notes:" +  (amount / 500));
            amount = amount % 500;}
        if(amount >= 100) {
            System.out.println("Total number of 100 notes:" + (amount / 100));
            amount = (amount % 100);}
        if (amount >= 20) {
            System.out.println("Total number of 20 notes:" + (amount / 20));
            amount = (amount % 20);}
        if (amount >= 10) {
            System.out.println("Total number of 10 notes:" + (amount / 10));
            amount = (amount % 10);}
        if (amount >= 5) {
            System.out.println("Total number of 5 notes:" + (amount / 5));
            amount = (amount % 5);}
        if (amount >= 2){
            System.out.println("Total number of 2 notes:" +(amount / 2));
            amount = (amount % 2);}
        if (amount >= 1) {
            System.out.println("Total number of 1 notes:" + (amount / 1));
            amount = (amount % 1);
        } else {
            System.out.println("Try again");
        }
    }
}
