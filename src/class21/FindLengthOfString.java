package class21;

import java.util.Scanner;

// Print a program to print length of the String
// without using length function
public class FindLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String name = sc.nextLine();
        int count = 0;

        while (!name.isEmpty()) {
            count++;
            name = name.substring(1);
        }

        System.out.println(count);
    }
}



 // other aproach
        //   for(int i = 0; i < name.length(); i++ ) {
       //  count++;
        //  }


