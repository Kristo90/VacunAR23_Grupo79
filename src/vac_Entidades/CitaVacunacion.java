
package vac_Entidades;

import java.time.LocalDateTime;


public class CitaVacunacion {
    private int idCita;
    private Ciudadano persona;
    private int codigoRefuerzo;
    private LocalDateTime fechaHoraCita;
    private String centroVacunacion;
    private LocalDateTime fechaHoraColocada;
    private Vacuna dosis;
    private boolean estado;

    public CitaVacunacion() {
    }

    public CitaVacunacion(Ciudadano persona, int codigoRefuerzo, LocalDateTime fechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraColocada, Vacuna dosis, boolean estado) {
        this.persona = persona;
        this.codigoRefuerzo = codigoRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColocada = fechaHoraColocada;
        this.dosis = dosis;
        this.estado = estado;
    }

    public CitaVacunacion(int idCita, Ciudadano persona, int codigoRefuerzo, LocalDateTime fechaHoraCita, String centroVacunacion, LocalDateTime fechaHoraColocada, Vacuna dosis, boolean estado) {
        this.idCita = idCita;
        this.persona = persona;
        this.codigoRefuerzo = codigoRefuerzo;
        this.fechaHoraCita = fechaHoraCita;
        this.centroVacunacion = centroVacunacion;
        this.fechaHoraColocada = fechaHoraColocada;
        this.dosis = dosis;
        this.estado = estado;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Ciudadano getPersona() {
        return persona;
    }

    public void setPersona(Ciudadano persona) {
        this.persona = persona;
    }

    public int getCodigoRefuerzo() {
        return codigoRefuerzo;
    }

    public void setCodigoRefuerzo(int codigoRefuerzo) {
        this.codigoRefuerzo = codigoRefuerzo;
    }

    public LocalDateTime getFechaHoraCita() {
        return fechaHoraCita;
    }

    public void setFechaHoraCita(LocalDateTime fechaHoraCita) {
        this.fechaHoraCita = fechaHoraCita;
    }

    public String getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(String centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    public LocalDateTime getFechaHoraColocada() {
        return fechaHoraColocada;
    }

    public void setFechaHoraColocada(LocalDateTime fechaHoraColocada) {
        this.fechaHoraColocada = fechaHoraColocada;
    }

    public Vacuna getDosis() {
        return dosis;
    }

    public void setDosis(Vacuna dosis) {
        this.dosis = dosis;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CitaVacunacion{" + "idCita=" + idCita + ", persona=" + persona + ", codigoRefuerzo=" + codigoRefuerzo + ", fechaHoraCita=" + fechaHoraCita + ", centroVacunacion=" + centroVacunacion + ", fechaHoraColocada=" + fechaHoraColocada + ", dosis=" + dosis + ", estado=" + estado + '}';
    }

       
}
