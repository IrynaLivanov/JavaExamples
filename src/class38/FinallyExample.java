package class38;
public class FinallyExample {

    public static void main(String[] args) {

        try {
            int a[] = {23, 45, 56};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("nice to see you");
        }
    }
}

