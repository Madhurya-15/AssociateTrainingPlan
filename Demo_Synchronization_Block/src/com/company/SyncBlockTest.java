package com.company;

public class SyncBlockTest {

    public void multiples(int n) {

        System.out.println("I came from thread " + Thread.currentThread().getName());

        synchronized (this) {
            for(int i=1;i<=n;i++) {
                System.out.println(i + " multiple of " + n + " is " + n*i + " from thread " + Thread.currentThread().getName());
            }
        }

    }

}

class Thread1 extends Thread {

    SyncBlockTest s;

    public Thread1(SyncBlockTest s) {
        this.s = s;
    }

    public void run() {
        s.multiples(5);
    }

}

class Thread2 extends Thread {

    SyncBlockTest s;
    public Thread2(SyncBlockTest s) {
        this.s = s;
    }

    public void run() {
        s.multiples(15);
    }



}
