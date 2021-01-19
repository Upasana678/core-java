package com.mycompany.objectclasses;

public class EmployeeMain {
    public static void main(String[] args){
        //e1 is reference   //below line creates new object and e1 reference pointing to it
        Employee e1         = new Employee();
        e1.setEmployeeId(111l);
        e1.setSalary(16000);

        Employee e2 = new Employee();
        e2.setEmployeeId(123l);
        e2.setSalary(17000);

        //Printing employee1 detailsj
        System.out.println("Employee ID is "+e1.getEmployeeId());
        System.out.println("Employee salary is "+e1.getSalary());

        System.out.println("Employee ID is "+e2.getEmployeeId());
        System.out.println("Employee salary is "+e2.getSalary());


    }
}
