package com.mycompany.wrapperdemo;

public class WrapperMain {
    public static void main(String[] args){
        //Examples of wrapper Classes
        Integer num = 10;
        Integer num2 = new Integer(12345);

        Double salary = 23454.34;

        Float a = 2345.3f;

        Long ln = 2345672L;

        Character c = 'A';

        Boolean b = new Boolean(true);

        String roll = "1234";
        Integer r = Integer.parseInt(roll);
        Double d = Double.parseDouble(roll);
        System.out.println(r);
        System.out.println(d);
    }
}
