package class21;

// Write a program to print reverse of given String

import java.util.Scanner;

public class FindReverseOfGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String name = sc.nextLine();

        for (int i = name.length()-1; i >= 0; i--) {

            System.out.println(name.charAt(i));
        }


// another approach
       for (int i = 0; i < name.length(); i++) {
           System.out.println(name.charAt(name.length() - 1 - i));
       }
        }

    }

