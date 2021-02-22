package com.mycompany.jdbcassignmentdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

public class JdbcProductUpdate {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);//Creating an object of Scanner Class

       try
       {
           Class.forName("com.mysql.jdbc.Driver");//tries to find the name of the Driver Class for running mysql Database and then it will create an object of Driver class at runtime

           //Creating a connection to the database
           Connection connection = JdbcCategoryInsert.createConnectionToDatabase();
           //Creating a sql statement
           String sql = "UPDATE products SET Product_Name = ?,Category_Id = ? WHERE Product_Id = ?";
           PreparedStatement statement = connection.prepareStatement(sql);

           //Asking user Product Name,categoryId and ProductId
           System.out.println("There are 2 categories 1-Shampoo, 2-Soap");
           System.out.println("Enter the category ID:-");
           int categoryId = sc.nextInt();
           sc.nextLine();
           System.out.println("Enter the product Name:-");
           String productName = sc.nextLine();
           System.out.println("Enter the product ID you wish to update:-");
           int productId = sc.nextInt();

           //Setting the values to the sql statement
           statement.setString(1,productName);
           statement.setInt(2,categoryId);
           statement.setInt(3,productId);

           //Running the sql Query
           int rowsUpdated = statement.executeUpdate();

           if(rowsUpdated > 0)
           {
               System.out.println("A row was updated sucessfully");
           }
           else
           {
               System.out.println("Sorry! The data which you want to update is not present in the database");
           }
       }
       catch(SQLException se)
       {
           se.printStackTrace();
       }
       catch(ClassNotFoundException cex)
       {
           cex.printStackTrace();
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }
}
