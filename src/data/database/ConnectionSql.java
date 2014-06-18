/**
 * Technical class to manage the connection to the database
 */
package data.database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mary
 */
public class ConnectionSql {
    private static Connection connexion;
    /**
     * Returns a connection in admin mode database
     * @return object Connection
     */
    public static Connection getConnection(){
        
        if(connexion == null){
            try {
                Class.forName( "com.mysql.jdbc.Driver" );
            } catch ( ClassNotFoundException e ) {
                    System.out.println(e.getMessage());
            }

            String url = "jdbc:mysql://localhost:3306/archipandaV2";
            String user = "root";
            String password = "";
            try {
                connexion = DriverManager.getConnection( url, user, password );


            } catch ( SQLException e ) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"getConnection " + e.toString());
            } 
        }
<<<<<<< HEAD
        
        String url = "jdbc:mysql://localhost:3306/Usi";
        String user = "root";
        String password = "igjjr";
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection( url, user, password );

            
        } catch ( SQLException e ) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"getConnection " + e.toString());
        } 
=======
>>>>>>> origin/master
        return connexion;
    }
}
