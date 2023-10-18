package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vac.Conexion.MiConexion;
import vac_Entidades.CitaVacunacion;
import vac_Entidades.Ciudadano;
import vac_Entidades.Vacuna;

public class CitaData {

    Vacuna vac = new Vacuna();
    Ciudadano pers = new Ciudadano();
    CiudadanoData cd = new CiudadanoData();
    VacunaData vd = new VacunaData();
    CitaVacunacion cv = new CitaVacunacion();

    private Connection CON = null;

    PreparedStatement ps;
    ResultSet rs;

//    INSERT INTO `citavacunacion`(`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`) 
//    VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]')
    String SQL_INGRESAR = "INSERT INTO citavacunacion (persona, codRefuerzo, fechaHoraCita, centroVacunacion, fechaHoraColoca, dosis, estado)"
            + "VALUES (?, ?, ?, ?, ?, ?,?)";

    public CitaData() {

        CON = MiConexion.getConexion();

    }

    public void turnoVac(CitaVacunacion cv) {
        try {
            ps = CON.prepareStatement(SQL_INGRESAR, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, cv.getPersona().getDni());
            ps.setInt(2, cv.getCodigoRefuerzo());
            ps.setString(3, cv.getFechaHoraCita());
            ps.setString(4, cv.getCentroVacunacion());
            ps.setDate(5, Date.valueOf(cv.getFechaHoraColocada()));
            ps.setBoolean(6, cv.getDosis().isColocada());
            ps.setBoolean(7, cv.isEstado());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cv.setIdCita(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cita agendada correctamente");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");
        }
    }

    public void cancelaCita(CitaVacunacion DNipersona) {
        String sql = "UPDATE citavacunacion Set estado=0 WHERE persona=? ";
        try {
            ps = CON.prepareStatement(sql);

            ps.setInt(1, cv.getPersona().getDni());

            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "La cita fue cancelada.\nPor favor programe una nueva cita.");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");
        }
    }

    public void posponerCita(CitaVacunacion DNipersona) {
        String sql = "UPDATE citavacunacion Set fechaHoraCita=? WHERE persona=? ";
        try {
            ps = CON.prepareStatement(sql);
            ps.setString(1, cv.getFechaHoraCita());
            ps.setInt(2, cv.getPersona().getDni());

            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Se ha agendado una nueva cita.");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");
        }
    }

    public CitaVacunacion buscarCita(int DNipersona) {
       // (`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`)
        String sql = "SELECT * FROM citavacunacion WHERE persona=? ";
        try {
            ps = CON.prepareStatement(sql);

            ps.setInt(1, cv.getPersona().getDni());

            rs = ps.executeQuery();

            if (rs.next()) {
                cv.setIdCita(rs.getInt(1));
                cv.setCodigoRefuerzo(rs.getInt(3));
                cv.setFechaHoraCita(rs.getString(4));

                JOptionPane.showMessageDialog(null, "Cita encontrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");
        
        }catch (NullPointerException ex){
         JOptionPane.showMessageDialog(null, "No existe turno para la persona ingresada.");
        
    }
        return cv;
}
}
