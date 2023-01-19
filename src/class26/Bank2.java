package class26;

public class Bank2 {
    double balance;
    String accName;
    String accNumber;


    Bank2(String accNumberFromUser, double balFromUser) {
        accNumber = accNumberFromUser;
        balance = balFromUser;
        accNumber = accName + balance;

    }

    Bank2() {
        System.out.println("This is hi from Constructor");
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void displayPersonalDetails() {
        System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNumber);
    }
}
