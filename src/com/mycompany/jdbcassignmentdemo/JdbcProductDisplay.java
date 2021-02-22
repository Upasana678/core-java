package com.mycompany.jdbcassignmentdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProductDisplay {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = JdbcCategoryInsert.createConnectionToDatabase();

            String sql = "SELECT * FROM products";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while(result.next())
            {
                int productId = result.getInt(1);
                String productName = result.getString(2);
                int categoryId = result.getInt(3);

                String format = "Product Details %d: %d--%s--%d";
                String formattedOutput = String.format(format,++count,productId,productName,categoryId);

                System.out.println(formattedOutput);
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
