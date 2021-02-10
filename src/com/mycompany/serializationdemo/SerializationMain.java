package com.mycompany.serializationdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args)
    {
        Product product = new Product(1,"Shampoo",100.0);
        Product product2 = new Product(2,"Biscuit",25.0);
        String fileName = "product2.ser";


        //Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            //Method to serialize the object
            out.writeObject(product2);
            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch(FileNotFoundException fnf)
        {
            fnf.printStackTrace();

        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();

        }
    }
}
