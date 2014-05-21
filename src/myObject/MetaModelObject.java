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
    
    abstract void addObjectToMetaModel();
    
    abstract void createObject();
    
    abstract void deleteObject();
    
    abstract void updateObject();
    
    abstract void associateObject(MetaModelObject secondObject);
    
    abstract void dissociateObject(MetaModelObject secondObject);
}
