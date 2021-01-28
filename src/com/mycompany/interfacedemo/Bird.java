package com.mycompany.interfacedemo;

public class Bird implements Animal,SuperAnimal{//Example of multiple inheritance

    public void speak(){

        System.out.println("Hello! I am a bird");
        System.out.println("Chirp");
    }
}
