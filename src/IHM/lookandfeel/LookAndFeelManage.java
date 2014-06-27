/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM.lookandfeel;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lug13995
 */
public class LookAndFeelManage {
    
    public static ArrayList<String> nameLook = new ArrayList<String>();
    
    public static void loadDefautLook(){

        //nameLook.add("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        nameLook.add("de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel");
        nameLook.add("de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel");
        nameLook.add("de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel");
        nameLook.add("de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel");
        nameLook.add("de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel");
        nameLook.add("de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel");
        nameLook.add("de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel");
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel");
        } catch (InstantiationException ex) {
            Logger.getLogger(LookAndFeelManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LookAndFeelManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LookAndFeelManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch(ClassNotFoundException ex){
            Logger.getLogger(LookAndFeelManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void changeLook(String lf){
        System.out.println(lf);
        try {
            UIManager.setLookAndFeel(lf);
            
        } catch (InstantiationException ex) {
            System.out.println(ex.toString());
        } catch (IllegalAccessException ex) {
            System.out.println(ex.toString());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex.toString());      
        } catch(ClassNotFoundException ex){
            System.out.println(ex.toString());
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
}
