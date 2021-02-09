package com.mycompany.collectiondemo.mapdemo;

import java.util.HashMap;
import java.util.Map;
public class MapDemoOne {
    public static void main(String[] args)
    {
        Map<Integer,String> mapOfEmployee = new HashMap<>();
        mapOfEmployee.put(111,"John");//Map.Entry<Integer,String>
        mapOfEmployee.put(555,"Alex");//Map.Entry<Integer,String>
        mapOfEmployee.put(333,"Peter");//Map.Entry<Integer,String>
        mapOfEmployee.put(444,"Joe");//Map.Entry<Integer,String>
        mapOfEmployee.put(null,null);//Map.Entry<Integer,String>
        mapOfEmployee.put(null,null);//Map.Entry<Integer,String>
        //At line 14 if key n value is same it overrides the whole entry of the map
        mapOfEmployee.put(null,"Ram");//Map.Entry<Integer,String>
        mapOfEmployee.put(777,null);//Map.Entry<Integer,String>
        //At line 16 and line 17,null is allowed in key as well as value

        //At line 22,Map.Entry is used because we are iterating throughout the whole set(set means a collection of (integer,string)
        //Map.Entry is like a element in a set
        for(Map.Entry<Integer,String> m : mapOfEmployee.entrySet())//entrySet() size of the whole set
        {
            System.out.println(m.getKey()+" "+m.getValue());
            if(m.getValue() != null && m.getValue().equals("Alex") )
            {
                System.out.println("Found Alex at key "+m.getKey());
            }
        }
        System.out.println(mapOfEmployee.get(333));
        System.out.println(mapOfEmployee.size());//Similarly there are other functions like contains value,keys remove,replace,remove all etc
    }

}
