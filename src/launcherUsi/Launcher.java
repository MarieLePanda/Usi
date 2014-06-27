package launcherUsi;
import IHM.*;
import IHM.lookandfeel.LookAndFeelManage;
//import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
//import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import java.awt.Toolkit;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import myObject.User;
import plugin.IModule;
import plugin.ModuleLoader;

public class Launcher {

    public static User userConnected = null;
	public static void main(String[] args) {
           
            
            Runnable r;
        r = new Runnable(){
            public void run(){
                
                //userConnected.setLogin("panda");
                //userConnected.setPassword("admin");
                if(userConnected == null){
                    LookAndFeelManage.loadDefautLook();
                    
                    WindowConnection win = new WindowConnection();
                    win.setVisible(true);
                    win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                }
                else{
                    MainFrame wind = new MainFrame();
                    wind.setVisible(true);
                    wind.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                }
            }
        };
        
            
        SwingUtilities.invokeLater(r);
        
        
    }

   /* private Object getFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        


}
