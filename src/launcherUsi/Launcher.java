package launcherUsi;
import IHM.MainFrame;
import IHM.frameObject.FrameApplication;

import IHM.frameAdmin.FrameAdmin;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Launcher {

	public static void main(String[] args) {
            
    // TODO Auto-generated method stub
            
            Runnable r = new Runnable(){
                public void run(){
                    MainFrame win = new MainFrame();
                    win.setVisible(true);
                    win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}
            };
        
            SwingUtilities.invokeLater(r);
	}

}
