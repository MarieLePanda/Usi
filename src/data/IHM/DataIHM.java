/**
 * Technical class to load data visible in the IHM
 */
package data.IHM;

import data.database.ConnectionSql;
import static data.database.ConnectionSql.closeConnection;
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
       DefaultMutableTreeNode segment = new DefaultMutableTreeNode("Zone");
       Connection connection = ConnectionSql.getConnection();
       for(Segment s : getListAllSegment()){
           segment.add(new DefaultMutableTreeNode(s));
           s.addObjectToMetaModel();
       }        
       return segment;
    }
    
    /**
     * Create all process existing
     * @return node of tree
     */
    public static DefaultMutableTreeNode loadTreeProcess(){
        DefaultMutableTreeNode process = new DefaultMutableTreeNode("Quartier");
        for(myObject.Process p : getListAllProcess()){
            process.add(new DefaultMutableTreeNode(p));
            p.addObjectToMetaModel();
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
        for(Capability c : getAllCapability()){
            capability.add(new DefaultMutableTreeNode(c));
            c.addObjectToMetaModel();
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
        }finally{
                closeConnection(connection);
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
                users.add(new User(res.getInt(1), res.getString(2), res.getString(3), res.getBoolean(4), res.getBoolean(5)));
            }
        }catch(SQLException e){
            System.out.println("loadUser " + e.toString());
        }finally{
            closeConnection(connection);
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
        }finally{
            closeConnection(connection);
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
        }finally{
            closeConnection(connection);
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
        }finally{
            closeConnection(connection);
        }
        return lifecycle;    
    }
    
        public static Lifecycle[] getAllLifecycle(){
        ArrayList<Lifecycle> listLifecycle = new ArrayList<Lifecycle>();
        Connection connection = ConnectionSql.getConnection();
        String sql = "SELECT * FROM lifecycle";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                listLifecycle.add(new Lifecycle(res.getInt(1), res.getString(2)));
            }
        }catch(SQLException e){
            System.out.println("Function getlifecycle : " + e.getMessage());
        }finally{
            closeConnection(connection);
        }
        return listLifecycle.toArray(new Lifecycle[listLifecycle.size()]);    
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
        }finally{
            closeConnection(connection);
        }
        return process.toArray(new myObject.Process[process.size()]);
    }
    
    /**
     * Returns the process attached to a segment to build a segment
     * @param segmentId Segment id that you want to have the list of process
     * @return List of process witch segment id passed as parameter
     */
    public static ArrayList<myObject.Process> getListProcess(int segmentId){
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
        }finally{
            closeConnection(connection);
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
            }finally{
                closeConnection(connection);
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
                        getResponsible(res.getInt(5)), getListProcess(res.getInt(1)));
                segment.add(objectSegment);
                objectSegment.addObjectToMetaModel();
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " loadTreeSegment " + e.getMessage());
        }finally{
            closeConnection(connection);
        }
       return segment.toArray(new Segment[segment.size()]);
    }    
     
    public static Capability[] getAllCapability(){
        ArrayList<Capability> capabilities = new ArrayList<Capability>();       
        Connection connection = ConnectionSql.getConnection();
        String sql = "SELECT * FROM capability";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                capabilities.add(new Capability(res.getInt(1), getUniqueProcess(res.getInt(2)), res.getString(3), res.getString(4),
                        res.getDate(5), res.getDate(6), getResponsible(res.getInt(7)),
                        getResponsible(res.getInt(8)), getListApplication(res.getInt(1))));
            }
        }catch(SQLException e){
            System.out.println("getFreeCapability " + e.toString());
        }finally{
            closeConnection(connection);
        }
        return capabilities.toArray(new Capability[capabilities.size()]);
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
        }finally{
            closeConnection(connection);
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
        }finally{
            closeConnection(connection);
        }
        return capabilities;
    }
    
    public static myObject.Process[] getListAllProcess(){
        ArrayList<myObject.Process> listProcess = new ArrayList<myObject.Process>();
        Connection connection = ConnectionSql.getConnection();
        String sql = "SELECT * FROM process";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                listProcess.add(new myObject.Process(res.getInt(1), res.getString(2),res.getString(3), 
                        res.getDate(4), res.getDate(5), getSegment(res.getInt(6)), getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), getListCapability(res.getInt(1))));
            }
        }catch(SQLException e){
            System.out.println("getListAllProcess " + e.toString());
        }finally{
            closeConnection(connection);
        }
        for(myObject.Process p : listProcess){
           
        }
        
       return listProcess.toArray(new myObject.Process[listProcess.size()]);
    }    
    public static ArrayList<Capability> getListCapability(int process){
        Connection connection = ConnectionSql.getConnection();
        ArrayList<Capability> capabilities = new ArrayList<Capability>();
        String sql = "SELECT * FROM capability WHERE PROCESSid = ?";
        try{ 
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, process);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                capabilities.add(new Capability(res.getInt(1), null, res.getString(3),res.getString(4), res.getDate(5), 
                    res.getDate(6), getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Application>()));
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " loadTreeProcess 3 " + e.getMessage());
        }finally{
            closeConnection(connection);
        }
        return capabilities;
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
                        getResponsible(res.getInt(5)), getListProcess(res.getInt(1)));
                //objectProcess.addObjectToMetaModel();
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getProcess " + e.getMessage());
        }finally{
            closeConnection(connection);
        }
        return segment;
    }  
    
    public static ArrayList<Application> getListApplication(int capabilityId){
        ArrayList<Application> applications = new ArrayList<Application>();
        ArrayList<Integer> idApplication = new ArrayList<Integer>();
        Connection connection = ConnectionSql.getConnection();
        
        String sql = "SELECT * FROM capability_application WHERE CAPABILITYid = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, capabilityId);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                idApplication.add(res.getInt(1));
            }
        }catch(SQLException e){
            System.out.println("getListApplication " + e.toString());
        }finally{
            closeConnection(connection);
        }
        connection = ConnectionSql.getConnection();
        sql = "SELECT * FROM application WHERE id = ?";
        for(int i : idApplication){
            try{
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, i);
                ResultSet res = preparedStatement.executeQuery();
                while(res.next()){
                    applications.add(new Application(
                            res.getInt(1), res.getString(2), res.getString(3),
                            res.getDate(4), res.getString(5), getResponsible(res.getInt(6)), getResponsible(res.getInt(7)), 
                            getResponsible(res.getInt(8)), getResponsible(res.getInt(9)),
                            getLifecycle(res.getInt(10)), getdatabase(res.getInt(11)), res.getDate(12), res.getInt(13), res.getInt(14),
                            res.getInt(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), getServer(res.getInt(20)), res.getString(21),
                            res.getString(22), res.getString(23), res.getString(24), new ArrayList<Capability>(), new ArrayList<Application>(), 
                            new ArrayList<Application>(), new ArrayList<Interface>(), new ArrayList<Interface>(), new ArrayList<Technology>()));
                }
            }catch(SQLException e){
                System.out.println("getApplication 2" + e.toString());
            }finally{
                closeConnection(connection);
            }
        }
        return applications;
    }
        
    public static myObject.Process getUniqueProcess(int processId){
        myObject.Process process = new myObject.Process();
        Connection connection = ConnectionSql.getConnection();
        String sql = "SELECT * FROM process WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, processId);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){                
                process = ( new myObject.Process(res.getInt(1), res.getString(2),res.getString(3), res.getDate(4), 
                    res.getDate(5), new Segment(), getResponsible(res.getInt(7)), getResponsible(res.getInt(8)), new ArrayList<Capability>()));
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getUniqueProcess " + e.getMessage());
        }finally{
            closeConnection(connection);
        }
        return process;
    }
    
    public static Database[] getAllDatabase(){
        ArrayList<Database> listDatabase = new ArrayList<Database>();
        Connection connection = data.database.ConnectionSql.getConnection();
        String sql = "SELECT * FROM database";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                listDatabase.add(new Database(res.getInt(1), res.getString(2), res.getString(3), getResponsible(res.getInt(4)), getResponsible(res.getInt(5)), getResponsible(res.getInt(6)),
                getResponsible(res.getInt(7)), getServer(res.getInt(8)), res.getInt(9), res.getInt(10), res.getDate(11), res.getDate(12), getLifecycle(res.getInt(13))));
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getAllDatabase " + e.getMessage());
        }finally{
            closeConnection(connection);
        }        
        return listDatabase.toArray(new Database[listDatabase.size()]);
    }
    
    public static Database getdatabase(int id){
        Database database = new Database();
        Connection connection = data.database.ConnectionSql.getConnection();
        String sql = "SELECT * FROM database WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                database = new Database(res.getInt(1), res.getString(2), res.getString(3), getResponsible(res.getInt(4)), getResponsible(res.getInt(5)), getResponsible(res.getInt(6)),
                getResponsible(res.getInt(7)), getServer(res.getInt(8)), res.getInt(9), res.getInt(10), res.getDate(11), res.getDate(12), getLifecycle(res.getInt(13)));
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getdatabase " + e.getMessage());
        }finally{
            closeConnection(connection);
        }
        return database;
    }
    
    public static Server[] getAllServer(){
        ArrayList<Server> listServer = new ArrayList<Server>();
        Connection connection = data.database.ConnectionSql.getConnection();
        String sql = "SELECT * FROM database";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
                listServer.add(new Server(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), getResponsible(res.getInt(5)), getResponsible(res.getInt(6)), getResponsible(res.getInt(7)), 
                        getResponsible(res.getInt(8)), res.getString(9), res.getString(10), res.getString(11), res.getInt(12), res.getInt(13), getLifecycle(res.getInt(14)), res.getInt(15), res.getDate(16), 
                        res.getDate(17), new ArrayList<Technology>()));
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getAllServer " + e.getMessage());
        }finally{
            closeConnection(connection);
        }        
        return listServer.toArray(new Server[listServer.size()]);
    }
    
    public static Server getServer(int id){
        Server server = null;
        Connection connection = data.database.ConnectionSql.getConnection();
        String sql = "SELECT * FROM database WHERE id = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet res = preparedStatement.executeQuery();
            while(res.next()){
               server = new Server(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), getResponsible(res.getInt(5)), getResponsible(res.getInt(6)), getResponsible(res.getInt(7)), 
                        getResponsible(res.getInt(8)), res.getString(9), res.getString(10), res.getString(11), res.getInt(12), res.getInt(13), getLifecycle(res.getInt(14)), res.getInt(15), res.getDate(16), 
                        res.getDate(17), new ArrayList<Technology>());
            }
        }catch(SQLException e){
            System.out.println(e.toString() + " getServer " + e.getMessage());
        }finally{
            closeConnection(connection);
        }        
        return server;
    }
}
