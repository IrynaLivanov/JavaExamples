package class16;
//Java program to find result of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5

public class HomeW16_2 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 10;
        int i = 1;

        for (j = 10, i = 1; i <= 5; j--,i++ ){
            sum = sum + i + j;
        }
        System.out.println(sum);
        }



        }




