package com.mithun.threads;

/**
 * @author Mithun Kumer Ghose.
 */
public class MyThread extends Thread {

    public MyThread() {}

    public MyThread(String threadName) {
        this.setName(threadName);
    }
    @Override
    public void run() {
        for(int i = 0; i < 2000; i++) {
            System.out.println("run():  " + i);
        }
    }

}
