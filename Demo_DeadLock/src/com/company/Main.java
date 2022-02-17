package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount first = new BankAccount(1,250);
        BankAccount second = new BankAccount(2,300);

        Thread1 t1 = new Thread1(first,second,10);
        Thread2 t2 = new Thread2(second,first,10);
        t1.setName("Infosys_1");
        t2.setName("Infosys_2");

        t1.start();
        t2.start();
    }
}
