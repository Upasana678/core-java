package com.mycompany.jdbcassignmentdemo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcCategoryDisplay {
    public static void main(String[] args)
    {

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = JdbcCategoryInsert.createConnectionToDatabase();

            String sql = "SELECT * FROM Category";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);

            int id = 0;
            String categoryName = null;
            int count = 0;

            System.out.println("Category Details are:-");

            while(result.next())
            {
                id = result.getInt(1);
                categoryName = result.getString(2);

                String format = "Category %d:- %d--%s";
                String formattedOutput = String.format(format, ++count, id,categoryName);
                System.out.println(formattedOutput);

            }

        }
        catch(SQLException ee)
        {
            ee.printStackTrace();
        }
        catch(ClassNotFoundException cex)
        {
            cex.printStackTrace();
        }
    }

}
