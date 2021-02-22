package com.mycompany.jdbcassignmentdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcProductDelete {
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = JdbcCategoryInsert.createConnectionToDatabase();

            String sql = "DELETE FROM Products WHERE Product_Id = ?";
            System.out.println("Enter the product Id you want to delete");
            int productId = sc.nextInt();
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,productId);
           int noOfRowsDeleted =  statement.executeUpdate();

           if(noOfRowsDeleted > 0)
           {
               System.out.println("A row was deleted sucessfully");
           }
           else
           {
               System.out.println("No row deleted");
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
