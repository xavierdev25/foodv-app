package Vista;

import java.awt.Color;
import javax.swing.JLabel;

public class Principal extends javax.swing.JFrame {
    private String nombreUsuario;
    
    public Principal() {
        initComponents();
        this.setSize(410, 854);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        lblBienvenido.setText("Bienvenido, " + nombreUsuario + "!");
    }

    public JLabel getLblBienvenido() {
        return lblBienvenido;
    }

    public void setLblBienvenido(JLabel lblBienvenido) {
        this.lblBienvenido = lblBienvenido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBebidas = new javax.swing.JButton();
        jMarca = new javax.swing.JLabel();
        btnPostres = new javax.swing.JButton();
        btnAdquirir = new javax.swing.JButton();
        jPromo = new javax.swing.JLabel();
        btnSnacks = new javax.swing.JButton();
        lblBienvenido = new javax.swing.JLabel();
        jUser = new javax.swing.JLabel();
        btnCarrito = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bebidas.png"))); // NOI18N
        btnBebidas.setBorderPainted(false);
        btnBebidas.setContentAreaFilled(false);
        btnBebidas.setDefaultCapable(false);
        btnBebidas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bebidas1.png"))); // NOI18N
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, 110));

        jMarca.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        jMarca.setForeground(new java.awt.Color(43, 43, 43));
        jMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarca.setText("©2023 Elaborado y diseñado por FoodV");
        getContentPane().add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 410, -1));

        btnPostres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Postres.png"))); // NOI18N
        btnPostres.setBorderPainted(false);
        btnPostres.setContentAreaFilled(false);
        btnPostres.setDefaultCapable(false);
        btnPostres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Postres1.png"))); // NOI18N
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 180, 110));

        btnAdquirir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adquirir.png"))); // NOI18N
        btnAdquirir.setToolTipText("");
        btnAdquirir.setBorderPainted(false);
        btnAdquirir.setContentAreaFilled(false);
        btnAdquirir.setDefaultCapable(false);
        btnAdquirir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Adquirir1.png"))); // NOI18N
        btnAdquirir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdquirirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdquirir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 90, 40));

        jPromo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPromo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Popular.png"))); // NOI18N
        getContentPane().add(jPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 330, -1));

        btnSnacks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Snacks.png"))); // NOI18N
        btnSnacks.setBorderPainted(false);
        btnSnacks.setContentAreaFilled(false);
        btnSnacks.setDefaultCapable(false);
        btnSnacks.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Snacks1.png"))); // NOI18N
        btnSnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnacksActionPerformed(evt);
            }
        });
        getContentPane().add(btnSnacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 170, 110));

        lblBienvenido.setFont(new java.awt.Font("Poppins SemiBold", 0, 11)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(53, 53, 53));
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBienvenido.setText("Bienvenido");
        getContentPane().add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, 40));

        jUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png"))); // NOI18N
        getContentPane().add(jUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 40));

        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito.png"))); // NOI18N
        btnCarrito.setBorderPainted(false);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito1.png"))); // NOI18N
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 70, 70));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Principal.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        Carrito Ca = new Carrito();
        Ca.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnacksActionPerformed
        Snacks Sn = new Snacks();
        Sn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSnacksActionPerformed

    private void btnAdquirirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdquirirActionPerformed
        Bebidas Be = new Bebidas();
        Be.getSpnIncaKola().setValue(1);
        Be.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdquirirActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        Postres Po= new Postres();
        Po.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPostresActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        Bebidas Be = new Bebidas();
        Be.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBebidasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdquirir;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnPostres;
    private javax.swing.JButton btnSnacks;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel jPromo;
    private javax.swing.JLabel jUser;
    private javax.swing.JLabel lblBienvenido;
    // End of variables declaration//GEN-END:variables
}
