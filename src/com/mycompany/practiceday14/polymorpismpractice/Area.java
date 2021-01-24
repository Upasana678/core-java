package com.mycompany.practiceday14.polymorpismpractice;

//Concept of overloading
//Calculate area of rectangle,square,circle
public class Area {

    //Calculate area of rectangle when length and breadth are of double data type
    public double calculateArea(double length,double breadth)
    {
        return (length * breadth);
    }

    //Calculate area of rectangle when length and breadth are of int data type
    public int calculateArea(int length,int breadth)
    {
        return (length * breadth);
    }

    //Calculate area of square when length is of int data type
    public int calculateArea(String name,int length)
    {
        System.out.println("Calculating area of "+name+" when length is of int datatype");
        return (length * length);
    }

    //Calculate area of square when length and breadth are of int data type
    public double calculateArea(double length,String name)
    {
        System.out.println("Calculating area of "+name+" when length is of double datatype");
        return (length * length);
    }

    //Calculate area of circle

    public double calculateArea(double radius)
    {
        System.out.println("Calculating area of circle");
        return (3.14 * radius * radius);
    }


}
