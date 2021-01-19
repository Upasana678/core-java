package com.mycompany.inheritancedemo;

public class Vehicle {//Vehicle is the super class
    private String vehicleType;

    public Vehicle()
    {
        System.out.println("Default Constructor of Super Class Vehicle");
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void show()
    {
        System.out.println("I am parent class Vehicle");
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
