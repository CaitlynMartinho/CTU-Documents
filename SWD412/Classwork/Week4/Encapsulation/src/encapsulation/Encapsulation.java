/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author caitl
 */

//Creates main class for bank account
class BankAccount {
    
    //Declares accountnumber and balances variables
    private String accountNumber;
    private double balance;

    //Creates bank account method and stores values in variables
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //Deposit method
    public void deposit(double amount) {
        //If ammount to deposit is more than 0 add it to the bank account
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: R" + amount);
            
            //Else display an error message
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    //Creates the withdraw method
    public void withdraw(double amount) {
        //Checks if ammount is more than zero and less than the current balance
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: R" + amount);
            
            //Displays an error message
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    //Creates a method to check the balance
    public double checkBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        //Creates the bank account
        BankAccount account = new BankAccount("123456789", 1000.00);

        //Calls the methods
        account.deposit(500.00);
        account.withdraw(200.00);

        //Creates a variable for the bank balance
        double currentBalance = account.checkBalance();
        System.out.println("Current Balance: R" + currentBalance);
    }
    
}
