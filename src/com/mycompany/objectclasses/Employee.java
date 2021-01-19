package com.mycompany.objectclasses;

public class Employee {

    long employeeId;//state variable.Every object will have a local copy with different values stored in it.
    double salary;//another state variable

    void setEmployeeId(long eid){
        employeeId = eid;
    }
    void setSalary(double s){
        salary = s;
    }
    long getEmployeeId(){
        return employeeId;
    }

    double getSalary(){
        return salary;
    }

}
