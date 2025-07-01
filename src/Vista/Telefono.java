package Vista;
import java.awt.Color;

import Conexion.ConectarBD;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//Verificación SMS
import java.net.*;
import java.util.Base64;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Telefono extends javax.swing.JFrame {
    private String correoUsuario;
    private String numeroTelefono = "";
    private String nombreUsuario = "";
    Random random = new Random();
        int min = 100000;
        int max = 999999;
        int otp = 123123; //random.nextInt((max - min) + min);
        
    public Telefono() {
        initComponents();
        this.setSize(410, 854);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        txtSMS = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jCuadroSMS = new javax.swing.JLabel();
        jCuadroCorreo = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins ExtraLight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("©2023 Elaborado y diseñado por FoodV");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 410, -1));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnConfirmar.png"))); // NOI18N
        btnConfirmar.setBorderPainted(false);
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnConfirmar1.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 410, -1));

        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerificar.png"))); // NOI18N
        btnVerificar.setBorderPainted(false);
        btnVerificar.setContentAreaFilled(false);
        btnVerificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerificar1.png"))); // NOI18N
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 238, 170, 80));

        txtSMS.setBackground(new java.awt.Color(255, 255, 255));
        txtSMS.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtSMS.setForeground(new java.awt.Color(153, 153, 153));
        txtSMS.setText("Código SMS");
        txtSMS.setBorder(null);
        txtSMS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSMSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSMSFocusLost(evt);
            }
        });
        getContentPane().add(txtSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 257, 150, 40));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));
        txtCorreo.setText("Ingrese el correo");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 197, 300, 40));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtras.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtras1.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 80));

        jCuadroSMS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cdrCodigo.png"))); // NOI18N
        getContentPane().add(jCuadroSMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 180, -1));

        jCuadroCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCuadroCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cdrCorreo.png"))); // NOI18N
        getContentPane().add(jCuadroCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 410, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Telefono.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        String correoIngresado = txtCorreo.getText();

        try {
            ConectarBD conexionBD = new ConectarBD();
            String query = "SELECT correo, telefono, nombre FROM Usuarios WHERE correo = ?";
            PreparedStatement ps = conexionBD.conexion.prepareStatement(query);
            ps.setString(1, correoIngresado);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                numeroTelefono = rs.getString("telefono");
                nombreUsuario = rs.getString("nombre");
                this.correoUsuario = rs.getString("correo");

                String myURI = "https://api.bulksms.com/v1/messages";
                String myUsername = "";
                String myPassword = "";
                String myData = "{to: \"" + numeroTelefono + "\", body: \"Tu codigo de verificacion para acceder a FoodV es: " + otp + " \"}";

                this.correoUsuario = rs.getString("correo");
                numeroTelefono = rs.getString("telefono");
                nombreUsuario = rs.getString("nombre");

                Mensaje mensajeForm = new Mensaje();
                mensajeForm.setNumTelefono(numeroTelefono);
                mensajeForm.setVisible(true);

                this.correoUsuario = rs.getString("correo");

                URL url = new URL(myURI);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                request.setDoOutput(true);

                String authStr = myUsername + ":" + myPassword;
                String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
                request.setRequestProperty("Authorization", "Basic " + authEncoded);

                request.setRequestMethod("POST");
                request.setRequestProperty("Content-Type", "application/json");

                try (OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream())) {
                    out.write(myData);
                } catch (IOException ex) {
                    Logger.getLogger(Telefono.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    InputStream response = request.getInputStream();
                    try (BufferedReader in = new BufferedReader(new InputStreamReader(response))) {
                        String replyText;
                        while ((replyText = in.readLine()) != null) {
                            System.out.println(replyText);
                        }
                    }
                } catch (IOException ex) {
                    System.out.println("An error occurred:" + ex.getMessage());
                    try (BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()))) {
                        String replyText;
                        while ((replyText = in.readLine()) != null) {
                            System.out.println(replyText);
                        }
                    } catch (IOException ex1) {
                        Logger.getLogger(Telefono.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
                request.disconnect();

            } else {
                JOptionPane.showMessageDialog(this, "Correo no encontrado en la base de datos");
            }

        } catch (SQLException | MalformedURLException ex) {
            Logger.getLogger(Telefono.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (ProtocolException ex) {
            Logger.getLogger(Telefono.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Telefono.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txtSMSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSMSFocusGained
        if (txtSMS.getText().equals("Código SMS")) {
            txtSMS.setText("");
            txtSMS.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtSMSFocusGained

    private void txtSMSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSMSFocusLost
        if (txtSMS.getText().isEmpty()) {
            txtSMS.setText("Código SMS");
            txtSMS.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtSMSFocusLost

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        if (txtCorreo.getText().equals("Ingrese el correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese el correo");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Logeo lo = new Logeo();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String codigoIngresado = txtSMS.getText();
        if (codigoIngresado.equals(String.valueOf(otp))) {
            Principal pr = new Principal();
            pr.setNombreUsuario(nombreUsuario);
            pr.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Código incorrecto. Por favor, verifica el código e inténtalo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telefono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jCuadroCorreo;
    private javax.swing.JLabel jCuadroSMS;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtSMS;
    // End of variables declaration//GEN-END:variables
}
