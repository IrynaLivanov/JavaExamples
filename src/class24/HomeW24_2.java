package class24;
// Write a program to print the sum of each COLUMN from a 2D array
//Example
//Array:
//{23, 44, 21},
//{45, 42, 31},
//{73, 14, 0}
public class HomeW24_2 {
    public static void main(String[] args) {

            int info[][] = {{23, 44, 21},
                            {45, 42, 31},
                             {73, 14, 0}
            };

            int sumCol = 0;

            for (int i = 0; i < info.length; i++) {
                sumCol = 0;


                for (int j = 0; j < info[i].length; j++) {
                    sumCol = sumCol + info[j][i];

                }
                System.out.println(sumCol);

            }


        }
    }




