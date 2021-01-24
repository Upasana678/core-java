package com.mycompany.practiceday14.polymorpismpractice;

public class Calculator {

    public int add(int a,int b)
    {
        return (a+b);
    }
    public double add(double a,double b,double c)
    {
        return (a+b+c);
    }

    //Subtraction of 2 numbers
    public int subtract(int a,int b)
    {
        return ( a - b);
    }
    public double subtract(double a,double b)
    {
        return (a - b);
    }

    //Multiplication of 2 numbers
    public int multiply(int a,int b,int c)
    {
        return (a * b * c);
    }
    public double multiply(int a,double b,double c,int d)
    {
        return ((double)( a * b * c * d));
    }
}
