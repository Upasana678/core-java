package com.mycompany.accessmodifier;

public class Bird {

    public void display()
    {
        Animal animal = new Animal();
        //System.out.println(animal.animalName);//private variable animalName can be accessed only in the same class
        //public members can be accessed within same class,within same package and outside class with a different package
        System.out.println(animal.getAnimalName());
        System.out.println(animal.animalType);//default member variables and functions can be accesed within
        //the same class,outside the class but in same package.
        System.out.println(animal.canFly);//protected variable,methods can be accesed within same class and within same package

    }
}
