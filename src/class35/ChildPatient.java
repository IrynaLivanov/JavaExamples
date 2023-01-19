package class35;

public class ChildPatient extends Patient {


    public void takeTylenol() {
        System.out.println("Your recommended dosage is 250 mg");

    }

    @Override
    public double takePayment(double originalBalance, double amountRecieved) {
        double discount = 0.1;

        return (originalBalance - (originalBalance * discount)) - amountRecieved;


    }
}

