package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vac.Conexion.MiConexion;
import vac_Entidades.Laboratorio;
import vac_Entidades.Vacuna;

public class VacunaData {

    public Vacuna vac = new Vacuna();
    
    private Connection CON = null;
    
    public ArrayList<Integer>vacu=new ArrayList();

    public VacunaData() {

        CON = MiConexion.getConexion();
        
    }

    public void ingresarVacuna(Vacuna vac) {

        // INSERT INTO `vacuna`(`idVacuna`, `nroSerieDosis`, `marca`, `medida`, `fechaCaduca`, `colocada`, `estado`) 
        // VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]')
        String SQL_INGRESAR = "INSERT INTO vacuna (nroSerieDosis, marca, medida, fechaCaduca, colocada, estado)"
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement PS = CON.prepareStatement(SQL_INGRESAR, Statement.RETURN_GENERATED_KEYS);

            PS.setString(1, vac.getNoSerieDosis());
            PS.setString(2, vac.getMarca());
            PS.setDouble(3, vac.getMedida());
            PS.setDate(4, Date.valueOf(vac.getFechaCaduca()));
            PS.setBoolean(5, false);
            PS.setBoolean(6, vac.isEstado());
            PS.executeUpdate();

            ResultSet RS = PS.getGeneratedKeys();

            if (RS.next()) {

                vac.setIdVacuna(RS.getInt(1));
                JOptionPane.showMessageDialog(null, "Vacuna registrada correctamente");
                
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla Vacuna");
            
        }
    }

    public void eliminarVacuna(String noSerie) {
        
        String SQL_ELIMINAR = "UPDATE vacuna SET estado=0 WHERE nroSerieDosis=?";
        try {
            
            PreparedStatement PS= CON.prepareStatement(SQL_ELIMINAR);
            PS.setString(1, noSerie);
            
            int FILA = PS.executeUpdate();

            if (FILA == 1) {
                
                JOptionPane.showMessageDialog(null, "Eliminó la vacuna ingresada.");
                
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla Vacuna.");
        
        }
        
    }
    
    public ArrayList<Integer>  buscarvacuna(){
        
        String SQL_BUSCAR = "SELECT idVacuna FROM vacuna WHERE colocada = 0";
        
        try {
            
            PreparedStatement PS= CON.prepareStatement(SQL_BUSCAR);
            ResultSet RS = PS.executeQuery();
            
             while(RS.next()){
                 
               vac.setIdVacuna(RS.getInt(1));
               vacu.add(vac.getIdVacuna());
               vacu.get(0);
            
             }
             
        } catch (SQLException ex) {
            
            Logger.getLogger(VacunaData.class.getName()).log(Level.SEVERE, null, ex);
        
        }
      
        return vacu;  
    }
    
}
