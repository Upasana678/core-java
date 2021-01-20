package com.mycompany.abstractdemo;

public class AbstractMain {
    public static void main(String[] args)
    {
        //Employee ee = new Employee();//Object instantiation/creation is not allowed for an abstract class
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        ContractEmployee contractEmployee = new ContractEmployee();

        String companyName = permanentEmployee.getCompanyName();
        double salary = permanentEmployee.calculateSalary("permanent");
        double salaryOfContractEmployee = contractEmployee.calculateSalary("Contract Employee");

        System.out.println("Company Name is "+companyName);
        System.out.println("Salary of Permanent Employee  is "+salary);
        System.out.println("Salary of Contract Employee  is "+salaryOfContractEmployee);

    }
}
