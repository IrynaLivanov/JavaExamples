package class19;

public class StringAndStringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2= "Hello";
        str1 = "Bye Bye";
        String str3 = new String ("Hello");

        System.out.println(str1 == str2); // true

        System.out.println(str1 == str3); //false, because they are stored in different memory location

        // "==" compare address of the memory instead of content
        // .equals compare the contest of the String

        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true,
    }
}

