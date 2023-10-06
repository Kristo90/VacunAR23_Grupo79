
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
   Laboratorio lab=new Laboratorio();

    public LaboratorioData() {
        con = MiConexion.getConexion();
    }
    
    public void guardarLaboratorio(Laboratorio lab){
        //INSERT INTO `laboratorio`( `cuit`, `nomLaboratorio`, `pais`, `domComercial`, `estado`) 
        //VALUES ('?,?,?,?,?')
        
        String sql="INSERT INTO laboratorio (cuit,nomLaboratorio,pais,domComercial,estado)"+
                "VALUES(?,?,?,?,?)";
       try {
           PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1,lab.getCuit());
           ps.setString(2,lab.getNomLab());
           ps.setString(3, lab.getPais());
           ps.setString(4, lab.getDomCom());
           ps.setBoolean(5, lab.isEstado());
           
           ps.executeUpdate();
           ResultSet rs= ps.getGeneratedKeys();
           
           if(rs.next()){
               lab.setIdLaboratorio(rs.getInt(1));//Si falla cambiar por "idLaboratorio"
               JOptionPane.showMessageDialog(null, "Se agrego exitosamente el Laboratorio.");
               ps.close();
           }
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se puedo acceder a la tabla Laboratorio.");
       }
        
    }
    public Laboratorio buscarLab(String nombre){
       // SELECT idLaboratorio,cuit, nomLaboratorio, pais, domComercial, estado FROM laboratorio WHERE nomLaboratorio like ?" 
        //VALUES ('?,?,?,?,?')
        String sql="SELECT idLaboratorio,cuit, nomLaboratorio, pais, domComercial, estado FROM laboratorio WHERE nomLaboratorio = '?'";
       
       return lab;
   }
}
