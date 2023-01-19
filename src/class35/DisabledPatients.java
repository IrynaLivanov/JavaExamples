package class35;

public class DisabledPatients extends Patient {


    public void takeTylenol() {
        System.out.println("your recommended dosage is 250mg");

    }
    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.2;


        return (originalBalance - (originalBalance * discount)) - amountReceived;
    }
}



