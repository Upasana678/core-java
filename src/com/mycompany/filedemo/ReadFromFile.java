package com.mycompany.filedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile {
    public static void main(String[] args)
    {
        try
        {
            //Creating an object of the file to read data
            File myFile = new File("Demo1.txt");
            Scanner myReader = new Scanner(myFile);

            while(myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
