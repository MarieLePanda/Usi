package tpGraphique;

import java.awt.*;

import javax.swing.*;

public class exo1 extends JFrame{
	
	Toolkit tk=Toolkit.getDefaultToolkit();
	JButton jb = new JButton("MC" );
    JButton jb2 = new JButton("MR" );
    JButton jb3 = new JButton("MS" );
    JButton jb4 = new JButton("M+" );
    JButton jb5 = new JButton("M-" );
    JButton jb6 = new JButton("<-" );
    JButton jb7 = new JButton("CE" );
    JButton jb8 = new JButton("C" );
    JButton jb9 = new JButton("+/-" );
    JButton jb10 = new JButton("racine" );
    JButton jb11 = new JButton("7" );
    JButton jb12 = new JButton("8" );    
    JButton jb13 = new JButton("9" );
    JButton jb14 = new JButton("/" );
    JButton jb15 = new JButton("%" );
    JButton jb16 = new JButton("4" );
    JButton jb17 = new JButton("5" );
    JButton jb18 = new JButton("6" );
    JButton jb19 = new JButton("*" );
    JButton jb20 = new JButton("1/x" );
    JButton jb21 = new JButton("1" );
    JButton jb22 = new JButton("2" );
    JButton jb23 = new JButton("3");
    JButton jb24= new JButton("-");
    JButton jb25 = new JButton("0");
    JButton jb26 = new JButton(",");
    JButton jb27 = new JButton("+");
    JButton jb28 = new JButton("=");
    
    public exo1 () {
    	// taille écran
    			Dimension d = tk.getScreenSize();
    			
    			// test boutton
    			Container ct = getContentPane();
    		    
    		    JPanel jp = new JPanel();
    		    JPanel jp2 = new JPanel();
    		   //GridLayout gl = new GridLayout(2,2);
    		    GridBagLayout gbl = new GridBagLayout();
    		    GridBagConstraints gbc = new GridBagConstraints();
    		    ct.setLayout(gbl);
    		    
    		    // 1er boutton
    		    gbc.gridx=0;
    		    gbc.gridy=0;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    gbc.fill=GridBagConstraints.BOTH;
    		    ct.add(jb,gbc);
    		    
    		    //2eme
    		    gbc.gridx=1;
    		    gbc.gridy=0;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb2,gbc);
    		    
    		    //3eme
    		    gbc.gridx=2;
    		    gbc.gridy=0;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb3,gbc);
    		    
    		    //4eme
    		    gbc.gridx=3;
    		    gbc.gridy=0;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb4,gbc);
    		    
    		    //5eme
    		    gbc.gridx=4;
    		    gbc.gridy=0;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb5,gbc);
    		    
    		    //__________________________________________________________
    		    
    		    gbc.gridx=0;
    		    gbc.gridy=1;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb6,gbc);
    		    
    		    //7eme
    		    gbc.gridx=1;
    		    gbc.gridy=1;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb7,gbc);
    		    
    		    //8eme
    		    gbc.gridx=2;
    		    gbc.gridy=1;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb8,gbc);
    		    
    		    //4eme
    		    gbc.gridx=3;
    		    gbc.gridy=1;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb9,gbc);
    		    
    		    //5eme
    		    gbc.gridx=4;
    		    gbc.gridy=1;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb10,gbc);
    		 
    		  //__________________________________________________________
    		    
    		    gbc.gridx=0;
    		    gbc.gridy=2;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb11,gbc);
    		    
    		    //7eme
    		    gbc.gridx=1;
    		    gbc.gridy=2;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb12,gbc);
    		    
    		    //8eme
    		    gbc.gridx=2;
    		    gbc.gridy=2;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb13,gbc);
    		    
    		    //4eme
    		    gbc.gridx=3;
    		    gbc.gridy=2;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb14,gbc);
    		    
    		    //5eme
    		    gbc.gridx=4;
    		    gbc.gridy=2;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb15,gbc);
    		  //__________________________________________________________
    		    
    		    gbc.gridx=0;
    		    gbc.gridy=3;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb16,gbc);
    		    
    		    //7eme
    		    gbc.gridx=1;
    		    gbc.gridy=3;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb17,gbc);
    		    
    		    //8eme
    		    gbc.gridx=2;
    		    gbc.gridy=3;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb18,gbc);
    		    
    		    //4eme
    		    gbc.gridx=3;
    		    gbc.gridy=3;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb19,gbc);
    		    
    		    //5eme
    		    gbc.gridx=4;
    		    gbc.gridy=3;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb20,gbc);
    		  //__________________________________________________________
    		    
    		    gbc.gridx=0;
    		    gbc.gridy=4;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb21,gbc);
    		    
    		    //7eme
    		    gbc.gridx=1;
    		    gbc.gridy=4;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb22,gbc);
    		    
    		    //8eme
    		    gbc.gridx=2;
    		    gbc.gridy=4;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb23,gbc);
    		    
    		    //4eme
    		    gbc.gridx=3;
    		    gbc.gridy=4;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb24,gbc);
    		    
    		    //5eme
    		    gbc.gridx=4; gbc.gridy=4;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=2;
    		    gbc.fill=GridBagConstraints.BOTH;
    		    ct.add(jb28,gbc);
    		    
    		  //__________________________________________________________
    		    
    		    gbc.gridx=0;
    		    gbc.gridy=5;
    		    gbc.gridwidth=2;
    		    gbc.gridheight=1;
    		    ct.add(jb25,gbc);
    		    
    		    //7eme
    		    gbc.gridx=2;
    		    gbc.gridy=5;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb26,gbc);
    		    
    		    //8eme
    		    gbc.gridx=3;
    		    gbc.gridy=5;
    		    gbc.gridwidth=1;
    		    gbc.gridheight=1;
    		    ct.add(jb27,gbc);
    		    
    		    
    		   
    		   
    		 // paramétrage de la fenetre 
    			setTitle("Exemple");
    			setSize(d.width/2,d.height/2);
    			pack();
    			setResizable(true);
    			setLocationRelativeTo(null);
    			setVisible(true);	
    }
}
