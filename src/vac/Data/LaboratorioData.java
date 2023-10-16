package vac.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vac.Conexion.MiConexion;
import vac_Entidades.Laboratorio;

public class LaboratorioData {

    private Connection con = null;
    Laboratorio lab = new Laboratorio();

    String SQL_ACTUALIZAR = "UPDATE laboratiro set nomLaboratorio = ?, pais = ?, domComercial = ?, estado = ? WHERE cuit = ?";

    // SELECT idLaboratorio,cuit, nomLaboratorio, pais, domComercial, estado FROM laboratorio WHERE nomLaboratorio like ?" 
    // VALUES ('?,?,?,?,?')
    String SQL_BUSCAR = "SELECT idLaboratorio,cuit, nomLaboratorio, pais, domComercial, estado FROM laboratorio WHERE nomLaboratorio = '?'";

    private PreparedStatement PS;
    private ResultSet RS;
    ArrayList<Laboratorio> lista = new ArrayList();

    public LaboratorioData() {
        con = MiConexion.getConexion();
    }

    public void guardarLaboratorio(Laboratorio lab) {
        //INSERT INTO `laboratorio`( `cuit`, `nomLaboratorio`, `pais`, `domComercial`, `estado`) 
        //VALUES ('?,?,?,?,?')

        String sql = "INSERT INTO laboratorio (cuit,nomLaboratorio,pais,domComercial,estado)"
                + "VALUES(?,?,?,?,?)";
        try {
            PS = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            PS.setInt(1, lab.getCuit());
            PS.setString(2, lab.getNomLab());
            PS.setString(3, lab.getPais());
            PS.setString(4, lab.getDomCom());
            PS.setBoolean(5, lab.isEstado());

            PS.executeUpdate();
            RS = PS.getGeneratedKeys();

            if (RS.next()) {
                lab.setIdLaboratorio(RS.getInt(1));//Si falla cambiar por "idLaboratorio"
                JOptionPane.showMessageDialog(null, "Se agrego exitosamente el Laboratorio.");
                PS.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puedo acceder a la tabla Laboratorio.");
        }

    }

    public Laboratorio buscarLaboratorio(int cuit) {

        try {
            PS = con.prepareStatement(SQL_BUSCAR);
            PS.setInt(1, cuit);

            RS = PS.executeQuery();

            if (RS.next()) {

                lab.setNomLab(RS.getString(1));
                lab.setPais(RS.getString(2));
                lab.setDomCom(RS.getString(3));
                lab.setEstado(RS.getBoolean(4));

                JOptionPane.showMessageDialog(null, "Laboratio Encontrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Ciudadano");
        }
        return lab;
    }

    public void actualizarLaboratorio(Laboratorio lab) {

        try {
            PS = con.prepareStatement(SQL_ACTUALIZAR);

            PS.setString(1, lab.getNomLab());
            PS.setString(2, lab.getPais());
            PS.setString(3, lab.getDomCom());
            PS.setBoolean(4, lab.isEstado());
            PS.setInt(5, lab.getCuit());

            int FILA = PS.executeUpdate();

            if (FILA == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizo la información del Laboratorio");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla ciudadano");
        }
    }

    public void eliminarLab(Laboratorio cuit) {

    }

    public ArrayList<Laboratorio> listarLab() {
        String sql = "SELECT nomLaboratorio FROM laboratorio";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lab.setNomLab(rs.getString("nomLaboratorio"));
                lista.add(lab);

            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Lista de Marcas Actualizada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Laboratorio");
        }
        return lista;
    }

}
