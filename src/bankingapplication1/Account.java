package bankingapplication1;

public class Account {
    private int accountNumber;
    private String accountName;
    private double balance;
    
    public Account(int accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public void deposit(double amount){this.balance += amount;}
    public void withdraw(double amount){this.balance -= amount;}
    public double getBalance(){return this.balance;}
    public int getAccountNumber(){return this.accountNumber;}
    public String getAccountName(){return this.accountName;}
}
