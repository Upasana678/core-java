package com.mycompany.practiceday14.abstractdemo;

public abstract class Employee {
    private final String companyName = "Tata Consultancy Services";

    public String getCompanyName()
    {
        return this.companyName;
    }

    public abstract double calculateSalary(String employmentType);
}
