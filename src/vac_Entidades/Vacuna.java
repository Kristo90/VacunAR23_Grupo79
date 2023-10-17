
package vac_Entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Vacuna {
    private int idVacuna;
    private String noSerieDosis;
    private String marca;
    private double medida;
    private LocalDate fechaCaduca;
    private boolean colocada;
    private boolean estado;

    public Vacuna() {
    }

    public Vacuna(String noSerieDosis, String marca, double medida, LocalDate fechaCaduca, boolean colocada, boolean estado) {
        this.noSerieDosis = noSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.estado = estado;
    }

    public Vacuna(int idVacuna, String noSerieDosis, String marca, double medida, LocalDate fechaCaduca, boolean colocada, boolean estado) {
        this.idVacuna = idVacuna;
        this.noSerieDosis = noSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.estado = estado;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getNoSerieDosis() {
        return noSerieDosis;
    }

    public void setNoSerieDosis(String noSerieDosis) {
        this.noSerieDosis = noSerieDosis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public LocalDate getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(LocalDate fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "idVacuna=" + idVacuna + ", noSerieDosis=" + noSerieDosis + ", marca=" + marca + ", medida=" + medida + ", fechaCaduca=" + fechaCaduca + ", colocada=" + colocada + ", estado=" + estado + '}';
    }
    
}
    