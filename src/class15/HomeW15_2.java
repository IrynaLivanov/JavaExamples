package class15;

//Java program to print the sum of 1 to 50 numbers which are divisible by 5 or by 3
public class HomeW15_2 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum = sum + i;
            }

            }
        System.out.println(sum);
        }

    }
