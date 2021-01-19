package com.mycompany.objectclasses;

import java.util.Scanner;
public class EmployeeArrayMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n; //No of employee records to create
        double salary;//Salary of the employee
        long employeeId;//Employee Id of the employee
        String empName;//Name of the employee
        String empAddress;//Address of the employee

        System.out.println("How many employee records to create ?");
        n = sc.nextInt();

        //Create an object of Employee
        EmployeeArray emp[] = new EmployeeArray[n];

        //Insert the details of the employee
        for(int i = 0; i < n; i++)
        {
            emp[i] = new EmployeeArray();
            System.out.println("Enter the employee ID of "+(i+1)+" employee");
            employeeId = sc.nextLong();
            emp[i].setEmployeeId(employeeId);
            System.out.println("Enter the name of "+(i+1)+" employee");
            sc.nextLine();//after taking input for long datatype and int data type always flush the Scanner stream by calling nextLine()
            empName = sc.nextLine();
            //System.out.println(empName);
            emp[i].setEmpName(empName);
            System.out.println("Enter the address of "+(i+1)+" employee");
            //sc.nextLine();
            empAddress = sc.nextLine();
            //System.out.println(empAddress);
            emp[i].setEmpAddress(empAddress);
            System.out.println("Enter the salary of "+(i+1)+" employee");
            salary = sc.nextDouble();
            emp[i].setSalary(salary);
            //System.out.println("Details of employee "+(i+1)+" entered");
        }

        //Retrieving the details of the employee
        for(int i = 0; i < n; i++)
        {
            System.out.println("Employee Details of "+(i+1)+" employee:-");
            System.out.println("Employee"+(i+1)+" Employee Id:- "+emp[i].getEmployeeId());
            System.out.println("Employee"+(i+1)+" Employee Name:- "+emp[i].getEmpName());
            System.out.println("Employee"+(i+1)+" Employee Address:- "+emp[i].getEmpAddress());
            System.out.println("Employee"+(i+1)+" Salary:- "+emp[i].getSalary());
            System.out.println();
        }








    }
}
