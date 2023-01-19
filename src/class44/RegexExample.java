package class44;

public class RegexExample {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.matches("^[a-zA-Z]+$"));

        String tittle2 = "USD 200 inclusive of tax";
        System.out.println(tittle2.replaceAll("[0-9]", ""));

        String str1 = "This is Chirag";
        System.out.println(str.replaceAll("Chirag", "Pasha"));
        System.out.println(str.replaceAll("[\\s]", " "));
    }

}
