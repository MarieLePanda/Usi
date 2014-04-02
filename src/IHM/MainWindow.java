package IHM;
import javax.swing.*;
import javax.swing.tree.*;

public class MainWindow extends JFrame {

	private JTree menu;
	public MainWindow(){

		super("Title");
		
		DefaultMutableTreeNode rootFolder = new DefaultMutableTreeNode("Metamodel");
		DefaultMutableTreeNode activityFolder = new DefaultMutableTreeNode("Activity");
		rootFolder.add(activityFolder);
		DefaultMutableTreeNode processFolder = new DefaultMutableTreeNode("Process");
		rootFolder.add(processFolder);
		DefaultMutableTreeNode functionFolder = new DefaultMutableTreeNode("Function");
		rootFolder.add(functionFolder);
		
		menu = new JTree(rootFolder);
		
		this.add(menu);
		
		pack();		
	}
}
