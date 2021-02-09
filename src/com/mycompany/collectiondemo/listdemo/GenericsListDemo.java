package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;
public class GenericsListDemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> empIdList = new ArrayList<Integer>();
        ArrayList<String> nameList = new ArrayList<>();

        empIdList.add(123);
        //empIdList.add("Apple");//Generic enforces strict Datatype constraints on the List for Integer datatype
        nameList.add("Amit");

    }
}
