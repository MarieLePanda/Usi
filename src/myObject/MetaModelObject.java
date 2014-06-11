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

    /*public ArrayList<MetaModelObject> getListObject() {
        return listObject;
    }
    
    public ArrayList<MetaModelObject> getListObject(String filtre) {
        return listObject;        
    }*/
    
    public String[] getListOfTypeObject() {
        return listOfTypeObject;
    }
    
    
    public abstract void addObjectToMetaModel();
    
    public abstract void createObject();
    
    public abstract void deleteObject();
    
    public abstract void updateObject();
    
    public abstract void associateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract void dissociateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract int sizeObject();
}
