package com.company;

public class Main {

    public static void main(String[] args) {

        SyncMethodTest test1 = new SyncMethodTest();
        Thread1 t1 = new Thread1(test1);
        Thread2 t2 = new Thread2(test1);

        t1.setName("Infosys_1");
        t2.setName("Infosys_2");
        t1.start();
        t2.start();
    }
}
