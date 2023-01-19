package class40;

import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) {
        method2();

    }

    public static void method2() {
        method1();
    }

    public static void method1() throws RuntimeException {
        throw new RuntimeException("Hello! You got exception");
    }
}


