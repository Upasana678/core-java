package com.mycompany.interfacedemo;

public class AnimalMain {
    public static void main(String[] args)
    {
        //Creating an object of Bird class
        Bird bird = new Bird();
        bird.speak();

        //Creating an object of Tiger class
        Tiger tiger = new Tiger();
        tiger.speak();

        Animal as = new Bird();//Example of Dynamic polymorphism
        as.speak();//Interface class reference variable can be created
        //Animal as = new Animal();//not allowed as interface object cannot be created
    }
}
