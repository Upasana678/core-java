package com.mycompany.objectclasses;

public class EmployeeArray {
    long employeeId;
    double salary;
    String empName;//Employee Name
    String empAddress;//Employee Address

    void setEmployeeId(long eid)
    {
        employeeId = eid;
    }
    void setSalary(double sal)
    {
        salary = sal;
    }
    double getSalary()
    {
        return salary;
    }
    long getEmployeeId()
    {
        return employeeId;
    }
    void setEmpName(String name){
        empName = name;
    }
    void setEmpAddress(String address){
        empAddress = address;
    }
    String getEmpName(){
        return empName;
    }
    String getEmpAddress(){
        return empAddress;
    }

}
