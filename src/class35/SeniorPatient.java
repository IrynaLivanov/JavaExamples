package class35;

public class SeniorPatient extends Patient {
    public void takeTylenol() {
        System.out.println("your recommended dosage is 500 mg ");
    }

    @Override
    public double takePayment(double originalBalance, double amountReceived) {
        double discount = 0.4;
        return (originalBalance - (originalBalance*discount) - amountReceived );
    }
}
