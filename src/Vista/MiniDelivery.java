package Vista;

import java.awt.Color;

public class MiniDelivery extends javax.swing.JFrame {
    public MiniDelivery() {
        initComponents();
        this.setSize(335, 250);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnPiso = new javax.swing.JSpinner();
        lblPiso = new javax.swing.JLabel();
        lblPabellon = new javax.swing.JLabel();
        spnPabellon = new javax.swing.JSpinner();
        lblPisoPabelon = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnPiso.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        getContentPane().add(spnPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 30));

        lblPiso.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblPiso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPiso.setText("Piso:");
        getContentPane().add(lblPiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 90, -1));

        lblPabellon.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        lblPabellon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPabellon.setText("Pabellón:");
        getContentPane().add(lblPabellon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 90, -1));

        spnPabellon.setModel(new javax.swing.SpinnerListModel(new String[] {"A", "B", "C", "D", "E"}));
        getContentPane().add(spnPabellon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, 30));

        lblPisoPabelon.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        lblPisoPabelon.setText("¡Escoja el piso y letra de pabellón!");
        getContentPane().add(lblPisoPabelon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir1.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 100));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegistrar.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setDefaultCapable(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegistrar1.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 140, 100));

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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 40, 40));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniDelivery.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int piso = (int) spnPiso.getValue();
        String pabellon = (String) spnPabellon.getValue();

        Envio envio = new Envio();
        envio.setLblEnvioText("Piso: " + piso + ", Pabellón: " + pabellon);

        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(MiniDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel lblPabellon;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblPisoPabelon;
    private javax.swing.JSpinner spnPabellon;
    private javax.swing.JSpinner spnPiso;
    // End of variables declaration//GEN-END:variables
}
