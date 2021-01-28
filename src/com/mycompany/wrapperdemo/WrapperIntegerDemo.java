package com.mycompany.wrapperdemo;

//This class demonstrates the methods provided in the Integer Wrapper class
public class WrapperIntegerDemo {
    public static void main(String[] args)
    {
        int n = 35;

        //Conversion of integer number to binary format
        String a = Integer.toBinaryString(n);
        System.out.println("Value of 35 in binary format is "+a);

        //bitCount() returns the number of ones in 2's complement version of the integer value
        int noOf1bits = Integer.bitCount(n);
        System.out.println("No of 1 bits in "+n+" is "+noOf1bits);

        Integer myValue = new Integer(n);

        //byteValue() converts the given number into a primitive byte type and returns the value of integer object as byte
        byte b = myValue.byteValue();
        System.out.println("Value of "+myValue+" in byte format is "+b);

        //hashCode() is a inbuilt java integer class method which returns the hashcode for the given integer value
        int hashcode = myValue.hashCode();
        System.out.println("Hashcode for "+hashcode+" is "+hashcode);

        int number1 = 10;
        int number2 = 20;
        int number3 = 10;

        //Integer.compare() compares two values of integer data type
        //0 if both integers are equal
        //-1 if num1<num2
        //1 if num1>num2
        System.out.println(Integer.compare(number1,number2));//prints -1 as number1 < number2
        System.out.println(Integer.compare(number1,number3));//prints 0 as number1 = number3
        System.out.println(Integer.compare(number2,number3));//prints 1 as number2 > number3
    }
}
