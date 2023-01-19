package class18;
// Write a program to print all the prime numbers from 1 to 100

public class HomeW18_1 {
    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}



