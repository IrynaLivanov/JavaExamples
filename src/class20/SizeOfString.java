package class20;
// Write a program to take String from user scanner class
// Count the number of spaces from the String
// Print String is small if number os spaces less than 5
// Print String is medium if number of spaces
// greater than or equal to 5 and less than 10
// Print String is large if number of spaces greater than 10

import java.util.Scanner;

public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter String");
        String str = sc.nextLine();


      //  System.out.println(getNumberOfSpace(str));
     //   if (count >= 10) {
            System.out.println("Large");
     //   } else if ( count >= 5) {
            System.out.println("Medium");
    //    } else {
            System.out.println("Small");
        }

    }
  // // static int getNumberOfSpace(Sring str) {
     //   int count = 0;
       // for(int i = 0; i < str.length(); i++){
            //if (str.charAt(i)) == ' ') {
  //  count++;
   //         }

   //     }
   //     System.out.println(count);
      //  return count;



  //  }

//}
