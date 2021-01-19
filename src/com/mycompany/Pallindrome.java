package com.mycompany;
//Number to check whether number is a pallindrome or not
 import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;//Variable to store number
        int rev = 0;//variable to store reverse
        int rem;//Remainder of a number
        int num2;//Variable to store the number stored in num1

        System.out.println("Enter a number");
        num1 = sc.nextInt();
        num2 = num1;

        //logic to find reverse of a number
        while(num1 != 0)
        {
            rem = num1 % 10;
            rev = rev * 10 + rem;
            num1 = num1 / 10;
        }

        //Logic to test whether number is a pallindrome or not
        if(rev == num2){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not a pallindrome");
        }
    }
}
