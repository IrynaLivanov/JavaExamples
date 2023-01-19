package class20;
//Write a program to take the full name from the user and print the first letter of the first name and last name
        //Example
        //Input - Thomas Joe
       // Output  - T.J
       // Another Example
       // Input - Charlie Kyle
       // Output - C.K (edited)

import java.util.Scanner;

public class HomeW20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = sc.nextLine();
        System.out.println(abbreviate(name));
    }
    static String abbreviate (String name){
        String abbrev = name.charAt(0) + "";

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' ') {
                abbrev = abbrev + "." + name.charAt(i + 1);
                return abbrev;
            }
        }
        return abbrev;
    }
}
