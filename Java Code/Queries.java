/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package final_project;

/**
 *
 * @author Diego de Luis Ballesteros
 */
public class Queries extends javax.swing.JFrame {
    /**
     * Creates new form Queries
     */
    private Worker worker;
    private Controler controller;
    private CouplesList couplesList;
    private ShowMaterials materialList;
    private ShowCollaborators collaboratorsList;
    private ShowReferees refereesList;
    
    public Queries() {
        initComponents();
        worker = new Worker();
        add(worker);
        couplesList = new CouplesList();
        materialList = new ShowMaterials();
        add(materialList);
        collaboratorsList = new ShowCollaborators();
        add(collaboratorsList);
        refereesList = new ShowReferees();
        add(refereesList);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        queries = new javax.swing.JMenu();
        work = new javax.swing.JMenuItem();
        couples = new javax.swing.JMenuItem();
        materials = new javax.swing.JMenuItem();
        collaborators = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenu();
        exitItem = new javax.swing.JMenuItem();
        referees = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        queries.setText("Queries");

        work.setText("Work");
        work.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workActionPerformed(evt);
            }
        });
        queries.add(work);

        couples.setText("Couples");
        couples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                couplesActionPerformed(evt);
            }
        });
        queries.add(couples);
        
        materials.setText("Materials");
        materials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	materialsActionPerformed(evt);
            }
        });
        queries.add(materials);
        
        collaborators.setText("Collaborations");
        collaborators.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	collaboratorsActionPerformed(evt);
            }
        });
        queries.add(collaborators);
        
        referees.setText("Referees");
        referees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	refereesActionPerformed(evt);
            }
        });
        queries.add(referees);

        jMenuBar1.add(queries);

        exit.setText("Exit");

        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        exit.add(exitItem);

        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        // TODO add your handling code here:
        worker.setVisible(false);
        couplesList.setVisible(false);
        materialList.setVisible(false);
        collaboratorsList.setVisible(false);
        refereesList.setVisible(false);
        this.controller.backToMenu();
    }//GEN-LAST:event_exitItemActionPerformed

    private void workActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workActionPerformed
        // TODO add your handling code here:
        worker.setVisible(true);
        worker.setController(this.controller);
    }//GEN-LAST:event_workActionPerformed

    private void couplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couplesActionPerformed
        couplesList.setVisible(true);
        couplesList.setController(this.controller);
    }//GEN-LAST:event_couplesActionPerformed
    

    private void materialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couplesActionPerformed
   
        materialList.setVisible(true);
        materialList.setController(this.controller);
    }//GEN-LAST:event_couplesActionPerformed
    
    private void collaboratorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couplesActionPerformed
    
        collaboratorsList.setVisible(true);
        collaboratorsList.setController(this.controller);
    }//GEN-LAST:event_couplesActionPerformed
    private void refereesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_couplesActionPerformed
        
        refereesList.setVisible(true);
        refereesList.setController(this.controller);
    }//GEN-LAST:event_couplesActionPerformed

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
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu exit;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu queries;
    private javax.swing.JMenuItem couples;
    private javax.swing.JMenuItem work;
    private javax.swing.JMenuItem materials;
    private javax.swing.JMenuItem collaborators;
    private javax.swing.JMenuItem referees;
    
    // End of variables declaration//GEN-END:variables
}


