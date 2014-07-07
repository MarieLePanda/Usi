package IHM;


import javax.imageio.ImageIO;
import javax.swing.JFrame;







import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;


import java.util.ArrayList;


public class DrawRect {

	static int LargOfGraph ;
	void setLargOfGraph(int largOfGraph) {
		LargOfGraph = largOfGraph;
	}

	public static void Paint(ArrayList<String[]>  args) {


int x=0;
		for(String[] arg:args){
			LevelOf.newIlot(  new ArrayList<String>(),arg[0],arg);
		x++;
		}



		LevelOf.setLvl2(x);


		JFrame window = new JFrame();

		window.setLocationRelativeTo(null);



		window.getContentPane().add(new Rect());


window.setBounds(300, 50, 900, 600);
		window.setVisible(true);
		
		if (LevelOf.isExported()) {
			File f =new File(LevelOf.getPathExport());
    
		saveFrameAsJepg(window,f);
		}
		



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
		  } catch (Exception e) { }
		}
}