public class BankAccount{
    private String name;
    private double balance;

    public BankAccount(String name){
        this.name= name;
        balance= 0.0;
    }

    public String getName() {
    return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        balance +=amount;
        System.out.println("$"+ amount +" is deposited into " + name + " account. Total balance is " +"$"+balance);
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds");
        }else{
        balance -=amount;
        System.out.println("$"+ amount +" is withdraw from " + name + " account. Total balance is " +"$"+balance);
        }
    }

    public void transfer(double amount, BankAccount acc){
        if (amount > this.balance){
            System.out.println("Insufficient funds");
        }else{
        this.balance -=amount;
        acc.balance +=amount;
        System.out.println("$"+amount + " is transfererd from " + this.name + " account" + " to " + acc.name + " account.");
        System.out.println(this.name + " account has" + " $"+this.balance);
        System.out.println(acc.name + " account has" + " $"+acc.balance);
        }
    }
}