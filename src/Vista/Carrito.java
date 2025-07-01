package Vista;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Carrito extends javax.swing.JFrame {
    private DefaultTableModel modeloTabla = new DefaultTableModel(new Object[]{"Producto", "Cantidad", "Precio"}, 0);
    private int cantidadTotal = 0;
    private double precioTotal = 0.0;
    
    public Carrito() {
        initComponents();
        this.setSize(410, 854);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0, 0, 0, 0));
    }
    
    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTable getTabla() {
        return jTable1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnContinuar = new javax.swing.JButton();
        btnAtras1 = new javax.swing.JButton();
        jMarca = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtras.png"))); // NOI18N
        btnAtras2.setBorderPainted(false);
        btnAtras2.setContentAreaFilled(false);
        btnAtras2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAtras1.png"))); // NOI18N
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 90));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Todo conforme?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 410, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 350, 390));

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

        jMarca.setFont(new java.awt.Font("Poppins ExtraLight", 0, 15)); // NOI18N
        jMarca.setForeground(new java.awt.Color(43, 43, 43));
        jMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMarca.setText("©2023 Elaborado y diseñado por FoodV");
        getContentPane().add(jMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 410, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CarritoCompras.png"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        Principal Pr = new Principal();
        Pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        Envio en = new Envio();
        en.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        Principal pr = new Principal ();
        pr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtras1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMarca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
