package com.mycompany.constructordemo;

public class Shape {
    int length;
    int breadth;
    String shapeType;
    //Default Constructor gets called during the time of object creation and its job is to initialise the member variables
    //with default values of the data type e.g default value of int is 0 and string is null

   public Shape(){//Default constructor is a special method that has the same name as class name it can have parameter-list it can also have return type but we don't specify the return type
       System.out.println("Default Constructor");
       System.out.println(length);//in the default constructor JVM initialises the default values of the datatype
       System.out.println(breadth);
       System.out.println(shapeType);
   }
   public Shape(int length,String shapeType){
       this.length = length;//the length local function parameter is getting assigned to current object's length property,the current object is being pointed by the this keyword.
       this.shapeType = shapeType;
       System.out.println("Two parameterised overloaded constructor");
       System.out.println(this.length);
       System.out.println(this.shapeType);
       System.out.println(this.breadth);//JVM will initialise the value of breadth with default data type value

   }
    public Shape(int length,String shapeType,int breadth){
        this.length = length;//the length local function parameter is getting assigned to current object's length property,the current object is being pointed by the this keyword.
        this.shapeType = shapeType;
        this.breadth = breadth;
        System.out.println("Three parameterised overloaded constructor");
        System.out.println(this.length);
        System.out.println(this.shapeType);
        System.out.println(this.breadth);
        this.test();//calls the current object's test method.

    }
    public void test(){
       System.out.println("I am Test method");
    }
}
