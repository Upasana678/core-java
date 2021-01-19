package com.mycompany.arrayassignments;

//Program to sort Salary of employees using selection sort
import java.util.Scanner;

public class SortEmployeeSalary {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;//Number of employee's salary in the array
        int temp;

        System.out.println("Enter how many people salary to enter?");
        n = sc.nextInt();

        int employeeSalary[] = new int[n];

        //Enter salary details
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the salary of "+(i+1)+" employee");
            employeeSalary[i] = sc.nextInt();
        }

        //Printing the salary details before sorting
        System.out.println("Employee Salary Details before sorting: ");
        for(int i = 0; i< employeeSalary.length; i++)
        {
            System.out.print(employeeSalary[i]+" ");
        }
        int min;
        for(int i = 0; i < employeeSalary.length - 1; i++)
        {
            min = i;
            for(int j = i+1; j < n - 1; j++)
            {
                if(employeeSalary[j] < employeeSalary[min])
                {
                    min = j;
                }

                //Swap the found minimum element with the first element
                temp = employeeSalary[min];
                employeeSalary[min] = employeeSalary[i];
                employeeSalary[i] = temp;

            }

        }

        System.out.println("Employee Salary details after sorting: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(employeeSalary[i]+" ");
        }


    }
}
