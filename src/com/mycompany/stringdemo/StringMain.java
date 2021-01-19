package com.mycompany.stringdemo;

public class StringMain {
    public static void main(String[] args){
        String s1 = "John";
        String s2 = "John";
        String s3 = new String("John");
        String s4 = new String("John");
        //Checking references using == operator whether these references are pointing to the same object or not.
        if(s1 == s2){//s1 and s2 are references pointing to the same object in string pool.
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 and s2 are not equal");
        }

        if(s1 == s3){//s1 references object in string pool area wheras s3 references object in heap area.
            System.out.println("s1 and s3 are equal");
        }
        else{
            System.out.println("s1 and s3 are not equal");
        }
        if(s4 == s3){//s1 references object in string pool area wheras s3 references object in heap area.
            System.out.println("s4 and s3 are equal");
        }
        else{
            System.out.println("s4 and s3 are not equal");
        }

        //.equals() always checks values

        if(s1.equals(s2)){
            System.out.println("s1 and s2 are equal using equals method");
        }
        else{
            System.out.println("s1 and s2 are not equal using equal method");
        }

        if(s1.equals(s3)){
            System.out.println("s1 and s3 are equal using equals method");
        }
        else{
            System.out.println("s1 and s3 are not equal using equal method");
        }

        if(s4.equals(s3)){
            System.out.println("s4 and s3 are equal using equals method");
        }
        else{
            System.out.println("s4 and s3 are not equal using equal method");
        }
        if(s4.equalsIgnoreCase(s3)){//Ignores the case while checking value of the string and equality
            System.out.println("s4 and s3 are equal using equals method");
        }
        else{
            System.out.println("s4 and s3 are not equal using equal method");
        }
    }
}
