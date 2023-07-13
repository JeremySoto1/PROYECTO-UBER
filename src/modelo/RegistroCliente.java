package modelo;

public class RegistroCliente {

    //variables de la clase
    private int id;
    private String nombres;
    private String cedula;
    private String celular;
    private String provincia;
    private String email;
    private String username;
    private String contrasenia;
    private String confirmarContrasenia;
    private String rol;

    //Contrsuctor vacio
    public RegistroCliente() {
    }

    //Constructo con parámetros
    public RegistroCliente(int id, String nombres, String cedula, String celular, String provincia, String email, String username, String contrasenia, String confirmarContrasenia, String rol) {
        this.id = id;
        this.nombres = nombres;
        this.cedula = cedula;
        this.celular = celular;
        this.provincia = provincia;
        this.email = email;
        this.username = username;
        this.contrasenia = contrasenia;
        this.confirmarContrasenia = confirmarContrasenia;
        this.rol = rol;
    }

    //Metodos getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getConfirmarContrasenia() {
        return confirmarContrasenia;
    }

    public void setConfirmarContrasenia(String confirmarContrasenia) {
        this.confirmarContrasenia = confirmarContrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
