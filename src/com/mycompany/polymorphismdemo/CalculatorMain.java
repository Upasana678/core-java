package com.mycompany.polymorphismdemo;

import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Enter the integers details
        System.out.println("Enter 1st integer");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd integer");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd integer");
        int num3 = sc.nextInt();

        //Creating an object of calculator class
        Calculator cc = new Calculator();
        //Calling add method
        int result1 = cc.add(num1,num2);
        System.out.println("Addition of 2 integers is "+result1);
        //Calling add method with 3 parameters
        int result2 = cc.add(num1,num2,num3);
        System.out.println("Addition of 3 numbers is "+result2);

        //Taking input of decimal numbers
        System.out.println("Enter 1st decimal number:");
        double dem1 = sc.nextDouble();
        System.out.println("Enter 2nd decimal number: ");
        double dem2 = sc.nextDouble();
        System.out.println("Enter 3rd decimal number: ");
        double dem3 = sc.nextDouble();
        System.out.println("Enter 4th decimal number ");
        double dem4 = sc.nextDouble();

        //Calling subtract method to subtract 2 decimal numbers
        double result3 = cc.subtract(dem1,dem2);
        System.out.println("Subtraction of 2 decimal numbers dem1 and dem2 is "+result3);

        //Taking input of double numbers
        double result4;
        double result5;
        result4 = cc.multiply(dem3,dem4);
        System.out.println("Multiplication of 2 numbers with dem3 and dem4 is "+result4);

        result5 = cc.multiply(dem1,dem2,dem3,dem4);
        System.out.println("Multiplication of 4 decimal numbers dem1,dem2,dem3,dem4 is "+result5);

        result5 = cc.multiply(dem2,dem1,dem3,dem4);
        System.out.println("Multiplication of 4 decimal numbers with sequence changed  is "+result5);







    }
}
