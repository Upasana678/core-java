package com.mycompany.exceptiondemo;

//This class Demonstrates NullPointerException
public class Exception3Main {
    public static void main(String[] args)
    {
        nullPointerExceptionDemo();
    }
    public static void nullPointerExceptionDemo()
    {
        try{
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException npe)
        {
            System.out.println("String doesn't exist.Initialise the variable with a valid value");
        }
        catch(Exception e)
        {
            System.out.println("Initialise the variable");
        }
        System.out.println("Exiting the application");
    }
}
