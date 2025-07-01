package Vista;

import java.awt.Color;  
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

public class Pago extends javax.swing.JFrame {

    public Pago() {
        initComponents();
        setSize(410, 854);
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));

        btnEfectivo.addActionListener(e -> rbtEfectivo.setSelected(true));

        rbtEfectivo.addActionListener(e -> {});

        btnYape.addActionListener(e -> rbtYape.setSelected(true));

        rbtYape.addActionListener(e -> {});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAtras1 = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rbtYape = new javax.swing.JRadioButton();
        rbtEfectivo = new javax.swing.JRadioButton();
        btnYape = new javax.swing.JButton();
        btnEfectivo = new javax.swing.JButton();
        jMarca = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtrasCarrito.png"))); // NOI18N
        btnAtras1.setBorderPainted(false);
        btnAtras1.setContentAreaFilled(false);
        btnAtras1.setDefaultCapable(false);
        btnAtras1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtrasCarrito1.png"))); // NOI18N
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

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

        buttonGroup1.add(rbtYape);
        getContentPane().add(rbtYape, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 289, 20, 50));

        buttonGroup1.add(rbtEfectivo);
        getContentPane().add(rbtEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 199, 20, 50));

        btnYape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnYape.png"))); // NOI18N
        btnYape.setBorderPainted(false);
        btnYape.setContentAreaFilled(false);
        btnYape.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnYape1.png"))); // NOI18N
        btnYape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYapeActionPerformed(evt);
            }
        });
        getContentPane().add(btnYape, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 370, 90));

        btnEfectivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEfectivo.png"))); // NOI18N
        btnEfectivo.setBorderPainted(false);
        btnEfectivo.setContentAreaFilled(false);
        btnEfectivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEfectivo1.png"))); // NOI18N
        getContentPane().add(btnEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 370, 90));

        jMarca.setFont(new java.awt.Font("Poppins ExtraLight", 0, 15)); // NOI18N
        jMarca.setForeground(new java.awt.Color(43, 43, 43));
        jMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarca.setText("©2023 Elaborado y diseñado por FoodV");
        getContentPane().add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 410, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ModoPago.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        Carrito ca = new Carrito();
        ca.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (rbtYape.isSelected()) {
            createEmail();
            PedidoRealizado pa = new PedidoRealizado();
            pa.setVisible(true);
            dispose();
            
        } else if (rbtEfectivo.isSelected()) {
            PedidoRealizado pa = new PedidoRealizado();
            pa.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una opción antes de continuar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnYapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYapeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYapeActionPerformed

    private void createEmail() {
        try {
        Properties propiedades = new Properties();
            propiedades.put("mail.smtp.host", "smtp.gmail.com");
            propiedades.put("mail.smtp.port", "465");
            propiedades.put("mail.smtp.auth", "true");
            propiedades.put("mail.smtp.starttls.enable", "true");
            propiedades.put("mail.smtp.starttls.required", "true");
            propiedades.put("mail.smtp.ssl.protocols", "TLSv1.2");
            propiedades.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        
        Session sesion = Session.getDefaultInstance(propiedades);
        String correo_emisor = "foodv2023@gmail.com";
        String contraseña_emisor = "hdbsypqhfsizbskk";
        
        String correo_receptor = "xmontanoga@ucvvirtual.edu.pe";
        String asunto = "Pedido realizado";
        String mensaje = "Hola, has realizado tu pedido mediante FoodV. <br> Este es la lista de productos adquiridos: <br> El método de pago elegido fue Yape/Plin, escanee este código QR para finalizar exitosamente la compra.";
        
        
        BodyPart texto = new MimeBodyPart();
        texto.setContent(mensaje, "text/html");
        
        MimeMultipart partes = new MimeMultipart();
        partes.addBodyPart(texto);
        
        MimeMessage message = new MimeMessage(sesion);
        message.setFrom(new InternetAddress(correo_emisor));        
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo_receptor));
        message.setSubject(asunto);
        message.setContent(partes);
        
        Transport transporte = sesion.getTransport("smtp");
        transporte.connect(correo_emisor,contraseña_emisor);
        transporte.sendMessage(message , message.getRecipients(Message.RecipientType.TO));
        transporte.close();
        
        JOptionPane.showMessageDialog(null,"El mensaje se ha enviado. ");
        
        } catch (AddressException ex) {
           JOptionPane.showMessageDialog(null,"Error : " +ex);
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null,"Error : " +ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnEfectivo;
    private javax.swing.JButton btnYape;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMarca;
    private javax.swing.JRadioButton rbtEfectivo;
    private javax.swing.JRadioButton rbtYape;
    // End of variables declaration//GEN-END:variables
}
