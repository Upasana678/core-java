package com.mycompany.practiceday14.polymorpismpractice;

import java.util.Scanner;
public class CalculatorMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking input of numbers
        System.out.println("Enter 1st number of integer datatype");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number of double datatype");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number of integer datatype");
        int c = sc.nextInt();
        System.out.println("Enter 1st number of double datatype");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd number of double datatype");
        double num2 = sc.nextDouble();
        System.out.println("Enter 3rd number of double datatype");
        double num3 = sc.nextDouble();

        //Creating an object of calculator class
        Calculator calc = new Calculator();

        //Result printing of addition
        System.out.println("Addition of 2 numbers of integer datatype is "+calc.add(a,b));
        System.out.println("Addition of 3 numbers of double datatype is "+calc.add(num1,num2,num3));

        //Result printing of subtraction
        System.out.println("Subtraction of 2 numbers of inetger datatype is "+calc.subtract(a,b));
        System.out.println("Subtraction of 2 numbers of double datatype is "+calc.subtract(num1,num2));

        //Result printing of multiplication
        System.out.println("Multiplication of 3 numbers of integer datatype is "+calc.multiply(a,b,c));
        System.out.println("Multiplication of 3 numbers of integer and double datatype is "+calc.multiply(a,num1,num3,c));

    }
}
