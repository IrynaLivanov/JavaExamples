package class16;
//  Java program to find result of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
public class HomeW16_3 {
    public static void main(String[] args) {
        double result = 0;
        double j = 2;
        double i = 1;


        for (i = 1, j = 2; i <= 10; i++, j++) {
            double k = i / j;
                result = result + k;
            }
            System.out.println(result);

        }
    }


