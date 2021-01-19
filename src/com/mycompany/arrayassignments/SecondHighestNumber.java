package com.mycompany.arrayassignments;
//Program to find the second highest element in an array
import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max1;//1st maximum element in the array
        int max2;//2nd maximum element in the array
        int n;//Number of the elements in the array

        //Prompting the user to enter how many elements in the array
        System.out.println("How many elements?");
        n = sc.nextInt();
        //Declaring an array
        int arr[] = new int[30];
        //Enter the values in the array
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }

        //Logic to find the 1st maximum element in the array
        max1 = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max1)
            {
                max1 = arr[i];
            }

        }
        //Logic to find the second maximum element in the array
        max2 = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max2 && arr[i] < max1)
            {
                max2 = arr[i];
            }
        }
        System.out.println("Second maximum element in the array is "+max2);







    }
}
