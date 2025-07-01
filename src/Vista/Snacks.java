package Vista;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class Snacks extends javax.swing.JFrame {
    private static final String[] NOMBRES_PRODUCTOS = {"Margarita", "Picaras", "Tentacion", "Vainilla", "Charada", "Casino", "GloboPop"};
    private static final double[] PRECIOS_PRODUCTOS = {1.20, 1.50, 2.00, 1.50, 1.20, 1.20, 1.00};

    private int cantidadTotal = 0;
    private double precioTotal = 0.0;

    private JSpinner[] spinners = new JSpinner[7];

    private Carrito carritoForm;

    public Snacks() {
        initComponents();
        this.setSize(410, 854);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));

        carritoForm = new Carrito();

        for (int i = 0; i < 7; i++) {
            spinners[i] = obtenerSpinner(i);
            agregarChangeListener(spinners[i], i);
        }
    }

    private void agregarChangeListener(JSpinner spinner, int index) {
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                actualizarTotal(index, spinner);
            }
        });
    }

    private void actualizarTotal(int index, JSpinner spinner) {
        int nuevoValor = (int) spinner.getValue();
        int cambio = nuevoValor - cantidadTotal;

        if (cambio != 0) {
            cantidadTotal += cambio;
            precioTotal += cambio * PRECIOS_PRODUCTOS[index];

            actualizarTotal();
        }
    }

    private void actualizarTotal() {
        cantidadTotal = 0;
        precioTotal = 0.0;

        for (int i = 0; i < spinners.length; i++) {
            cantidadTotal += (int) spinners[i].getValue();
            precioTotal += PRECIOS_PRODUCTOS[i] * (int) spinners[i].getValue();
        }

        DecimalFormat df = new DecimalFormat("0.00");
        double totalPrecio = Math.round(precioTotal * 100.0) / 100.0;
        String totalText = "Total (" + cantidadTotal + "): S/. " + df.format(totalPrecio);
        lblTotal.setText(totalText);
    }

    private JSpinner obtenerSpinner(int index) {
        switch (index) {
            case 0:
                return spnMargarita;
            case 1:
                return spnPicaras;
            case 2:
                return spnTentacion;
            case 3:
                return spnVainilla;
            case 4:
                return spnCharada;
            case 5:
                return spnCasino;
            case 6:
                return spnGloboPop;
            default:
                return null;
        }
    }
    
    private void agregarDatosATabla() {
        DefaultTableModel model = (DefaultTableModel) carritoForm.getTabla().getModel();
        precioTotal = 0.0;

        for (int i = 0; i < 7; i++) {
            String producto = NOMBRES_PRODUCTOS[i];
            int cantidad = (int) spinners[i].getValue();
            double precio = cantidad * PRECIOS_PRODUCTOS[i];

            if (cantidad > 0) {
                String precioFormateado = String.format("%.2f", precio);
                model.insertRow(0, new Object[]{producto, cantidad, precioFormateado});
                precioTotal += precio;
            }
        }

        String totalText = lblTotal.getText();
        int index = totalText.indexOf("S/. ") + 4;
        double total = Double.parseDouble(totalText.substring(index));
        model.addRow(new Object[]{"Total", cantidadTotal, String.format("%.2f", total)});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnGloboPop = new javax.swing.JSpinner();
        spnCasino = new javax.swing.JSpinner();
        spnCharada = new javax.swing.JSpinner();
        spnVainilla = new javax.swing.JSpinner();
        spnTentacion = new javax.swing.JSpinner();
        spnPicaras = new javax.swing.JSpinner();
        spnMargarita = new javax.swing.JSpinner();
        lblTotal = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        jMarca = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnGloboPop.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnGloboPop.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnGloboPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 693, 80, 40));

        spnCasino.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnCasino.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnCasino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 614, 80, 40));

        spnCharada.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnCharada.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnCharada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 532, 80, 40));

        spnVainilla.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnVainilla.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnVainilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 451, 80, 40));

        spnTentacion.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnTentacion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnTentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 80, 40));

        spnPicaras.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnPicaras.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnPicaras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, 40));

        spnMargarita.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnMargarita.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnMargarita, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 210, 80, 40));

        lblTotal.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total (0): S/. 0.00");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 410, 40));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtras.png"))); // NOI18N
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtras1.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 90));

        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito.png"))); // NOI18N
        btnCarrito.setBorderPainted(false);
        btnCarrito.setContentAreaFilled(false);
        btnCarrito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carrito1.png"))); // NOI18N
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 59, 70, 90));

        jMarca.setFont(new java.awt.Font("Poppins ExtraLight", 0, 15)); // NOI18N
        jMarca.setForeground(new java.awt.Color(43, 43, 43));
        jMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarca.setText("©2023 Elaborado y diseñado por FoodV");
        getContentPane().add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 410, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Snacks_1.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal Pr = new Principal();
        Pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        agregarDatosATabla();
        dispose();
        carritoForm.setVisible(true);
    }//GEN-LAST:event_btnCarritoActionPerformed

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
            java.util.logging.Logger.getLogger(Snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Snacks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Snacks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCasino;
    private javax.swing.JSpinner spnCharada;
    private javax.swing.JSpinner spnGloboPop;
    private javax.swing.JSpinner spnMargarita;
    private javax.swing.JSpinner spnPicaras;
    private javax.swing.JSpinner spnTentacion;
    private javax.swing.JSpinner spnVainilla;
    // End of variables declaration//GEN-END:variables
}
