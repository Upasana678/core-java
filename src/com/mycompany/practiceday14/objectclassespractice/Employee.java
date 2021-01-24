package com.mycompany.practiceday14.objectclassespractice;

public class Employee {

    //Attributes of the employee class
    String empName;
    long empID;
    double salary;

    //getter methods
    public String getEmpName()
    {
        return this.empName;
    }
    public long getEmpID()
    {
        return this.empID;
    }
    public double getSalary()
    {
        return this.salary;
    }

    //setter methods to initialise values
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }
    public void setEmpID(long empID)
    {
        this.empID = empID;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
