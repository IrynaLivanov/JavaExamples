public class En {
    public static void main(String[] args) {
        String str = "it15is25a20string";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                sum = sum + Character.getNumericValue(str.charAt(i));
            }

        }
        System.out.println("The sum is " + sum);
    }
}
