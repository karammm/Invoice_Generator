package com.karam.invoice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {

    public static Connection Connector()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\Database SQLITE\\testjava.sqlite");
            return conn;
        } catch(SQLException | ClassNotFoundException e)
        {
            System.out.println("Something went wrong" +e.getMessage());
            return null;
        }
    }
}
