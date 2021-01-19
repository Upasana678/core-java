package com.mycompany.inheritancedemo;

public class InheritanceMain {
    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.display();
        Car car = new Car(890655);
        car.showDetails();

        System.out.println("---------------------------------");
        //The concept of making decision to which objects method should be called at run time
        //is called dynamic polymorphism
        //whose object that particular class method gets called
        Vehicle vehicle = new Vehicle();
        vehicle.show();

        vehicle = new Bike(); //vehicle reference is pointing to bike object,According to line 14 rule
        //bike class show() is called.
        vehicle.show();

        vehicle = new Car();
        vehicle.show();
    }
}
