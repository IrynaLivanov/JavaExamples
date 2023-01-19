package class35;

public class GeneralPatient extends Patient {

@Override
    public void takeTylenol() {
    System.out.println("your recommended dosage is 250 mg");

    }
@Override
    public double takePayment(double originalBalance, double amountRecieved) {
        return originalBalance - amountRecieved;
    }
}



