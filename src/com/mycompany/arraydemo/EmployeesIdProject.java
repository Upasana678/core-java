package com.mycompany.arraydemo;

import java.util.Scanner;

public class EmployeesIdProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);*/
        System.out.println("Hi, Please enter the number of employees in your company");
        int numberOfEmployees = scanner.nextInt();//variable to store number of employees during run time of program.The user integer input was assigned from keyboard and assigned to variable
        int arrayOfEmployees[] = new int[numberOfEmployees];

        //Logic to take input from keyboard and store it in array
        for(int i = 0; i< arrayOfEmployees.length; i++){
            System.out.println("Enter EmployeeId of "+(i+1)+" employee");
            arrayOfEmployees[i] = scanner.nextInt();
        }

        //Printing all employee Ids
        for(int i = 0; i< arrayOfEmployees.length; i++){
            System.out.println("Employee ID of employee "+(i+1)+" is "+arrayOfEmployees[i]);
        }


    }
}
