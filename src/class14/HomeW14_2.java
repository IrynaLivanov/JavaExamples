package class14;
//  Write a program to print numbers from 1 to 20 which are divisible by 3

public class HomeW14_2 {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 20) {
            if (a % 3 == 0)
                System.out.println(a);
            a++;
        }
    }
}
