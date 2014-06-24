/**
 * Frame to create or edit a segment
 */
package IHM.frameObject;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.*;
import myObject.*;

/**
 *
 * @author Mary
 */
public class FrameSegment extends javax.swing.JFrame {

    private Segment segment = null;
    
    /**
     * Creates new form FrameSegment when user create a new segment
     */
    public FrameSegment() {
        initComponents();
    }
    
    /**
     * Creates new form FrameProcess when user update a existing process
     * @param segment segment to update
     */
    public FrameSegment(Segment segment){
        this.segment = segment;
        initComponents();
        setIcon();
        loadValue();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jLabelIdValue = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabelResponsible = new javax.swing.JLabel();
        jLabelResponsibleDeputy = new javax.swing.JLabel();
        jComboBoxResponsibleDeputy = new javax.swing.JComboBox();
        jComboBoxResponsible = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelListProcess = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProcess = new javax.swing.JList();
        jButtonAddProcess = new javax.swing.JButton();
        jButtonRemoveProcess = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabelName.setText("Nom");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelId.setText("ID");

        jLabelIdValue.setText("valID");

        jLabelDescription.setText("Description");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelIdValue)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelName)
                                .addComponent(jLabelId))
                            .addGap(25, 25, 25)))
                    .addComponent(jLabelDescription)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelIdValue)
                .addGap(18, 18, 18)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Information générale", jPanel1);

        jLabelResponsible.setText("Responsable");

        jLabelResponsibleDeputy.setText("responsable suppléant");

        jComboBoxResponsibleDeputy.setModel(new javax.swing.DefaultComboBoxModel(data.IHM.DataIHM.loadResponsible()));

        jComboBoxResponsible.setModel(new javax.swing.DefaultComboBoxModel(data.IHM.DataIHM.loadResponsible()));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelResponsible)
                    .addComponent(jLabelResponsibleDeputy)
                    .addComponent(jComboBoxResponsible, 0, 200, Short.MAX_VALUE)
                    .addComponent(jComboBoxResponsibleDeputy, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResponsible)
                .addGap(11, 11, 11)
                .addComponent(jComboBoxResponsible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelResponsibleDeputy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxResponsibleDeputy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Organisation", jPanel2);

        jLabelListProcess.setText("Quariters soutient");

        jListProcess.setModel(new javax.swing.AbstractListModel() {
            myObject.Process[] tabProcess = data.IHM.DataIHM.getListProcess(segment);
            public int getSize() { return tabProcess.length; }
            public Object getElementAt(int i) { return tabProcess[i]; }
        });
        jScrollPane2.setViewportView(jListProcess);

        jButtonAddProcess.setText("Ajouter quartier");
        jButtonAddProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProcessActionPerformed(evt);
            }
        });

        jButtonRemoveProcess.setText("Enlever quartier");
        jButtonRemoveProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelListProcess)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButtonAddProcess)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemoveProcess))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelListProcess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddProcess)
                    .addComponent(jButtonRemoveProcess))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Architecture", jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 91;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 10, 0, 10);
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        jButtonSave.setText("Valider");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 59, 15, 0);
        getContentPane().add(jButtonSave, gridBagConstraints);

        jButtonCancel.setText("Annuler");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 124, 15, 0);
        getContentPane().add(jButtonCancel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void loadValue(){
      jTextFieldName.setText(this.segment.getName());
      jLabelIdValue.setText(Integer.toString(this.segment.getId()));
      jTextAreaDescription.setText(this.segment.getDescription());
      jComboBoxResponsible.setSelectedItem(this.segment.getResponsible());
      jComboBoxResponsibleDeputy.setSelectedItem(this.segment.getResponsibledeputy());
      
  }
          
    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
        //A supprimer
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    /**
     * Create or update segment
     * @param evt 
     */
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        if(segment == null){
            segment = new Segment(jTextFieldName.getText(), jTextAreaDescription.getText(), 
            (Responsible) jComboBoxResponsible.getSelectedItem(), (Responsible) jComboBoxResponsibleDeputy.getSelectedItem(), 
            (ArrayList<myObject.Process>) new ArrayList<myObject.Process>());
            segment.createObject();
            JOptionPane.showMessageDialog(null,"Zone " + segment.getName() + " créer");
            this.dispose();
                
            
        }else{
            segment = new Segment(Integer.parseInt(jLabelIdValue.getText()), jTextFieldName.getText(), jTextAreaDescription.getText(), 
            (Responsible) jComboBoxResponsible.getSelectedItem(), (Responsible) jComboBoxResponsibleDeputy.getSelectedItem(), 
            (ArrayList<myObject.Process>) new ArrayList<myObject.Process>());
            segment.updateObject();
            JOptionPane.showMessageDialog(null,"Zone " + segment.getName() + " modifier");
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    /**
     * Close the frame
     * @param evt 
     */
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * To add a segment, call a new frame
     * @param evt 
     */
    private void jButtonAddProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProcessActionPerformed
        // TODO add your handling code here:
        if(segment != null){
            FrameAssoToSegment win = new FrameAssoToSegment(segment);
            win.setVisible(true);
            win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }else{
            JOptionPane.showMessageDialog(null,"Merci de d'abord valider la création de votre zone");
        }
    }//GEN-LAST:event_jButtonAddProcessActionPerformed

    /**
     * To remove a segment, call a new frame
     * @param evt 
     */
    private void jButtonRemoveProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveProcessActionPerformed
        // TODO add your handling code here:
        if(segment != null){
            if(jListProcess.getSelectedValue() == null)
            {
                JOptionPane.showMessageDialog(null,"Choisiez d'abord un quartier à enelver");
            }else{
                int dialogResult = JOptionPane.showConfirmDialog (null, "Voulez vous vraiment dissocier " + jListProcess.getSelectedValue() + 
                                                                   " à votre zone " + segment.getName() + " ?");
                if(dialogResult == JOptionPane.YES_OPTION){
                   myObject.Process process = (myObject.Process) jListProcess.getSelectedValue();
                   data.database.CrudDatabase.updateAssoProcessToSegment(process);
                   JOptionPane.showMessageDialog(null, "Association supprimée");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Merci de d'abord valider la création de votre zone");
        }
    }//GEN-LAST:event_jButtonRemoveProcessActionPerformed

    /**
     * Windows reload her-self the list of process in the Jlist
     * @param evt 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jListProcess.setModel(new javax.swing.AbstractListModel() {
            myObject.Process[] tabProcess = data.IHM.DataIHM.getListProcess(segment);
            public int getSize() { return tabProcess.length; }
            public Object getElementAt(int i) { return tabProcess[i]; }
        });
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FrameSegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSegment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSegment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddProcess;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRemoveProcess;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxResponsible;
    private javax.swing.JComboBox jComboBoxResponsibleDeputy;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIdValue;
    private javax.swing.JLabel jLabelListProcess;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelResponsible;
    private javax.swing.JLabel jLabelResponsibleDeputy;
    private javax.swing.JList jListProcess;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

   private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("usi.png")));
    }
}
