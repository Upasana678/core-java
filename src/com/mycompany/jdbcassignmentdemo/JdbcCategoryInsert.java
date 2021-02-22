package com.mycompany.jdbcassignmentdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class JdbcCategoryInsert {

    public static Connection createConnectionToDatabase()
    {
        String dbURL = "jdbc:mysql://localhost:3306/product";
        String username = "root";
        String password = "";
        Connection con = null;
        try{
            con = DriverManager.getConnection(dbURL, username, password);
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
            return con;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);//Creates a scanner Object
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = createConnectionToDatabase();

            String sql = "INSERT INTO Category(Category_Id,Category_Name) VALUES(?,?)";
            int categoryId;
            String categoryName;

            //It prompts the user to enter categoryID and categoryName
            System.out.println("Enter the category ID:-");
            categoryId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the category Name:-");
            categoryName = sc.nextLine();

            //Create a statement
            PreparedStatement statement = connection.prepareStatement(sql);

            //These lines 48 and 49 initialises one row of the table Category present in database product.
            statement.setInt(1,2);
            statement.setString(2,categoryName);

            //Execute the query and inserts one record into the category table
            int noOfRowsInserted = statement.executeUpdate();

            if(noOfRowsInserted > 0)
            {
                System.out.println("A row was inserted sucessfully");
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException cex)
        {
            cex.printStackTrace();
        }


    }
}
