package com.mycompany.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Definition of a driver - Driver is a set of classes through which we interact with different types of databases.
public class JdbcInsertDemo {
    public static void main(String[] args)
    {
        String dbURL = "jdbc:mysql://localhost:3306/foodapp";
        String username = "root";
        String password = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");//Creates a Driver Object for interacting with mysql database,
            //different databases have different types of drivers Example - Oracle,MSSQL SERVER Oracle will have a different driver
            Connection conn = DriverManager.getConnection(dbURL,username,password);//Creates a connection to mysql database server by taking dburl,password,user parameters
            String sql = "INSERT INTO Users (username,password,fullname,email) VALUES (?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            //statement.setString(1,2,3,4) inserts data into one row.
            statement.setString(1,"Rishi");
            statement.setString(2,"Rishi@#");
            statement.setString(3,"Rishi Ghosh");
            statement.setString(4,"Rishi.Ghosh@gmail.com");

            int rowsInserted = statement.executeUpdate();//It will execute the query
            if(rowsInserted > 0)
            {
                System.out.println("A new user was inserted sucessfully");
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
