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
abstract class MetaModelObject {
    private static ArrayList<MetaModelObject> listObject = new ArrayList<MetaModelObject>();
    private static ArrayList<String> listOfTypeObject = new ArrayList<String>();

    public ArrayList<MetaModelObject> getListObject() {
        return listObject;
    }
    
    public ArrayList<String> getListOfTypeObject() {
        return listOfTypeObject;
    }
    
    public static ArrayList<String> getListOfTypeObject(String type) {
        return listOfTypeObject;
    }
    
    public abstract void addObjectToMetaModel();
    
    public abstract void createObject();
    
    public abstract void deleteObject();
    
    public abstract void updateObject();
    
    public abstract void associateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract void dissociateObject(MetaModelObject secondObject, ArrayList<MetaModelObject> listTarget);
    
    public abstract void sizeObject();
}
