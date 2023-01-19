package class21;
// Java Program to count the total number of vowels and consonants in a string
//Example
//Input - Today is Saturday
//Output - Total Vowels - 6, Total Consonants -  9

import java.util.Locale;
import java.util.Scanner;

public class HomeW21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'u') {
                vowelCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonsts: " + consonantCount);
    }
}
