package com.mycompany.polymorphismdemo;

/*
* Function is Overloaded when:
* 1. no. of param list differs
* 2. data type of param list differs
* 3. sequence of param list differs
 */
public class Area {

    // number of parameters vary than its an overloaded function
    // data type of parameters vary than its an overloaded function
    public double calculateArea(double radius){
        return (3.14 * radius *radius);
    }
    // number of parameters vary than its an overloaded function
    public double calculateArea(double length,double width){
        return (length * width);
    }
    // number of parameters vary than its an overloaded function
    //sequence of parameter
    public double calculateArea(double length,double width, String name){
        System.out.println(name);
        return (length * width);
    }
    //sequence of parameter
    public double calculateArea(String name, double length,double width){
        System.out.println(name);
        return (length * width);
    }

//Overloaded functions can have same name and differ in the num. of parameter
// data type of parameter and sequence of parameters
    //but if two function have same name and same parameter format and only differ in return type
// they are NOT considered as overloaded function

    // data type of parameters vary than its an overloaded function
    public int calculateArea(int length){
        return (int)(length * length);
    }
    /*public long calculateArea(int length){
        return (long)(length * length);
    }*/

    public double calculateAreaOfRectangle(double length,double width){
        return (length * width);
    }

    public double calculateAreaOfSquare(long length){
        return (length * length);
    }


}
