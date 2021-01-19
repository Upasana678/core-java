package com.mycompany.arrayassignments;
//Sort the employee ids of an organisation using bubble sort
import java.util.Scanner;

public class SortEmployeeId {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;//Number of employeeIds to process
        int temp = 0;

        //Prompt the user to enter the how many employeeIds to enter
        System.out.println("How many elements in the array");
        n = sc.nextInt();

        //declaring an array
        int employeeId[] = new int[n];

        //Enter the elements in the array
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the "+(i+1)+" element");
            employeeId[i] = sc.nextInt();
        }

        System.out.println("Employee ID before sorting: ");
        for(int i =0;i<employeeId.length;i++)
        {
            System.out.print(employeeId[i]+" ");
        }
        System.out.println();

        //Sorting all employeeIds through bubble sort
        for(int i = 0;i < n; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(employeeId[j] > employeeId[j+1])
                {
                    temp = employeeId[j];
                    employeeId[j] = employeeId[j+1];
                    employeeId[j+1] = temp;
                }
            }
        }

        System.out.println("Employee IDs after sorting: ");
        for(int i = 0;i < employeeId.length; i++)
        {
            System.out.print(employeeId[i]+" ");
        }

    }
}
