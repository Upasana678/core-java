package com.mycompany.filedemo;

import java.io.IOException;
import java.io.File;
public class FileInformation {
    public static void main(String[] args)
    {
        //Creating an object of a file
        File myObj = new File("Demo1.txt");
        if(myObj.exists())
        {
            //Returning the file name
            System.out.println("File Name: "+myObj.getName());

            //Returning the path of the file
            System.out.println("Absolute Path: "+myObj.getAbsolutePath());

            //Displaying whether the file is writable or not
            System.out.println("Writable: "+myObj.canWrite());

            //Displaying whether the file is readable or not
            System.out.println("Readable is: "+myObj.canRead());

            //Returning the length of the file in bytes
            System.out.println("File size: "+myObj.length());
        }
        else
        {
            System.out.println("The File does not exist");
        }

    }
}
