package final_project;



import javax.swing.JFrame;

import javax.swing.JOptionPane;


import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JTextArea;
import java.awt.Font;

public class DeleteWorkers extends JFrame {

	 private Controler controller;
	    private Scanner in;
	    
	    /**
	     * Creates new form Material
	     */
	    public DeleteWorkers() {
	        initComponents();
	    }
	    
	    public void setController(Controler controller) {
	        this.controller = controller;
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {
	        jLabel5 = new javax.swing.JLabel();
	        DNI = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jLabel5.setText("DNI");

	        DNI.setText("2625116F");
	        DNI.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                CIFActionPerformed(evt);
	            }
	        });

	        jButton1.setText("Accept");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setText("Cancel");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });
	        
	        JLabel lblNewLabel = new JLabel("Delete Workers Pitch");
	        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(59)
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(jButton2)
	        						.addComponent(jLabel5))
	        					.addGap(69)
	        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	        						.addComponent(jButton1)
	        						.addComponent(DNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(40)
	        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)))
	        			.addContainerGap(141, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGap(28)
	        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	        			.addGap(46)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(jLabel5)
	        				.addComponent(DNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(103)
	        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(jButton2)
	        				.addComponent(jButton1))
	        			.addContainerGap(18, Short.MAX_VALUE))
	        );
	        getContentPane().setLayout(layout);

	                pack();
	            }// </editor-fold>//GEN-END:initComponents

	            private void CIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIFActionPerformed
	                // TODO add your handling code here:
	                in = new Scanner(System.in);
	            }//GEN-LAST:event_CIFActionPerformed

	            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	                // TODO add your handling code here:
	                // accept button
	                try{
	                    this.controller.deleteWorkerPitch(DNI);
	                    JOptionPane.showMessageDialog(null, "worker deleted");
	                    this.controller.commit();
	                    this.controller.backToMenu();
	                } catch (SQLException ex) {
	                    JOptionPane.showMessageDialog(null, "Error deleting worker");
	                    Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
	                    this.controller.backToMenu();
	                }
	            }//GEN-LAST:event_jButton1ActionPerformed

	            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	                // TODO add your handling code here:
	                // cancel button
	                this.setVisible(false);
	                this.controller.backToMenu();
	            }//GEN-LAST:event_jButton2ActionPerformed

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
	                    java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	                } catch (InstantiationException ex) {
	                    java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	                } catch (IllegalAccessException ex) {
	                    java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	                    java.util.logging.Logger.getLogger(Material.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	                }
	                //</editor-fold>

	                /* Create and display the form */
	                java.awt.EventQueue.invokeLater(new Runnable() {
	                    public void run() {
	                        new Material().setVisible(true);
	                    }
	                });
	            }

	            // Variables declaration - do not modify//GEN-BEGIN:variables
	            private javax.swing.JTextField DNI;
	            private javax.swing.JButton jButton1;
	            private javax.swing.JButton jButton2;
	            private javax.swing.JLabel jLabel5;
}