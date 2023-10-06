
package vac_Entidades;

import java.time.LocalDateTime;


public class Vacuna {
    private int idVacuna;
    private int noSerieDosis;
    private Laboratorio marca;
    private double medida;
    private LocalDateTime fechaCaduca;
    private boolean colocada;
    private boolean estado;

    public Vacuna() {
    }

    public Vacuna(int noSerieDosis, Laboratorio marca, double medida, LocalDateTime fechaCaduca, boolean colocada, boolean estado) {
        this.noSerieDosis = noSerieDosis;
        this.marca = marca;
        this.medida = medida;
        this.fechaCaduca = fechaCaduca;
        this.colocada = colocada;
        this.estado = estado;
    }

    public Vacuna(int idVacuna, int noSerieDosis, Laboratorio marca, double medida, LocalDateTime fechaCaduca, boolean colocada, boolean estado) {
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

    public int getNoSerieDosis() {
        return noSerieDosis;
    }

    public void setNoSerieDosis(int noSerieDosis) {
        this.noSerieDosis = noSerieDosis;
    }

    public Laboratorio getMarca() {
        return marca;
    }

    public void setMarca(Laboratorio marca) {
        this.marca = marca;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public LocalDateTime getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(LocalDateTime fechaCaduca) {
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
    