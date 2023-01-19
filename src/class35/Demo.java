package class35;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Patient general = new GeneralPatient();
        general.takeTylenol();

        Patient child = new ChildPatient();
        child.takeTylenol();

        Patient disabled = new DisabledPatients();
        disabled.takeTylenol();

        Patient senior = new SeniorPatient();
        senior.takeTylenol();

      child.takePayment(1000, 200);
      general.takePayment(1000,200);
      disabled.takePayment(1000,200);
      senior.takePayment(1000,200);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");
        int age = scanner.nextInt();

        System.out.println("What is your balance");
        double balance = scanner.nextDouble();

        System.out.println("how much do want to pay?");
        double amountReceived = scanner.nextDouble();

        Patient patient;
        if (age<10)
        {
            patient = new ChildPatient();
        }
        else if (age < 60){
            patient = new GeneralPatient();
        }
        else {
            patient = new SeniorPatient();
        }

        double remainingBalance = patient.takePayment(balance, amountReceived);

        System.out.println("your remaining balance is " + remainingBalance);
        System.out.println(senior.takePayment(1000, 200));
        System.out.println(child.takePayment(1000, 200));
        System.out.println(general.takePayment(1000, 200));
        System.out.println(disabled.takePayment(1000, 200));

    }
}




