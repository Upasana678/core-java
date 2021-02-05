package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListDemo2 {
    public static void main(String[] args)
    {
        List<String> fruitsList = new ArrayList<String>();
        fruitsList.add("Mango"); //adds a string to the list
        fruitsList.add("Apple");
        fruitsList.add("Papaya");
        fruitsList.add(null); //allows to add a null value

        System.out.println(fruitsList.get(1)); //Gets the list item at index 1
        fruitsList.add(1,"Grapes");//Adds new element grapes at index 1
        System.out.println(fruitsList.get(2));
        System.out.println(fruitsList.size());
        System.out.println(fruitsList.remove("Apple"));//It removes the element Apple
        fruitsList.set(2,"Orange");//Replace element in index 2 with orange

        for(String a : fruitsList)
        {
            System.out.println(a);
        }
        if(fruitsList.contains("Mango"))
        {
            System.out.println("It is present");
        }
        else{
            System.out.println("It is not present");
        }
        if(fruitsList.isEmpty())
        {
            System.out.println("It is empty");
        }
        else
        {
            System.out.println("List is not empty");
        }

        fruitsList = new LinkedList<>();


    }
}
