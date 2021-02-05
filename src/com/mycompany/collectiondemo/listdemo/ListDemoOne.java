package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;
public class ListDemoOne {
    public static void main(String[] args)
    {
        //List allows duplicate items
        //List allows duplicate order
        //Raw List allows to add any datatype
        //ArrayList will automatically grow in size as we add new items to it.
        ArrayList numberlist = new ArrayList();
        numberlist.add("YELLOW Ball");
        numberlist.add("Blue Ball");
        numberlist.add("YELLOW Ball");
        numberlist.add("PINK Ball");
        numberlist.add("PURPLE Ball");
        numberlist.add(88.975);
        numberlist.add("BLUE Ball");
        numberlist.add(2005);

        for(int i = 0; i < numberlist.size(); i++)
        {
            System.out.println("COLOR BALLS: "+numberlist.get(i));
        }




    }
}
