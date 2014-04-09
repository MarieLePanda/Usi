package IHM;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class MainWindow extends JFrame {

	public JTree tree;
        public JScrollPane scrollTree;
        public JPanel panelTree;
        public BorderLayout layoutTree; 
        public Container containerTree;

	public MainWindow(){

            super("Title");
            initJtree();
            
            pack();		
	}
        
        
        public void initJtree(){
            //containerTree = this.getContentPane();
            //cont.
            
            //Metamodel
            DefaultMutableTreeNode rootFolder = new DefaultMutableTreeNode("Metamodel");
            
            //Functionnal view
            DefaultMutableTreeNode functionalView = new DefaultMutableTreeNode("Functional view");
            rootFolder.add(functionalView);
            DefaultMutableTreeNode activityFolder = new DefaultMutableTreeNode("Activity");
            functionalView.add(activityFolder);
            DefaultMutableTreeNode processFolder = new DefaultMutableTreeNode("Process");
            functionalView.add(processFolder);
            DefaultMutableTreeNode functionFolder = new DefaultMutableTreeNode("Function");
            functionalView.add(functionFolder);
            
            //Application view
            DefaultMutableTreeNode applicationView = new DefaultMutableTreeNode("Application view");
            rootFolder.add(applicationView);
            DefaultMutableTreeNode applicationFolder = new DefaultMutableTreeNode("Application");
            applicationView.add(applicationFolder); 
            DefaultMutableTreeNode interfaceFolder = new DefaultMutableTreeNode("Interface");
            applicationView.add(interfaceFolder);
            
            //Technical view
            DefaultMutableTreeNode technicalView = new DefaultMutableTreeNode("Technical view");
            rootFolder.add(technicalView);
            DefaultMutableTreeNode serverFolder = new DefaultMutableTreeNode("Server");
            technicalView.add(serverFolder); 
            DefaultMutableTreeNode databaseFolder = new DefaultMutableTreeNode("Database");
            technicalView.add(databaseFolder);
            DefaultMutableTreeNode technologieFolder = new DefaultMutableTreeNode("Technologie");
            technicalView.add(technologieFolder);
            
            //assignment
            tree = new JTree(rootFolder);
            
            this.getContentPane().add(tree, BorderLayout.WEST);
            //this.getContentPane().setSize(300, 300);
            scrollTree = new JScrollPane(tree);
            //scrollTree.setSize(300, 300);
            


            this.add(scrollTree);
          
        }
        
        public void initDraw(){
        	Graphics graph = null;
        	graph.setColor(Color.red);
        	graph.fillRect(10,10,80,80);
        }
        
        public void initFolder(){
            
            
        }
}
