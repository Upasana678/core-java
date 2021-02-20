package com.mycompany.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo {
    public static void main(String[] args)
    {
        String dbURL = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL,username,password);

            String sql = "SELECT * from Users";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            int count = 0;

            while(result.next())//next() checks if the sql query has row or not.If it returns true, it will point to 1st row and fetch the details of that row and then it will go to the next row and do the same.
            {
                String name = result.getString(2);
                String pass = result.getString(3);
                String fullName = result.getString("fullname");
                String email = result.getString("email");

                String format = "User #%d: %s - %s - %s - %s";
                String formattedOutput = String.format(format, ++count, name, pass,fullName, email);

                System.out.println(formattedOutput);
            }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
