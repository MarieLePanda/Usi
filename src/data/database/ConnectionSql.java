/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.database;

import java.sql.*;

/**
 *
 * @author lug13995
 */
public class ConnectionSql {
    
    
    public static Connection getConnection(){

        try {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch ( ClassNotFoundException e ) {
                System.out.println(e.getMessage());
        }
        
        String url = "jdbc:mysql://localhost:3306/archipandaV2";
        String user = "root";
        String password = "";
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection( url, user, password );

            
        } catch ( SQLException e ) {
            System.out.println(e.getMessage());
        } 
        return connexion;
    }
}
