package Control_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rocio
 */
public class fusuario {

    Connection cn = null;

    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar_inicial() {
        cn = ConexionConBaseDatos.getConexion();

        DefaultTableModel modelo;

        String[] titulos = {"id", "usuario", "password", "tipo", "nombres", "apellidos", "correo"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.id,p.usuario,p.password,p.tipo,p.nombres,p.apellidos,"
                + "p.correo from usuario p";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("usuario");
                registro[2] = rs.getString("password");
                registro[3] = rs.getString("tipo");
                registro[4] = rs.getString("nombres");
                registro[5] = rs.getString("apellidos");
                registro[6] = rs.getString("correo");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public DefaultTableModel mostrar(String buscar) {
        cn = ConexionConBaseDatos.getConexion();
        DefaultTableModel modelo;

        String[] titulos = {"id", "usuario", "password", "tipo", "nombres", "apellidos", "correo"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.id,p.usuario,p.password,p.tipo,p.nombres,p.apellidos,"
                + "p.id,p.correo from usuario p"
                + " where id like '%"
                + buscar + "%' or "
                + "nombres like '%"
                + buscar + "%' or "
                + "apellidos like '%"
                + buscar + "%'"
                + "order by id desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("usuario");
                registro[2] = rs.getString("password");
                registro[3] = rs.getString("tipo");
                registro[4] = rs.getString("nombres");
                registro[5] = rs.getString("apellidos");
                registro[6] = rs.getString("correo");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(vusuario dts) {
        cn = ConexionConBaseDatos.getConexion();
        sSQL = "insert into usuario (id,usuario,password,tipo,nombres,apellidos,correo)"
                + "values (?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, "");
            pst.setString(2, dts.getUsuario());
            pst.setString(3, dts.getPassword());
            pst.setString(4, dts.getTipo());
            pst.setString(5, dts.getNombres());
            pst.setString(6, dts.getApellidos());
            pst.setString(7, dts.getCorreo());

            int n2 = pst.executeUpdate();

            if (n2 != 0) {
                return true;

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean editar(vusuario dts) {
        cn = ConexionConBaseDatos.getConexion();
//consultar editar usuario

        sSQL2 = "update usuario set usuario=?,password=?,tipo=?,nombres=?,apellidos=?,correo=?"
                + " where id='"+dts.getId()+"'";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL2);

            pst.setString(1, dts.getUsuario());
            pst.setString(2, dts.getPassword());
            pst.setString(3, dts.getTipo());
            //pst.setString(4, dts.getTipo());
            pst.setString(4, dts.getNombres());
            pst.setString(5, dts.getApellidos());
            pst.setString(6, dts.getCorreo());

            int n2 = pst.executeUpdate();

            if (n2 != 0) {
                return true;

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }

    public boolean eliminar(vusuario dts) {
        cn = ConexionConBaseDatos.getConexion();
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        if (confirmar == JOptionPane.OK_OPTION) {

            try {
                String sql = "DELETE FROM usuario "
                        + "WHERE id=?";

                cn = ConexionConBaseDatos.getConexion();
                PreparedStatement pst = cn.prepareStatement(sSQL);
                pst.setInt(1, dts.getId());
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

                if (cn != null) {

                    try {

                        cn.close();

                    } catch (SQLException e) {

                        JOptionPane.showMessageDialog(null, "Se ha produjo un error a la hora de cerrar la conexión, \n"
                                + "con la base de datos\n" + e);

                    }

                }

            }

        }
        return false;

    }

    public DefaultTableModel login(String usuario, String pasword) {
        cn = ConexionConBaseDatos.getConexion();
        DefaultTableModel modelo;

        String[] titulos = {"id", "usuario", "password", "tipo", "nombres", "apellidos", "correo"};

        String[] registro = new String[8];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.id,p.usuario,p.password,p.tipo,"
                + "p.nombres,p.apellidos,p.correo from usuario p "
                + " where p.usuario='"
                + usuario + "' and p.password='" + pasword + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id");
                registro[1] = rs.getString("usuario");
                registro[2] = rs.getString("password");
                registro[3] = rs.getString("tipo");

                registro[4] = rs.getString("nombres");
                registro[5] = rs.getString("apellidos");
                registro[6] = rs.getString("correo");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

}
