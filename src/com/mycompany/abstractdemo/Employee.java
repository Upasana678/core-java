package com.mycompany.abstractdemo;

public abstract class Employee {
    private final String companyName = "xyz Private Limited";

    //this is a concrete method because it has its own method body and implementation.
    public String getCompanyName()
    {
        return this.companyName;
    }
    public abstract double calculateSalary(String employmentType);
}
