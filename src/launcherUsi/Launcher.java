package launcherUsi;
import IHM.*;
import javax.swing.*;
import myObject.User;

public class Launcher {

    public static User userConnected = null;
	public static void main(String[] args) {
            
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
