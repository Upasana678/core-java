package com.mycompany.jdbcassignmentdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcProductInsert {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = JdbcCategoryInsert.createConnectionToDatabase();

            String sql = "INSERT INTO products(Product_Id,Product_Name,Category_Id) VALUES(?,?,?)";

            int productId;
            String productName;
            int categoryId;

            //Takes user Input
            System.out.println("Enter the Product ID:-");
            productId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Product Name:-");
            productName = sc.nextLine();
            System.out.println("Enter the category Id:-");
            categoryId = sc.nextInt();

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,productId);
            statement.setString(2,productName);
            statement.setInt(3,categoryId);

            int noOfRowsInserted = statement.executeUpdate();

            if(noOfRowsInserted > 0)
            {
                System.out.println("One row of product table inserted sucessfully");
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
    }
}
