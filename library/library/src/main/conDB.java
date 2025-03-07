package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class conDB {

    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "books";
        String dbURL = dbRoot+hostName+dbName;
        
        String hostUsername = "root";
        String hostPassword = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConn = (Connection)DriverManager.getConnection(dbURL, hostUsername, hostPassword);
            return myConn;
        }catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
}
