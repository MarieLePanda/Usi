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
    
    public static void updateSegment(Segment segment){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update Segment SET id = ?, name = ?, description = ?, Responsibleid = ?, ResponsibleidDeputy = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, segment.getId());
            preparedStatement.setString(2, segment.getName());
            preparedStatement.setString(3, segment.getDescription());
            preparedStatement.setInt(4, segment.getResponsible().getId());
            preparedStatement.setInt(5, segment.getResponsibledeputy().getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("Erreur data.database.CrudDatabase.updateSegment " + e.getMessage());
        }catch(NullPointerException e){
            System.out.println("Erreur data.database.CrudDatabase.updateSegment " + e.getMessage());
        }
        
    }
    
   
}
