package org.example;

import org.example.bankAccounts.Bank;
import org.example.bankAccounts.BankAccount;
import org.example.bankAccounts.CheckingAccount;
import org.example.bankAccounts.SavingAccount;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Bank<BankAccount> bank = new Bank<>();

        SavingAccount savingAccount = new SavingAccount("1.1.1.1", "Mohammad", 10000, 6, 0);
        SavingAccount savingAccount2 = new SavingAccount("1.1.1.2", "Ali", 20000, 6, 0);
        SavingAccount savingAccount3 = new SavingAccount("1.1.1.3", "Yalda", 30000, 6, 0);
        SavingAccount savingAccount4 = new SavingAccount("1.1.1.4", "kua", 40000, 6, 0);
        SavingAccount savingAccount5 = new SavingAccount("1.1.1.5", "kua", 50000, 6, 0);
        SavingAccount savingAccount6 = new SavingAccount("1.1.1.6", "kua", 60000, 6, 0);
        CheckingAccount checkingAccount = new CheckingAccount("2.1.1.1", "Mohammad", 10000, 2000);
        CheckingAccount checkingAccount2 = new CheckingAccount("2.1.1.2", "Ali", 20000, 2000);
        CheckingAccount checkingAccount3 = new CheckingAccount("2.1.1.3", "Yalda", 30000, 2000);
        CheckingAccount checkingAccount4 = new CheckingAccount("2.1.1.4", "Saleh", 40000, 2000);
        CheckingAccount checkingAccount5 = new CheckingAccount("2.1.1.5", "Sadegh", 50000, 2000);

        bank.addAccount(savingAccount);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);
        bank.addAccount(savingAccount4);
        bank.addAccount(savingAccount5);
        bank.addAccount(savingAccount6);
        bank.addAccount(checkingAccount);
        bank.addAccount(checkingAccount2);
        bank.addAccount(checkingAccount3);
        bank.addAccount(checkingAccount4);
        bank.addAccount(checkingAccount5);

        System.out.println("before add: ");
        bank.printListAccounts();

        bank.applyInterestManually();
        System.out.println("\n after add:");
        bank.printListAccounts();
    }
}