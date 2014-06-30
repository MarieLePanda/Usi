/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.database;

import static data.database.ConnectionSql.closeConnection;
import java.sql.*;
import myObject.*;

/**
 *
 * @author lug13995
 */
public class CrudDatabase {
    
    public static void connectionUser(User user){
        
        Connection connection = ConnectionSql.getConnection();
        String sql = "SELECT * FROM `user` WHERE name = ? and password = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                launcherUsi.Launcher.userConnected = new User(res.getInt(1), res.getString(2), res.getString(3), res.getBoolean(4), res.getBoolean(5));
            }
        }catch(SQLException e){
            System.out.println("connectionUser " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
    public static void createUser(User user){
        Connection connection = ConnectionSql.getConnection();
        String sql = "INSERT INTO user (name, password, administrator, needChange) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setBoolean(3, user.getAdministrator());
            preparedStatement.setBoolean(4, user.getNeedChange());
            preparedStatement.execute();
            
        }catch(SQLException e){
            System.out.println("createUser " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
    
    public static void updateUser(User user){
        Connection connection = ConnectionSql.getConnection();
        String sql = "UPDATE user SET id = ?, name = ?, password = ?, administrator = ?, needChange = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setBoolean(4, user.getAdministrator());
            preparedStatement.setBoolean(5, user.getNeedChange());
            preparedStatement.setInt(6, user.getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("updateUser " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
    public static void deleteUser(User user) {
        Connection connection = ConnectionSql.getConnection();
        String sql = "DELETE FROM user WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.execute();
            
        }catch(SQLException e){
            System.out.println("deleteUser " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
    public static void createApplication(Application application){
        Connection connection = ConnectionSql.getConnection();
        String sql = "INSERT INTO application (`name`, `description`, `production_date`, `TYPE_APPLICATIONid`, `Responsibleid`, `DATABASEid`, "
                + "`ResponsibleIdDeputy`, `ResponsibleIdDevelopment`, `ResponsibleiIdOperation`, `Lifecycleid`, `decommissionDate`, `investmentCost`, `operatingCost`, "
                + "`NumberOfUser`, `SECURITYidAvailability`, `SECURITYidConfidentiality`, `SECURITYidIntegrity`, `Categoryid`, `SERVERid`, `FITidBusiness`, `FITidIT`, "
                + "`FITidCost`, `STRATEGYidIImportance`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, application.getName());
            preparedStatement.setString(2, application.getDescription());
            preparedStatement.setDate(3, application.getProductionDate());
            preparedStatement.setString(4, application.getTypeApplication());
            preparedStatement.setInt(5, application.getResponsible().getId());
            preparedStatement.setInt(6, application.getDatabase().getId());
            preparedStatement.setInt(7, application.getResponsibleDeputy().getId());
            preparedStatement.setInt(8, application.getResponsibleDevelopment().getId());
            preparedStatement.setInt(9, application.getResponsibleOperation().getId());
            preparedStatement.setInt(10, application.getLifecycle().getId());
            preparedStatement.setDate(11, application.getDecommissionDate());
            preparedStatement.setInt(12, application.getInvestmentCost());
            preparedStatement.setInt(13, application.getOperatingCost());
            preparedStatement.setInt(14, application.getNumberUser());
            preparedStatement.setString(15, application.getSecurityAvailability());
            preparedStatement.setString(16, application.getSecurityConfidentiality());
            preparedStatement.setString(17, application.getSecurityIntegrity());
            preparedStatement.setString(18, application.getCategory());
            preparedStatement.setInt(19, application.getServer().getId());
            preparedStatement.setString(20, application.getFitBusiness());
            preparedStatement.setString(21, application.getFitIT());
            preparedStatement.setString(22, application.getFitCost());
            preparedStatement.setString(23, application.getStrategyImportance());
            
            preparedStatement.execute();
            
        }catch(SQLException e){
            System.out.println(e.toString());
        }finally{
            closeConnection(connection);
        }
        
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
        }finally{
            closeConnection(connection);
        }
        
    }
    
    public static void updateSegment(Segment segment){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update Segment SET name = ?, description = ?, Responsibleid = ?, ResponsibleidDeputy = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(5, segment.getId());
            preparedStatement.setString(1, segment.getName());
            preparedStatement.setString(2, segment.getDescription());
            preparedStatement.setInt(3, segment.getResponsible().getId());
            preparedStatement.setInt(4, segment.getResponsibledeputy().getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("updateSegment " + e.toString());
        }finally{
            closeConnection(connection);
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
        }finally{
            closeConnection(connection);
        }
    }
    
    public static void updateAssoProcessToSegment(myObject.Process process){
        
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "update process SET SEGMENTid = 100 WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, process.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println(e.toString() + " updateAssoProcessToSegment " + e.getMessage());
        }finally{
            closeConnection(connection);
        }
    }
    
    public static void deleteSegment(Segment segment){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update process SET SEGMENTid = 100 WHERE id = ?";
        for(myObject.Process process : segment.getListProcess()){
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, process.getId());
                preparedStatement.executeUpdate();
            }catch(SQLException e){
                System.out.println("deleteSegment 1 " + e.toString());
            }
        }
        sql = "DELETE FROM segment WHERE segment.id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, segment.getId());
            preparedStatement.execute();
        }catch(SQLException e){
            System.out.println("deleteSegment 2 " + e.toString());
        }finally{
            closeConnection(connection);
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
        }finally{
            closeConnection(connection);
        }
        
    }
    
    public static void updateProcess(myObject.Process process){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update process SET name = ?, description = ?, validFrom = ?, validUntil = ?, "
                + "SEGMENTid = ?, Responsibleid = ?, ResponsibleidDeputy = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, process.getName());
            preparedStatement.setString(2, process.getDescription());
            preparedStatement.setDate(3, process.getValidFrom());
            preparedStatement.setDate(4, process.getValideUntil());
            preparedStatement.setInt(5, process.getSegment().getId());
            preparedStatement.setInt(6, process.getResponsible().getId());
            preparedStatement.setInt(7, process.getResponsibleDeputy().getId());
            preparedStatement.setInt(8, process.getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println(" updateProcess " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
    public static void updateAssoCapabilityToProcess(myObject.Process process, Capability capability){
   
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "update capability SET PROCESSid = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, process.getId());
            preparedStatement.setInt(2, capability.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println( "updateAssoCapabilityToProcess " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
  
     public static void updateAssoCapabilityToProcess(Capability capability){
        
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "update capability SET PROCESSid = 100 WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, capability.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println(" updateAssoCapabilityToProcess " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
     public static void deleteProcess(myObject.Process process){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update capability SET PROCESSid = 100 WHERE id = ?";
        for(Capability capability : process.getListCapability()){
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, capability.getId());
                preparedStatement.executeUpdate();
            }catch(SQLException e){
                System.out.println("deleteProcess 1 " + e.toString());
            }
        }
        sql = "DELETE FROM process WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, process.getId());
            preparedStatement.execute();
        }catch(SQLException e){
            System.out.println("deleteProcess 2 " + e.toString());
        }finally{
            closeConnection(connection);
        }
        
    }   
     
    public static void createCapability(Capability capability){
        Connection connection = ConnectionSql.getConnection();
        String sql = "INSERT INTO capability (PROCESSid, name, description, validFrom, validUntil, Responsibleid, ResponsibleidDeputy)"
                + "VALUE (?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, capability.getProcess().getId());
            preparedStatement.setString(2, capability.getName());
            preparedStatement.setString(3, capability.getDescription());
            preparedStatement.setDate(4, capability.getValidFrom());
            preparedStatement.setDate(5, capability.getValideUntil());
            preparedStatement.setInt(6, capability.getResponsible().getId());
            preparedStatement.setInt(7, capability.getResponsibleDeputy().getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("createCapability " + e.toString());
        }finally{
            closeConnection(connection);
        }
        
    }
    
    public static void updateCapability(Capability capability){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update capability SET PROCESSid = ?, name = ?, description = ?, validFrom = ?, validUntil = ?, "
                + "Responsibleid = ?, ResponsibleidDeputy = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, capability.getProcess().getId());
            preparedStatement.setString(2, capability.getName());
            preparedStatement.setString(3, capability.getDescription());
            preparedStatement.setDate(4, capability.getValidFrom());
            preparedStatement.setDate(5, capability.getValideUntil());
            preparedStatement.setInt(6, capability.getResponsible().getId());
            preparedStatement.setInt(7, capability.getResponsibleDeputy().getId());
            preparedStatement.setInt(8, capability.getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("updateCapability " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
    public static void deleteCapability(Capability capability){
        Connection connection = ConnectionSql.getConnection();
        String sql = "DELETE FROM capability_application WHERE CAPABILITYid = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, capability.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println("deleteCapability 1 " + e.toString());
        }finally{
            closeConnection(connection);
        }
        connection = ConnectionSql.getConnection();
        sql = "DELETE FROM capability WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, capability.getId());
            preparedStatement.execute();
        }catch(SQLException e){
            System.out.println("deleteCapability 2 " + e.toString());
        }finally{
            closeConnection(connection);
        }
        
    }
    public static void createResponsible(Responsible responsible){
        Connection connection = ConnectionSql.getConnection();
        String sql = "INSERT INTO responsible (id, nom)"
                + "VALUE (NULL,?)";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //preparedStatement.setInt(1, responsible.getId());
            preparedStatement.setString(1, responsible.getName());
            preparedStatement.execute();
            
        }catch(SQLException e){
            System.out.println("createResponsible " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
    
        public static void deleteResponsible(Responsible responsible){
        Connection connection = ConnectionSql.getConnection();
        String sql = "DELETE FROM Responsible WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, responsible.getId());
            preparedStatement.executeUpdate();
        }catch(SQLException e){
            System.out.println("deleteResponsible " + e.toString());
        }finally{
            closeConnection(connection);
        }
        
        
    }
            public static void updateResponsible(Responsible responsible){
        Connection connection = ConnectionSql.getConnection();
        String sql = "update responsible SET nom = ? WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, responsible.getName());
            preparedStatement.setInt(2, responsible.getId());
            preparedStatement.executeUpdate();
            
        }catch(SQLException e){
            System.out.println("updateResponsible " + e.toString());
        }finally{
            closeConnection(connection);
        }
    }
}
