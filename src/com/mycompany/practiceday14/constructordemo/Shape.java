package com.mycompany.practiceday14.constructordemo;

public class Shape {
    int length;
    int breadth;
    String shapeType;

    public Shape()
    {
        System.out.println("Calling the Default Constructor");
        this.length = length;
        this.breadth = breadth;
        this.shapeType = shapeType;
        System.out.println("Length = "+this.length);
        System.out.println("Breadth = "+this.breadth);
        System.out.println("Shape Type = "+this.shapeType);
    }

    //Calling the overloaded constructor
    public Shape(int length,int breadth,String shapeType)
    {
        System.out.println("Calling the parameterised constructor");
        this.length = length;
        this.breadth = breadth;
        this.shapeType = shapeType;
        System.out.println("Length = "+this.length);
        System.out.println("Breadth = "+this.breadth);
        System.out.println("ShapeType = "+this.shapeType);
    }
}
