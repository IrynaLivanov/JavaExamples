package class22;
// duplicate numbers
public class DuplicatesNum {
    public static void main(String[] args) {
        int nums[] = {43, 65, 43, 22, 73, 43, 8, 54, 65};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                        System.out.println(nums[i]);
                        break;
                    }
                }
            }
    }

}
