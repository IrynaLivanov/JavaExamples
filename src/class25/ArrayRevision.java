package class25;

public class ArrayRevision {
    public static void main(String[] args) {
        int info[][] = {{23, 44, 21},
                {45, 42, 31},
                {73, 14, 0}
        };

        // index based for loop
        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
                System.out.print(info[i][j] + "  ");
            }
            System.out.println();

        }


        //for each loop

        for (int[] row : info) {
            for (int num : row) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}





