package class27;

class Bank {
        int balance = 50;

        public void method1() {
           // balance = 40;
            System.out.println(balance);
            int balance = 40;
        }
    }

    public class TypesOfVariables {
        public static void main(String[] args) {
            Bank b = new Bank();
          //  b.method1();
            System.out.println(b.balance);
            b.method1();
            b.method1();
            System.out.println(b.balance);

        }

    }

