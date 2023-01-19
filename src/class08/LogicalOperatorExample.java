package class08;
// Logical operator works with boolean value
public class LogicalOperatorExample {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false, b3 = false, b4 = false;

        System.out.println(b1 || b2); // true
        System.out.println(b1 && b2); // false
        System.out.println(b1 || b2 && b3); // true
        System.out.println(b1 && b2 || b3); // false
        System.out.println(b1 ||(b2 || b3) && (b4 || b1) && b3); // true
        System.out.println(b1 && (b2 || b3) && (b4 || b2) && b3); // false
        System.out.println(b1 && b2 || b3 && b4 && b2 && b4 || b1 && b3 && (b1 || b2 || b1)); // false
    }
}
