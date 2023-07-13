package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.RegistroCliente;
import modelo.Registro_ClienteDao;
import views.Registro_Cliente;

public class Registro_ClienteControlador implements ActionListener {
    //Encapsular Variables
    private RegistroCliente cliente;
    private Registro_ClienteDao cliente_dao;
    private Registro_Cliente views;
    
    //Constructor
    public Registro_ClienteControlador(RegistroCliente cliente, Registro_ClienteDao cliente_dao, Registro_Cliente views) {
        this.cliente = cliente;
        this.cliente_dao = cliente_dao;
        this.views = views;
        //boton de registar en escucha
        this.views.btn_registro_cliente_registrar.addActionListener(this);
    }
    
  
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btn_registro_cliente_registrar){
            //Verificar si los campos estan vacios
            if(views.txt_registro_cliente_nombres.getText().equals("")
                    ||views.txt_registro_cliente_cedula.getText().equals("")
                    ||views.txt_registro_cliente_celular.getText().equals("")
                    ||views.txt_registro_cliente_provincia.getText().equals("")
                    ||views.txt_registro_cliente_email.getText().equals("")
                    ||views.txt_registro_cliente_usuario.getText().equals("")
                    ||views.txt_registro_cliente_contraseña.getText().equals("")
                    ||views.txt_registro_cliente_confirmar_contraseña.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                //Realiza la insercion de la información en la base de datos
                cliente.setNombres(views.txt_registro_cliente_nombres.getText().trim());
                cliente.setCedula(views.txt_registro_cliente_cedula.getText().trim());
                cliente.setCelular(views.txt_registro_cliente_celular.getText().trim());
                cliente.setProvincia(views.txt_registro_cliente_provincia.getText().trim());
                cliente.setEmail(views.txt_registro_cliente_email.getText().trim());
                cliente.setUsername(views.txt_registro_cliente_usuario.getText().trim());
                cliente.setContrasenia(views.txt_registro_cliente_contraseña.getText().trim());
                cliente.setConfirmarContrasenia(views.txt_registro_cliente_confirmar_contraseña.getText().trim());
                cliente.setRol(views.jL_cliente_rol.getText().trim());

                //Se registra la información
                if(cliente_dao.registerClienteQuery(cliente)){
                   registrarLogin();
                   cleanFields();
                    views.btn_registro_cliente_registrar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al Usuario");
                }
                
            }
        }
    }
    
    public void registrarLogin(){
             //Verificar si los campos estan vacios
            if(views.txt_registro_cliente_usuario.getText().equals("")
                    ||views.txt_registro_cliente_contraseña.getText().equals("")
                    ||views.jL_cliente_rol.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                //Realiza la insercion de la información en la base de datos
                cliente.setUsername(views.txt_registro_cliente_usuario.getText().trim());
                cliente.setContrasenia(views.txt_registro_cliente_contraseña.getText().trim());
                cliente.setRol(views.jL_cliente_rol.getText().trim());

                //Se registra la información
                if(cliente_dao.registerClienteLoginQuery(cliente)){
                    views.btn_registro_cliente_registrar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al Usuario");
                }
                
            }
        }     
    
    
    //Limpiar campos
    public void cleanFields() {
        views.txt_registro_cliente_nombres.setText("");
        views.txt_registro_cliente_cedula.setText("");
        views.txt_registro_cliente_celular.setText("");
        views.txt_registro_cliente_provincia.setText("");
        views.txt_registro_cliente_email.setText("");
        views.txt_registro_cliente_usuario.setText("");
        views.txt_registro_cliente_contraseña.setText("");
        views.txt_registro_cliente_confirmar_contraseña.setText("");

    }
    
}
