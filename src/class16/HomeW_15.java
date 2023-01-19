package class16;
// print the sum of 1 to 5 witch are divisible by 5 or 3

public class HomeW_15 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <=50; i++){
            if (i % 5 == 0 || i % 3 == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
