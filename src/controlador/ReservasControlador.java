package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Reservas;
import modelo.ReservasDao;
import views.Cliente;

public class ReservasControlador implements ActionListener, MouseListener{
    
    //Encapsular las variables
    private Reservas reserva;
    private ReservasDao reserva_dao;
    private Cliente views;
    
    //Constructor
    public ReservasControlador(Reservas reserva, ReservasDao reserva_dao, Cliente views) {
        this.reserva = reserva;
        this.reserva_dao = reserva_dao;
        this.views = views;
        //Boton aceptar guardar la reserva en escucha
        this.views.btn_reservas_aceptar.addActionListener(this);
        //boton de cancelar reserva en escucha
        this.views.btn_reservas_cancelar.addActionListener(this);
        //Label de reserva a la escucha
        this.views.jLReservas.addMouseListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btn_reservas_aceptar){
            //Verificar si los campos estan vacios
            if(views.txt_reservas_dia.getText().equals("")
                    || views.txt_reservas_hora.getText().equals("")
                    || views.txt_reservas_destino.getText().equals("")
                    || views.txt_reservas_ubicacion.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                //Realiza la insercion de los datos
                reserva.setFecha(views.txt_reservas_dia.getText().trim());
                reserva.setHora(views.txt_reservas_hora.getText().trim());
                reserva.setDestino(views.txt_reservas_destino.getText().trim());
                reserva.setUbicacion(views.txt_reservas_ubicacion.getText().trim());
                reserva.setUsuario(views.label_name_user.getText().trim());
                //Se registra la informacion a la tabla
                if(reserva_dao.registerReservaQuery(reserva)){
                    cleanFields();
                    views.btn_reservas_aceptar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Reserva Registrado con Exito");
                }else{
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar la reserva");
                }
            }
        }else if(e.getSource() == views.btn_reservas_cancelar ){
            cleanFields();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.jLReservas) {
            views.jTabbedPane1.setSelectedIndex(1);
            cleanFields();
        }
    }
    
    //Limpiar campos
    public void cleanFields() {
        views.txt_reservas_dia.setText("");
        views.txt_reservas_hora.setText("");
        views.txt_reservas_destino.setText("");
        views.txt_reservas_ubicacion.setText("");

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
