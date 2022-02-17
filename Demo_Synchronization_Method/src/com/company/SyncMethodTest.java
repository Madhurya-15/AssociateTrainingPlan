package com.company;

public class SyncMethodTest {

    public synchronized void displayNumbers(int start,int end) {
        for(int i=start; i<end; i++) {
            System.out.println("Number is " + i + " got from thread " + Thread.currentThread().getName());
        }
    }
}

class Thread1 extends Thread {

    SyncMethodTest s;

    public Thread1(SyncMethodTest s) {
        this.s = s;
    }

    public void run() {
        s.displayNumbers(1,10);
    }
}

class Thread2 extends Thread {
    SyncMethodTest s;

    public Thread2(SyncMethodTest s) {
        this.s = s;
    }

    public void run() {
        s.displayNumbers(11,20);
    }

}
