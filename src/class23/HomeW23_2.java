package class23;
//  Write a program to find all duplicates number from the array (Implement this program to get unique numbers in the output)
//Example
//Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//Output : Duplicate numbers - 23, 44, 35

public class HomeW23_2 {
    public static void main(String[] args) {
        int nums[] = {43, 65, 54, 22, 73, 43, 8, 54, 43, 22};
        int duplicNum = 0;

        for (int i = 0; i < nums.length; i++) {
            duplicNum = 0;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicNum++;
                }
            }
                  if(duplicNum == 1) {
                        System.out.println(nums[i] + " ");
                    }

                }
            }
        }


