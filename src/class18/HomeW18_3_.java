package class18;

public class HomeW18_3_ {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();}
    }
}

