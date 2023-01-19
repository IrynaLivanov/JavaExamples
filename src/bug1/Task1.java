package bug1;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {4,4};
        System.out.println(no23(nums));


    }

    public static boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}

