package class31;

public class BankMainClass {
    public static void main(String[] args) {
        ChaseBank iraAccCB = new ChaseBank();
        BankOfAmerica iraBOA = new BankOfAmerica();
        WellsFargo iraWF = new WellsFargo();

        PayPal pp = new PayPal();

        pp.displayInterest(iraAccCB);
        pp.displayInterest(iraBOA);
        pp.displayInterest(iraWF);

        pp.checkBalance(iraAccCB);
        pp.checkBalance(iraBOA);
        pp.checkBalance(iraWF);



    }
}
