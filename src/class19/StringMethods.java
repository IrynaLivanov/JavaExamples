package class19;

public class StringMethods {
    public static void main(String[] args) {


        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

// 1. Change Case Of String
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        // 2. Change Case Of String
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); //false

        // 3. Equals ignoring case
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        // 4. Contains
        String str4 = "Hello Iryna";
        System.out.println(str4.contains(str1));//true
        System.out.println(str4.contains(str3)); // false
        System.out.println(str4.toLowerCase().contains(str3.toLowerCase())); //true

        // 5. Character at Paticular Index
        System.out.println(str4.charAt(8)); // y

        //6. Index of Particular character
        System.out.println(str4.indexOf('r')); // 7

        // 7.Length of the String
        System.out.println(str4.length());

        // 8. Check if String is empty
        String str5 = " "; // false, because it is not empty (without space it will be true)
        System.out.println(str5.isEmpty());
       System.out.println(str5.isBlank());

        //9. Trim - trimming spaces before and after String
        String str6 = "            Hello      World     ";
        System.out.println(str6.trim());

        // 10. SubString
        String str7 = "Hello User, Welcome to %s";
        System.out.println(str7.substring(6)); // User, Welcome to Ebay
        System.out.println(str7.substring(0, 6)); // Hello

        // 11. Format
        String title = "Hello %s, Welcome to Ebay";
        String user = "Iryna";
        String webside = "Amazon";
      System.out.println(String.format(title, user)); // Hello Iryna, Welcome to Amazon

        // 12. Replace
        String title1 = "Hello ZZZ, Welcome to $$$";
        System.out.println(title1.replace("ZZZ", user));
        System.out.println(title1.replace("$$$", webside));
        // replaceAll() - we will learn this ....

        // 13. Split
        String title2 = "Hello User, Welcome to Ebay";
        String words[] = title2.split(" ");
        System.out.println(words.length); // 5


    }

}
