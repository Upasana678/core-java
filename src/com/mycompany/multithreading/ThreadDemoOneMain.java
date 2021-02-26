package com.mycompany.multithreading;

public class ThreadDemoOneMain {
    public static void main(String[] args)
    {
        //Creating instance of the class that extend Thread class
        ThreadDemoOne t1 = new ThreadDemoOne();
        //calling start method to execute the run method of Thread Class
        t1.start();

    }
}
