/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.database;


import static data.IHM.DataIHM.getResponsible;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
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
    
    public static void deleteSegment(Segment segment){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update process SET SEGMENTid = NULL WHERE id = ?";
        for(myObject.Process process : segment.getListProcess()){
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, process.getId());
                preparedStatement.executeUpdate();
            }catch(SQLException e){
                System.out.println(e.toString() + " deleteSegment " + e.getMessage());
            }
        }
        sql = "DELETE FROM segment WHERE segment.id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, segment.getId());
            preparedStatement.execute();
        }catch(SQLException e){
            System.out.println(e.toString() + " deleteSegment " + e.getMessage());
        }
        
    }
    
    
        public static void createProcess(myObject.Process process){
        Connection connection = ConnectionSql.getConnection();
        String sql = "INSERT INTO `process` (`name`, `description`, `validFrom`, `validUntil`, `SEGMENTid`, `Responsibleid`, `ResponsibleidDeputy`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?);";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, process.getName());
            preparedStatement.setString(2, process.getDescription());
            preparedStatement.setDate(3, process.getValidFrom());
            preparedStatement.setDate(4, process.getValideUntil());
            preparedStatement.setInt(5, process.getSegment().getId());
            preparedStatement.setInt(6, process.getResponsible().getId());
            preparedStatement.setInt(7, process.getResponsibleDeputy().getId());
            preparedStatement.execute();
            
        }catch(SQLException e){
            System.out.println(e.toString() + " createProcess " + e.getMessage());
        }
        
    }
    
    public static void updateProcess(myObject.Process process){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update process SET `name = ?, `description` = ?, `validFrom` = ?, `validUntil` = ?, "
                + "`SEGMENTid` = ?, `Responsibleid` = ?, `ResponsibleidDeputy` = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, process.getName());
            preparedStatement.setString(2, process.getDescription());
            preparedStatement.setDate(3, process.getValidFrom());
            preparedStatement.setDate(4, process.getValideUntil());
            preparedStatement.setInt(5, process.getSegment().getId());
            preparedStatement.setInt(6, process.getResponsible().getId());
            preparedStatement.setInt(7, process.getResponsibleDeputy().getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(e.toString() + " updateProcess " + e.getMessage());
        }        
    }
  
    
   
}
