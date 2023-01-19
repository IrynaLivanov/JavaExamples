package project5;

import java.util.Scanner;
public class Converter {
        public static void main(String[] args) {

            /**
             *
             * Write a java program that calculates to metric system
             * if incorrect input print result as -1
             *
             * 1 lb = 0.45359237 kg
             * 1 oz = 28.34952 g
             *
             * 1 ft = 0.3048 m
             * 1 ft = 30.48 cm
             * 1 in = 2.54cm
             *
             * C = (F - 32) × 5/9
             *
             *
             * Example output:
             * Enter amount:
             * 1
             * Enter type:
             * in
             * To:
             * cm
             * Result: 2.54
             *
             */

            Scanner scanner = new Scanner(System.in);
            Converter converter = new Converter();

            System.out.println("Enter amount");
            double amount = scanner.nextDouble();

            System.out.println("Enter Type");
           // String type = scanner.findInLine();

            String celsium, fahrenheit;

           // double tempF = calculateTemperature(celsium, fahrenheit, amount);
            System.out.println("TempF");
        }

        public boolean isWeight(String type) {

            return false;
        }

        public boolean isLength(String type) {
            //TODO IMPLEMENT METHOD
            return false;
        }

        public boolean isTemperature(String type) {
            //TODO IMPLEMENT METHOD
            return false;
        }

        public double calculateWeight(String type, String to, double amount) {
            //TODO IMPLEMENT METHOD
            return -1;
        }

        public double calculateLength(String type, String to, double amount) {
            //TODO IMPLEMENT METHOD
            return -1;
        }

        public double calculateTemperature(String celsium, String fahrenheit, double amount) {
            double tempF = (amount * (9/5) + 32);
            return tempF;
        }

        public void printResult(double result) {
            // TODO IMPLEMENT METHOD
        }
    }


