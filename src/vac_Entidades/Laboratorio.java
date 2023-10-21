
package vac_Entidades;


public class Laboratorio {
    private int idLaboratorio;
    private String cuit;
    private String nomLab;
    private String pais;
    private String domCom;
    private boolean estado;

    public Laboratorio() {
    }

    public Laboratorio(String cuit, String nomLab, String pais, String domCom, boolean estado) {
        this.cuit = cuit;
        this.nomLab = nomLab;
        this.pais = pais;
        this.domCom = domCom;
        this.estado = estado;
    }

    public Laboratorio(int idLaboratorio, String cuit, String nomLab, String pais, String domCom, boolean estado) {
        this.idLaboratorio = idLaboratorio;
        this.cuit = cuit;
        this.nomLab = nomLab;
        this.pais = pais;
        this.domCom = domCom;
        this.estado = estado;
    }

    public int getIdLaboratorio() {
        return idLaboratorio;
    }

    public void setIdLaboratorio(int idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getNomLab() {
        return nomLab;
    }

    public void setNomLab(String nomLab) {
        this.nomLab = nomLab;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDomCom() {
        return domCom;
    }

    public void setDomCom(String domCom) {
        this.domCom = domCom;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  nomLab;
    }

}