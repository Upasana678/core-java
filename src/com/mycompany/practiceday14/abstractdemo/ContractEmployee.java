package com.mycompany.practiceday14.abstractdemo;

public class ContractEmployee extends Employee{

    @Override
    public double calculateSalary(String employmentType) {
        double grossSalary = 50000;
        double tax = 0.30;
        double salary = 0.0;

        if(employmentType.equalsIgnoreCase("Contract"))
        {
            salary = grossSalary - (grossSalary * tax);
        }
        return salary;
    }
}
