package class22;
//Write a program to find all duplicates number from the array (Tricky, do enough brainstorming before solving)
//Example
//Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
//Output : Duplicate numbers - 23, 44

public class HomeW22_3 {
    public static void main(String[] args) {
        int nums[] = {43, 65, 54, 22, 73, 43, 8, 54};
        int duplicNum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    duplicNum = nums[i];
                    {
                        System.out.println(duplicNum);
                    }
                }
            }
        }
    }
}


