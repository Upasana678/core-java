package com.mycompany.filedemo;

import java.io.IOException;
import java.io.FileWriter;
public class WriteToFile {
    public static void main(String[] args)
    {
        try
        {
            FileWriter myWriter = new FileWriter("Demo1.txt");

            //Writes this content to the specified file
            myWriter.write("Java is the prominent language of the millenium.");

            //Closing the file
            myWriter.close();
            System.out.println("Sucessfully wrote to the file");

        }
        catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();

        }
    }
}
