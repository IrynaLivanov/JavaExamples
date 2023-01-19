package class41;

public class GenericExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        intBox.setData(50);
        stringBox.setData("Chirag");

        System.out.println(intBox.getData());
        System.out.println(stringBox.getData());

    }
}
