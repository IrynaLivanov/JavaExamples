package class31;

public class Bank {
    int balance;
public void checkBalance(){
        System.out.println(balance);
    }
    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println("Available Balance - " + balance);
    }
    public void displayRateOfInterest(){
        System.out.println("");
    }

}
class ChaseBank extends Bank{
    public void displayRateOfInterest(){
        System.out.println("7.8");
    }

}
class BankOfAmerica extends Bank{
    public void displayRateOfInterest(){
        System.out.println("3.8");


}
}
class WellsFargo extends Bank {
    public void displayRateOfInterest() {
        System.out.println("5.8");

    }
}