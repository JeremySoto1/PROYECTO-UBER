package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.*;
import views.*;

public class Inicio_SesionControlador implements ActionListener {

    //Encampsular las variables
    private RegistroCliente cliente;
    private Registro_ClienteDao cliente_dao;
    private RegistroSocio socio;
    private Registro_SocioDao socio_dao;
    private Iniciar_Sesion iniciar_sesion;

    //Constructor
    public Inicio_SesionControlador(RegistroCliente cliente, Registro_ClienteDao cliente_dao, RegistroSocio socio, Registro_SocioDao socio_dao, Iniciar_Sesion iniciar_sesion) {
        this.cliente = cliente;
        this.cliente_dao = cliente_dao;
        this.socio = socio;
        this.socio_dao = socio_dao;
        this.iniciar_sesion = iniciar_sesion;
        //Boton de aceptar a la escuchar
        this.iniciar_sesion.btn_sesion_aceptar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Obetner los datos enviados desde la vista
        String user = iniciar_sesion.txt_sesion_usuario.getText().trim();
        String pass = String.valueOf(iniciar_sesion.txt_sesion_contrasenia.getPassword());

        //Verificar si el usuario presionó clic en el boton ingresar
        if (e.getSource() == iniciar_sesion.btn_sesion_aceptar) {
            //validar que los campos no esten vacios
            if (!user.equals("") || !pass.equals("")) {
                //Pasar los parámetros al metodo login 
                cliente = cliente_dao.loginQuery(user, pass);
                //verificar la existencia del usuario
                if (cliente.getUsername() != null) {// si el usuario no es nulo
                    if (cliente.getRol().equals("CLIENTE")) {// Y posee rol de administrador entonces se le mostrará la ventana del System view
                        Cliente clt = new Cliente();
                        clt.setVisible(true);
                    } else {//En caso de que no sea administrador y sea auxiliar tambien se le mostra´ra la ventana del systemView
                        Socio soc = new Socio();
                        soc.setVisible(true);
                    }
                    this.iniciar_sesion.dispose();//cierra la ventana del login el .dispose sirve apra cerrar o dejar de mostrar la ventnaa del login o cualquier ventana
                } else {// en caso de que no coincidan ni el usuario ni el rol
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
                }

            } else {//si los campos estan vacios
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }
        }
    }
}
