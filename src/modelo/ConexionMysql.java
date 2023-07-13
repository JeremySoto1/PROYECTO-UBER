package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {
     //DEFINIR VARIABLE E INICIALIZARLA CON INFORMACIÓN CORRESPONDIENTE
    private String database_name = "uber";
    private String user = "root";
    private String password = "tequiero12";
    private String url = "jdbc:mysql://localhost:3306/"+ database_name;
    Connection conn = null;
    
    //método para conectar java con mysql
    public Connection getConnection(){
        try{
            //obtener valor del driver
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            //obtener la coneccion
            conn = DriverManager.getConnection(url, user, password); 
            
        }catch(ClassNotFoundException e){//importar la libreria 
            System.err.println("No se encontró el driver de: "+e.getMessage());
        }catch(SQLException e){//importar la libreria
            System.err.println("Ha ocurrido un SQLException" +e.getMessage());
        }
        return conn;
    }
}
