package com.mycompany;
//Program to swap 2 numbers using temporary variable
import java.util.Scanner;
public class NumberSwap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;//Variable to store 1st number
        int num2;//Variable to store 2nd number
        int temp;//Temporary variable for swapping purpose

        //input to take 1st number
        System.out.println("Enter 1st number:-");
        num1 = sc.nextInt();
        //input to take 2nd number
        System.out.println("Enter 2nd number:-");
        num2 = sc.nextInt();

        //Numbers before swapping
        System.out.println("Value of num1 before swapping is "+num1);
        System.out.println("Value of num2 after swapping  is "+num2);

        //Logic for swapping with the help of temporaty variable
        temp = num1;
        num1 = num2;
        num2 = temp;

        //Numbers after swapping
        System.out.println("Value of num1 after swapping is " +num1);
        System.out.println("Value of num2 after swapping is " +num2);


    }
}
