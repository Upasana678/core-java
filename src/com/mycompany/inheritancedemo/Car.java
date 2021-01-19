package com.mycompany.inheritancedemo;

public class Car extends Vehicle{//Car is the subclass
    private long buildNumber;
    public Car()
    {
        super();
        System.out.println("Default Constructor of child class Car");
        super.setVehicleType("Car is Four Wheeler");
    }
    public Car(long buildNumber)
    {
        this();//called the default constructor of Car class which is line 5
        this.buildNumber = buildNumber;
    }
    public void showDetails()
    {
        System.out.println(super.getVehicleType());
        System.out.println("Build Number of the car is "+this.buildNumber);
    }
    //Method overriding
    public void show()//The child class car is overriding the logic of the parent class function show()
    {
        System.out.println("I am child class Car");
    }
}
