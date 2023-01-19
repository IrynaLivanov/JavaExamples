package class21;
//  Java Program to remove all the white spaces from a string
//Example
//Input - Today is Saturday
//Output - TodayisSaturday

import java.util.Scanner;

public class HomeW21_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String originStr = sc.nextLine();
        String newStr = " ";

        for (int i = 0; i < originStr.length(); i++) {
            char ch = originStr.charAt(i);
            if (ch != ' ') {
                newStr = newStr + ch;
            }
        }

            System.out.println(newStr);

        }
    }




