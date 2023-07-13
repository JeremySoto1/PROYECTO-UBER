package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.SolicitarServicio;
import modelo.Solicitar_ServicioDao;
import views.Cliente;

public class Solicitar_ServicioControlador implements ActionListener, MouseListener {

    //Encapsular las Variables
    private SolicitarServicio servicio;
    private Solicitar_ServicioDao servicio_dao;
    private Cliente views;

    //Constructor con parámetros
    public Solicitar_ServicioControlador(SolicitarServicio servicio, Solicitar_ServicioDao servicio_dao, Cliente views) {
        this.servicio = servicio;
        this.servicio_dao = servicio_dao;
        this.views = views;
        //Boton de aceptar solicitud de Servicio a la escucha
        this.views.btn_solicitar_aceptar.addActionListener(this);
        //Boton de cancelar solicitud de Servicio a la escucha
        this.views.btn_solicitar_cancelar.addActionListener(this);
        //Jlabel de servicio a la escucha
        this.views.jLServicio.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btn_solicitar_aceptar) {
            //Verificar si los campos estan vacios
            if (views.txt_solicitar_destino.getText().equals("")
                    || views.txt_soliticar_ubicacion.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            } else {
                //Realiza la insercion de la información en la base de datos
                servicio.setDestino(views.txt_solicitar_destino.getText().trim());
                servicio.setUbicacion(views.txt_soliticar_ubicacion.getText().trim());
                servicio.setFecha(views.jLabel_usuario_fecha.getText().trim());
                servicio.setHora(views.jLabel_usuario_hora.getText().trim());
                servicio.setUsuario(views.label_name_user.getText().trim());

                //Se registra la información
                if (servicio_dao.registerServicioQuery(servicio)) {
                    cleanFields();
                    views.btn_solicitar_aceptar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Servicio Registrado con Exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar el servicio");
                }

            }

        }else if(e.getSource() == views.btn_solicitar_cancelar){
            cleanFields();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.jLServicio) {
            views.jTabbedPane1.setSelectedIndex(0);
            cleanFields();
        }

    }

    //Limpiar campos
    public void cleanFields() {
        views.txt_solicitar_destino.setText("");
        views.txt_soliticar_ubicacion.setText("");

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
