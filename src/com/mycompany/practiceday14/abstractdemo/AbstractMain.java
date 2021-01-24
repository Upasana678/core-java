package com.mycompany.practiceday14.abstractdemo;

public class AbstractMain {
    public static void main(String[] args)
    {
        double salary;
        //Creating an object of Permanent Employee
        PermanentEmployee per = new PermanentEmployee();
        //Creating an object of Contractual Employee
        ContractEmployee coe = new ContractEmployee();

        //Displaying the salary of Contractual Employee
        System.out.println("Displaying the salary of Contract Employee");
        System.out.println(coe.getCompanyName());
        salary = coe.calculateSalary("contract");
        System.out.println("Salary of contract employee is "+salary);

        //Displaying the salary of Permanent Employee
        System.out.println("Displaying the salary of Permanent Employee");
        System.out.println(per.getCompanyName());
        salary = per.calculateSalary("permanent");
        System.out.println("Salary of Permanent Employee is "+salary);



    }
}
