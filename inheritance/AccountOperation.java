package inheritance;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

public class AccountOperation {

    public static void main(String[] args) {
        
        Account acc = new Account(1001, "Alex", 1000.0);
        acc.withdraw(200.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        System.out.println("Acc balance: " + acc.getBalance()); 

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 500.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
        acc2.withdraw(200.0);
        acc3.withdraw(200.0);

        System.out.println("Acc2 balance: " + acc2.getBalance()); 
        System.out.println("Acc3 balance: " + acc3.getBalance()); 

        System.out.println("Acc1 balance: " + acc1.getBalance()); 

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
    
}