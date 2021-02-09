package com.mycompany.filedemo;

import java.io.File;
import java.io.IOException;
public class CreateFile {
    public static void main(String[] args)
    {
        try
        {
            //Creating an object of a file
            File myObj = new File("Demo1.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File created: "+myObj.getName());
                System.out.println("Path: "+myObj.getAbsolutePath());
                System.out.println("Path: "+myObj.getCanonicalPath());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();

        }
    }
}
