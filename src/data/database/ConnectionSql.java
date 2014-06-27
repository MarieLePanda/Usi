/**
 * Technical class to manage the connection to the database
 */
package data.database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Mary
 */
public class ConnectionSql {
    private static Connection connexion;
    private static String[] conf = new String[4];
    
    /**
     * Returns a connection in admin mode database
     * @return object Connection
     */
    public static Connection getConnection(){
        if(conf[1] == null || conf[2] == null){
            conf[0] = "jdbc:mysql://";
            conf[1] = "";
            conf[2] = "";
            conf[3] = "";
            
           	try {
                    FileReader fichierLecture = new FileReader("C:\\Users\\lug13995\\Documents\\GitHub\\Usi\\src\\conf\\conf.txt");
                    //C:\Users\lug13995\Documents\GitHub\Usi\src\conf\conf.txt
                    //.\conf\conf.txt
                    BufferedReader fichier = new BufferedReader(fichierLecture);
                    String ligne;
                    int i = 0;
                    while ((ligne = fichier.readLine()) != null){
                        conf[i] += ligne;
                        i++;
                    }
                    fichierLecture.close();
                }
                catch (FileNotFoundException e1) {
                    e1.getMessage();
                }

                catch (IOException e) {
                    e.getMessage();
                }
        }

        if(connexion == null){
            try {
                Class.forName( "com.mysql.jdbc.Driver" );
            } catch ( ClassNotFoundException e ) {
                    System.out.println(e.getMessage());
            }

            try {
                System.out.println("DEBUG"+conf[0]);
                System.out.println("DEBUG"+conf[1]);
                System.out.println("DEBUG"+conf[2]);
                System.out.println("DEBUG"+conf[3]);
                connexion = DriverManager.getConnection( conf[0] + "/" + conf[1], conf[2], conf[3] );


            } catch ( SQLException e ) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"getConnection " + e.toString());
            } 
        }

        return connexion;
    }
}
