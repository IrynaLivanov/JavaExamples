package class26;

public class MainClassBank2 {
    public static void main(String[] args) {


        Bank2 acc1 = new Bank2("Iryna" , 2000);

        Bank2 acc2 = new Bank2("Pavlo", 10000);
        Bank2 acc3 = new Bank2("Roman",8000);

        Bank2 acc4 = new Bank2();


        System.out.println(acc1.accNumber);
        System.out.println(acc2.accNumber);
        System.out.println(acc3.accNumber);
    }
}



