package com.mycompany.practiceday14.polymorpismpractice;

public class AreaMain {
    public static void main(String[] args)
    {
        //Creating an object of Area class
        Area aa = new Area();//Default constructor

        //Calculate area of rectangle when length and breadth are of int data type
        System.out.println("Area of rectangle when length and breadth are of integer data type");
        int areaOfRectangle = aa.calculateArea(12,7);
        System.out.println("Area of rectangle is "+areaOfRectangle);

        //Calculate area of rectangle when length and breadth are of double data type
        System.out.println("Area of rectangle when length and breadth are of double data type");
        double areaOfRectangle1 = aa.calculateArea(3.4,2.3);
        System.out.println("Area of rectangle is "+areaOfRectangle1);

       //Calculate area of square with int data type
       System.out.println("Area of square when length is of integer data type");
       int areaOfSquare = aa.calculateArea("square",5);
       System.out.println("Area of square is "+areaOfSquare);

       //Calculate area of square when length is of double data type
        System.out.println("Area of square when length is of double data type");
        System.out.println("Area of square is "+aa.calculateArea(8.9,"square"));

        //Calculate area of circle when radius is of integer data type
        System.out.println("Area of circle is "+aa.calculateArea(9.8));

    }
}
