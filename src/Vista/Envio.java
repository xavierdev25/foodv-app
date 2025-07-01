package Vista;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Envio extends javax.swing.JFrame {
    public Envio() {
        initComponents();
        this.setSize(410, 854);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));

        btnTienda.addActionListener(e -> rbtTienda.setSelected(true));
        btnDelivery.addActionListener(e -> rbtDelivery.setSelected(true));

        lblEnvio.setVisible(false);
    }

    public void setLblEnvioText(String texto) {
        lblEnvio.setText(texto);
        lblEnvio.setVisible(true);
    }

    public javax.swing.JLabel getLblEnvio() {
        return lblEnvio;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblEnvio = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();
        rbtDelivery = new javax.swing.JRadioButton();
        rbtTienda = new javax.swing.JRadioButton();
        btnTienda = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();
        jMarca = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnvio.setText("jLabel2");
        getContentPane().add(lblEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        btnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnContinuarCarrito.png"))); // NOI18N
        btnContinuar.setBorderPainted(false);
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.setDefaultCapable(false);
        btnContinuar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnContinuarCarrito1.png"))); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, -1, -1));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Todo conforme?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 410, -1));

        btnAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtrasCarrito.png"))); // NOI18N
        btnAtras1.setBorderPainted(false);
        btnAtras1.setContentAreaFilled(false);
        btnAtras1.setDefaultCapable(false);
        btnAtras1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtrasCarrito1.png"))); // NOI18N
        btnAtras1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtrasCarrito1.png"))); // NOI18N
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        buttonGroup1.add(rbtDelivery);
        rbtDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDeliveryActionPerformed(evt);
            }
        });
        getContentPane().add(rbtDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 289, 20, 50));

        buttonGroup1.add(rbtTienda);
        getContentPane().add(rbtTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 199, 20, 50));

        btnTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnTienda.png"))); // NOI18N
        btnTienda.setBorderPainted(false);
        btnTienda.setContentAreaFilled(false);
        btnTienda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnTienda1.png"))); // NOI18N
        getContentPane().add(btnTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 370, 90));

        btnDelivery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDelivery.png"))); // NOI18N
        btnDelivery.setToolTipText("");
        btnDelivery.setBorderPainted(false);
        btnDelivery.setContentAreaFilled(false);
        btnDelivery.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDelivery1.png"))); // NOI18N
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 370, 90));

        jMarca.setFont(new java.awt.Font("Poppins ExtraLight", 0, 15)); // NOI18N
        jMarca.setForeground(new java.awt.Color(43, 43, 43));
        jMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarca.setText("©2023 Elaborado y diseñado por FoodV");
        getContentPane().add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 410, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ModoEnvio.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (rbtTienda.isSelected() || rbtDelivery.isSelected()) {
            Pago pa = new Pago();
            pa.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una opción antes de continuar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        Carrito ca = new Carrito();
        ca.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void rbtDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDeliveryActionPerformed
        MiniDelivery md = new MiniDelivery();
        md.setVisible(true);
    }//GEN-LAST:event_rbtDeliveryActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        MiniDelivery md = new MiniDelivery();
        md.setVisible(true);
    }//GEN-LAST:event_btnDeliveryActionPerformed

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
            java.util.logging.Logger.getLogger(Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Envio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Envio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnTienda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel lblEnvio;
    private javax.swing.JRadioButton rbtDelivery;
    private javax.swing.JRadioButton rbtTienda;
    // End of variables declaration//GEN-END:variables
}
