package Control_BD;

import BD_Proveedor.ListarProveedor;
import BD_Proveedor.addProveedor;
import BD_Proveedor.EliminarProveedor;
import BD_Proveedor.ModificarProveedor;
import AlmacenJurid.Pedidos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Control_Proveedor {

    DefaultTableModel modelo;

    String[] titulosColumnas = {"CÓDIGO", "NOMBRE (S)", "TELEFONO", "DIRECCIÓN", "PRODUCTO "};
    String info[][] = {};
    ConexionConBaseDatos conectar = new ConexionConBaseDatos();

    public void agregarProveedor(String nombre, String telefono, String direccion, String producto) {

        Connection reg = ConexionConBaseDatos.getConexion();

        String sql = "INSERT proveedor ( idProveedor, nombre_prov, tel_prov,ciudad,tipoprod)VALUES (?,?,?,?,?)";
        try {

            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setString(1, "");
            pst.setString(2, nombre);
            pst.setString(3, telefono);
            pst.setString(4, direccion);
            pst.setString(5, producto);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Regristado Exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error - " + ex);
            Logger.getLogger(addProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarTodosProveedores() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ListarProveedor.jTableListarProveedor.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarModificarProveedor() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ModificarProveedor.jTable_proveedor.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarEliminarProveedor() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        EliminarProveedor.jTable_proveedor.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarProveedor() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ejecutarConsultaTodaTabla();

    }
    Connection conexion = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

    public void ejecutarConsultaTodaTabla() {

        try {
            conexion = ConexionConBaseDatos.getConexion();

            sentencia = conexion.createStatement();
            String consultaSQL = "SELECT * FROM proveedor ORDER BY nombre_prov ASC";
            resultado = sentencia.executeQuery(consultaSQL);
            while (resultado.next()) {

                int codigo = resultado.getInt("idProveedor");
                String nombre = resultado.getString("nombre_prov");
                String telefono = resultado.getString("tel_prov");
                String direccion = resultado.getString("ciudad");
                String producto = resultado.getString("tipoprod");
                Object[] info = {codigo, nombre, telefono, direccion, producto};

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

    public void buscarProveedor(String parametroBusqueda, boolean buscarPorCodigo, boolean buscarPorNombre, boolean buscarPordireccion) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        ListarProveedor.jTableListarProveedor.setModel(modelo);

        buscarRegistroCodigoONombre(parametroBusqueda, buscarPorCodigo, buscarPorNombre, buscarPordireccion);

    }

    public void buscarListaProveedor(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;
        ListarProveedor.jTableListarProveedor.setModel(modelo);

        buscarRegistrocodigoOnombre(parametroBusqueda);

    }

    public void buscarModificarProveedor(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        ModificarProveedor.jTable_proveedor.setModel(modelo);

        buscarRegistrocodigoOnombre(parametroBusqueda);

    }

    public void buscarEliminarProveedor(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        EliminarProveedor.jTable_proveedor.setModel(modelo);

        buscarRegistrocodigoOnombre(parametroBusqueda);

    }

    public void buscarRegistrocodigoOnombre(String parametroBusqueda) {

        try {

            conexion = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;

            selectSQL = "SELECT * FROM proveedor WHERE  nombre_prov LIKE ?  ORDER BY tipoprod ASC";
            ps = conexion.prepareStatement(selectSQL);
            ps.setString(1, "%" + parametroBusqueda + "%");

            resultado = ps.executeQuery();

            while (resultado.next()) {

                int codigo = resultado.getInt("idProveedor");
                String nombre = resultado.getString("nombre_prov");
                String telefono = resultado.getString("tel_prov");
                String direccion = resultado.getString("ciudad");
                String producto = resultado.getString("tipoprod");

                Object[] info = {codigo, nombre, telefono, direccion, producto};;

                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void buscarRegistroCodigoONombre(String parametroBusqueda, boolean buscarPorcodigo, boolean buscarPorNombre, boolean buscarPordireccion) {

        try {

            conexion = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;

            if (buscarPorNombre == true) {
                selectSQL = "SELECT * FROM proveedor WHERE nombre_prov LIKE ? ORDER BY idProveedor ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            } else if (buscarPordireccion == true) {

                selectSQL = "SELECT * FROM proveedor WHERE ciudad LIKE ? ORDER BY idProducto ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            resultado = ps.executeQuery();

            while (resultado.next()) {
                int codigo = resultado.getInt("idProducto");
                String nombre = resultado.getString("nombre_prov");
                String telefono = resultado.getString("tel_prov");
                String direccion = resultado.getString("ciudad");
                String producto = resultado.getString("tipopro");

                Object[] info = {codigo, nombre, telefono, direccion, producto};

                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void EliminarProveedor(String code) {
        conexion = ConexionConBaseDatos.getConexion();
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        if (confirmar == JOptionPane.OK_OPTION) {

            try {
                String sql = "DELETE FROM proveedor "
                        + "WHERE idProveedor=?";

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

    public void ModificarProveedor(String code, String nombre, String telefono, String direccion, String producto) {

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/scia", "root", "");

            Statement comando = conexion.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
//            int cantidad = comando.executeUpdate("update proveedor set nombre_prov ='" + nombre + "', "
//                    + " tel_prov ='" + telefono + "'" + " " + ", ciudad='" + direccion + "'" + ", tipoprod ='" + producto + "'where idProveedor=" + code);
//            
            int cantidad = comando.executeUpdate(" UPDATE `scia`.`proveedor` SET `nombre_prov` = '" + nombre + "', `tel_prov` = '" + telefono+ "', `ciudad` = '" + direccion + "', `tipoprod` = '" + producto + "' WHERE (`idProveedor` = '" + code + "')");

            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, " Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "No existe proveedor de un codigo " + code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error -->" + ex);
        }
    }

}
