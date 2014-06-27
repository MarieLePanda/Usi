/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM.lookandfeel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lug13995
 */
public class LookAndFeelManage {
    
    public static HashMap nameLook = new HashMap();
    
    public static void loadDefautLook(){

        //nameLook.add("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        nameLook.put("Greeb Dream", "de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel");
        nameLook.put("Silver Moon", "de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel");
        nameLook.put("Blue Moon", "de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel");
        nameLook.put("Black Star", "de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel");
        nameLook.put("Black Moon", "de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel");
        nameLook.put("Blue Ice", "de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel");
        nameLook.put("Blue Ligt", "de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel");
        try {
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel");
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
