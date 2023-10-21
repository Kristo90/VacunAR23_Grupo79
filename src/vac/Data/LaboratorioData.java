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

    private Connection CON = null;
    
    Laboratorio lab = new Laboratorio();

    ArrayList<String> lista = new ArrayList();

    public LaboratorioData() {
        
        CON = MiConexion.getConexion();
    
    }

    public void guardarLaboratorio(Laboratorio lab) {
        
        //INSERT INTO `laboratorio`( `cuit`, `nomLaboratorio`, `pais`, `domComercial`, `estado`) 
        //VALUES ('?,?,?,?,?')
        String SQL_GUARDAR = "INSERT INTO laboratorio (cuit, nomLaboratorio, pais, domComercial, estado)"
                + "VALUES(?, ?, ?, ?, ?)";
        try {
            
            PreparedStatement PS = CON.prepareStatement(SQL_GUARDAR, Statement.RETURN_GENERATED_KEYS);
            
            PS.setString(1, lab.getCuit());
            PS.setString(2, lab.getNomLab());
            PS.setString(3, lab.getPais());
            PS.setString(4, lab.getDomCom());
            PS.setBoolean(5, lab.isEstado());

            PS.executeUpdate();
            
            ResultSet RS = PS.getGeneratedKeys();

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

        // SELECT idLaboratorio,cuit, nomLaboratorio, pais, domComercial, estado FROM laboratorio WHERE nomLaboratorio like ?" 
        // VALUES ('?,?,?,?,?')
        String SQL_BUSCAR = "SELECT idLaboratorio,cuit, nomLaboratorio, pais, domComercial, estado FROM laboratorio WHERE cuit = ?";

        try {
            
            PreparedStatement PS = CON.prepareStatement(SQL_BUSCAR);
            PS.setInt(1, cuit);

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {
                 lab.setCuit(RS.getString(2));
                lab.setNomLab(RS.getString(3));
                lab.setPais(RS.getString(4));
                lab.setDomCom(RS.getString(5));
                lab.setEstado(RS.getBoolean(6));
                System.out.println(lab);
                

                JOptionPane.showMessageDialog(null, "Laboratorio Encontrado");
            
            }

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Ciudadano");
        
        }
        
        return lab;
    
    }

    public void actualizarLaboratorio(Laboratorio lab) {
        
        String SQL_ACTUALIZAR = "UPDATE laboratorio set nomLaboratorio = ?, pais = ?, domComercial = ?, estado = ? WHERE cuit = ?";

        try {
            
            PreparedStatement PS = CON.prepareStatement(SQL_ACTUALIZAR);

            PS.setString(1, lab.getNomLab());
            PS.setString(2, lab.getPais());
            PS.setString(3, lab.getDomCom());
            PS.setBoolean(4, lab.isEstado());
            PS.setString(5, lab.getCuit());

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

    public ArrayList<String> listarLab() {
        
        String SQL_LISTA = "SELECT nomLaboratorio FROM laboratorio";
        
        String labo;
        
        try {
            
            PreparedStatement PS = CON.prepareStatement(SQL_LISTA);
            
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {
                
                labo=(RS.getString("nomLaboratorio"));
                lista.add(labo);

            }
            
            PS.close();
            
            JOptionPane.showMessageDialog(null, "Lista de Marcas Actualizada");
        
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Laboratorio");
        
        }
        
        return lista;
    }

}