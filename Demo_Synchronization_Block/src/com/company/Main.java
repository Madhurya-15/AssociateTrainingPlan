package com.company;

public class Main {

    public static void main(String[] args) {

	    SyncBlockTest test = new SyncBlockTest();

        Thread1 t1 = new Thread1(test);
        Thread t2 = new Thread2(test);

        t1.setName("Infosys_1");
        t2.setName("Infosys_2");

        t1.start();
        t2.start();
    }
}
