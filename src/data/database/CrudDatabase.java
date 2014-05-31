/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.database;

import java.sql.*;
import java.util.ArrayList;
import myObject.*;

/**
 *
 * @author lug13995
 */
public class CrudDatabase {
    
    public static void createApplication(Application application){
        ConnectionSql.getConnection();
        System.out.print("Creation de l'application en base de données");
        System.out.println(application);
    }
    
   
}
