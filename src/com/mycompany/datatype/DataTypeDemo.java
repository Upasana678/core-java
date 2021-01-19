package com.mycompany.datatype;
//Package name should be always SMALL letter separated by DOT.
//Class name should follow every word 1st character should be CAPITAL.
    public class DataTypeDemo {
    public static void main(String[] args){
        int age = 40;//Variable and method name should follow camel casing.
        // First letter should be small,rest all words that follow should start with a capital letter.
        long empId = 1821717;//Variable and method name should follow camel casing
        double salary = 20000;
        float performanceParameter = 6.7f;
        char gender = 'M';
        //Printing employee details
        System.out.println("Employee Age is "+age);//String concantenation can be done using + operator.
        char grade = 'S';
        System.out.println("Employee ID is "+empId);
        System.out.println("Employee Salary is "+salary);
        System.out.println("Employee Performance is "+performanceParameter);
        System.out.println("Employee Gender is "+gender);
        System.out.println("Employee Grade is "+grade);
        //Logic for checking cab eligibility
        if(gender == 'F'){
            System.out.println("Eligible for cab");
        }
        else
        {
            System.out.println("Not eligible for cab");
        }
        //Logic for checking Loan eligibility based on Salary
        if(salary > 20000 && salary <50000){
            System.out.println("Eligible for 1 Lakh Loan");
        }
        else if(salary <= 20000){
            System.out.println("Eligible for 50 thousand loan");

        }
        else
        {
            System.out.println("Eligible for 5 Lakh Loan");
        }




    }


}
