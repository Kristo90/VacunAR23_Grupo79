
package vac.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public LaboratorioData() {
        con = MiConexion.getConexion();
    }
    
    public void guardarLaboratorio(Laboratorio lab){
        //INSERT INTO `laboratorio`( `cuit`, `nomLaboratorio`, `pais`, `domComercial`, `estado`) 
        //VALUES ('?,?,?,?,?')
        
        String sql="INSERT INTO laboratorio (cuit,nomLaboratorio,pais,domComercial,estado)"+
                "VALUES(?,?,?,?,?)";
       try {
           PS =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           PS.setInt(1,lab.getCuit());
           PS.setString(2,lab.getNomLab());
           PS.setString(3, lab.getPais());
           PS.setString(4, lab.getDomCom());
           PS.setBoolean(5, lab.isEstado());
           
           PS.executeUpdate();
           RS = PS.getGeneratedKeys();
           
           if(RS.next()){
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
                
                
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Ciudadano");
        }
        return lab;           
   }
}
