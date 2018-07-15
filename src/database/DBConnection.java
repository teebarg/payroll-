/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADENIYI
 */
public class DBConnection {
    private static final String host="jdbc:mysql://localhost:3306/prime";
    private static final String user="root";
    private static final String password="";
    static Connection con;
    
    public static Connection getConnection(){
        try {
            con = DriverManager.getConnection(host, user, password);
            System.out.println("Connection Established Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
