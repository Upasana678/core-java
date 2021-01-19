package com.mycompany.stringdemo.stringoperationsmain;

public class StringOperationsMain {
    public static void main(String[] args){
        //Concatenation of strings
        String one = "Hello";
        String two = "World";
        String three = one+" "+two;
        System.out.println(three);

        String text = "\tThis text is one tab in.\r\n";
        System.out.println(text);

        //Usage of substring function
        String hh = "Hello World";
        String substring = hh.substring(0,5);
        System.out.println(substring);

        //Obtain the length of the string
        int l = hh.length();
        System.out.println("Length of the string is "+l);

        //Obtain the index of the substring
        int index = hh.indexOf("World");
        System.out.println(index);
        int index1 = hh.indexOf("Dummy");
        System.out.println("index at which substring starts is "+index1);//Returns -1 because Dummy is not a part of hello world string

        String thestring = "is this good";
        String y = "is";
        int index11 = y.lastIndexOf(substring);
        System.out.println(index11);

        String name = "Upasana";
        String jk = name.substring(1,name.length()-1);
        System.out.println(jk);
        System.out.println(name.length());



    }
}
