package BD_Productos;

import static BD_Productos.EliminarProductos.jTable_productos;
import Control_BD.*;
import static AlmacenJurid.Pedidos.JTableProduct;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import Control_BD.Control_Productos;
import java.awt.event.KeyEvent;

/**
 *
 * @author rocio
 */

public class ModificarProductos extends javax.swing.JDialog {

    String idproducto = "";
    String path = "";

    public ModificarProductos(java.awt.Frame parent, boolean modal) {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrecioventam = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_descripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_preciocompram = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_cantidad = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel_imagen = new javax.swing.JLabel();
        btn_imagen = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonModificarProducto = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_busqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_busqueda.setToolTipText("Ingrese el código del Vendedor para ser buscado.");
        jTextField_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_busquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_busquedaKeyTyped(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(0, 153, 102));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setToolTipText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre de producto");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre de producto");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio venta");

        jTextFieldPrecioventam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPrecioventam.setForeground(new java.awt.Color(0, 153, 0));
        jTextFieldPrecioventam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioventamKeyTyped(evt);
            }
        });

        jTextArea_descripcion.setColumns(20);
        jTextArea_descripcion.setRows(5);
        jTextArea_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea_descripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea_descripcion);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descripción");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Precio compra");

        jTextField_preciocompram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_preciocompram.setForeground(new java.awt.Color(0, 153, 0));
        jTextField_preciocompram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_preciocompramActionPerformed(evt);
            }
        });
        jTextField_preciocompram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_preciocompramKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Stock");

        jTextField_cantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_cantidad.setForeground(new java.awt.Color(0, 153, 0));
        jTextField_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_cantidadKeyTyped(evt);
            }
        });

        jLabel3.setText("Fecha caducidad");

        jLabel_imagen.setText("Falta Imagen ");

        btn_imagen.setBackground(new java.awt.Color(0, 153, 102));
        btn_imagen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_imagen.setForeground(new java.awt.Color(255, 255, 255));
        btn_imagen.setText("Cambiar");
        btn_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrecioventam, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_preciocompram, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_imagen)
                                .addGap(109, 109, 109))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField_preciocompram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPrecioventam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_imagen)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(98, 98, 98)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jTextField_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

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

        jPanel5.setBackground(new java.awt.Color(11, 11, 59));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MODIFICAR PRODUCTOS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/main.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Guerrero.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jLabel8.setText("Almacén Juridiccional 04 De La Montaña");

        jButtonModificarProducto.setBackground(new java.awt.Color(0, 153, 102));
        jButtonModificarProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarProducto.setText("Modificar");
        jButtonModificarProducto.setToolTipText("presionar para modificar");
        jButtonModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarProductoActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar Modificar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(0, 153, 102));
        btnOk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(268, 268, 268)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnOk)
                                        .addGap(171, 171, 171)))))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOk)))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void ocultar_columnas() {
        jTable_productos.getColumnModel().getColumn(5).setMaxWidth(0);
        jTable_productos.getColumnModel().getColumn(0).setMinWidth(0);
        jTable_productos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    public void limpiarCajas(){
        
        jTextFieldNombre.setText(null);
        jTextFieldPrecioventam.setText(null);
        jTextArea_descripcion.setText(null);
        jTextField_cantidad.setText(null);
        jTextField_preciocompram.setText(null);
        jLabel_imagen.setText(null);
    }

    private void llamarProductos() {

        Control_Productos load = new Control_Productos();
        load.CargarProductos2();
        int[] anchos = {50, 200, 50, 200, 50, 60, 150};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

    }
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Control_Productos cc = new Control_Productos();
        String parametroBusqueda = jTextField_busqueda.getText();
        cc.buscarProductosparaProductos(parametroBusqueda);
        int[] anchos = {50, 200, 50, 200, 50, 60, 150};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarProductoActionPerformed

        Control_Productos change = new Control_Productos();
//        int fila = jTable_productos.rowAtPoint(evt.getPoint());
//
//        idproducto = (jTable_productos.getValueAt(fila, 0).toString());

        String nombre = jTextFieldNombre.getText();
        float preciosventa = Float.valueOf(jTextFieldPrecioventam.getText());
        String descripcion = jTextArea_descripcion.getText();
        int cantidad = Integer.parseInt(jTextField_cantidad.getText());
        float preciocompra = Float.valueOf(jTextField_preciocompram.getText());

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = format.format(jDateChooser1.getDate());
        System.out.println("" + fecha);
        try {

            change.ModificarProductos(idproducto, nombre, preciosventa, descripcion, cantidad, preciocompra, fecha);
            llamarProductos();
            int[] anchos = {50, 200, 50, 200, 50, 60, 150};
            for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
                jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            save();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }//GEN-LAST:event_jButtonModificarProductoActionPerformed

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked

        int fila = jTable_productos.rowAtPoint(evt.getPoint());

        idproducto = (jTable_productos.getValueAt(fila, 0).toString());
        jTextFieldNombre.setText((jTable_productos.getValueAt(fila, 1).toString()));
        jTextFieldPrecioventam.setText((jTable_productos.getValueAt(fila, 2).toString()));
        jTextArea_descripcion.setText((jTable_productos.getValueAt(fila, 3).toString()));
        jTextField_cantidad.setText((jTable_productos.getValueAt(fila, 4).toString()));
        jTextField_preciocompram.setText((jTable_productos.getValueAt(fila, 5).toString()));
        jDateChooser1.getDateFormatString();
        String file = new String("/imgproductos/" + idproducto + ".jpg");
        String master = System.getProperty("user.dir") + file;
        jLabel_imagen.setIcon(new ImageIcon(master));
        ImageIcon icon = new ImageIcon(master);
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(jLabel_imagen.getWidth(), jLabel_imagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        jLabel_imagen.setIcon(newIcon);
        jLabel_imagen.setSize(jLabel_imagen.getWidth(), jLabel_imagen.getHeight());
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jTextField_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_busquedaKeyPressed

        Control_Productos cc = new Control_Productos();
        String parametroBusqueda = jTextField_busqueda.getText();
        cc.buscarProductosparaProductos(parametroBusqueda);
        int[] anchos = {50, 200, 50, 200, 50, 60, 150};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }


    }//GEN-LAST:event_jTextField_busquedaKeyPressed

    private void btn_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imagenActionPerformed

        try {
            open();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_imagenActionPerformed

    private void jTextField_preciocompramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_preciocompramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_preciocompramActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    private void jTextField_preciocompramKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_preciocompramKeyTyped
 char c = evt.getKeyChar();

        if (Character.isLetter(c)) {

            getToolkit().beep();

            evt.consume();
        }
     
    }//GEN-LAST:event_jTextField_preciocompramKeyTyped

    private void jTextFieldPrecioventamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioventamKeyTyped
 char c = evt.getKeyChar();

        if (Character.isLetter(c)) {

            getToolkit().beep();

            evt.consume();
        }
                                              
    }//GEN-LAST:event_jTextFieldPrecioventamKeyTyped

    private void jTextField_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_cantidadKeyTyped
 char c = evt.getKeyChar();

        if (Character.isLetter(c)) {

            getToolkit().beep();

            evt.consume();
        }                                           

    }//GEN-LAST:event_jTextField_cantidadKeyTyped

    private void jTextField_busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_busquedaKeyTyped
char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }

    }//GEN-LAST:event_jTextField_busquedaKeyTyped

    private void jTextArea_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_descripcionKeyTyped
char car = evt.getKeyChar();
        if (Character.isLetter(car) || Character.isDigit(car)) {

        } else {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextArea_descripcionKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
// Para que solo acepte letras
      if (!Character.isLetter(evt.getKeyChar())&&
                !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar()== KeyEvent.VK_BACK_SPACE)){
        evt.consume();
                
        } 
      
    }//GEN-LAST:event_jTextFieldNombreKeyTyped
    void open() throws IOException {

        JFileChooser JFC = new JFileChooser();

        JFC.setFileFilter(new FileNameExtensionFilter("todos los archivos *.jpg", "png", "JPG"));

        int abrir = JFC.showDialog(null, "Abrir");
        if (abrir == JFileChooser.APPROVE_OPTION) {
            FileReader FR = null;
            BufferedReader BR = null;

            try {

                File archivo = JFC.getSelectedFile();//abre un archivo .lengf

                String PATH = JFC.getSelectedFile().getAbsolutePath();
                if (PATH.endsWith(".jpg") || PATH.endsWith(".png")) {

                    FR = new FileReader(archivo);
                    BR = new BufferedReader(FR);

                    String linea;
                    if (path.compareTo(archivo.getAbsolutePath()) == 0) {
                        System.out.println("Archivo Abierto" + "Oops! Error" + JOptionPane.ERROR_MESSAGE);
                    } else {
                        path = archivo.getAbsolutePath();

                        while ((linea = BR.readLine()) != null) { //cuando termina el texto del archivo?

                        }
                    }
                    jLabel_imagen.setIcon(new ImageIcon(path));
                    ImageIcon icon = new ImageIcon(path);
                    Image img = icon.getImage();
                    Image newimg = img.getScaledInstance(jLabel_imagen.getWidth(), jLabel_imagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
                    ImageIcon newIcon = new ImageIcon(newimg);
                    jLabel_imagen.setIcon(newIcon);
                    jLabel_imagen.setSize(jLabel_imagen.getWidth(), jLabel_imagen.getHeight());

                } else {
                    System.out.println("Archivo no soportado" + "Oops! Error" + JOptionPane.ERROR_MESSAGE);
                    open();
                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();

            } finally {
                try {
                    if (null != FR) {
                        FR.close();
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();

                }
            }
        }
    }

    private void save() {

        try {
            String file = new String("/imgproductos/" + idproducto + ".jpg");
            String master = System.getProperty("user.dir") + file;

            File source = new File(path);

            File dest = new File(master);

            System.out.println("origen :" + path + "destino: " + master);

            long start = System.nanoTime();

            long end;

            copyFileUsingFileStreams(source, dest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void copyFileUsingFileStreams(File source, File dest)
            throws IOException {

        InputStream input = null;

        OutputStream output = null;

        try {

            input = new FileInputStream(source);

            output = new FileOutputStream(dest);

            byte[] buf = new byte[1024];

            int bytesRead;

            while ((bytesRead = input.read(buf)) > 0) {

                output.write(buf, 0, bytesRead);

            }

        } finally {

            input.close();

            output.close();

        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarProductos dialog = new ModificarProductos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btn_imagen;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonModificarProducto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextArea jTextArea_descripcion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecioventam;
    private javax.swing.JTextField jTextField_busqueda;
    private javax.swing.JTextField jTextField_cantidad;
    private javax.swing.JTextField jTextField_preciocompram;
    // End of variables declaration//GEN-END:variables
}
