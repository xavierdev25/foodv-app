package Vista;

import java.awt.Color;

public class Mensaje extends javax.swing.JFrame {
    public Mensaje() {
        initComponents();
        this.setSize(360, 150);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
    }
    
    public void setNumTelefono(String numTelefono) {
        if (numTelefono.length() >= 3) {
        String ultimosDigitos = numTelefono.substring(numTelefono.length() - 3);
        String censurado = "*".repeat(numTelefono.length() - 3);
        jNumtTelef.setText("Su código ha sido enviado");
        jNumtTelef1.setText("al número de teléfono: " + censurado + ultimosDigitos);
    } else {
        jNumtTelef.setText("Su código ha sido enviado al número de teléfono: " + numTelefono);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        jNumtTelef = new javax.swing.JLabel();
        jNumtTelef1 = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 21.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setDefaultCapable(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 21 (1).png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 40, 40));

        jNumtTelef.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jNumtTelef.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jNumtTelef.setText("jLabel1");
        getContentPane().add(jNumtTelef, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, 30));

        jNumtTelef1.setFont(new java.awt.Font("Poppins Medium", 0, 13)); // NOI18N
        jNumtTelef1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jNumtTelef1.setText("jLabel1");
        getContentPane().add(jNumtTelef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 260, 30));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ConfirmarSMS.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jNumtTelef;
    private javax.swing.JLabel jNumtTelef1;
    // End of variables declaration//GEN-END:variables
}
