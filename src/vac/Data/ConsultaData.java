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
import javax.swing.table.DefaultTableModel;
import vac_Entidades.CitaVacunacion;
import vac_Entidades.Ciudadano;
import vac_Entidades.Vacuna;


public class ConsultaData {
    
    private final Connection CON = null;
    
    public Vacuna VAC = new Vacuna();
    
    
//  ⦁	Se lista mensualmente, todas las citas vencidas, cumplidas, o canceladas.
    
    public Ciudadano listaMensual(int idCita) {
        
        CitaVacunacion CITA = new CitaVacunacion();
        Ciudadano PERS = new Ciudadano();
        
//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
        
        String SQL_MENSSUAL = "SELECT * FROM citavacunacion WHERE fechaHoraCita BETWEEN ? AND ?";
        
        try {
            
            PreparedStatement PS = CON.prepareStatement(SQL_MENSSUAL);
            
            PS.setInt(1, idCita);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
                
                CITA.setIdCita(RS.getInt("codCita"));
                PERS.setNombre(RS.getString("persona"));
                CITA.setEstado(RS.getBoolean("estado"));
                
//                if (estado.equals("vencida") || estado.equals("cumplidas") || estado.equals("cancelada")) {
//                    
//                     
//                }
                
            }
        
        } catch (SQLException ex) {
            
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
        return PERS;
        
    }
    
//    ⦁	Listar diariamente, todos los centros de vacunación, y la cantidad de dosis aplicadas en cada uno.

    
    public void listarCitas() {
                
//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
//        SELECT * FROM `citavacunacion` WHERE 1
        
        ConsultaData CONS = new ConsultaData();
        
        jTable jCvacunatorio = new jTable();
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("Centro de Vacunación");
        tabla.addColumn("Dosis Aplicadas");
        jCvacunatorio.setModel(tabla);
        
        String SQL_CENTRO = "SELECT centroVacunacion, SUM(dosis) AS dosisAplicadas FROM citaVacunacion WHERE DATE(fechaHoraCita) = Curate() GROUP¨BY centroVacunacion";
        
        try {
            PreparedStatement PS = CON.prepareStatement(SQL_CENTRO);
            
            ResultSet RS = PS.executeQuery();
                        
            while (RS.next()) {
                
                String centroVacunacion = RS.getString("centroVacunacion");
                int dosisAplicadas = RS.getInt("DosisAplicadas");
                tabla.addRow(new Object[]{centroVacunacion, dosisAplicadas});
                
            }
            
            RS.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void listarVacunasEnCentro(String nomLab) {
        
        
//        ⦁	Para un centro especifico, listar las vacunas aplicadas, con número de serie y DNI del ciudadano receptor.

        
        String SQL_CENTRO = "SELECT laboratoria.nomLaboratorio, ciudadano.dni, vacuna.nroSerieDosis FROM laboratorio" 
                + "INNER JOIN vacuna, ciudadano, laboratorio ON laboratorio.id = ciudadano.id = vacuna.id ";
 
        try {
        
            PreparedStatement PS = CON.prepareStatement(SQL_CENTRO);
            PS.setString(1, nomLab);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
                
                RS.getString("");
                RS.getString("");
                
            }
            
            RS.close();
        
        } catch (SQLException ex) {
            
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
    }

    private static class jTable {

        public jTable() {
        }

        private void setModel(DefaultTableModel tabla) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
