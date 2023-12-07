package com;
import java.sql.*;

public class DatabaseC {
    static final String dbUrl = "jdbc:mysql://localhost:3306/uas";
    static final String user = "root";
    static final String pass = "";
    
    public static Connection connectDB(){
        
        Connection cnc = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //membuat connection
            cnc = DriverManager.getConnection(dbUrl, user, pass);
            return cnc;
        }catch(Exception ex){
            System.out.println("Ada kesalahan saat menghubungkan ke db.");
            return null;
        }
    }
}
