package com.mycompany.arrayassignments;
//Program to generate fibonacci series
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int first_term = 0;//First Term of the fibonacci series
        int second_term = 1;//Second Term of the fibonacci series
        int third_term;//Second term of the fibonacci series
        int n; //No of fibonacci terms to generate

        //Prompt the user to generate fibonacci series
        System.out.println("How many fibonacci terms to generate?");
        n = sc.nextInt();

        System.out.print(first_term+" ");
        System.out.print(second_term+" ");
        for(int i = 1; i<=n; i++)
        {
          third_term = first_term + second_term;
          System.out.print(third_term+" ");
          first_term = second_term;
          second_term = third_term;

        }
        System.out.println();




    }
}
