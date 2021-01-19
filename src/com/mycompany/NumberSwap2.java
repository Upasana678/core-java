package com.mycompany;
//Program to swap 2 numbers without using a temporary variable
import java.util.Scanner;
public class NumberSwap2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;//Variable to enter 1st number
        int num2;//Variable to enter 2nd number

        //Enter the values of the numbers
        System.out.println("Enter the value of 1st variable:-");
        num1 = sc.nextInt();
        System.out.println("Enter the value of 2nd variable:-");
        num2 = sc.nextInt();

        //Values of the numbers before swapping
        System.out.println("Value of num1 before swapping is "+num1);
        System.out.println("Value of num2 before swapping is "+num2);

        //Logic to swap 2 numbers without using a temporary variable
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1 -num2;

        //Values of the numbers after swapping
        System.out.println("Value of num1 after swapping is "+num1);
        System.out.println("Value of num2 after swapping is "+num2);

    }


}
