package vac.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConsultaData {
    
    
    private final Connection CON = null;
    
    private ResultSet RS;
    
    
    public void listarCitas() {
        
//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
//        SELECT * FROM `citavacunacion` WHERE 1

        String SQL_CITAS = "SELECT * FROM citavacunacion WHERE 1";
        
        try {
            PreparedStatement PS = CON.prepareStatement(SQL_CITAS);
            
            ResultSet RS = PS.executeQuery();
            
            while (RS.next()) {
               // RS.getInt();
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
