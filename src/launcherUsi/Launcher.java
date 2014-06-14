package launcherUsi;
import IHM.*;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import javax.swing.*;
import myObject.User;
import plugin.IModule;
import plugin.ModuleLoader;

public class Launcher {

    public static User userConnected = null;
	public static void main(String[] args) {
            ModuleLoader.loadPlugin();
    // TODO Auto-generated method stub
            
            Runnable r = new Runnable(){
                public void run(){
                    
                    if(userConnected == null){
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
        


}
