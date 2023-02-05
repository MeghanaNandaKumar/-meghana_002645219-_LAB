/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.application;
import model.medicine;
import model.observation;
import java.util.ArrayList;


/**
 *
 * @author megha
 */
public class medicineassignjpanel extends javax.swing.JPanel {

    /**
     * Creates new form medicineassignjpanel
     */
    
    private application application;
    
    public medicineassignjpanel() {
        initComponents();
    }
    
     medicineassignjpanel(application application) {
        initComponents();
        this.application = application;
        populatedropdowns();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        observationbox = new javax.swing.JComboBox<>();
        medicinebox = new javax.swing.JComboBox<>();
        assignbutton = new javax.swing.JButton();
        valuedisplay = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        observationbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observationboxActionPerformed(evt);
            }
        });
        add(observationbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, -1));

        add(medicinebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 120, -1));

        assignbutton.setText("ASSIGN");
        assignbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbuttonActionPerformed(evt);
            }
        });
        add(assignbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        valuedisplay.setText("jLabel1");
        add(valuedisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbuttonActionPerformed
        // TODO add your handling code here:
        observation o = (observation) observationbox.getSelectedItem();
        
        medicine m = (medicine) medicinebox.getSelectedItem();
        o.setMedication(m);
    }//GEN-LAST:event_assignbuttonActionPerformed

    private void observationboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observationboxActionPerformed
        // TODO add your handling code here:
        observation o = (observation)observationbox.getSelectedItem();
        if(o.getMedication()!= null)
        {
            valuedisplay.setText(o.getMedication().getMedicineName());
        }
    }//GEN-LAST:event_observationboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignbutton;
    private javax.swing.JComboBox<String> medicinebox;
    private javax.swing.JComboBox<String> observationbox;
    private javax.swing.JLabel valuedisplay;
    // End of variables declaration//GEN-END:variables
 public void populatedropdowns() {
        ArrayList<medicine> medicines = this.application.getCatalog().getMedicineList();
         ArrayList<observation> observations = this.application.getHistory().getVitalSignHistory();
         for(observation o: observations){
             observationbox.addItem(o);
         }
           for(medicine o: medicines){
             medicinebox.addItem(o);
         }
        
        
        
    }
}
