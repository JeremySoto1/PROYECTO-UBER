package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.RegistroSocio;
import modelo.Registro_SocioDao;
import views.Registro_Socio;

public class Registro_SocioControlador implements ActionListener {

    //Encapsular las variables
    private RegistroSocio socio;
    private Registro_SocioDao socio_dao;
    private Registro_Socio views;

    //Constructor con parámetros
    public Registro_SocioControlador(RegistroSocio socio, Registro_SocioDao socio_dao, Registro_Socio views) {
        this.socio = socio;
        this.socio_dao = socio_dao;
        this.views = views;
        //Boton de Registrar a la Escucha
        this.views.btn_registro_socio_registrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_registro_socio_registrar) {
            //Verificar si los campos estan vacios
            if (views.txt_registro_socio_nombres.getText().equals("")
                    || views.txt_registro_socio_cedula.getText().equals("")
                    || views.txt_registro_socio_celular.getText().equals("")
                    || views.txt_registro_socio_provincia.getText().equals("")
                    || views.txt_registro_socio_email.getText().equals("")
                    || views.txt_registro_socio_tipo_vehiculo.getText().equals("")
                    || views.txt_registro_socio_placa.getText().equals("")
                    || views.txt_registro_socio_licencia.getText().equals("")
                    || views.txt_registro_socio_usuario.getText().equals("")
                    || views.txt_registro_socio_contraseña.getText().equals("")
                    || views.txt_registro_socio_confirmar_contraseña.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                //Realiza la insercion de la información en la base de datos
                socio.setNombres(views.txt_registro_socio_nombres.getText().trim());
                socio.setCedula(views.txt_registro_socio_cedula.getText().trim());
                socio.setCelular(views.txt_registro_socio_celular.getText().trim());
                socio.setProvincia(views.txt_registro_socio_provincia.getText().trim());
                socio.setEmail(views.txt_registro_socio_email.getText().trim());
                socio.setTipoVehiculo(views.txt_registro_socio_tipo_vehiculo.getText().trim());
                socio.setPlaca(views.txt_registro_socio_placa.getText().trim());
                socio.setLicencia(views.txt_registro_socio_licencia.getText().trim());
                socio.setUsername(views.txt_registro_socio_usuario.getText().trim());
                socio.setContrasenia(views.txt_registro_socio_contraseña.getText().trim());
                socio.setConfirmarContrasenia(views.txt_registro_socio_confirmar_contraseña.getText().trim());
                socio.setRol(views.jL_socio_rol.getText().trim());
                //Se registra la información
                if (socio_dao.registerSocioQuery(socio)) {
                    registrarLogin();
                    cleanFields();
                    views.btn_registro_socio_registrar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al Usuario");
                }
            }

        }
    }

    public void registrarLogin() {
        //Verificar si los campos estan vacios
        if (views.txt_registro_socio_usuario.getText().equals("")
                || views.txt_registro_socio_contraseña.getText().equals("")
                || views.jL_socio_rol.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        } else {
            //Realiza la insercion de la información en la base de datos
            socio.setUsername(views.txt_registro_socio_usuario.getText().trim());
            socio.setContrasenia(views.txt_registro_socio_contraseña.getText().trim());
            socio.setRol(views.jL_socio_rol.getText().trim());

            //Se registra la información
            if (socio_dao.registerSocioLoginQuery(socio)) {
                views.btn_registro_socio_registrar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al Usuario");
            }

        }
    }

    //Limpiar campos
    public void cleanFields() {
        views.txt_registro_socio_nombres.setText("");
        views.txt_registro_socio_cedula.setText("");
        views.txt_registro_socio_celular.setText("");
        views.txt_registro_socio_provincia.setText("");
        views.txt_registro_socio_email.setText("");
        views.txt_registro_socio_tipo_vehiculo.setText("");
        views.txt_registro_socio_placa.setText("");
        views.txt_registro_socio_licencia.setText("");
        views.txt_registro_socio_usuario.setText("");
        views.txt_registro_socio_contraseña.setText("");
        views.txt_registro_socio_confirmar_contraseña.setText("");

    }
}
