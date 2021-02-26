package com.mycompany.multithreading;

public class ThreadDemoOne extends Thread{

    public void run()
    {
        int a = 10;
        int b = 12;
        int output = a+b;
        System.out.println("Thread started and it is running");
        System.out.println("Sum is "+output);
    }

}
