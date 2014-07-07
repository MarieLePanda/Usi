package IHM;

import java.util.ArrayList;


abstract class LevelOf {

	static int lvl2,lvl3;
	static DrawRect CurrentRect;
	

	public static void setCurrentRect(DrawRect currentRect) {
		CurrentRect = currentRect;
	}


	static String PathExport;

	static ArrayList<ArrayList<String>> Tab =new ArrayList<ArrayList<String>>();


	static String NameLvl1;

	static int LargOfGraph;
	
	static boolean exported;
	
	
	public static boolean isExported() {
		return exported;
	}
	public static void setExported(boolean exported) {
		LevelOf.exported = exported;
	}
	public static int getLargOfGraph() {
		return LargOfGraph;
	}
	public static void setLargOfGraph(int largOfGraph) {
		LargOfGraph = largOfGraph;
		
	}
	public static String getPathExport() {
		return PathExport;
	}
	public static void setPathExport(String pathExport) {
		PathExport = pathExport;
	}
	public static int getLvl2() {
		return lvl2;
	}
	public static void setLvl2(int lvl2) {
		LevelOf.lvl2 = lvl2;
	}
	public static int getLvl3() {
		return lvl3;
	}
	public static void setLvl3(int lvl3) {
		LevelOf.lvl3 = lvl3;
	}

	public static String getNameLvl1() {
		return NameLvl1;
	}
	public static void setNameLvl1(String nameLvl1) {
		NameLvl1 = nameLvl1;
	}

	public static String getUnit( int nb,int ilo) {
		
		return Tab.get(ilo).get(nb);

	}


	public static void newIlot(ArrayList<String> ilot,String name ,String[] Unit ) {
		ilot.add(name);
		for(int i=1 ; i<Unit.length;i++)
		{
			ilot.add(Unit[i]);
		}
		Tab.add(ilot);

	}



	public static int getNbIlot() {
		return  Tab.size();
	}


	public static int getNbUnit(int ilo) {
		return  Tab.get(ilo).size();
	}



}
