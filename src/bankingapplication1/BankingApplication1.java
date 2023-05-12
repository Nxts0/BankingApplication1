package bankingapplication1;

import java.util.Random;
import java.util.Scanner;

public class BankingApplication1 {

    public static void main(String[] args) {
        int option = 0, number;
        String name;
        double balance, amount;
        Account account;
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);
        
        while (option != 6){
            System.out.println("Main Menu");
            System.out.println("1. Display All accounts");
            System.out.println("2. Open New Account");
            System.out.println("3. Close Existing Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.println();
            
            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            scan.nextLine();
            
        switch(option){
            case 1 :
                bank.listAccount();
                break;
            case 2 :
                System.out.println("Enter Account Name: ");
                name = scan.nextLine();
                System.out.println("Enter Initial Balacne: ");
                balance = scan.nextDouble();
                number = generateAccountNumber();
                account = new Account(number, name, balance);
                bank.openAccount(account);
                break;
            case 3 :
                System.out.println("Enter Account Number");
                number = scan.nextInt();
                bank.closeAccount(number);
                break;
            case 4 :
                System.out.println("Enter Account Number");
                number = scan.nextInt();
                System.out.println("Enter Amount");
                amount = scan.nextDouble();
                bank.depositMoney(number, amount);
                break;
            case 5 :
                System.out.println("Enter Account Number");
                number = scan.nextInt();
                System.out.println("Enter Amount");
                amount = scan.nextDouble();
                bank.withdrawMoney(number, amount);
                break;
        }
        System.out.println();
    }
   }
    public static int generateAccountNumber() {
        Random rand = new Random();
        int number = 100000 + rand.nextInt(900000);
        return number;
    }
}
