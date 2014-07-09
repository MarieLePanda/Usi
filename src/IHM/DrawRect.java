package IHM;


import java.awt.Graphics2D;
import static java.awt.SystemColor.window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;


public class DrawRect {
    
    static JFrame window = new JFrame();

	static int LargOfGraph ;
	void setLargOfGraph(int largOfGraph) {
		LargOfGraph = largOfGraph;
	}

	public static void Paint(ArrayList<String[]>  args) {
        
        JMenuBar menu = new JMenuBar();
	final JMenu exp = new JMenu("Export");
	JMenuItem dest = new JMenuItem(" Destination ");
	final JMenuItem enrg = new JMenuItem(" Exporter");
	dest.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        	JFileChooser chooser = new JFileChooser();
        	chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int returnVal = chooser.showOpenDialog(window);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
            		exp.add(enrg);
               LevelOf.setPathExport(chooser.getSelectedFile().getAbsolutePath());
            	
            }
		  
        }

       
    
        
    });
	
	enrg.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
    		if (LevelOf.isExported()) {
    			File f =new File(LevelOf.getPathExport());
       
                        saveFrameAsJepg(window,f);
   
    		}
    		

        }

       
    
        
    });
	exp.add(dest);
	
	menu.add(exp);
	window.setJMenuBar(menu);
	

int x=0;

		for(String[] arg:args){
			LevelOf.newIlot(  new ArrayList<String>(),arg[0],arg);
		x++;
		}



		LevelOf.setLvl2(x);


		

		window.setLocationRelativeTo(null);
                window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


		window.getContentPane().add(new Rect());


window.setBounds(300, 50, 900, 600);
		window.setVisible(true);
		



 	}
	
	public static void saveFrameAsJepg(JFrame frame, File jpeg) {
		  BufferedImage image = new BufferedImage(frame.getWidth(),
		                                          frame.getHeight(),
		                                          BufferedImage.TYPE_INT_BGR);
		  Graphics2D g2 = image.createGraphics();
		  frame.paint(g2);
		  g2.dispose();
		 
		  try {
		    ImageIO.write(image, "JPEG", jpeg);
		  } catch (IOException e) { 
                      e.printStackTrace();
                  }
		}
}