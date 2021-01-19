package com.mycompany.stringdemo;

public class StringBuilderMain {
    public static void main(String[] args){
        //Whenever u want to do string manipulation use String Builder instead of String for better performance
        StringBuilder sb = new StringBuilder("Amit");
        String s1 = sb.toString();
        System.out.println(sb);
        sb.append(" ");
        sb.append("Sharma");
        System.out.println(sb);
        sb.insert(4," Kumar");
        System.out.println(sb);
       // System.out.println(sb.reverse());
        //System.out.println(sb.delete(5,10));
        //System.out.println(sb.reverse());
        System.out.println(sb.replace(5,10,"ku"));


    }
}
