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
    protected static ArrayList<MetaModelObject> listObject = new ArrayList<MetaModelObject>();
    protected final static String[] listOfTypeObject = {"Zone", "Quartier", "Ilot", "Application", "Interface", "Serveur", "Base de données", "Technologie","Responsible"};
    protected String name;
    protected int id;
    /*public ArrayList<MetaModelObject> getListObject() {
        return listObject;
    }
    
    public ArrayList<MetaModelObject> getListObject(String filtre) {
        return listObject;        
    }*/
    
    
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
    
    
    public abstract void addObjectToMetaModel();
    
    public abstract void createObject();
    
    public abstract void deleteObject();
    
    public abstract void updateObject();
    
    public abstract void associateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract void dissociateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract int sizeObject();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if(this == obj){
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MetaModelObject other = (MetaModelObject) obj;
        return this.id == other.id;
    }
    

}
