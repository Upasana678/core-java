package com.mycompany.jdbcassignmentdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcCategoryUpdate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = JdbcCategoryInsert.createConnectionToDatabase();

            String sql = "UPDATE Category SET Category_Name = ? WHERE Category_Id = ?";
            int categoryId;
            System.out.println("Enter the category you want to update:");
            categoryId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter category Name:");
            String categoryName = sc.nextLine();

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(2,categoryName);
            statement.setInt(1,categoryId);

            int noOfRowsUpdated = statement.executeUpdate();

            if(noOfRowsUpdated > 0)
            {
                System.out.println("Rows updated sucessfully");
            }
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(ClassNotFoundException ces)

        {
            ces.printStackTrace();
        }

    }

}
