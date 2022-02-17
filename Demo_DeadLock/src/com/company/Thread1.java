package com.company;

public class Thread1 extends Thread{

    BankAccount b1;
    BankAccount b2;
    double amount;

    public Thread1(BankAccount b1, BankAccount b2,double amount) {
        this.b1 = b1;
        this.b2 = b2;
        this.amount = amount;
    }

    public void run() {
        b1.transfer(b1,b2,amount);
    }
}
