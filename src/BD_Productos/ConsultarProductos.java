package BD_Productos;

import static BD_Productos.ModificarProductos.jTable_productos;
import Control_BD.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author rocio
 */

public class ConsultarProductos extends javax.swing.JDialog {

    String idproducto = "";

    Control_Productos cc = new Control_Productos();

    public ConsultarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarProducto = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldParametroBusqueda = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonBuscarTodos = new javax.swing.JButton();
        jButtonBuscarFiltro = new javax.swing.JButton();
        jLabel_i = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel_imagen = new javax.swing.JLabel();
        btn_alerta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableListarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 610, 370));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Buscar ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jTextFieldParametroBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldParametroBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldParametroBusquedaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldParametroBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 160, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 110, -1));

        jButtonBuscarTodos.setText("Mostrar Todos");
        jButtonBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTodosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 250, 30));

        jButtonBuscarFiltro.setBackground(new java.awt.Color(0, 153, 102));
        jButtonBuscarFiltro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarFiltro.setText("Buscar");
        jButtonBuscarFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBuscarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, 30));

        jLabel_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/busProducto.jpg"))); // NOI18N
        jPanel1.add(jLabel_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 100, 80));

        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/print.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, -1, -1));

        jLabel_imagen.setText("No hay imagen");
        jPanel1.add(jLabel_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 190, 170));

        btn_alerta.setText("Alerta productos");
        btn_alerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alertaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 170, 30));

        jPanel5.setBackground(new java.awt.Color(11, 11, 59));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONSULTAR PRODUCTOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(288, 288, 288))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 850, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/main.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BD_Productos/Guerrero.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jLabel11.setText("Almacén Juridiccional 04 De La Montaña");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.gc();//limpiar basura
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFiltroActionPerformed

        try {
            String parametroBusqueda = jTextFieldParametroBusqueda.getText();
            cc.buscarProductos(parametroBusqueda);
            int[] anchos = {50,150, 200, 50, 200, 200};
            for (int i = 0; i < jTableListarProducto.getColumnCount(); i++) {
                jTableListarProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " bash " + e);
        }
    }//GEN-LAST:event_jButtonBuscarFiltroActionPerformed

    private void jButtonBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTodosActionPerformed

        cc.listarTodosProductos();
        int[] anchos = {50,150, 200, 50, 200, 200};
        for (int i = 0; i < jTableListarProducto.getColumnCount(); i++) {
            jTableListarProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

    }//GEN-LAST:event_jButtonBuscarTodosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String reporte = JOptionPane.showInputDialog(null, "Escriba Titulo de la hoja?");

        try {

            MessageFormat headerFormat = new MessageFormat("Reportes de " + reporte);

            MessageFormat footerFormat = new MessageFormat("Almacén Juridiccional 04 Montaña");

            jTableListarProducto.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(ConsultarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
 
              
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldParametroBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldParametroBusquedaKeyPressed

        try {
            String parametroBusqueda = jTextFieldParametroBusqueda.getText();
            cc.buscarProductos(parametroBusqueda);
            int[] anchos = {50,150, 200, 50, 200, 200};
            for (int i = 0; i < jTableListarProducto.getColumnCount(); i++) {
                jTableListarProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " bash " + e);
        }
        char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldParametroBusquedaKeyPressed

    private void jTableListarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarProductoMouseClicked

        try {
            int fila = jTableListarProducto.rowAtPoint(evt.getPoint());

            idproducto = (jTableListarProducto.getValueAt(fila, 0).toString());
            String file = new String("/imgproductos/" + idproducto + ".jpg");
            String master = System.getProperty("user.dir") + file;
            jLabel_imagen.setIcon(new ImageIcon(master));
            ImageIcon icon = new ImageIcon(master);
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(jLabel_imagen.getWidth(), jLabel_imagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(newimg);
            jLabel_imagen.setIcon(newIcon);
            jLabel_imagen.setSize(jLabel_imagen.getWidth(), jLabel_imagen.getHeight());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabel_imagen.setText("no hay imagen");

        }

    }//GEN-LAST:event_jTableListarProductoMouseClicked

    private void btn_alertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alertaActionPerformed
        // TODO add your handling code here:
        cc.listarTodosProductos_por_agotar();
        int[] anchos = {50,150, 200, 50, 200, 200};
        for (int i = 5; i < jTableListarProducto.getColumnCount(); i++) {
            jTableListarProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }//GEN-LAST:event_btn_alertaActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarProductos dialog = new ConsultarProductos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alerta;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBuscarFiltro;
    private javax.swing.JButton jButtonBuscarTodos;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_i;
    private javax.swing.JLabel jLabel_imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableListarProducto;
    private javax.swing.JTextField jTextFieldParametroBusqueda;
    // End of variables declaration//GEN-END:variables
}
