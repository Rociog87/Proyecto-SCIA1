package Control_BD;

import BD_Productos.ConsultarProductos;
import BD_Productos.EliminarProductos;
import BD_Productos.ModificarProductos;
import AlmacenJurid.Pedidos;
import static AlmacenJurid.Pedidos.JTableProduct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static BD_Productos.ConsultarProductos.jTableListarProducto;

/**
 *
 * @author rocio
 */
public class Control_Productos {

    DefaultTableModel modelo;
    private String sSQL = "";

    String[] titulosColumnas = {"ID", "NOMBRE", "PRECIO", "DESCRIPCIÓN", "STOCK",  "CADUCIDAD"};
    String info[][] = {};

    public void CargarProductos() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Pedidos.SeleccionarProductos.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarProductosPedidos() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Pedidos.SeleccionarProductos.setModel(modelo);

        ejecutarConsultaTodaTablapedidos();

    }

    public void CargarProductos2() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ModificarProductos.jTable_productos.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarProductos_eliminar() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        EliminarProductos.jTable_productos.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public DefaultTableModel mostrar_inicial() {

        int totalregistros;

        String[] titulos = {"ID", "Nombres", "Precio", "Dias"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT idProductos,nombreProducto,precioventaProducto,descripcionProductos,stock,fecha FROM table_Productos ORDER BY idProductos ASC";

        try {
            conexion = ConexionConBaseDatos.getConexion();

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registro[0] = resultado.getString("idProductos");
                registro[1] = resultado.getString("nombreProducto");
                registro[2] = resultado.getString("precioventaProducto");
                registro[3] = resultado.getString("descripcionProductos");
                registro[4] = resultado.getString("stock");
                registro[5] = resultado.getString("fecha");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public void listarTodosProductos_por_agotar() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ConsultarProductos.jTableListarProducto.setModel(modelo);

        ejecutarConsultaTodaTabla_por_agotar();

    }

    public void listarTodosProductos() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ConsultarProductos.jTableListarProducto.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

    public void ejecutarConsultaTodaTabla_por_agotar() {

        try {
            conexion = ConexionConBaseDatos.getConexion();

            sentencia = conexion.createStatement();

            String consultaSQL = "select * from table_productos where stock<=4";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);

            while (rs.next()) {

                String codigo = rs.getString("idProductos");
                String nombre = rs.getString("nombreProducto");
                String precioventaProducto = rs.getString("precioventaProducto");
                String descripcion = rs.getString("descripcionProductos");
                String cantidad = rs.getString("stock");
                String fecha = rs.getString("fecha");

                Object[] info = {codigo, nombre, precioventaProducto, descripcion, cantidad, fecha};

                modelo.addRow(info);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            conexion = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void ejecutarConsultaTodaTablapedidos() {

        try {
            conexion = ConexionConBaseDatos.getConexion();

            sentencia = conexion.createStatement();
            String consultaSQL = "SELECT * FROM table_Productos WHERE stock>0 ORDER BY idProductos ASC ";
            resultado = sentencia.executeQuery(consultaSQL);

            while (resultado.next()) {

                String Codigo = resultado.getString("idProductos");
                String Nombre = resultado.getString("nombreProducto");
                String precioventaProducto = resultado.getString("precioventaProducto");
                String descripcion = resultado.getString("descripcionProductos");
                String cantidad = resultado.getString("stock");
                String fecha = resultado.getString("fecha");

                Object[] info = {Codigo, Nombre, precioventaProducto, descripcion, cantidad, fecha};

                modelo.addRow(info);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            conexion = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void ejecutarConsultaTodaTabla() {

        try {
            conexion = ConexionConBaseDatos.getConexion();

            sentencia = conexion.createStatement();
            String consultaSQL = "SELECT * FROM table_Productos ORDER BY idProductos ASC";
            resultado = sentencia.executeQuery(consultaSQL);

            while (resultado.next()) {

                String codigo = resultado.getString("idProductos");
                String nombre = resultado.getString("nombreProducto");
                String precioventa = resultado.getString("precioventaProducto");
                String descripcion = resultado.getString("descripcionProductos");
                String cantidad = resultado.getString("stock");
                String fecha = resultado.getString("fecha");

                Object[] info = {codigo, nombre, precioventa, descripcion, cantidad, fecha};

                modelo.addRow(info);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            conexion = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void buscarProductos(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        ConsultarProductos.jTableListarProducto.setModel(modelo);

        buscarRegistroProductos(parametroBusqueda);

    }

    public void buscarRegistroProductos(String parametroBusqueda) {

        try {

            conexion = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;

            selectSQL = "SELECT * FROM table_Productos WHERE nombreProducto LIKE ? ORDER BY idProductos ASC";
            ps = conexion.prepareStatement(selectSQL);
            ps.setString(1, "%" + parametroBusqueda + "%");

            resultado = ps.executeQuery();

            while (resultado.next()) {
                String codigo = resultado.getString("idProductos");
                String nombre = resultado.getString("nombreProducto");
                String precioventa = resultado.getString("precioventaProducto");
                String descripcion = resultado.getString("descripcionProductos");
                String cantidad = resultado.getString("stock");
                String fecha = resultado.getString("fecha");

                Object[] info = {codigo, nombre, precioventa, descripcion, cantidad, fecha};

                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void EliminarProductos(String code) {

        conexion = ConexionConBaseDatos.getConexion();
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        if (confirmar == JOptionPane.OK_OPTION) {

            try {
                String sql = "DELETE FROM table_productos "
                        + "WHERE idProductos=?";

                conexion = ConexionConBaseDatos.getConexion();
                PreparedStatement pst = conexion.prepareStatement(sql);
                pst.setString(1, code);

                if (pst.executeUpdate() > 0) {

                    JOptionPane.showMessageDialog(null, "¡El registro se ha eliminado de forma exitosa!");

                } else {

                    JOptionPane.showMessageDialog(null, "El registro no se ha podido eliminar.\n"
                            + "Inténtelo nuevamente.");

                }

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "El registro no se ha podido eliminar.\n"
                        + "Inténtelo nuevamente.\n" + e);

            } finally {

                if (conexion != null) {

                    try {

                        conexion.close();

                    } catch (SQLException e) {

                        JOptionPane.showMessageDialog(null, "Se ha produjo un error a la hora de cerrar la conexión, \n"
                                + "con la base de datos\n" + e);

                    }

                }

            }

        }
    }

    public void ModificarProductos(String code, String nombre, float precios, String descripcion, int cantidad_productos, String fecha) {

        try {
            conexion = ConexionConBaseDatos.getConexion();
            Statement comando = conexion.createStatement();
            
            int cantidad = comando.executeUpdate(" UPDATE `scia`.`table_productos` SET `nombreProducto` = '" + nombre + "', `precioventaProducto` = '" + precios + "', `descripcionProductos` = '" + descripcion + "', `stock` = '" + cantidad_productos + "', `fecha` = '" + fecha + "' WHERE (`idProductos` = '" + code + "')");

            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, " Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "No existe producto de un codigo " + code);
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("" + ex);
            JOptionPane.showMessageDialog(null, " Error -->" + ex);
        }
    }

    ;
            
    public void buscarProductosparaPedidos(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        Pedidos.SeleccionarProductos.setModel(modelo);

        buscarRegistroProductoss(parametroBusqueda);

    }

    public void buscarProductosparaProductos(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        ModificarProductos.jTable_productos.setModel(modelo);

        buscarRegistroProductoss(parametroBusqueda);

    }

    public void buscarProductosparaEliminarProductos(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        EliminarProductos.jTable_productos.setModel(modelo);

        buscarRegistroProductoss(parametroBusqueda);

    }

    public void buscarRegistroProductoss(String parametroBusqueda) {

        try {

            conexion = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;

            selectSQL = "SELECT * FROM table_Productos WHERE nombreProducto LIKE ? AND stock>5 ORDER BY idProductos ASC";
            ps = conexion.prepareStatement(selectSQL);
            ps.setString(1, "%" + parametroBusqueda + "%");

            resultado = ps.executeQuery();

            while (resultado.next()) {
                String codigo = resultado.getString("idProductos");
                String nombre = resultado.getString("nombreProducto");
                String precioventa = resultado.getString("precioventaProducto");
                String descripcion = resultado.getString("descripcionProductos");
                String cantidad = resultado.getString("stock");
                String fecha = resultado.getString("fecha");

                Object[] info = {codigo, nombre, precioventa, descripcion, cantidad, fecha};

                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

}
