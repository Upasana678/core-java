package com.mycompany.exceptiondemo;

import java.io.IOException;

public class CustomExceptionMain {
    public static void validate(int age) throws InvalidAgeException,IOException
    {
        if(age < 18)
        {
            InvalidAgeException ia = new InvalidAgeException("not valid");
            throw ia;
        }
        else
        {
            System.out.println("Welcome to vote");
        }
        throw new IOException();
    }
    //Main method
    public static void main(String[] args)
    {
        try
        {
            //Program will skip the line after 23 because InvalidAgeException gets thrown inside validate()
            //It looks for the matching catch block otherwise looks for the general exception block and the program flow continues.
            //validate(14);
            validate(10);

        } catch (InvalidAgeException e)
        {
            System.out.println("you are not allowed to vote because you are less than 18 years of age "+e);
            //e.printStackTrace();
        }
        catch(Exception m)//Parent Exception catch block should always be at the last otherwise compilation error
        {
            System.out.println("Exception occured: "+m);
        }
    }
}
