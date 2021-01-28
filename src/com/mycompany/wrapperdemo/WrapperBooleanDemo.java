package com.mycompany.wrapperdemo;

public class WrapperBooleanDemo {
    public static void main(String[] args)
    {
        //logicalAnd(boolean a,boolean b) performs a AND operation on the arguments passed
        Boolean b1 = true;
        Boolean b2 = false;
        Boolean b3 = Boolean.logicalAnd(b1,b2);
        System.out.println("Value of b3 after performing logical and operation on "+b1+" and "+b2+" is "+b3);

        //compare(x,y) compares two boolean values
        //0 if x==y
        //positive value if x is true and y is false
        int b4 = Boolean.compare(b1,b2);
        System.out.println(b4);//prints 1 as b1 is true and b2 is false
        int b5 = Boolean.compare(b2,b1);
        System.out.println(b5);//prints -1 as b2 is false and b1 is true
        int b6 = Boolean.compare(b1,b1);
        System.out.println(b6);//prints 0 as b1 is true and b1 is true


    }
}
