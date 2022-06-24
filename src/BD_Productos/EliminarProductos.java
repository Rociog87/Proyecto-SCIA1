package BD_Productos;

import Control_BD.*;
import Control_BD.ConexionConBaseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static BD_Productos.ConsultarProductos.jTableListarProducto;

/**
 *
 * @author rocio
 */

public class EliminarProductos extends javax.swing.JDialog {

    String idproducto = "";
    Control_Productos bash = new Control_Productos();

    private void llamarProductos() {

        Control_Productos load = new Control_Productos();
        load.CargarProductos_eliminar();
        int[] anchos = {50,150, 200, 50, 200, 200};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

    }

    public EliminarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        llamarProductos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_busqueda = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonEliminarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EliminarClientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_busqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_busqueda.setToolTipText("Ingrese el código del cliente para ser buscado.");
        jTextField_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_busquedaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextField_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 150, -1));

        jButtonBuscar.setBackground(new java.awt.Color(0, 153, 102));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setToolTipText("Pulse para buscar datos del producto");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 100, 30));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.setToolTipText("Pulse para regresar al menú.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 130, 40));

        jButtonEliminarProducto.setBackground(new java.awt.Color(0, 153, 102));
        jButtonEliminarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEliminarProducto.setText("Eliminar ");
        jButtonEliminarProducto.setToolTipText("Pulse para eliminar el pruducto");
        jButtonEliminarProducto.setEnabled(false);
        jButtonEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/borrar.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, 130));

        jPanel5.setBackground(new java.awt.Color(11, 11, 59));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ELIMINAR PRODUCTOS");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                        .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 310, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(39, 39, 39))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                        .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(120, 120, 120))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 580, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/main.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Guerrero.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 80));

        jLabel8.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jLabel8.setText("Almacén Juridiccional 04 De La Montaña");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_productos);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 432, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane2)
                .addContainerGap())
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
        jButtonEliminarProducto.setEnabled(true);
        int fila = jTable_productos.rowAtPoint(evt.getPoint());

        idproducto = (jTable_productos.getValueAt(fila, 0).toString());

    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jButtonEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarProductoActionPerformed

        bash.EliminarProductos(idproducto);
        jTextField_busqueda.setText("");
        
    }//GEN-LAST:event_jButtonEliminarProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.gc();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        Control_Productos cc = new Control_Productos();
        String parametroBusqueda = jTextField_busqueda.getText();
        cc.buscarProductosparaEliminarProductos(parametroBusqueda);
        int[] anchos = {50,150, 200, 50, 200, 200};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextField_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_busquedaKeyPressed
        // TODO add your handling code here:
        Control_Productos cc = new Control_Productos();
        String parametroBusqueda = jTextField_busqueda.getText();
        cc.buscarProductosparaEliminarProductos(parametroBusqueda);
        int[] anchos = {50,150, 200, 50, 200, 200};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextField_busquedaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EliminarProductos dialog = new EliminarProductos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextField jTextField_busqueda;
    // End of variables declaration//GEN-END:variables
}
