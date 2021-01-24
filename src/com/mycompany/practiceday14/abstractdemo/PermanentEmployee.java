package com.mycompany.practiceday14.abstractdemo;

public class PermanentEmployee extends Employee {

    public double calculateSalary(String employmentType) {
        double grossSalary = 80000;
        double tax = 0.20;
        double salary = 0.0;

        if (employmentType.equalsIgnoreCase("Permanent")) {

            salary = grossSalary - (grossSalary * tax);

        }
        return salary;

    }
}
