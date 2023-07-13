package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Solicitar_ServicioDao {
    
    //Instanciar la conexion
    //todos los métodos que van a permiter a java interactuar con MsSQL
    //Instanciar la conexion
    //Conexion cn = new Conexion();

    ConexionMysql cn = new ConexionMysql();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
     public boolean registerServicioQuery(SolicitarServicio servicio) {
        String query = "INSERT INTO viajes_cliente(DESTINO, UBICACION, FECHA, HORA, USER_CLIENTE) VALUES (?, ?, ?, ?, ?)";

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, servicio.getDestino());
            pst.setString(2, servicio.getUbicacion());
            pst.setString(3, servicio.getFecha());
            pst.setString(4, servicio.getHora());
            pst.setString(5, servicio.getUsuario());

            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR EL SERVICIO" + e);
            return false;
        }
    }
}
