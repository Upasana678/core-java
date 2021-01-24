package com.mycompany.practiceday14.objectclassespractice;

import java.util.Scanner;
public class EmployeeArrayMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;//No of employees to take as user input
        long empID;//Employee ID of the employee
        String empName;//Name of the employee
        long salary;//Salary of the employee
        String empAddress;//Address of the employee

        //User input to enter how many employee data to process
        System.out.println("How many employee data to process?");
        n = sc.nextInt();

        //Creating an object of Employee Class
        EmployeeArray ea[] = new EmployeeArray[n];

        //This loop takes values from user and sets those values in the EmployeeArray object

        for(int i = 0; i < n; i++)
        {
            ea[i] = new EmployeeArray();//Creating an object at each position ea[] array
            System.out.println("Enter the employee ID of "+(i+1)+" employee");
            empID = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter the name of "+(i+1)+" employee");
            empName = sc.nextLine();
            System.out.println("Enter the salary of "+(i+1)+" employee");
            salary = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter the address where employee "+(i+1)+" resides:-");
            empAddress = sc.nextLine();

            //Setting the values
            ea[i].setEmpID(empID);
            ea[i].setEmpName(empName);
            ea[i].setSalary(salary);
            ea[i].setEmpAddress(empAddress);
        }

        //This loop retrieves the values from the employee Array
        for(int i = 0; i<n; i++)
        {
            System.out.println("Employee "+(i+1)+" details:-");
            System.out.println("Employee ID:- "+ea[i].getEmpID());
            System.out.println("Employee Name:- "+ea[i].getEmpName());
            System.out.println("Employee Salary:- "+ea[i].getSalary());
            System.out.println("Employee Address:- "+ea[i].getEmpAddress());

        }

    }
}
