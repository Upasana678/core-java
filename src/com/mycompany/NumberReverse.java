package com.mycompany;
//Program to reverse a number
import java.util.Scanner;
public class NumberReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;//Variable to enter a number
        int rev = 0;//Variable to store the reverse of a number
        int rem;//Variable to store remainder

        //Input a number
        System.out.println("Enter a number:-");
        num1 = sc.nextInt();

        //Logic to find the reverse of a number
        while(num1 !=0)
        {
            rem = num1 % 10;
            rev = rev * 10 + rem;
            num1 = num1/10;

        }

        //Print the reversed number
        System.out.println("Reverse is "+rev);
    }
}
