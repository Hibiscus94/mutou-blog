package com.mutoublog.utils;

/**
 * 通过继承 ThreadDemo 类来创建线程
 * com.mutoublog.com.mutoublog.utils
 * Created by mutou on 2017/4/24.
 */
public class ThreadDemo extends Thread {
    private Thread thread;
    private String threadName;

    ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating: " + threadName);
    }

    public void run() {
        System.out.println("Running: " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread：" + threadName + "," +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread: " + threadName + " exiting...");
    }

    public void start() {
        System.out.println("Starting: " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

class TestThreadByThread {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("thread1");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("thread2");
        t2.start();
    }
}