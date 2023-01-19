package class22;

public class ArraysExample {
    public static void main(String[] args) {
        // declaration of array -
        int data[];

        // Initialize thr array
        // In java when we want to initialize variable that can hold collection of values we need to use new keyword

        data = new int[5];

        // declaration and initialization in the same line
        int salary[] = new int[100]; // we don't know the value

        // declaration and assignment in the same line
        int nums[] = {10,23,564,768,657,34,67,890,987,345}; //

        // length of the Array
        System.out.println(nums.length);

        // print value at particular index
        System.out.println(nums[4]);

        // print the data from array

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println(0); // print number from array
        System.out.println(5);
        System.out.println(7);
        System.out.println(3);

        // print default value of element of array
        System.out.println(salary[45]); // 0

        System.out.println(nums[21]); // index 21 is out of bound
    }
}
