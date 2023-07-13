package modelo;

public class Reservas {
    private String destino;
    private String ubicacion;
    private String usuario;
    private String fecha;
    private String hora;
    
    //Constructor vacio
    public Reservas() {
    }
    
    //Constructo con parámetros
    public Reservas(String destino, String ubicacion, String usuario, String fecha, String hora) {
        this.destino = destino;
        this.ubicacion = ubicacion;
        this.usuario = usuario;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    //Metodos getter and setter

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
}
