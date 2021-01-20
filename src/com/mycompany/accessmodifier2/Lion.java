package com.mycompany.accessmodifier2;

import com.mycompany.accessmodifier.Animal;

public class Lion extends Animal {

    public void display()
    {
        System.out.println(canFly);//protected members can be accesed outside the package in the child classes
    }
}
