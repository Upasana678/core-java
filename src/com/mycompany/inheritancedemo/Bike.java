package com.mycompany.inheritancedemo;

public class Bike extends Vehicle{//bike is the subclass

    public Bike()
    {
        //super();similar to calling Vehicle();If we don't call super(),JVM automatically calls the constructor of parent class.
        System.out.println("Default Constructor of child class Bike");
        super.setVehicleType("Bike is Two Wheeler");
    }
    public void display()
    {
        System.out.println(super.getVehicleType());
    }
    //Method Overriding(modifying the definition of the show() inherited from parent class)
    public void show()
    {
        System.out.println("I am child class Bike");
    }
}
