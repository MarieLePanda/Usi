package launcherUsi;
import IHM.*;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
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
                    
                    try
                    {
                        
                        //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel");
                        //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueStellLookAndFeel");
                        //UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
                        //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel");
                        //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel");
                        //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel");
                        //UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel");
                        UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel");
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.toString());
                    }
                    
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
