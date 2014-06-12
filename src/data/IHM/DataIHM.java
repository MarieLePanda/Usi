/**
 * Technical class to load data visible in the IHM
 */
package data.IHM;

import data.database.ConnectionSql;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import myObject.*;


/**
 *
 * @author Mary
 */
public class DataIHM {
    
    /**
     * Create the tree
     * @return model of tree
     */
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
    
    /**
     * Create all segment existing
     * @return node of tree
     */
    public static DefaultMutableTreeNode loadTreeSegment(){
       DefaultMutableTreeNode segment = new DefaultMutableTreeNode(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             "Zone");
       Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM segment";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                
                Segment objectSegment = new Segment(res.getInt(1), res.getString(2),res.getString(3), getResponsible(res.getInt(4)),
                        getResponsible(res.getInt(5)), getProcess(res.getInt(1)));
                segment.add(new DefaultMutableTreeNode(objectSegment));
                objectSegment.addObjectToMetaModel();
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " loadTreeSegment " + e.getMessage());
        }
        
       return segment;
    }
    
    /**
     * Create all process existing
     * @return node of tree
     */
    public static DefaultMutableTreeNode loadTreeProcess(){
        DefaultMutableTreeNode process = new DefaultMutableTreeNode("Quartier");
        ArrayList<myObject.Process> listProcess = new ArrayList<myObject.Process>();
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM process";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){                
                myObject.Process p = ( new myObject.Process(res.getInt(1), res.getString(2),res.getString(3), res.getDate(4), 
                        res.getDate(5), new Segment(), getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Capability>()));
                p.getSegment().setId(res.getInt(6));
                listProcess.add(p);
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " loadTreeProcess 1 " + e.getMessage());
        }
        for(myObject.Process p : listProcess){
            sql = "SELECT * FROM Segment WHERE id = ?";
            Connection connectionSeg = ConnectionSql.getConnection();
            try{
                PreparedStatement preparedStatementSeg = connectionSeg.prepareStatement(sql);
                preparedStatementSeg.setInt(1, p.getSegment().getId());
                ResultSet seg = preparedStatementSeg.executeQuery();
                seg.next();
                p.setSegment(new Segment(seg.getInt(1), seg.getString(2),seg.getString(3), getResponsible(seg.getInt(4)),
                    getResponsible(seg.getInt(5)), getProcess(seg.getInt(1))));
            }
            catch(SQLException e){
            System.out.println(e.toString() + " loadTreeProcess 2 " + e.getMessage());
            }
        }
            for(myObject.Process p : listProcess){
                System.out.println(p.getSegment());
                ArrayList<Capability> capabilities = new ArrayList<Capability>();
                try{
                    connection = ConnectionSql.getConnection();
                    sql = "SELECT * FROM capability WHERE PROCESSid = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1, p.getId());
                    ResultSet res = preparedStatement.executeQuery();
                    while(res.next()){
                        Capability objectCapability = new Capability(res.getInt(1), null, res.getString(3),res.getString(4), res.getDate(5), 
                            res.getDate(6), getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Application>());
                            capabilities.add(objectCapability);
                    }
                    p.setListCapability(capabilities);
                }catch(SQLException e){
                    System.out.println(e.toString() + " loadTreeProcess 3 " + e.getMessage());
                }
        
            }
            for(myObject.Process p : listProcess){
                process.add(new DefaultMutableTreeNode(p));
            }
            
        
        return process;
    }
    
     /**
     * Create all capability existing
     * @return node of tree
     */
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
            System.out.println(e.toString() + " loadTreeCapability " + e.getMessage());
        }
        return capability;
    }
    
     /**
     * Create all interface existing
     * @return node of tree
     */
    public static DefaultMutableTreeNode loadTreeInterface(){
        DefaultMutableTreeNode appInterface = new DefaultMutableTreeNode("Interface");
        
        return appInterface;
    }
    
    /**
     * Create all server existing
     * @return node of tree
     */
    public static DefaultMutableTreeNode loadTreeServer(){
        DefaultMutableTreeNode server = new DefaultMutableTreeNode("Serveur");
        
        return server;
        
    }
    
    /**
     * Create all database existing
     * @return node of tree
     */
    public static DefaultMutableTreeNode loadTreeDatabase(){
        DefaultMutableTreeNode database = new DefaultMutableTreeNode("base de donnée");
        
        return database;
    }
    
    /**
     * Create all technology existing
     * @return node of tree
     */
    public static DefaultMutableTreeNode loadTreeTechnology(){
        DefaultMutableTreeNode technology = new DefaultMutableTreeNode("Technologie");
        
        return technology;
    }
    
    /**
     * Create all application existing
     * @return node of tree
     */
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
            System.out.println(e.toString() + " loadTreeApplication " + e.getMessage());
            
        }
        
        return application; 
    }
    
   /**
     * Create all user existing
     * @return array of user
     */
   public static User[] loadUser(){
       ArrayList<User> users = new ArrayList<User>();
       Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM user";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                users.add(new User(res.getInt(1), res.getString(2), res.getString(3), res.getBoolean(4)));
            }
        }catch(SQLException e){
            System.out.println("loadUser " + e.toString());
            
        }
       
       return users.toArray(new User[users.size()]);
   }
   
     /**
     * Create all responsible existing
     * @return array of responsible
     */
    public static Responsible[] loadResponsible(){
        ArrayList<Responsible> responsibles = new ArrayList<Responsible>();

        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM responsible";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                responsibles.add(new Responsible(res.getInt(1), res.getString(2)));
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " loadResponsible " + e.getMessage());
        }
        
        return responsibles.toArray(new Responsible[responsibles.size()]);
        
    }    
    
    /**
     * create a specify responsible
     * @param id the id of responsible that you want to have 
     * @return the responsible witch id passed as parameter
     */
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
            System.out.println(e.toString() + " getResponsible " + e.getMessage());
        }
        
        return responsible;
    }
    
    /**
     * Create a specify lifecycle
     * @param id the id of lifecycle that you want to have 
     * @return the lifecycle witch id passed as parameter
     */
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
    
    //Need to manage segment
    /**
     * Returns all process attached to any segment
     * @return array of process
     */
    public static myObject.Process[] getFreeProcess(){
        ArrayList<myObject.Process> process = new ArrayList<myObject.Process>();
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM process WHERE SEGMENTid = 100";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                myObject.Process objectProcess = new myObject.Process(res.getInt(1), res.getString(2),res.getString(3), res.getDate(4), 
                        res.getDate(5), null, getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Capability>());
                process.add(objectProcess);
                //objectProcess.addObjectToMetaModel();
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getProcess " + e.getMessage());
        }
        return process.toArray(new myObject.Process[process.size()]);
    }
    
    /**
     * Returns the process attached to a segment to build a segment
     * @param segmentId Segment id that you want to have the list of process
     * @return List of process witch segment id passed as parameter
     */
    public static ArrayList<myObject.Process> getProcess(int segmentId){
        ArrayList<myObject.Process> process = new ArrayList<myObject.Process>();
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM process WHERE SEGMENTid = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, segmentId);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                myObject.Process objectProcess = new myObject.Process(res.getInt(1), res.getString(2),res.getString(3), res.getDate(4), 
                        res.getDate(5), null, getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Capability>());
                process.add(objectProcess);
                //objectProcess.addObjectToMetaModel();
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getProcess " + e.getMessage());
        }
        return process;
    }  
    
     /**
     * Returns the process attached to a segment to display a segment
     * @param segment Segment that you want to have the list of process
     * @return array of process witch segment id passed as parameter
     */
    public static myObject.Process[] getListProcess(Segment segment){
       
        ArrayList<myObject.Process> listProcess = new ArrayList<myObject.Process>();
        if(segment !=null){
            Connection connection = ConnectionSql.getConnection();

            String sql = "SELECT * FROM process WHERE SEGMENTid = ?";
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, segment.getId());
                ResultSet res = preparedStatement.executeQuery();
                while(res.next()){
                    listProcess.add(new myObject.Process(res.getInt("id"), res.getString("name"), res.getString("description"),
                            res.getDate("ValidFrom"), res.getDate("ValidUntil"), segment, getResponsible(res.getInt("Responsibleid")),
                            getResponsible(res.getInt("ResponsibleidDeputy")), new ArrayList<Capability>()));
                }
            }catch(SQLException e){
                System.out.println(e.toString() + " getListProcess " + e.getMessage());
            }
        }
        
        return listProcess.toArray(new myObject.Process[listProcess.size()]);
        
    }
    
    /**
     * Returns all segment existing to display in the combobox
     * @return array of segment
     */
    public static Segment[] getListAllSegment(){
        ArrayList<Segment> segment = new ArrayList<Segment>();
        Connection connection = ConnectionSql.getConnection();
        String sql = "SELECT * FROM segment";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                
                Segment objectSegment = new Segment(res.getInt(1), res.getString(2),res.getString(3), getResponsible(res.getInt(4)),
                        getResponsible(res.getInt(5)), getProcess(res.getInt(1)));
                segment.add(objectSegment);
                objectSegment.addObjectToMetaModel();
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " loadTreeSegment " + e.getMessage());
        }
        
       return segment.toArray(new Segment[segment.size()]);
    }    
     
    /**
     * Returns all capability attached to any process
     * @return array of capability
     */
    public static Capability[] getFreeCapability(){
        ArrayList<Capability> capabilities = new ArrayList<Capability>();
        
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM capability WHERE PROCESSid = 100";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                capabilities.add(new Capability(res.getInt(1), null, res.getString(3), res.getString(4),
                        res.getDate(5), res.getDate(6), getResponsible(res.getInt(7)),
                        getResponsible(res.getInt(8)), new ArrayList<Application>()));
            }
        }catch(SQLException e){
            System.out.println("getFreeCapability " + e.toString());
        }
        
        return capabilities.toArray(new Capability[capabilities.size()]);
    }
    
     /**
     * Create a specify capability
     * @param id the process id for which you want a list of capability
     * @return aurray of capability witch id passed as parameter
     */
    public static ArrayList<Capability> getCapability(int processId){
        ArrayList<Capability> capabilities = new ArrayList<Capability>();
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM capability WHERE PROCESSid = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, processId);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                capabilities.add(new Capability(res.getInt(1), null, res.getString(3), res.getString(4),
                        res.getDate(5), res.getDate(6), getResponsible(res.getInt(7)),
                        getResponsible(res.getInt(8)), new ArrayList<Application>()));
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getProcess " + e.getMessage());
        }
        return capabilities;
    }
    
    public static myObject.Process[] getListAllProcess(){
        ArrayList<myObject.Process> process = new ArrayList<myObject.Process>();
        Connection connection = ConnectionSql.getConnection();
        String sql = "SELECT * FROM process";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                
                myObject.Process objectProcess = new myObject.Process(res.getInt(1), res.getString(2),res.getString(3), 
                        res.getDate(4), res.getDate(5), getSegment(res.getInt(6)), getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Capability>());
                process.add(objectProcess);
            }
        }catch(SQLException e){
            System.out.println("getListAllProcess " + e.toString());
        }
        
       return process.toArray(new myObject.Process[process.size()]);
    }    
    
    public static Segment getSegment(int segmentId){
        
        Connection connection = ConnectionSql.getConnection();
        Segment segment = null;
        String sql = "SELECT * FROM segment WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, segmentId);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                segment = new Segment(res.getInt(1), res.getString(2),res.getString(3), getResponsible(res.getInt(4)),
                        getResponsible(res.getInt(5)), getProcess(res.getInt(1)));
                //objectProcess.addObjectToMetaModel();
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getProcess " + e.getMessage());
        }
        return segment;
    }  
}
