package com.mycompany.practiceday14.objectclassespractice;

public class EmployeeArray {
    long empID;
    String empName;
    long salary;
    String empAddress;

    //getter methods
    public long getEmpID()
    {
        return this.empID;
    }
    public String getEmpName()
    {
        return this.empName;
    }
    public long getSalary()
    {
        return this.salary;
    }
    public String getEmpAddress()
    {
        return this.empAddress;
    }

    //Setter methods
    public void setEmpID(long empID)
    {
        this.empID = empID;
    }
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }
    public void setSalary(long salary)
    {
        this.salary = salary;
    }
    public void setEmpAddress(String empAddress)
    {
        this.empAddress = empAddress;
    }
}
