package com.mycompany.accessmodifier;

public class Cat extends Animal {
    public void display()
    {
        System.out.println(canFly);//protected members can be accesed within the same package
    }
}
