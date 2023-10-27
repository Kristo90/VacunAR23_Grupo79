package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vac_Entidades.CitaVacunacion;
import vac_Entidades.Ciudadano;
import vac_Entidades.Vacuna;


public class ConsultaData {
    
    private final Connection CON = null;
    
    public Vacuna VAC = new Vacuna();
    
    
//  ⦁	Se lista mensualmente, todas las citas vencidas, cumplidas, o canceladas.
    
    public void listaMensual() {
         
//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
        
        String SQL_MENSSUAL = "SELECT * FROM citavacunacion WHERE estado IN (vencida, cumplida, cancelada) AND DATE (fechaHoraCita) <= CURDATE()";
        
        try {
            
            PreparedStatement PS = CON.prepareStatement(SQL_MENSSUAL);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
                
                int codCita = RS.getInt("codCita");
                String persona = RS.getString("persona");
                int codRefuerzo = RS.getInt("CodRefuerzo");
                
            }
        
        } catch (SQLException ex) {
            
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }

        
    }
    
//    ⦁	Listar diariamente, todos los centros de vacunación, y la cantidad de dosis aplicadas en cada uno.

    
    public void listarCitas() {
                
//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
//        SELECT * FROM `citavacunacion` WHERE 1
        
        try {
            String SQL_CENTRO = "SELECT centroVacunacion, COUNT(*) AS cantidadDosisAplicadas"
                    + "FROM citavacunacion"
                    + "WHERE fechaHoraCita BETWEEN CURDATE() AND DATE_ADD(CURDAT(), INTERVAl 1 DAT)"
                    + "GROUP BY centroVacunacion";
            
            PreparedStatement PS = CON.prepareStatement(SQL_CENTRO);
            
            ResultSet RS = PS.executeQuery();
                        
            while (RS.next()) {
                
                String centroVac = RS.getString("centroVacinacion");
                int cantidadDosis = RS.getInt("cantidadDosisAplicadas");
                
            }
            
            RS.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void listarCentroA() {
              
//        ⦁	Para un centro especifico, listar las vacunas aplicadas, con número de serie y DNI del ciudadano receptor.
 
        try {
            
            int idCentro = 1;
            
            String SQL_CONSULTA = "SELECT v.idVacuna, v.nroSerieDosis, c.dni" +
                    "FROM vacuna v" +
                    "INNER JOIN vacuna_ciudadano vc ON v.idVacuna = vc.idVacuna" +
                    "INNER JOIN ciudadano c ON vc.idCiudadano = c.Ciudadano" +
                    "WHERE v.idCentro = ?";
        
            PreparedStatement PS = CON.prepareStatement(SQL_CONSULTA);
            PS.setInt(1, idCentro);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
                
                int idVacuna = RS.getInt("idVacuna");
                String nroSerieDosis = RS.getString("nroSerieDosis");
                String dniCiudadano = RS.getString("dni");
                
            }
            
            RS.close();
        
        } catch (SQLException ex) {
            
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
    
        public void listarCentroB() {
              
//        ⦁	Para un centro especifico, listar las vacunas aplicadas, con número de serie y DNI del ciudadano receptor.
 
        try {
            
            int idCentro = 2;
            
            String SQL_CONSULTA = "SELECT v.idVacuna, v.nroSerieDosis, c.dni" +
                    "FROM vacuna v" +
                    "INNER JOIN vacuna_ciudadano vc ON v.idVacuna = vc.idVacuna" +
                    "INNER JOIN ciudadano c ON vc.idCiudadano = c.Ciudadano" +
                    "WHERE v.idCentro = ?";
        
            PreparedStatement PS = CON.prepareStatement(SQL_CONSULTA);
            PS.setInt(1, idCentro);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
                
                int idVacuna = RS.getInt("idVacuna");
                String nroSerieDosis = RS.getString("nroSerieDosis");
                String dniCiudadano = RS.getString("dni");
                
            }
            
            RS.close();
        
        } catch (SQLException ex) {
            
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
        
        public void listarCentroC() {
              
//        ⦁	Para un centro especifico, listar las vacunas aplicadas, con número de serie y DNI del ciudadano receptor.
 
        try {
            
            int idCentro = 3;
            
            String SQL_CONSULTA = "SELECT v.idVacuna, v.nroSerieDosis, c.dni" +
                    "FROM vacuna v" +
                    "INNER JOIN vacuna_ciudadano vc ON v.idVacuna = vc.idVacuna" +
                    "INNER JOIN ciudadano c ON vc.idCiudadano = c.Ciudadano" +
                    "WHERE v.idCentro = ?";
        
            PreparedStatement PS = CON.prepareStatement(SQL_CONSULTA);
            PS.setInt(1, idCentro);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
                
                int idVacuna = RS.getInt("idVacuna");
                String nroSerieDosis = RS.getString("nroSerieDosis");
                String dniCiudadano = RS.getString("dni");
                
            }
            
            RS.close();
        
        } catch (SQLException ex) {
            
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
    
        public void listarCentroD() {
              
//        ⦁	Para un centro especifico, listar las vacunas aplicadas, con número de serie y DNI del ciudadano receptor.
 
        try {
            
            int idCentro = 4;
            
            String SQL_CONSULTA = "SELECT v.idVacuna, v.nroSerieDosis, c.dni" +
                    "FROM vacuna v" +
                    "INNER JOIN vacuna_ciudadano vc ON v.idVacuna = vc.idVacuna" +
                    "INNER JOIN ciudadano c ON vc.idCiudadano = c.Ciudadano" +
                    "WHERE v.idCentro = ?";
        
            PreparedStatement PS = CON.prepareStatement(SQL_CONSULTA);
            PS.setInt(1, idCentro);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
                
                int idVacuna = RS.getInt("idVacuna");
                String nroSerieDosis = RS.getString("nroSerieDosis");
                String dniCiudadano = RS.getString("dni");
                
            }
            
            RS.close();
        
        } catch (SQLException ex) {
            
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }
}
