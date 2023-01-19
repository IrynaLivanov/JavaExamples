package class21;
//  Java Program to remove all the white spaces from a string
//Example
//Input - Today is Saturday
//Output - TodayisSaturday

import java.util.Scanner;

public class HomeW21_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String originStr = sc.nextLine();
        String newStr = originStr.replace(" ", "");
        System.out.println(newStr);
    }
}




