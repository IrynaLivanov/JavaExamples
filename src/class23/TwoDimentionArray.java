package class23;

public class TwoDimentionArray {
    public static void main(String[] args) {
        // declaration of 2D array
        int data [][];

        // declaration and initialization of 2D array
        int nums[][] = new int[3][3]; // 3 rows and 3 column, rows first

        // declare and assign in one line
        int info[][] = {     {23, 44, 21},
                             {45, 42, 31},
                              {73, 14, 0}
        };

        //find number of rowa in the array
        System.out.println(nums.length);

        // find number of column in a row
        System.out.println(nums[0].length);

        //print data at particular
        System.out.println(nums[1][1]);

        // print all data from 2D array using index based for loop
        for (int i = 0; i < info.length; i++) {
            for (int j = 0; j < info[i].length; j++) {
                System.out.print(info[i][j] + " ");
            }
            System.out.println();
        }

    }
}
