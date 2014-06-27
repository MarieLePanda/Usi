/**
 * Main frame of the application. We found all object existing in the metamodel
 */
package IHM;

import IHM.frameAdmin.FrameAdmin;
import IHM.frameObject.*;
import IHM.lookandfeel.LookAndFeelManage;
import data.IHM.DataIHM;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import launcherUsi.Launcher;
import myObject.*;
import plugin.IModule;
import plugin.ModuleLoader;

/**
 * Create a main frame witch data loaded
 * @author Mary
 */
public class MainFrame extends javax.swing.JFrame{

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
       
        ModuleLoader.loadPlugin();
        initComponents();
        this.setTitle("Gestion MetaModel");
        setIcon();
        this.setLocationRelativeTo(null);
           
        if(Launcher.userConnected.getAdministrator() == false)
            jMenuAdministration.setVisible(false);
        if(ModuleLoader.listModule.size() > 0){
            for(final IModule m : ModuleLoader.listModule)
            {
                ActionListener ls = new ActionListener() {

                   public void actionPerformed(ActionEvent e) {
                       m.start();
                   }
               };
                JMenuItem jm = new JMenuItem(m.getName());
                jm.addActionListener(ls);
               jMenuPlugin.add(jm);
               
            }
        }else
            jMenuPlugin.add(new JMenuItem("<Aucun pluging>"));
        
        for(final String lf : LookAndFeelManage.nameLook)
            {
                ActionListener ls = new ActionListener() {

                   public void actionPerformed(ActionEvent e) {
                       LookAndFeelManage.changeLook(lf);
                       JOptionPane.showMessageDialog(null,"Thème changé");
                   }
               };
                JMenuItem jm = new JMenuItem(lf);
                jm.addActionListener(ls);
               jMenuLook.add(jm);
               
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultMutableTreeNode root;
        root = DataIHM.initTree();
        jTreeMetaModel = new javax.swing.JTree(root);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuObject = new javax.swing.JMenu();
        jMenuCreate = new javax.swing.JMenu();
        jMenuUpdate = new javax.swing.JMenu();
        jMenuDelete = new javax.swing.JMenu();
        jMenuAdministration = new javax.swing.JMenu();
        jMenuPlugin = new javax.swing.JMenu();
        jMenuLook = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jTreeMetaModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMetaModelMouseClicked(evt);
            }
        });
        jTreeMetaModel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTreeMetaModelFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTreeMetaModel);

        jMenuObject.setText("Objet");

        jMenuCreate.setText("Créer");
        jMenuCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCreateMouseClicked(evt);
            }
        });
        jMenuObject.add(jMenuCreate);

        jMenuUpdate.setText("Modifier");
        jMenuUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuUpdateMouseClicked(evt);
            }
        });
        jMenuObject.add(jMenuUpdate);

        jMenuDelete.setText("Supprimer");
        jMenuDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDeleteMouseClicked(evt);
            }
        });
        jMenuObject.add(jMenuDelete);

        jMenuBar1.add(jMenuObject);

        jMenuAdministration.setText("Administration");
        jMenuAdministration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAdministrationMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAdministration);

        jMenuPlugin.setText("Plugin");
        jMenuPlugin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPluginMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuPlugin);

        jMenuLook.setText("Look");
        jMenuBar1.add(jMenuLook);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeMetaModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMetaModelMouseClicked
        // TODO add your handling code here:
        // A supprimer
    }//GEN-LAST:event_jTreeMetaModelMouseClicked

    private void jTreeMetaModelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTreeMetaModelFocusGained
        // TODO add your handling code here:
        //A supprimer
    }//GEN-LAST:event_jTreeMetaModelFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        //A supprimer
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
        //A supprimer
    }//GEN-LAST:event_formWindowStateChanged

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
        //A supprimer
    }//GEN-LAST:event_formPropertyChange

    /**
     * Windows reload her-self the JTree
     * @param evt 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        jTreeMetaModel.setModel(new javax.swing.JTree(DataIHM.initTree()).getModel());
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCreateMouseClicked
        // TODO add your handling code here:      
        FrameNewObject win = new FrameNewObject();
        win.setVisible(true);
        win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuCreateMouseClicked

    private void jMenuUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuUpdateMouseClicked
        // TODO add your handling code here:
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTreeMetaModel.getLastSelectedPathComponent();
        try{
            if(node != null){
                MetaModelObject __aucun = (MetaModelObject) node.getUserObject();
                if(__aucun.getName().equals("__Aucun"))
                    JOptionPane.showMessageDialog(null,"Seul un panda peut le faire");
                else{
                    if(node.getUserObject() instanceof Segment){
                        FrameSegment win = new FrameSegment((Segment) node.getUserObject());
                        win.setVisible(true);
                        win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    }
                    else if(node.getUserObject() instanceof myObject.Process){
                        FrameProcess win = new FrameProcess((myObject.Process) node.getUserObject());
                        win.setVisible(true);
                        win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    }
                    else if(node.getUserObject() instanceof Capability){
                        FrameProcess win = new FrameProcess((Capability) node.getUserObject());
                        win.setVisible(true);
                        win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    }
                }
            } else{
                JOptionPane.showMessageDialog(null,"Choisisez d'abord un objet à modifier");
            }
        }catch(ClassCastException e){
            JOptionPane.showMessageDialog(null,"Ceci n'est pas un objet");
        }
        
    }//GEN-LAST:event_jMenuUpdateMouseClicked

    private void jMenuDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDeleteMouseClicked
        // TODO add your handling code here:
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTreeMetaModel.getLastSelectedPathComponent();
        try{
            if(node != null){
                MetaModelObject __aucun = (MetaModelObject) node.getUserObject();
                if(__aucun.getName().equals("__Aucun"))
                    JOptionPane.showMessageDialog(null,"Seul un panda peut le faire");
                else{
                    int dialogResult = JOptionPane.showConfirmDialog(null, "Êtes vous sur de vouloir supprimer l'objet " + node.toString());
                    {
                        MetaModelObject objectDelete = (MetaModelObject) node.getUserObject();
                        if(dialogResult == JOptionPane.YES_OPTION){
                            objectDelete.deleteObject();
                            JOptionPane.showMessageDialog(null,"Objet supprimé");
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null,"Choisisez d'abord un objet à supprimer");
            }
        }catch(ClassCastException e){
            JOptionPane.showMessageDialog(null,"Ceci n'est pas un objet");
        }
        
    }//GEN-LAST:event_jMenuDeleteMouseClicked

    private void jMenuAdministrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAdministrationMouseClicked
        // TODO add your handling code here:
        FrameAdmin win = new FrameAdmin();
        win.setVisible(true);
        win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuAdministrationMouseClicked

    private void jMenuPluginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPluginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuPluginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAdministration;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCreate;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuLook;
    private javax.swing.JMenu jMenuObject;
    private javax.swing.JMenu jMenuPlugin;
    private javax.swing.JMenu jMenuUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTreeMetaModel;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("usi.png")));
    }
}
