package com.mycompany.collectionassignment;

import java.util.Hashtable;
import java.util.Scanner;
public class SetEmployee {
    public static void main(String[] args) throws EmployeeIdExist
    {
        Scanner sc = new Scanner(System.in);
        int employeeID;//Employee ID of a person
        String employeeName;//Employee Name
        int n;
        System.out.println("How many employees?");
        n = sc.nextInt();
        Hashtable<Integer,String> employeeDetails = new Hashtable<>();

        //Entering the details of the employee
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Enter the employee ID of "+i+" Employee");
            employeeID = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name of "+i+" Employee");
            employeeName = sc.nextLine();
            //Entering the record in HashTable
            if(employeeDetails.size() == 0) {
                employeeDetails.put(employeeID, employeeName);
            }
            else
            {
                try
                {
                    if(employeeDetails.get(employeeID)!= null)
                    {
                        EmployeeIdExist ee = new EmployeeIdExist();
                        throw ee;
                    }
                    else
                    {
                        employeeDetails.put(employeeID, employeeName);
                    }
                }
                catch(EmployeeIdExist eid)
                {
                    System.out.println("This employee Id "+employeeID+" exists in the database.Please enter another employee ID");
                    System.out.println("Enter the employee ID of "+i+" Employee");
                    employeeID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the name of "+i+" Employee");
                    employeeName = sc.nextLine();
                    employeeDetails.put(employeeID, employeeName);
                }
                catch(Exception ee)
                {
                    System.out.println("Exception occured: "+ee);
                }
            }
        }

        //Displaying the details of the employee Table
        System.out.println(employeeDetails);

    }
}
