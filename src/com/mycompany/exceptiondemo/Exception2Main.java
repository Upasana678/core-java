package com.mycompany.exceptiondemo;

//This class demonstrates ArrayIndexOutOfbounds Exception
public class Exception2Main {
    public static void main(String[] args)
    {
        arrayException();
    }
    public static void arrayException()
    {
        try{
            int array[] = new int[5];
            array[9] = 20;
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
           System.out.println("Memory declared in array is insufficient");
           System.out.println("Increase the size of the array");

        }
        catch(Exception e)
        {
            System.out.println("An error occured");
        }
        System.out.println("Exiting the application");
    }
}
