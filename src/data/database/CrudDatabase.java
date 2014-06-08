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
    
    
    public static void createSegment(Segment segment){
        Connection connection = ConnectionSql.getConnection();
        String sql = "INSERT INTO `segment` ( `name`, `description`, `Responsibleid`, `ResponsibleidDeputy`) VALUES" +
                        "(?, ?, ?, ?);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, segment.getName());
            preparedStatement.setString(2, segment.getDescription());
            preparedStatement.setInt(3, segment.getResponsible().getId());
            preparedStatement.setInt(4, segment.getResponsibledeputy().getId());
            preparedStatement.execute();
            
        }catch(SQLException e){
            System.out.println(e.toString() + " " + e.getMessage());
        }
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
            System.out.println(e.toString() + " " + e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.toString() + " " + e.getMessage());
        }
        
    }
    
    public static void updateAssoProcessToSegment(Segment segment, myObject.Process process){
        
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "update process SET SEGMENTid = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, segment.getId());
            preparedStatement.setInt(2, process.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.toString() + " " + e.getMessage());
        }
    }
    
    public static void updateAssoProcessToSegment(myObject.Process process){
        
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "update process SET SEGMENTid = NULL WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, process.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.toString() + " updateAssoProcessToSegment " + e.getMessage());
        }
    }
        
   
}
