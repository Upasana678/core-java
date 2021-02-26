package com.mycompany.multithreading;

public class ThreadExample2Main {
    public static void main(String[] args)
    {
        new ThreadDemo2("1st thread");
        new ThreadDemo2("2nd thread");
        new ThreadDemo2("3rd Thread");

        try
        {
            Thread.sleep(8000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interruption occurs in Main thread");
        }
        System.out.println("We are exiting from the main thread");
    }
}
