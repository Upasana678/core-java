package com.mycompany.collectiondemo.setdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoOne {
    public static void main(String[] args)
    {
        //Set does not maintain order of insertion
        Set<Integer> rolls1 = new HashSet<>();//allows null value
        Set<Integer> rolls = new TreeSet<>();
        rolls.add(1);
        rolls.add(3);
        rolls.add(5);
        rolls.add(99);

        //rolls.add(null);//Treeset does not allow null value but Hashset allows null value
        for(Integer r : rolls)
        {
            System.out.println(r);
        }
        System.out.println(rolls.size());
        rolls.add(3);
        rolls.add(99);
        System.out.println(rolls.size());//Size remains same as duplicates are overridden
        rolls.remove(99);
        System.out.println(rolls.size());
        rolls.clear();//clears the whole set
        System.out.println(rolls.size());
    }
}
