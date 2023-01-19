package project88;
import java.util.Arrays;

    public class Test {

        public static void main(String[] args) {
            // You know that array should contain 6 cells,
            // but still don't know which numbers to put inside
            int[] arrayOfIntegers = new int[6];

            // 6, 5, 8, 98, 67, 0
            // 1,2,3,4,5,6

            // Indexes start with 0
            arrayOfIntegers[0] = 6;
            arrayOfIntegers[1] = 5;
            arrayOfIntegers[2] = 8;
            arrayOfIntegers[3] = 98;
            arrayOfIntegers[4] = 67;
            arrayOfIntegers[5] = 0;

            System.out.println(arrayOfIntegers[4]);


            for (int i = 0; i < arrayOfIntegers.length; i++) {
                arrayOfIntegers[i] = i + 1;
            }

            System.out.println(Arrays.toString(arrayOfIntegers));

            String[] words = {"word1", "abay2", "ssss3", "kkkk4"};

            // print middle chars of each word

            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i].charAt(words[i].length() / 2));
            }
        }
    }

