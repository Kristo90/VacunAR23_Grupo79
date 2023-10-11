
package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vac.Conexion.MiConexion;
import vac_Entidades.Laboratorio;
import vac_Entidades.Vacuna;


public class VacunaData {
    
    public Vacuna vac = new Vacuna();
    private Connection CON = null;
    
    PreparedStatement PS;
    ResultSet RS;
    
    // INSERT INTO `vacuna`(`idVacuna`, `nroSerieDosis`, `marca`, `medida`, `fechaCaduca`, `colocada`, `estado`) 
    // VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]')
    String SQL_INGRESAR = "INSERT INTO vacuna (nroSerieDosis, marca, medida, fechaCaduca, colocada, estado)"
            + "VALUES (?, ?, ?, ?, ?, ?)";
            
    
    public VacunaData() {
        
        CON = MiConexion.getConexion();
    }
    
    public void ingresarVacuna(Vacuna vac) {
        
        try {
            PS = CON.prepareStatement(SQL_INGRESAR, Statement.RETURN_GENERATED_KEYS);
            
            PS.setInt(1, vac.getNoSerieDosis());
            PS.setString(2, vac.getMarca().getNomLab());
            PS.setDouble(3, vac.getMedida());
            PS.setDate(4, toInstant(vac.getFechaCaduca()));
            PS.setBoolean(5, vac.isEstado());
            PS.setBoolean(6, vac.isEstado());
            PS.executeUpdate();
            
            RS = PS.getGeneratedKeys();
            
            if (RS.next()) {
                
                vac.setIdVacuna(RS.getInt(1));
                JOptionPane.showMessageDialog(null, "Ingresó correctamente");
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La vacnua ya existe");
        }
    }

    private Date toInstant(LocalDateTime fechaCaduca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
