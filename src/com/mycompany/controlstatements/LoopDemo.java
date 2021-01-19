package com.mycompany.controlstatements;

public class LoopDemo {
    public static void main(String[] args){
        //Printing Odd numbers starting from 1 to 100
        /*for(int i = 1; i <= 100; i = i + 2){
            System.out.println(i);
        }
        */
// Intialisation happens once , condition checking then execution of the body
        //From next iteration onwards,increment then condition checking then execution and same gets repeated until condition fails.
        //Printing even numbers starting from 1 to 100
        int j = 2; //Initialisation step
        /*while(j <= 100){ //Condition Checking
            System.out.println(j);//execution step
            j = j+2;//Increment Step
        }*/
        int i = 1;//initialisation
        do {
            i++;//Increment
            System.out.println(i);//Execution
            //i++;//Increment
        }while(i <= 10);//Condition Checking

    }
}
