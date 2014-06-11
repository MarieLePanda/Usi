/**
 * Main frame of the application. We found all object existing in the metamodel
 */
package IHM;

import IHM.frameObject.*;
import data.IHM.DataIHM;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import myObject.*;

/**
 * Create a main frame witch data loaded
 * @author Mary
 */
public class MainFrame extends javax.swing.JFrame{

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        
        initComponents();

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
        jButtonCreateObject = new javax.swing.JButton();
        jButtonEditObject = new javax.swing.JButton();
        jButtonDeleteObject = new javax.swing.JButton();

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

        jButtonCreateObject.setText("Créer objet");
        jButtonCreateObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateObjectActionPerformed(evt);
            }
        });

        jButtonEditObject.setText("Modifier objet");
        jButtonEditObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditObjectActionPerformed(evt);
            }
        });

        jButtonDeleteObject.setText("Supprimer objet");
        jButtonDeleteObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteObjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCreateObject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditObject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeleteObject)))
                .addContainerGap(383, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreateObject)
                    .addComponent(jButtonEditObject)
                    .addComponent(jButtonDeleteObject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
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
     * Windows reload her-self the list of process in the Jlist
     * @param evt 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jTreeMetaModel.setModel(new javax.swing.JTree(DataIHM.initTree()).getModel());
    }//GEN-LAST:event_formWindowActivated

    /**
     * To create a new object, call a new frame
     * @param evt 
     */
    private void jButtonCreateObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateObjectActionPerformed
        // TODO add your handling code here:
        FrameNewObject win = new FrameNewObject();
        win.setVisible(true);
        win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonCreateObjectActionPerformed

    /**
     * To edit a existing object, call a new frame
     * @param evt 
     */
    private void jButtonEditObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditObjectActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTreeMetaModel.getLastSelectedPathComponent();
        
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
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Choisisez d'abord un objet à modifier");
        }
    }//GEN-LAST:event_jButtonEditObjectActionPerformed

    /**
     * To delete a existing object
     * @param evt 
     */
    private void jButtonDeleteObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteObjectActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTreeMetaModel.getLastSelectedPathComponent();
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
        }
        else{
            JOptionPane.showMessageDialog(null,"Choisisez d'abord un objet à supprimer");
        }     
    }//GEN-LAST:event_jButtonDeleteObjectActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JButton jButtonCreateObject;
    private javax.swing.JButton jButtonDeleteObject;
    private javax.swing.JButton jButtonEditObject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTreeMetaModel;
    // End of variables declaration//GEN-END:variables
}
