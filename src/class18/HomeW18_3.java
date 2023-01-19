package class18;

public class HomeW18_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
//  patten 2
        for (int i = 0; i <= 5; i++) {
            for (int s = 0; s <= i - 1; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i) - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
// patten 3
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
