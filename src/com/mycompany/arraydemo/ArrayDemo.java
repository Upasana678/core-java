package com.mycompany.arraydemo;

public class ArrayDemo {
    public static void main(String[] args){
        int arrayOfAadhar[] = new int[5];
        System.out.println(arrayOfAadhar[3]);//Output is 0 because default value of int is 0
        arrayOfAadhar[3] = 25568;

        //Printing aadhar Details
        for(int i = 0; i < arrayOfAadhar.length; i++){
            System.out.println(arrayOfAadhar[i]);
        }
        for(int a:arrayOfAadhar){//It is an enhanced for loop
            System.out.println(a);
        }
        /*
        boolean arrayIsEmployee[] = new boolean[5];
        System.out.println(arrayIsEmployee[3]);//Output is false because default value of boolean is false
        arrayIsEmployee[3] = true;
        arrayIsEmployee[8] = true;//This will throw runtime exception ArrayIndexOutOfBounds

        //Printing aadhar Details
        for(int i = 0; i < arrayIsEmployee.length; i++){
            System.out.println(arrayIsEmployee[i]);
        }
        */

    }
}
