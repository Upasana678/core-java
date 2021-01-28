package com.mycompany.wrapperdemo;

public class WrapperDoubleDemo {
    public static void main(String[] args)
    {
        //byteValue() method converts double object value to a primitive byte value
        Double d1  = new Double(5.67);
        byte d1ToByte = d1.byteValue();
        System.out.println("Byte value of "+d1+" is "+d1ToByte);

        //toCompare() method compares two double values
        Double d2 = 8.99;
        Double d3 = 7.96;
        Double d4 = 8.99;

        System.out.println(Double.compare(d2,d3));//prints 1 as d2 > d3
        System.out.println(Double.compare(d3,d4));//prints -1 as d3 < d4
        System.out.println(Double.compare(d2,d4));//prints 0 as d2 < d4

        //intValue() converts double value to integer
        int v1 = d2.intValue();
        System.out.println("Integer format of "+d2+" is "+v1);

        //The doubleToLongBits(double value) method returns the bits that represent the floating-point number
        //according to IEEE 754 floating-point "double format" bit layout.

        float as = Double.doubleToLongBits(d2);
        System.out.println("Float representation of Double value "+d2+" is "+as);

        String s1 = d2.toString();//converts Double object to its string representation
        System.out.println("String representation of "+d2+" is "+s1);


    }
}
