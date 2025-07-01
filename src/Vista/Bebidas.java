package Vista;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class Bebidas extends javax.swing.JFrame {
private static final String[] NOMBRES_BEBIDAS = {"SevenUp", "SanCarlos", "Fanta", "IncaKola", "CocaCola", "Sprite", "Pepsi"};
    private static final double[] PRECIOS_BEBIDAS = {2.20, 1.50, 2.50, 2.80, 2.80, 2.50, 2.00};

    private int cantidadTotal = 0;
    private double precioTotal = 0.0;

    private JSpinner[] spinners = new JSpinner[7];
    
    private Carrito carritoForm;
    
    public Bebidas() {
        initComponents();
        this.setSize(410, 854);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
        
        carritoForm = new Carrito();
        
        for (int i = 0; i < 7; i++) {
            spinners[i] = obtenerSpinner(i);
            agregarChangeListener(spinners[i]);
        }
        actualizarTotal();
    }

    private void agregarDatosATabla() {
        DefaultTableModel model = (DefaultTableModel) carritoForm.getTabla().getModel();
        precioTotal = 0.0;

        for (int i = 0; i < 7; i++) {
            String producto = NOMBRES_BEBIDAS[i];
            int cantidad = (int) spinners[i].getValue();
            double precio = cantidad * PRECIOS_BEBIDAS[i];

            if (cantidad > 0) {
                String precioFormateado = String.format("%.2f", precio);
                model.insertRow(0, new Object[]{producto, cantidad, precioFormateado});
                precioTotal += precio;
            }
        }
        actualizarTotalRow(model);
    }

    private void actualizarTotalRow(DefaultTableModel model) {
        String totalText = lblTotal.getText();
        int index = totalText.indexOf("S/. ") + 4;
        double total = Double.parseDouble(totalText.substring(index));
        model.addRow(new Object[]{"Total", cantidadTotal, String.format("%.2f", total)});
    }
    
    private void agregarChangeListener(JSpinner spinner) {
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                actualizarTotal();
            }
        });
    }
    
    private void actualizarTotal() {
        cantidadTotal = 0;
        precioTotal = 0.0;

        for (int i = 0; i < 7; i++) {
            cantidadTotal += (int) spinners[i].getValue();
            precioTotal += (int) spinners[i].getValue() * PRECIOS_BEBIDAS[i];
        }

        DecimalFormat df = new DecimalFormat("0.00");
        double totalPrecioRedondeado = Math.round(precioTotal * 100.0) / 100.0;
        String totalText = "Total (" + cantidadTotal + "): S/. " + df.format(totalPrecioRedondeado);
        lblTotal.setText(totalText);
    }

    private JSpinner obtenerSpinner(int index) {
        switch (index) {
            case 0: return spnSevenUp;
            case 1: return spnSanCarlos;
            case 2: return spnFanta;
            case 3: return spnIncaKola;
            case 4: return spnCocaCola;
            case 5: return spnSprite;
            case 6: return spnPepsi;
            default: return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnPepsi = new javax.swing.JSpinner();
        spnSprite = new javax.swing.JSpinner();
        spnCocaCola = new javax.swing.JSpinner();
        spnIncaKola = new javax.swing.JSpinner();
        spnFanta = new javax.swing.JSpinner();
        spnSanCarlos = new javax.swing.JSpinner();
        spnSevenUp = new javax.swing.JSpinner();
        jMarca = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnPepsi.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnPepsi.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnPepsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 695, 80, 40));

        spnSprite.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnSprite.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 613, 80, 40));

        spnCocaCola.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnCocaCola.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 533, 80, 40));

        spnIncaKola.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnIncaKola.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnIncaKola, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 451, 80, 40));

        spnFanta.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnFanta.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnFanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 80, 40));

        spnSanCarlos.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnSanCarlos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnSanCarlos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 80, 40));

        spnSevenUp.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        spnSevenUp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        getContentPane().add(spnSevenUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 210, 80, 40));

        jMarca.setFont(new java.awt.Font("Poppins ExtraLight", 0, 15)); // NOI18N
        jMarca.setForeground(new java.awt.Color(43, 43, 43));
        jMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarca.setText("©2023 Elaborado y diseñado por FoodV");
        getContentPane().add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 410, -1));

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

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bebida.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

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

    public JSpinner getSpnIncaKola() {
        return spnIncaKola;
    }
    
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
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jMarca;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCocaCola;
    private javax.swing.JSpinner spnFanta;
    private javax.swing.JSpinner spnIncaKola;
    private javax.swing.JSpinner spnPepsi;
    private javax.swing.JSpinner spnSanCarlos;
    private javax.swing.JSpinner spnSevenUp;
    private javax.swing.JSpinner spnSprite;
    // End of variables declaration//GEN-END:variables
}
