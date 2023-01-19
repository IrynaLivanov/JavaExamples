package class09;
// Write a program to get age and weight from the user and print message based on following conditions

// 1. user has age more than or equal to 18 and weight more than equal to 50
// then they are eligible for blood donation
// 2. If user has age less than 18 and weight greater than 50 then
// print you're too young to donate blood
// 3. If user has age greater than 18 and weight less than 50 then
// print you're underweight. Please eat more and try again
// 4. If user has age less than 18 and weight less than 50 then
// print, you're not eligible


import java.util.Scanner;

public class NestedIfStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 1st approach -
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        System.out.println("Please enter your weight:");
        int weight = sc.nextInt();

        if (age >= 18 && weight >= 50) {
            System.out.println("You are eligible for blood donation.");
        }else if(age < 18 && weight >=50) {
            System.out.println("You are too young to donate blood.");
        }else if (age >= 18 && weight < 50) {
            System.out.println("You are underweight.");
        }else{
            System.out.println("You are not eligible.");
                    }
                }
            }

