public class BankAccount {
    private String acctHolder;
    private double balance;
    public BankAccount(String aactHolder ,double initialbalance)
    {
        this.acctHolder=aactHolder;
        this.balance=initialbalance;

    }
    public void deposite(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("deposited "+ amount);
        }
        else{
            System.out.println("Deposite must be positive");
        }
    }
    public void withdraw(double amount){
        if(balance>0&& amount<=balance){
            balance -= amount;
            System.out.println("amount withdraw"+amount);
        }
        else{
            System.out.println("invalid amount");
        }
    }
    public void checkbalance()
    {
        System.out.println("balance is"+ balance);

    }
    

public static void main(String[] args) {
    BankAccount acct= new BankAccount("Mary Angel",1000);
    acct.checkbalance();
    acct.deposite(600);
    acct.checkbalance();
    acct.withdraw(500);
    acct.checkbalance();
}
}

