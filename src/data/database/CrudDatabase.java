/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.database;

import myObject.Application;

/**
 *
 * @author lug13995
 */
public class SqlDatabase {
    
    public static void createApplication(Application application){
        
        System.out.print("Creation de l'application en base de données");
        System.out.println(application);
    }
}
