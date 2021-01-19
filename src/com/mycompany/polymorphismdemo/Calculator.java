package com.mycompany.polymorphismdemo;

public class Calculator {

    //Method to add 2 integer numbers
    public int add(int a,int b)
    {
        return (a+b);
    }
    //Method to add 3 integer numbers
    public int add(int a,int b,int c)
    {
        return (a+b+c);
    }
    //Method to subtract 2 decimal numbers
    public double subtract(double a,double b)
    {
        return (a - b);
    }
    public double multiply(double a , double b)
    {
        return ( a * b);
    }
    public double multiply(double a,double b,double c,double d)
    {
        return (a * b * c * d);
    }

}
