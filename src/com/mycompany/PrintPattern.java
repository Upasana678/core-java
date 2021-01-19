package com.mycompany;
//Program to print star pattern

public class PrintPattern {
    public static void main(String[] args){

        //logic to print star pattern
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
