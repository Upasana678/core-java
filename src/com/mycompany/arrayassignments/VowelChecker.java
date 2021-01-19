package com.mycompany.arrayassignments;
//Program to check whether a vowel is present in the array or not
import java.util.Scanner;
public class VowelChecker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;//Number of characters in the array
        int flag = 0; //Flag variable to detect vowel in a character array

        //Prompt the user to enter how many characters
        System.out.println("How many characters in the array?");
        n = sc.nextInt();

        //Declaring an array of characters
        char vowels[] = new char[n];

        //Entering the characters in the array
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter the "+(i+1)+" character");
            vowels[i] = sc.next().charAt(0);

        }

        //Logic to find the vowels in the array
        for(int i = 0; i < vowels.length; i++)
        {
            if(vowels[i] == 'a' || vowels[i] == 'A' || vowels[i] =='E' || vowels[i] == 'e' ||vowels[i] == 'i' ||vowels[i]=='I' ||vowels[i] =='o' ||vowels[i] =='O' ||vowels[i] == 'U' || vowels[i] == 'u')
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Vowels are present in the array");
        }
        else
        {
            System.out.println("Vowels are not present in the array");
        }

    }


}

