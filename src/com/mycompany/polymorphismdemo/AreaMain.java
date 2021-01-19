package com.mycompany.polymorphismdemo;

public class AreaMain {
    public static void main(String[] args){
        Area aa = new Area();
        double area = aa.calculateArea(9.8);
        System.out.println("Area of Circle is "+area);
        System.out.println("Area of Rectangle is "+aa.calculateArea(2.5,7.5));
        System.out.println("Area of Rectangle is with name "+aa.calculateArea(2.5,7.5, "String last param"));
        System.out.println("Area of Rectangle is with name "+aa.calculateArea("String 1st param", 2.5,7.5));
        System.out.println("Area of Square is "+aa.calculateArea(90));

    }
}
