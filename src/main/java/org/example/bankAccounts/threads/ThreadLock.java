package org.example.bankAccounts.threads;

import org.example.bankAccounts.BankAccount;
import org.example.exeptions.InsufficientFundsException;
import org.example.exeptions.InvalidTransactionException;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLock {
    protected String accountNumber;
    protected String accountHolderName;
    protected double withdrawAmount;
    protected double depositAmount;
    Lock lock = new ReentrantLock();

    public ThreadLock(String accountNumber, String accountHolderName, double withdrawAmount, double depositAmount) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        this.withdrawAmount = withdrawAmount;
        this.depositAmount = depositAmount;
    }

    BankAccount bankAccount = new BankAccount(accountNumber, accountHolderName);
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                thread1.start();
                lock.lock();
                bankAccount.withdraw(withdrawAmount);

            } catch (InsufficientFundsException e) {
                throw new RuntimeException(e);
            } catch (InvalidTransactionException e) {
                throw new RuntimeException(e);
            }
            lock.unlock();
        }

    });
    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            thread2.start();
            lock.lock();
            bankAccount.deposit(depositAmount);
            lock.unlock();

        }
    });
    Thread thread3 = new Thread(new Runnable() {
        @Override
        public void run() {
            thread3.start();
            lock.lock();
            bankAccount.deposit(depositAmount);
            lock.unlock();

        }
    });
    Thread thread4 = new Thread(new Runnable() {
        @Override
        public void run() {
            thread4.start();
            lock.lock();
            bankAccount.deposit(depositAmount);
            lock.unlock();

        }
    });

}
