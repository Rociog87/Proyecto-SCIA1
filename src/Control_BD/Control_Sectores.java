package Control_BD;

import BD_Sector.EliminarSector;
import BD_Sector.ListarSector;
import BD_Sector.ModificarSector;
import BD_Sector.addSector;
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

/**
 *
 * @author rocio
 */
public class Control_Sectores {

    DefaultTableModel modelo;
    //vector con los titulos de cada columna
    String[] titulosColumnas = {"CÓDIGO", "NOMBRES", "RAZÓN SOCIAL", "RUC", "DIRECCIÓN", "TELÉFONO", "CORREO"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String info[][] = {};
    // Conectar Base de Datos
    ConexionConBaseDatos conectar = new ConexionConBaseDatos();

    public void agregarSector(String nombre, String razon_social, String ruc, String direccion, String telefono, String correo) {

        Connection reg = ConexionConBaseDatos.getConexion();

        String sql = "INSERT INTO sector ( idSector, nombre_sector, razon_s,ruc_sector,direccion_Sector,telefono_Sector,correo_Sector)VALUES (?,?,?,?,?,?,?)";
        try {

            PreparedStatement pst = reg.prepareStatement(sql);
            pst.setString(1, "");
            pst.setString(2, nombre);
            pst.setString(3, razon_social);
            pst.setString(4, ruc);
            pst.setString(5, direccion);
            pst.setString(6, telefono);
            pst.setString(7, correo);
            int n = pst.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Regristado Exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error - " + ex);
            Logger.getLogger(addSector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarTodosSectores() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ListarSector.jTableListarSector.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarModificarSectores() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        ModificarSector.jTable_sectores.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarEliminarSectores() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        EliminarSector.jTable_sectores.setModel(modelo);

        ejecutarConsultaTodaTabla();

    }

    public void CargarSectores() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ejecutarConsultaTodaTabla();

    }

    public void CargarSectoresPedidos() {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        Pedidos.SeleccionarSector.setModel(modelo);

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
            String consultaSQL = "SELECT * FROM sector ORDER BY nombre_sector ASC";
            resultado = sentencia.executeQuery(consultaSQL);

            while (resultado.next()) {

                int codigo = resultado.getInt("idSector");
                String nombre = resultado.getString("nombre_sector");
                String razon_s_sector = resultado.getString("razon_s");
                String ruc_sector = resultado.getString("ruc_sector");
                String direccion_Sector = resultado.getString("direccion_Sector");
                String telefono_Sector = resultado.getString("telefono_Sector");
                String correo_Sector = resultado.getString("correo_Sector");

                Object[] info = {codigo, nombre, razon_s_sector, ruc_sector, direccion_Sector, telefono_Sector, correo_Sector};

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

    public void buscarSector(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorRazon_s_sector) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        ListarSector.jTableListarSector.setModel(modelo);

        buscarRegistroCedulaONombreOrazon_s_sector(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorRazon_s_sector);

    }

    public void buscarListaSector(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        ListarSector.jTableListarSector.setModel(modelo);

        buscarRegistrodniOnombreOrazon_s_sector(parametroBusqueda);

    }

    public void buscarModificarSector(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        ModificarSector.jTable_sectores.setModel(modelo);

        buscarRegistrodniOnombreOrazon_s_sector(parametroBusqueda);

    }

    public void buscarEliminarSector(String parametroBusqueda) {

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ;

        EliminarSector.jTable_sectores.setModel(modelo);

        buscarRegistrodniOnombreOrazon_s_sector(parametroBusqueda);

    }

    public void buscarRegistrodniOnombreOrazon_s_sector(String parametroBusqueda) {

        try {

            conexion = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;

            selectSQL = "SELECT * FROM sector WHERE  nombre_sector LIKE ?  or  ruc_sector LIKE ? or  razon_s LIKE ? ORDER BY idSector ASC";
            ps = conexion.prepareStatement(selectSQL);
            ps.setString(1, "%" + parametroBusqueda + "%");
            ps.setString(2, "%" + parametroBusqueda + "%");
            ps.setString(3, "%" + parametroBusqueda + "%");

            resultado = ps.executeQuery();

            while (resultado.next()) {

                int codigo = resultado.getInt("idSector");
                String nombre = resultado.getString("nombre_sector");
                String razon_s = resultado.getString("razon_s");
                String ruc_sector = resultado.getString("ruc_sector");
                String direccion_Sector = resultado.getString("direccion_Sector");
                String telefono_Sector = resultado.getString("telefono_Sector");
                String correo_Sector = resultado.getString("correo_Sector");
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, razon_s, ruc_sector, direccion_Sector, telefono_Sector, correo_Sector};;

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void buscarRegistroCedulaONombreOrazon_s_sector(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorrazon_s_sector) {

        try {

            conexion = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;

            if (buscarPorNombre == true) {
                selectSQL = "SELECT * FROM sector WHERE nombre_sector LIKE ? ORDER BY idSector ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            } else if (buscarPorrazon_s_sector == true) {

                selectSQL = "SELECT * FROM sector WHERE razon_s LIKE ? ORDER BY idSector ASC";
                ps = conexion.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            resultado = ps.executeQuery();

            while (resultado.next()) {
                int codigo = resultado.getInt("idSector");
                String nombre = resultado.getString("nombre_sector");
                String razon_s = resultado.getString("razon_s");
                String ruc_sector = resultado.getString("ruc_sector");
                String direccion_Sector = resultado.getString("direccion_Sector");
                String telefono_Sector = resultado.getString("telefono_Sector");
                String correo_Sector = resultado.getString("correo_Sector");
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, razon_s, ruc_sector, direccion_Sector, telefono_Sector, correo_Sector};;

                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion, sentencia, resultado, ps);
        }

    }

    public void EliminarSector(String code) {

        try {
            Connection conexion = ConexionConBaseDatos.getConexion();
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from sector where idSector=" + code);
            if (cantidad == 1) {

                JOptionPane.showMessageDialog(null, "Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Sector" + code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }

    public void ModificarSector(String code, String nombre, String razon_social, String ruc, String direccion, String telefono, String correo) {

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/scia", "root", "");

            Statement comando = conexion.createStatement();

//            int cantidad = comando.executeUpdate("update sector set nombre_sector ='" + nombre + "', "
//                    + ", razon_s ='" + razon_social + "'" + ", direccion_Sector ='" + direccion + "', telefono_Sector ='" + telefono + "', correo_Sector ='" + correo + "' , ruc_sector ='" + ruc + "'  where idSector=" + code);

             int cantidad = comando.executeUpdate(" UPDATE `scia`.`sector` SET `nombre_sector` = '" + nombre + "', `razon_s` = '" + razon_social+ "', `direccion_Sector` = '" + direccion + "', `telefono_Sector` = '" + telefono + "', `correo_Sector` = '" + correo + "', `ruc_sector` = '" + ruc + "' WHERE (`idSector` = '" + code + "')");

            
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, " Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Sector " + code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error -->" + ex);
        }
    }

}
