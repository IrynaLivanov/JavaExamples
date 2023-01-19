package class18;

public class HomeW18_3__ {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
                System.out.println();
            }
        for (int i = 1; i <= 4; i++) {
                for (int s = 1; s <= i; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 9 - 2 * i; j++) {
                    if (i % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                    System.out.println();
                }
            }
        }







