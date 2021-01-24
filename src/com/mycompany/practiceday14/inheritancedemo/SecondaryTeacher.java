package com.mycompany.practiceday14.inheritancedemo;

public class SecondaryTeacher extends Teacher{

    public SecondaryTeacher()
    {
        System.out.println("Hello! I am a secondary teacher");
        System.out.println("I teach students from classes 6 to 10");
        System.out.println("My area of specialisation is Social Studies");
    }

    @Override
    public void teachSubjects() {
        System.out.println("I teach students History,Civics,Geography");
        System.out.println("I teach Economics from classes 9 to 10");
    }
}
