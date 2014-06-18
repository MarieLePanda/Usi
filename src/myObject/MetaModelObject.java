/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myObject;

import java.util.ArrayList;

/**
 *
 * @author lug13995
 */
public abstract class MetaModelObject {
   // protected static ArrayList<MetaModelObject> listObject = new ArrayList<MetaModelObject>();
    protected static String[] listOfTypeObject = {"Zone", "Quartier", "Ilot", "Application", "Interface", "Serveur", "Base de données", "Technologie"};
    protected String name;
    protected int id;
    protected static ArrayList<MetaModelObject> listObject;
    
    public ArrayList<MetaModelObject> getListObject() {
        return listObject;
    }
    
    public ArrayList<MetaModelObject> getListObject(String filtre) {
        return listObject;        
    }
    
    
    public String[] getListOfTypeObject() {
        return listOfTypeObject;
    }
    
    /**
     * @return the id
     */
    public int getId() {
	return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
    	this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
    	return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }
    
    
    public void addObjectToMetaModel(){
        listObject.add(this);
    }
    
    public abstract void createObject();
    
    public abstract void deleteObject();
    
    public abstract void updateObject();
    
    public abstract void associateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract void dissociateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract int sizeObject();
    
    public static ArrayList<Segment> listOfSegment(){
        ArrayList<Segment> segments = new ArrayList<Segment>();
        for(MetaModelObject s : listObject){
            if(s instanceof Segment)
                segments.add((Segment) s);
        }
        return segments;
    }
    
    public static ArrayList<myObject.Process> listOfProcess(){
        ArrayList<myObject.Process> process = new ArrayList<myObject.Process>();
        for(MetaModelObject p : listObject){
            if(p instanceof myObject.Process)
                process.add((myObject.Process) p);
        }
        return process;
    }
    
    public static ArrayList<Capability> listOfCapability(){
        ArrayList<Capability> capabilities = new ArrayList<Capability>();
        for(MetaModelObject c : listObject){
            if(c instanceof Segment)
                capabilities.add((Capability) c);
        }
        return capabilities;
    }
    
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MetaModelObject other = (MetaModelObject) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
