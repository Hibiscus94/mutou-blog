package com.mutoublog.utils;

/**
 * 通过实现 Runnable 接口来创建线程
 * com.mutoublog.com.mutoublog.utils
 * Created by mutou on 2017/4/21.
 */
public class RunnableDemo implements Runnable {
    private Thread t = null;
    private String ThreadName;

    RunnableDemo(String name) {
        ThreadName = name;
        System.out.println("Createing: " + ThreadName);
    }

    @Override
    public void run() {
        System.out.println("Running: " + ThreadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + ThreadName + ", " + i);
                // 休眠
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + ThreadName + " interrupted.");
        }
        System.out.println("Thread : " + ThreadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting: " + ThreadName);
        if (t == null) {
            t = new Thread(this, ThreadName);
            t.start();
        }
    }
}

class TestThreadByRunnable {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread2");
        R2.start();
    }
}