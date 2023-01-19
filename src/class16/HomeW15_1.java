package class16;
// print the sum of even number from 1 to 10

public class HomeW15_1 {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i <= 10; i = i + 2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
