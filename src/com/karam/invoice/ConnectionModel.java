package com.karam.invoice;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionModel {
    Connection connection;
    public ConnectionModel()
    {
        connection = SQLiteConnection.Connector();
        if(connection == null)
            System.exit(1);
    }
    public boolean isDBConnected()
    {
        try{
            return !connection.isClosed();
        }catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
