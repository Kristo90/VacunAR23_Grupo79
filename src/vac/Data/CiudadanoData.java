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
import vac_Entidades.Ciudadano;
import vac_Entidades.Laboratorio;

public class CiudadanoData {
    
    
    private final String SQL_INSERT = "INSERT INTO ciudadano (dni,nombre,apellido,email,celular, patologia, ambitoTrabajo,estado)"
            + "VALUES(?,?,?,?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT nombre, apellido, email, celular, patologia, ambitoTrabajo, estado FROM ciudadano WHERE dni=? AND estado=1";
    
    private final String SQL_UPDATE = "UPDATE ciudadano SET estado = 0 WHERE dni = ? ";
    
    
    private PreparedStatement ps;
    private ResultSet rs;
    
    Ciudadano pers=new Ciudadano();
    private Connection con = null;
    Laboratorio lab=new Laboratorio();

    public CiudadanoData() {
        con = MiConexion.getConexion();
    }

    public void inscribirCiudadano(Ciudadano pers) {
        try {
            ps = con.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pers.getDni());
            ps.setString(2, pers.getNombre());
            ps.setString(3, pers.getApellido());
            ps.setString(4, pers.getEmail());
            ps.setString(5, pers.getCelular());
            ps.setString(6, pers.getPatologia());
            ps.setString(7, pers.getAmbtrabajo());
            ps.setBoolean(8, pers.isEstado());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pers.setIdCiudadano(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se inscribió correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No pudo conectarse a la tabla Ciudadano");

        }
    }
    public Ciudadano buscarCiudadano(int dni){
        
        try {
                        
            ps= con.prepareStatement(SQL_SELECT);
            ps.setInt(1, dni);
            rs= ps.executeQuery();
            
            if(rs.next()){
                pers.setNombre(rs.getNString(1));//si falla poner "nombre"
                pers.setApellido(rs.getNString(2));
                pers.setEmail(rs.getString(3));
                pers.setCelular(rs.getNString(4));
                pers.setPatologia(rs.getNString(5));
                pers.setAmbtrabajo(rs.getNString(6));
                pers.setEstado(rs.getBoolean(7));
                
                JOptionPane.showMessageDialog(null, "Persona encontrada");
            }
                    
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Ciudadano");
        }
        return pers;
    }
    
   public void bajaCiudadano(int dni) {
        try {
            
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó a la persona del programa VacunAr23");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla ciudadano");
        }
    } 
   
   
}
