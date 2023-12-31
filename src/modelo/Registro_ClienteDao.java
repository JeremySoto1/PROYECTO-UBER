package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registro_ClienteDao {
    //Instanciar la conexion
    //todos los métodos que van a permiter a java interactuar con MsSQL
    //Instanciar la conexion
    //Conexion cn = new Conexion();

    ConexionMysql cn = new ConexionMysql();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
     public static String username_user = "";
     public static String password_user = "";
     public static String rol_user = "";
    
    
    public RegistroCliente loginQuery(String user, String password){
        String query = "SELECT * FROM login WHERE username = ? AND CONTRASENIA = ?";
             RegistroCliente cliente = new RegistroCliente();
        
    try{
            conn = cn.getConnection();// con esto se llama a la conección 
            pst = conn.prepareStatement(query);
            //enviar los paramétros ingresados    
            pst.setString(1, user);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if (rs.next()){
                cliente.setUsername(rs.getString("USERNAME"));
                username_user = cliente.getUsername();
                cliente.setContrasenia(rs.getString("contrasenia"));
                cliente.setRol(rs.getString("rol_user"));
                rol_user = cliente.getRol();
               
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener al empleado" + e);
        }return cliente;
    }
    
    
    public boolean registerClienteQuery(RegistroCliente cliente) {
        String query = "INSERT INTO registro_cliente(NOMBRES, CEDULA, CELULAR, PROVINCIA, EMAIL,USERNAME, CONTRASEÑA, CONFIRMAR_CONTRASEÑA, ROL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, cliente.getNombres());
            pst.setString(2, cliente.getCedula());
            pst.setString(3, cliente.getCelular());
            pst.setString(4, cliente.getProvincia());
            pst.setString(5, cliente.getEmail());
            pst.setString(6, cliente.getUsername());
            pst.setString(7, cliente.getContrasenia());
            pst.setString(8, cliente.getConfirmarContrasenia());
            pst.setString(9, cliente.getRol());

            pst.execute();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR AL USUARIO" + e);
            return false;
        }
    }
    public boolean registerClienteLoginQuery(RegistroCliente cliente){
        String query2 = "INSERT INTO login (USERNAME, CONTRASENIA, ROL_USER) VALUES (?, ?, ?)";
        try {
            conn = cn.getConnection();
            pst = conn.prepareStatement(query2);
            pst.setString(1, cliente.getUsername());
            pst.setString(2, cliente.getContrasenia());
            pst.setString(3, cliente.getRol());

            pst.execute();
            return true;

         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTAR AL USUARIO" + e);
            return false;
        }
    }
}
