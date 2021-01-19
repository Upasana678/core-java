package com.mycompany.assignmentday8;

import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Taking input of the number of students
        System.out.println("How many students to create?");
        int n = sc.nextInt();
        String name;//Name of the student to be taken as input

        for(int i = 1; i<=n; i++)
        {
            System.out.println("Enter the name of the student");
            name = sc.next();
            if(name == null)
            {
                Student ss = new Student();
            }
            else
            {
                Student st = new Student(name);
            }
        }




    }
}
