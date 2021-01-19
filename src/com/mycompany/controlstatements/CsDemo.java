package com.mycompany.controlstatements;

public class CsDemo {
    public static void main(String[] args){
        char grade = 'O';
        switch(grade){
            case 'S' :
                System.out.println("You are a senior");
                break;
            case 'M' :
                System.out.println("You are a Manager");
                break;
            case 'J' :
                System.out.println("You are a Junior");
                break;
            default :
                System.out.println("You are a unknown employee");
                break;

        }
    }
}
