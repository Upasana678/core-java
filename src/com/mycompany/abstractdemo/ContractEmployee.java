package com.mycompany.abstractdemo;

public class ContractEmployee extends Employee{


    @Override
    public double calculateSalary(String employmentType) {
        double tax = 0.30;
        double grossSalary = 80000;
        double netSalary = 0.0;
        if(employmentType.equalsIgnoreCase("Contract Employee"))
        {
            netSalary = grossSalary - (grossSalary * tax);
            netSalary = netSalary - 5000;//10000 is the bonus for permanent employee
        }
        return netSalary;
    }
}
