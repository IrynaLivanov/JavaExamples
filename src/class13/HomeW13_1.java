package class13;
import java.util.Scanner;

import java.util.Scanner;
// Write a program to take a temperature from the user in Celsius and convert it into Fahrenheit using the method

public class HomeW13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius");
        double tempC = sc.nextDouble();
        double tempF = convertIntoFahrenheit(tempC);
        System.out.println("The temperature in Fahrenheit is " + tempF);
    }
    static double convertIntoFahrenheit(double tempC){
    double f = (tempC * 9/5) +32;
    return(f);

        }
    }
