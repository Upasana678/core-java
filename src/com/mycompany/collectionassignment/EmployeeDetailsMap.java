package com.mycompany.collectionassignment;

import java.util.*;

public class EmployeeDetailsMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;//Choice of the user

        Map<Integer, String> employeeDetails = new HashMap<>();
        int employeeID;//EmployeeID of the person
        String employeeName;//Name of the employee

        menu();
        System.out.println("Enter your choice");
        choice = sc.nextInt();

        while (choice != 6) {

            switch (choice) {
                case 1:
                    System.out.println("Enter the employee ID :");
                    employeeID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the employee Name: ");
                    employeeName = sc.nextLine();
                    employeeDetails.put(employeeID, employeeName);
                    break;
                case 2:
                    System.out.println("Enter the employee ID of the employee you want to search:");
                    employeeID = sc.nextInt();
                    int flag = 0;
                    for (Map.Entry<Integer, String> m : employeeDetails.entrySet()) {
                        if (m.getKey() == employeeID) {
                            System.out.println("Employee ID: " + m.getKey());
                            System.out.println("Employee Name: " + m.getValue());
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Sorry! This employee does not exist in our system.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the employee ID you want to delete: ");
                    employeeID = sc.nextInt();
                    employeeDetails.remove(employeeID);
                    System.out.println("The employee with employeeID " + employeeID + " was removed sucessfully");
                    break;

                case 4:
                    System.out.println("Displaying Employee Details");
                    for (Map.Entry<Integer, String> m : employeeDetails.entrySet()) {
                        System.out.println("Employee Id: " + m.getKey());
                        System.out.println("Employee Name: " + m.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Enter the Employee Id you want to Update");
                    employeeID = sc.nextInt();
                    int flag1 = 0;
                    sc.nextLine();
                    for (Map.Entry<Integer, String> m : employeeDetails.entrySet()) {
                        if (m.getKey() == employeeID) {
                            System.out.println("Enter the employee name");
                            employeeName = sc.nextLine();
                            employeeDetails.replace(employeeID, employeeName);
                            System.out.println("Employee Details updated sucessfully");
                            flag1 = 1;
                            break;
                        }
                    }
                    if (flag1 == 0) {
                        System.out.println("Employee ID does not exist");
                    }
                    break;
                case 6:
                    System.out.println("GoodBye!");
                    System.exit(0);
                default:
                    System.out.println("sorry! Wrong choice");
                    break;
            }
            menu();
            System.out.println("Enter your choice");
            choice = sc.nextInt();
        }
    }
    public static void menu()
    {
        System.out.println("1.Add Employee");
        System.out.println("2.Find Employee");
        System.out.println("3.Delete Employee");
        System.out.println("4.Display Employee Details");
        System.out.println("5.Update Employee Details");
        System.out.println("6.Exit");
    }
}
