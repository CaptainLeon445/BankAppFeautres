public class Driver{
    public static void main(String[] args){
        BankAccount Chris=new BankAccount("Chris");
        BankAccount Leon=new BankAccount("Leon");
        Chris.deposit(500.0);
        Chris.withdraw(100.0);
        Chris.withdraw(800.0);

        Leon.deposit(1500.0);
        Leon.withdraw(300.0);
        Leon.withdraw(1800.0);

        Chris.transfer(250, Leon);

    }
}