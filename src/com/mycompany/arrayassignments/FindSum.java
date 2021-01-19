package com.mycompany.arrayassignments;
//Program to find sum of an array of elements
import java.util.Scanner;

public class FindSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;//Variable to store sum of all elelements in the array
        int n;//Number of elements in the array

        //Prompt the user to find how many elements in the array
        System.out.println("Enter how many elements?");
        n = sc.nextInt();

        //Declaring an array to store elements
        int arr[] = new int[n];

        //Inserting the elements in the array
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }

        //Logic to find sum of elements in an array
        for(int i = 0;i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the elements in the array is "+sum);
    }
}
