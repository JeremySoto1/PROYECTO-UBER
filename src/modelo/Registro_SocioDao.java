package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registro_SocioDao {
    //Instanciar la conexion
    //todos los métodos que van a permiter a java interactuar con MsSQL
    //Instanciar la conexion
    //Conexion cn = new Conexion();

    ConexionMysql cn = new ConexionMysql();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;


    public boolean registerSocioQuery(RegistroSocio socio) {
        String query = "INSERT INTO registro_socio(NOMBRES, CEDULA, CELULAR, PROVINCIA, EMAIL, TIPO_VEHICULO, PLACA, TIPO_LICENCIA,USERNAME, CONTRASEÑA, CONFIRMAR_CONTRASEÑA, ROL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, socio.getNombres());
            pst.setString(2, socio.getCedula());
            pst.setString(3, socio.getCelular());
            pst.setString(4, socio.getProvincia());
            pst.setString(5, socio.getEmail());
            pst.setString(6, socio.getTipoVehiculo());
            pst.setString(7, socio.getPlaca());
            pst.setString(8, socio.getLicencia());
            pst.setString(9, socio.getUsername());
            pst.setString(10, socio.getContrasenia());
            pst.setString(11, socio.getConfirmarContrasenia());
            pst.setString(12, socio.getRol());

            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR AL USUARIO" + e);
            return false;
        }
    }
    public boolean registerSocioLoginQuery(RegistroSocio socio){
        String query2 = "INSERT INTO login (USERNAME, CONTRASENIA, ROL_USER) VALUES (?, ?, ?)";
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query2);
            pst.setString(1, socio.getUsername());
            pst.setString(2, socio.getContrasenia());
            pst.setString(3, socio.getRol());

            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR AL USUARIO" + e);
            return false;
        }
    }
}
