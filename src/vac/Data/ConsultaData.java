package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vac_Entidades.Vacuna;


public class ConsultaData {
    
    private final Connection CON = null;
    
    public Vacuna VAC = new Vacuna();
    
    public void listarCitas() {
        
//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
//        SELECT * FROM `citavacunacion` WHERE 1

        String SQL_CITAS = "SELECT * FROM citavacunacion WHERE 1";
        
        try {
            PreparedStatement PS = CON.prepareStatement(SQL_CITAS);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
               VAC.setIdVacuna(RS.getInt(1));
               VAC.setColocada(true);
//               VAC.setFechaCaduca(Date.valueOf(RS.getDate(6)).toString);
               VAC.setEstado(RS.getBoolean(SQL_CITAS));
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
    
    
}
