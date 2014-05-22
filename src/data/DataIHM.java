/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import myObject.Application;
import myObject.User;

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
        viewFunction.add(loadSegment());
        viewFunction.add(loadProcess());
        viewFunction.add(loadCapability());
        //Root/Application/
        viewApplication.add(loadApplication());
        viewApplication.add(loadInterface());
        //Root/Technologique/
        viewTechnologique.add(loadServer());
        viewTechnologique.add(loadDatabase());
        viewTechnologique.add(loadTechnology()); 

        return root;
    }
    
    public static DefaultMutableTreeNode loadSegment(){
       DefaultMutableTreeNode segment = new DefaultMutableTreeNode(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             "Zone");
       
       return segment;
    }
    
    public static DefaultMutableTreeNode loadProcess(){
        DefaultMutableTreeNode process = new DefaultMutableTreeNode("Quartier");
        
        return process;
    }
    
    public static DefaultMutableTreeNode loadCapability(){
        DefaultMutableTreeNode capability = new DefaultMutableTreeNode("Ilot");
        
        return capability;
    }
    
    public static DefaultMutableTreeNode loadInterface(){
        DefaultMutableTreeNode appInterface = new DefaultMutableTreeNode("Interface");
        
        return appInterface;
    }
    
    public static DefaultMutableTreeNode loadServer(){
        DefaultMutableTreeNode server = new DefaultMutableTreeNode("Serveur");
        
        return server;
        
    }
    
    public static DefaultMutableTreeNode loadDatabase(){
        DefaultMutableTreeNode database = new DefaultMutableTreeNode("base de donnée");
        
        return database;
    }
    
    public static DefaultMutableTreeNode loadTechnology(){
        DefaultMutableTreeNode technology = new DefaultMutableTreeNode("Technologie");
        
        return technology;
    }
    
    public static DefaultMutableTreeNode loadApplication(){
        DefaultMutableTreeNode application = new DefaultMutableTreeNode("Application");
        Application ap = new Application();
        ap.setName("testAp");
        DefaultMutableTreeNode leaf = new DefaultMutableTreeNode(ap);
        application.add(leaf);
        
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
}
