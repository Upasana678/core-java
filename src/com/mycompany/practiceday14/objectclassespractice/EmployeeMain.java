package com.mycompany.practiceday14.objectclassespractice;

import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args)
    {
        //Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Properties of employee class
        String empName;
        long empID;
        double salary;

        //Creating an object of Employee class
        Employee e1 = new Employee();
        System.out.println("Enter the name of the 1st employee");
        empName = sc.nextLine();
        System.out.println("Enter the employee ID of 1st employee");
        empID = sc.nextLong();
        System.out.println("Enter the salary of 1st employee:");
        salary = sc.nextDouble();

        e1.setEmpName(empName);
        e1.setEmpID(empID);
        e1.setSalary(salary);

        System.out.println("Extracting employee 1 details:-");
        System.out.println("Name of 1st employee is "+e1.getEmpName());
        System.out.println("Employee ID of 1st employee is "+e1.getEmpID());
        System.out.println("Salary of 1st employee is "+e1.getSalary());
        System.out.println("---------------------------------------------------------------------------");
        sc.nextLine();
        //Creating object for 2nd employee
        Employee e2 = new Employee();
        System.out.println("Enter the name of 2nd employee:-");
        empName = sc.nextLine();
        System.out.println("Enter the employee ID of 2nd employee:-");
        empID = sc.nextLong();
        System.out.println("Enter the salary of 2nd employee:-");
        salary = sc.nextDouble();

        e2.setEmpName(empName);
        e2.setEmpID(empID);
        e2.setSalary(salary);

        System.out.println("Extracting employee 2 details:-");
        System.out.println("Name of 2nd employee is "+e2.getEmpName());
        System.out.println("Employee ID of 2nd employee is "+e2.getEmpID());
        System.out.println("Salary of 2nd employee is "+e2.getSalary());
        System.out.println("---------------------------------------------------------------------------");






    }


}
