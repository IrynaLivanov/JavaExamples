package class23;
//. Program to sort the elements of an array in ascending order (Tricky, do enough brainstorming before solving)
//Example
//Input : 5, 2, 8, 7, 3, 6
//Output : Duplicate numbers - 2, 3, 5, 6, 7

public class HomeW23_3 {
    public static void main(String[] args) {
        int nums[] = {43, 65, 54, 22, 73, 43, 8, 54, 43, 22};
        int tempAscending = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    tempAscending = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tempAscending;
                }
            }
                System.out.println(nums[i] + " ");
            }

        }
    }

