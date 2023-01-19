package class22;
//Write a program to find the sum of even and odd numbers
//Example
//Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
//Output : Sum Of Even - 134, Sum Of Odd - 206

public class HomeW22_1 {
    public static void main(String[] args) {
        int nums[] = {15, 18, 44, 32, 75, 8, 35, 78, 10};
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                sumOfEven = sumOfEven + nums[i];
            }else{
                sumOfOdd = sumOfOdd + nums[i];
            }
        }
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);

    }
}
