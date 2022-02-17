package com.company;

public class BankAccount {

    private int id;
    private double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Amount withdrawn successfully and balance is " + balance);
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully and balance is " + balance);
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void transfer(BankAccount from, BankAccount to, double amount) {
        synchronized(from) {//start of from
            System.out.println(Thread.currentThread().getName() + " acquired lock on " + from.id);
            from.withdraw(amount);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (to) {//start of to
                System.out.println(Thread.currentThread().getName() + " acquired lock on " + to.id);
                to.deposit(amount);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }// end of to
        }//end of from
    }
}
