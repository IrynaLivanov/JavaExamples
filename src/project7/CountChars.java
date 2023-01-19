package project7;

public class CountChars {
    public static void printCounts(String word) {


        int vowelCount = 0;
        int constantsCount = 0;
        int digits = 0;
        int whiteSpaces = 0;
        int symbols = 0;
        for (int i = 0; i < word.length(); i++) {


            char takeCompare = word.charAt(i);
            if (takeCompare == 'a' || takeCompare == 'e' || takeCompare == 'i' || takeCompare == 'o' || takeCompare == 'u') {
                vowelCount++;

            } else if (takeCompare >= 'a' && takeCompare <= 'z') {
                constantsCount++;

            } else if (takeCompare >= '0' && takeCompare <= '9' ) {
                digits++;

            }else if (takeCompare == ' ') {
                whiteSpaces++;

            }else{
                symbols++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Constants: " + constantsCount);
        System.out.println("Digits: " + digits);
        System.out.println("White Spaces: " + whiteSpaces);
        System.out.println("Symbols: "+ symbols);
    }
}

