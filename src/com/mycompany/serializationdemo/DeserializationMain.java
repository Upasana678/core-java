package com.mycompany.serializationdemo;

import com.mycompany.filedemo.FileInformation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationMain {
    public static void main(String[] args)
    {
        Product product = null;
        String fileName = "product2.ser";

        try
        {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream obj = new ObjectInputStream(file);

            //Method of deserialization the object
            product = (Product)obj.readObject();// Deserialization creates new object and assign values to it

            obj.close();
            file.close();

            System.out.println("Object has been deserialized");

            System.out.println("ProductId = "+product.getProductId());
            System.out.println("ProductName = "+product.getProductName());
            System.out.println("ProductPrice = "+product.getProductPrice());

        }
        catch(IOException ex)
        {
            System.out.println("IO Exception has been caught");
        }
        catch(ClassNotFoundException ces)
        {
            System.out.println("Class Not Found Exception has been caught");
        }
    }
}
