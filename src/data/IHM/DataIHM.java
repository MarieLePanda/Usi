/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.IHM;

import data.database.ConnectionSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import myObject.*;


/**
 *
 * @author lug13995
 */
public class DataIHM {
    
    public static DefaultMutableTreeNode initTree(){
        
        //Root/
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Meta-model");
        DefaultMutableTreeNode viewFunction = new DefaultMutableTreeNode("Objet fonctionnel");
        DefaultMutableTreeNode viewApplication = new DefaultMutableTreeNode("Objet applicatif");
        DefaultMutableTreeNode viewTechnologique = new DefaultMutableTreeNode("objet technologique");
        root.add(viewFunction);
        root.add(viewApplication);
        root.add(viewTechnologique);
        
        //Root/Function
        viewFunction.add(loadTreeSegment());
        viewFunction.add(loadTreeProcess());
        viewFunction.add(loadTreeCapability());
        //Root/Application
        viewApplication.add(loadTreeApplication());
        viewApplication.add(loadTreeInterface());

        //Root/Technologique/
        viewTechnologique.add(loadTreeServer());
        viewTechnologique.add(loadTreeDatabase());
        viewTechnologique.add(loadTreeTechnology()); 

        return root;
    }
    
    public static DefaultMutableTreeNode loadTreeSegment(){
       DefaultMutableTreeNode segment = new DefaultMutableTreeNode(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             "Zone");
       Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM segment";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                segment.add(new DefaultMutableTreeNode(new Segment(
                        res.getInt(1), res.getString(2),res.getString(3), getResponsible(res.getInt(4)),
                        getResponsible(res.getInt(5)), new ArrayList<myObject.Process>())));
            }
        }catch(SQLException e){
            System.out.println("Function loadTreeSegment : " + e.getMessage());
        }
        
       return segment;
    }
    
    public static DefaultMutableTreeNode loadTreeProcess(){
        DefaultMutableTreeNode process = new DefaultMutableTreeNode("Quartier");
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM process";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                process.add(new DefaultMutableTreeNode(new myObject.Process(
                        res.getInt(1), res.getString(2),res.getString(3), res.getDate(4), res.getDate(5), null,
                        getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Capability>())));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return process;
    }
    
    public static DefaultMutableTreeNode loadTreeCapability(){
        DefaultMutableTreeNode capability = new DefaultMutableTreeNode("Ilot");
        
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM capability";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                capability.add(new DefaultMutableTreeNode(new Capability(
                        res.getInt(1), null, res.getString(3), res.getString(4),
                        res.getDate(5), res.getDate(6), getResponsible(res.getInt(7)),
                        getResponsible(res.getInt(8)), new ArrayList<Application>())));
            }
        }catch(SQLException e){
            System.out.println("Function loadTreeCaâbility : " + e.getMessage());
        }
        return capability;
    }
    
    public static DefaultMutableTreeNode loadTreeInterface(){
        DefaultMutableTreeNode appInterface = new DefaultMutableTreeNode("Interface");
        
        return appInterface;
    }
    
    public static DefaultMutableTreeNode loadTreeServer(){
        DefaultMutableTreeNode server = new DefaultMutableTreeNode("Serveur");
        
        return server;
        
    }
    
    public static DefaultMutableTreeNode loadTreeDatabase(){
        DefaultMutableTreeNode database = new DefaultMutableTreeNode("base de donnée");
        
        return database;
    }
    
    public static DefaultMutableTreeNode loadTreeTechnology(){
        DefaultMutableTreeNode technology = new DefaultMutableTreeNode("Technologie");
        
        return technology;
    }
    
    public static DefaultMutableTreeNode loadTreeApplication(){
        DefaultMutableTreeNode application = new DefaultMutableTreeNode("Application");
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM application";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                application.add(new DefaultMutableTreeNode(new Application(
                        res.getInt(1), res.getString(2), res.getString(3),
                        res.getDate(4), res.getString(5), getResponsible(res.getInt(6)), getResponsible(res.getInt(7)), 
                        getResponsible(res.getInt(8)), getResponsible(res.getInt(9)),
                        getLifecycle(res.getInt(10)), null, res.getDate(12), res.getInt(13), res.getInt(14),
                        res.getInt(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), null, res.getString(21),
                        res.getString(22), res.getString(23), res.getString(24), new ArrayList<Capability>(), new ArrayList<Application>(), 
                        new ArrayList<Application>(), new ArrayList<Interface>(), new ArrayList<Interface>(), new ArrayList<Technology>())));
            }
        }catch(SQLException e){
            System.out.println("Function loadTreeApplication : " + e.getMessage());
            
        }
        
        return application; 
    }
    
   public static User[] loadUser(){
       /*User[] users = new User[3];
       users[0] = new User (1, "Panda", "panda", true);
       users[1] = new User(2, "Marie", "marie", false);
       users[2] = new User(3, "Mary", "mary", false);*/
       ArrayList<User> users = new ArrayList<User>();
       users.add(new User (1, "Panda", "panda", true));
       users.add(new User(2, "Marie", "marie", false));
       users.add(new User(3, "Mary", "mary", false));
       
       return users.toArray(new User[users.size()]);
   }
   
    public static Responsible[] loadResponsible(){
        ArrayList<Responsible> responsibles = new ArrayList<Responsible>();
        /*responsibles.add(new Responsible(9999, null));
        responsibles.add(new Responsible(1, "Panda"));
        responsibles.add(new Responsible(2, "Marie"));*/
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM responsible";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                responsibles.add(new Responsible(res.getInt(1), res.getString(2)));
            }
        }catch(SQLException e){
            System.out.println("Function loadResponsible : " + e.getMessage());
        }
        
        return responsibles.toArray(new Responsible[responsibles.size()]);
        
    }
    
    public static Responsible getResponsible(int id){
        Responsible responsible = null;
        
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM responsible WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                responsible = new Responsible(res.getInt(1), res.getString(2));
            }
        }catch(SQLException e){
            System.out.println("Function getResponsible : " + e.getMessage());
        }
        
        return responsible;
    }
    
    public static Lifecycle getLifecycle(int id){
        Lifecycle lifecycle = null;
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM lifecycle WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                lifecycle = new Lifecycle(res.getInt(1), res.getString(2));
            }
        }catch(SQLException e){
            System.out.println("Function getlifecycle : " + e.getMessage());
        }
        
        return lifecycle;    
    }
    
    public static ArrayList<myObject.Process> getListProcess(Segment segment){
        ArrayList<myObject.Process> listProcess = new ArrayList<myObject.Process>();
        
         Connection connection = ConnectionSql.getConnection();
        
        /*String sql = "SELECT * FROM process WHERE SEGMENTid = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(0, segment.getId());
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                listProcess.add(new myObject.Process(res.getInt("id"), res.getString("name"), res.getString("description"),
                        res.getDate("ValidFrom"), res.getDate("ValidUntil"), segment, getResponsible(res.getInt("Responsibleid")),
                        getResponsible(res.getInt("ResponsibleidDeputy"))));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }*/
        
        return listProcess;
        
    }
    
    public static Segment getSegment(int id){
        Segment segment = null;
        
                 Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM responsible WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                segment = new Segment(res.getInt(1), res.getString(2),res.getString(3), getResponsible(res.getInt(4)),
                getResponsible(res.getInt(5)), new ArrayList<myObject.Process>());
            }
        }catch(SQLException e){
            System.out.println("Function getSegment : " + e.getMessage());
        }
        
        return segment;
    }
}
