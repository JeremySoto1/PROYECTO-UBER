package modelo;

public class RegistroSocio {

    //Variables de la clase
    private String nombres;
    private String cedula;
    private String celular;
    private String provincia;
    private String email;
    private String tipoVehiculo;
    private String placa;
    private String licencia;
    private String username;
    private String contrasenia;
    private String confirmarContrasenia;
    private String rol;
    
    //Constructor vacio
    public RegistroSocio() {
    }
    
    //Constructor con parámetros
    public RegistroSocio(String nombres, String cedula, String celular, String provincia, String email, String tipoVehiculo, String placa, String licencia, String username, String contrasenia, String confirmarContrasenia, String rol) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.celular = celular;
        this.provincia = provincia;
        this.email = email;
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.licencia = licencia;
        this.username = username;
        this.contrasenia = contrasenia;
        this.confirmarContrasenia = confirmarContrasenia;
        this.rol = rol;
    }

    //Metodo getter and setter

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

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
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

    public void setContrasenia(String Contrasenia) {
        this.contrasenia = Contrasenia;
    }

    public String getConfirmarContrasenia() {
        return confirmarContrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setConfirmarContrasenia(String confirmarContrasenia) {
        this.confirmarContrasenia = confirmarContrasenia;
    }
    
    
}
