package class21;

import java.util.Scanner;

public class HomeW21_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine();
        String revStr = " ";
        String newStr = str.toLowerCase();


        for(int i = str.length()-1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
            revStr = revStr.replace(" ","");
        }

        if(str.equalsIgnoreCase(revStr))
        {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
