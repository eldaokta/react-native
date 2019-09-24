package com.enigma.connection;

import java.sql.*;

public class DBConnection {
    static Connection connection;

    public static Connection letsCreateConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/school",
                    "postgres", "11oktober" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;


    }
}
