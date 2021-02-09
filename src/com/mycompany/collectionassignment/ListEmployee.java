package com.mycompany.collectionassignment;

//This program takes input of n employees and displays their id,name,salary
import java.util.ArrayList;
import java.util.Scanner;
public class ListEmployee {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;//No of employees to take as input
        int empId;//Employee ID of an employee
        String name;//Name of the employee
        double salary;//Salary of the employee

        System.out.println("How many employees?");
        n = sc.nextInt();

        //Creating an array of ArrayList
        ArrayList employee[] = new ArrayList[n];

        //Entering the values of employees
        for(int i = 0; i < n; i++)
        {
            employee[i] = new ArrayList();
            System.out.println("Enter the employee ID of "+(i+1)+" employee");
            empId = sc.nextInt();
            System.out.println("Enter the name of "+(i+1)+" employee");
            sc.next();
            name = sc.nextLine();
            System.out.println("Enter the salary of "+(i+1)+" employee");
            salary = sc.nextDouble();
            employee[i].add(empId);
            employee[i].add(name);
            employee[i].add(salary);
        }
            //Displaying the details of the employees
            for(int j = 0; j < n; j++)
            {
                System.out.println("Details of Employee "+(j+1)+" is:");
                System.out.println("Employee ID is "+employee[j].get(0));
                System.out.println("Employee Name is "+employee[j].get(1));
                System.out.println("Employee Salary is "+employee[j].get(2));
            }


    }
}
