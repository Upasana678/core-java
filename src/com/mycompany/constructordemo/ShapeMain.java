package com.mycompany.constructordemo;

public class ShapeMain {
    public static void main(String[] args){
        Shape s = new Shape();//calls the default or 0 parameterised constructor.this keyword and s reference are pointing to the same object where the object variables(length,breadth,shapetype) are initialised by default values by JVM
        Shape s1 = new Shape(20,"Square");
        //this and s1 point to the same object and JVM will initialse only the breadth object variable and we are initialising the length and shape type variables
        Shape s2 = new Shape(20,"Rectangle",13);//Example of static polymorphism because decision has been made at compile time which overloaded constructor to call
    }
}

