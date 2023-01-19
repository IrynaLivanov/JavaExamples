package class18;

public class Homework {
    public static void main(String[] args) {
        int i = 5;

        for (i = 1; i <= 5; i++) {
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print("0");

            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                if ((i % 2) == (j % 2)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");

                }
                System.out.println();
            }
        }
    }
}

