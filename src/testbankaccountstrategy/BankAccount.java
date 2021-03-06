/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbankaccountstrategy;

/**
 *
 * @author ha07
 */
public class BankAccount {
    // look at the access modifier of balance
    private double balance;
    
    // constructor
    BankAccount(double amount) {
        balance = amount;
    }
    
    // look at the access modifier of the following methods
    protected double getBalance() {
        return balance;
    }
    
    protected void withdraw(double amount) {
        if(balance >= amount)
            balance -= amount;
    }
    
    protected void deposit(double amount) {
        balance += amount;
    }
 
    // depending on the payment method: 
    protected void pay(PaymentStrategy paymentMethod, double amount) {
        if(getBalance() > amount) {
            paymentMethod.pay(amount);
            withdraw(amount);
        }
    }
}

