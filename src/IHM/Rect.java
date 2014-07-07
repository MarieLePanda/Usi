package IHM;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


import javax.swing.JPanel;





@SuppressWarnings("serial")
public class Rect extends JPanel { 
	int Largeur3=30;
	public void paintComponent(Graphics g){

		int acc;

		int l=1,lvl1xy=0;
		int[] tabdim={20,0,10,0};
		int z=0;
		int[] lvl3={25,25,100,Largeur3};

		
		Font f = new Font("VERANDA", 20, 10);

		g.setFont(f);

		g.setPaintMode();


		acc=((lvl3[2]+lvl3[0]));
		
		while(z<LevelOf.getLvl2()){
			lvl3[0]=tabdim[0]+10;
			
			if(z==2 || z== 4 ||z== 6 || z== 8){
				if(lvl1xy<tabdim[0]){
					lvl1xy=tabdim[0];
				}
				
				
				tabdim[0]=20;
				lvl3[0]=30;
				lvl3[1]=lvl3[1]+lvl3[3]+50;
				lvl3[2]=50;
				lvl3[3]=Largeur3;
			}
		while(l<(LevelOf.getNbUnit(z))){	  

			g.setColor(Color.red);
			g.drawRect (lvl3[0], lvl3[1], lvl3[2], lvl3[3]);  
			g.drawString(LevelOf.getUnit(l, z),lvl3[0]+7, lvl3[1]+lvl3[3]-5);	  

			lvl3[0]=lvl3[0]+acc;

			l++;

		} 
		l=1;
		
			tabdim=Drawlvl2(g,(tabdim[0]),lvl3[1]-5, (lvl3[0]-tabdim[0]),LevelOf.Tab.get(z).get(0));
			
			tabdim[0]=lvl3[0]+lvl3[3];
			
			z++;
		}
		
		
		

if(lvl1xy==0){
	lvl1xy=tabdim[0];
}else{
	
	if(lvl1xy<tabdim[0]){
		lvl1xy=tabdim[0];
		
	}
	
}

		int[] lvl1={10,10,(lvl1xy)+10,tabdim[2]};

		g.setColor(Color.blue);

		g.drawRect (lvl1[0], lvl1[1], lvl1[2], lvl1[3]);  

		g.drawString(LevelOf.getNameLvl1(), lvl1[0]+10,lvl1[1]+lvl1[3]-5);

	}



	private int[] Drawlvl2(Graphics g , int x,int y, int largeur,String tabName){

		int[] lvl={x,y,largeur+10,60};



		g.setColor(Color.orange);
		g.drawRect (lvl[0], lvl[1], lvl[2], lvl[3]);  
		g.drawString(tabName, lvl[0]+7, lvl[1]+lvl[3]-5); 




		return lvl;


	}


  

            
}