
package vac_Entidades;


public class Ciudadano {
    private int idCiudadano;
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String  celular;
    private String patologia = null;
    private String ambtrabajo;
    private boolean estado=true;

    public Ciudadano() {
    }

    public Ciudadano(int dni, String nombre, String apellido, String email, String celular, String ambtrabajo, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.ambtrabajo = ambtrabajo;
        this.estado = estado;
    }

    public Ciudadano(int idCiudadano, int dni, String nombre, String apellido, String email, String celular, String ambtrabajo, boolean estado) {
        this.idCiudadano = idCiudadano;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.ambtrabajo = ambtrabajo;
        this.estado = estado;
    }

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getAmbtrabajo() {
        return ambtrabajo;
    }

    public void setAmbtrabajo(String ambtrabajo) {
        this.ambtrabajo = ambtrabajo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "idCiudadano=" + idCiudadano + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", celular=" + celular + ", patologia=" + patologia + ", ambtrabajo=" + ambtrabajo + ", estado=" + estado + '}';
    }

}