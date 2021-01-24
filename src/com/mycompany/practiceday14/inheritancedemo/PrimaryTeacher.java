package com.mycompany.practiceday14.inheritancedemo;

public class PrimaryTeacher extends Teacher {

    public PrimaryTeacher()
    {
        System.out.println("Hello! I am a primary Teacher");
        System.out.println("I teach students ranging from Classes 3 to 5");
    }

    public void teachSubjects()
    {
        System.out.println("I teach EVS,Maths,English");
    }
}
