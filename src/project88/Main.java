package project88;

public class Main {
    public static void main(String[] args) {
        // Strings and string methods
        String word = "word";

//        CTRL + P
//        CMND + P
        // Method chaining

        word.substring(1).length(); // 3
        word.length();

//        it, word, banana -> substring

//        Given a string of even length,
//        return a string made of the middle two chars,
//        so the string "string" yields "ri".
//        The string length will be at least 2.


        // int char double boolean
        // String

        String word2 = "it";
        System.out.println(findMiddle(word2));
    }

    public static String findMiddle(String word) {
        int wordLength = word.length(); // 6 / 2 = 3 - 1
        String middleChars = "";
        if (word.length() > 2) {
            middleChars = word.substring(wordLength / 2 - 1, wordLength / 2 + 1);
        } else {
            return word;
        }
        return middleChars;
    }
}

