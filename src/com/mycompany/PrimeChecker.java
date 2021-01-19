package com.mycompany;
import java.util.Scanner;
//Program to determine whether a number is prime or not
public class PrimeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();//variable to store number
        int flag = 0;

        //Logic to determine whether a number is prime or not
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }

    }
}
