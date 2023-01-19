package class24;
//  Write a program to find all duplicates number from the array (Implement this program to get unique numbers in the output)
//Example
//Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
//Output : Duplicate numbers - 23, 44, 35

public class HomeW23_22 {
    public static void main(String[] args) {
        int nums[] = {43, 65, 54, 22, 73, 43, 8, 54, 43, 22};
        int duplicates[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {


            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if(isElementPresentInArray(duplicates, nums[i])) {
                        System.out.println(nums[i]);


                    }
                break;

        }
    }
        }
    }


static boolean isElementPresentInArray(int nums[], int targetNumber){
        for(int num : nums) {
            if(num == targetNumber){
                return true;
            } else {
                return false;
            }
        }
        return false;
}
}