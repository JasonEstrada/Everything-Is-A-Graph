/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everythig_is_a_graph;

import javax.swing.JFrame;

/**
 *
 * @author ACER_
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();

        this.setLocationRelativeTo(null);
        ButtonTransparent();
      
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        credits = new javax.swing.JButton();
        GO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(894, 624));
        setMinimumSize(new java.awt.Dimension(894, 624));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(894, 624));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close (2).png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 40, 40));

        credits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsMouseClicked(evt);
            }
        });
        getContentPane().add(credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 50, 60));

        GO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GOMouseClicked(evt);
            }
        });
        GO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOActionPerformed(evt);
            }
        });
        getContentPane().add(GO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 190, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/INICIO.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 920, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOActionPerformed
      
    }//GEN-LAST:event_GOActionPerformed

    private void GOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GOMouseClicked
        Ventana1 ventana = new Ventana1();
        ventana.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_GOMouseClicked

    private void creditsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsMouseClicked
        Credit credit = new Credit();
        credit.setVisible(true);
    }//GEN-LAST:event_creditsMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    public void ButtonTransparent() {
        GO.setOpaque(false);
        GO.setContentAreaFilled(false);
        GO.setBorderPainted(false);
        credits.setOpaque(false);
        credits.setContentAreaFilled(false);
        credits.setBorderPainted(false);
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        
    }

    /**
     *
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GO;
    private javax.swing.JButton credits;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
