/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.swing.tree.DefaultMutableTreeNode;
import myObject.Application;

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
        //Root/Function/
        DefaultMutableTreeNode segment = new DefaultMutableTreeNode("Zone");
        DefaultMutableTreeNode process = new DefaultMutableTreeNode("Quartier");
        DefaultMutableTreeNode capability = new DefaultMutableTreeNode("Ilot");
        viewFunction.add(segment);
        viewFunction.add(process);
        viewFunction.add(capability);
        capability.setAllowsChildren(true);
        //Root/Application/
        DefaultMutableTreeNode application = new DefaultMutableTreeNode("Application");
        DefaultMutableTreeNode appInterface = new DefaultMutableTreeNode("Interface");
        viewApplication.add(application);
        viewApplication.add(appInterface);
        //Root/Technologique/
        DefaultMutableTreeNode server = new DefaultMutableTreeNode("Serveur");
        DefaultMutableTreeNode database = new DefaultMutableTreeNode("base de donnée");
        DefaultMutableTreeNode technology = new DefaultMutableTreeNode("Technologie");
        viewTechnologique.add(server);
        viewTechnologique.add(database);
        viewTechnologique.add(technology);

        
        
        Application ap = new Application();
        ap.setName("testAp");
        
        
        DefaultMutableTreeNode leaf = new DefaultMutableTreeNode(ap);
        application.add(leaf);
        
        
        
        return root;
    }
}
