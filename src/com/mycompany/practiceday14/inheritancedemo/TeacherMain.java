package com.mycompany.practiceday14.inheritancedemo;

public class TeacherMain {
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO DAV PUBLIC SCHOOL");

        //Creating an object of Teacher
        Teacher teacher = new Teacher();
        teacher.teachSubjects();

        //Calling constructor of Primary Teacher using reference of parent class Teacher
        Teacher tt = new PrimaryTeacher();
        tt.teachSubjects();

        //Calling constructor of Secondary Teacher using reference of parent class Teacher
        Teacher tt1 = new SecondaryTeacher();
        tt1.teachSubjects();
    }
}
