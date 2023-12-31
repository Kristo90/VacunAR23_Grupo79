package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vac.Conexion.MiConexion;
import vac_Entidades.CitaVacunacion;
import vac_Entidades.Ciudadano;
import vac_Entidades.Vacuna;

public class CitaData {

    private Connection CON = null;

    public CitaData() {

        CON = MiConexion.getConexion();

    }

    public void turnoVac(CitaVacunacion cv) {

//      INSERT INTO `citavacunacion`(`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`) 
//      VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]')
        String SQL_INGRESAR = "INSERT INTO citavacunacion (persona, codRefuerzo, fechaHoraCita, centroVacunacion, estado)"
                + "VALUES (?, ?, ?, ?, ?)";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_INGRESAR, Statement.RETURN_GENERATED_KEYS);

            PS.setInt(1, cv.getPersona().getIdCiudadano());//SALE ERROR 1452
            PS.setInt(2, cv.getCodigoRefuerzo());
            PS.setString(3, cv.getFechaHoraCita());
            PS.setString(4, cv.getCentroVacunacion());
            //PS.setDate(5, Date.valueOf(cv.getFechaHoraColocada()));
            //PS.setInt(6, 9);//cv.getDosis().getIdVacuna());SALE ERROR 1452
            PS.setBoolean(5, cv.isEstado());

            PS.executeUpdate();

            ResultSet RS = PS.getGeneratedKeys();

            if (RS.next()) {

                cv.setIdCita(RS.getInt(1));
                JOptionPane.showMessageDialog(null, "Cita agendada correctamente");
                PS.close();

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");

        }

    }

    public void cancelaCita(CitaVacunacion cv) {
        Vacuna vac = new Vacuna();
        Ciudadano pers = new Ciudadano();
        CiudadanoData cd = new CiudadanoData();
        VacunaData vd = new VacunaData();
        

        String SQL_CANCELAR = "DELETE FROM citavacunacion WHERE codCita=? ";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_CANCELAR);

            PS.setInt(1,cv.getIdCita());
           

            int fila = PS.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "La cita fue cancelada.\nPor favor programe una nueva cita.");
                PS.close();
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");

        }
    }

    public void posponerCita(CitaVacunacion cv) {
        Vacuna vac = new Vacuna();
        Ciudadano pers = new Ciudadano();
        CiudadanoData cd = new CiudadanoData();
        VacunaData vd = new VacunaData();
        
        
        String SQL_POSPONER = "UPDATE citavacunacion SET fechaHoraCita=?, centroVacunacion=? WHERE persona=?";

        try {
            
            PreparedStatement PS = CON.prepareStatement(SQL_POSPONER);
            PS.setString(1, cv.getFechaHoraCita());
            
            PS.setString(2, cv.getCentroVacunacion());
           
            PS.setInt(3, cv.getPersona().getIdCiudadano());
            System.out.println(cv.getPersona().getIdCiudadano());
            

            int fila = PS.executeUpdate();
            
            if (fila == 1) {
                
                JOptionPane.showMessageDialog(null, "Se ha pospuesto la cita.");
                PS.close();

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");

        }

    }

    public CitaVacunacion buscarCita(Ciudadano pers) {
        Vacuna vac = new Vacuna();
        CiudadanoData cd = new CiudadanoData();
        VacunaData vd = new VacunaData();
        CitaVacunacion cv = new CitaVacunacion();

//      (`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`)
        String SQL_BUSCAR = "SELECT * FROM citavacunacion WHERE persona=?  ";
        
        try {

            PreparedStatement PS = CON.prepareStatement(SQL_BUSCAR);

            PS.setInt(1, pers.getIdCiudadano());

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {

                cv.setIdCita(RS.getInt(1));
                cv.setPersona(pers);
                cv.setCodigoRefuerzo(RS.getInt(3));
                cv.setFechaHoraCita(RS.getString(4));
                cv.setCentroVacunacion(RS.getString(5));
                cv.setFechaHoraColocada(LocalDate.now());
                cv.setEstado(RS.getBoolean(8));
                
                JOptionPane.showMessageDialog(null, "Cita encontrada.");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(null, "No existe turno para la persona ingresada.");

        }

        return cv;

    }

    public void aplicaVac(CitaVacunacion vac) {
           
    Ciudadano pers = new Ciudadano();
    CiudadanoData cd = new CiudadanoData();
    VacunaData vd = new VacunaData();
    CitaVacunacion cv = new CitaVacunacion();
        String sql = "UPDATE citavacunacion SET fechaHoraColoca=?,dosis=?,estado=? WHERE codCita=?";
        try {
            
            
            PreparedStatement PS = CON.prepareStatement(sql);
            
            
            PS.setDate(1, Date.valueOf(vac.getFechaHoraColocada()));
            PS.setInt(2, vac.getDosis().getIdVacuna());
            PS.setBoolean(3, false);
            
            PS.setInt(4, vac.getIdCita());
            

            int fila = PS.executeUpdate();
            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Se ha aplicado a " + vac.getPersona().getNombre() + " " + vac.getPersona().getApellido() + " la vacuna " + vac.getDosis().getNoSerieDosis());
                PS.close();

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");

        }catch (NullPointerException nex){
            
        }
    }
    public CitaVacunacion buscarCitaApli(Ciudadano pers) {
        Vacuna vac = new Vacuna();
        CiudadanoData cd = new CiudadanoData();
        VacunaData vd = new VacunaData();
        CitaVacunacion cv = new CitaVacunacion();

//      (`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`)
        String SQL_BUSCAR = "SELECT * FROM citavacunacion WHERE persona=? AND estado=1 ";
        
        try {

            PreparedStatement PS = CON.prepareStatement(SQL_BUSCAR);

            PS.setInt(1, pers.getIdCiudadano());

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {

                cv.setIdCita(RS.getInt(1));
                cv.setPersona(pers);
                cv.setCodigoRefuerzo(RS.getInt(3));
                cv.setFechaHoraCita(RS.getString(4));
                cv.setCentroVacunacion(RS.getString(5));
                cv.setFechaHoraColocada(LocalDate.now());
                cv.setEstado(RS.getBoolean(8));
                
                JOptionPane.showMessageDialog(null, "Cita encontrada.");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(null, "No existe turno para la persona ingresada.");

        }

        return cv;

    }
public CitaVacunacion buscarCitaCancel(Ciudadano pers) {
        Vacuna vac = new Vacuna();
        CiudadanoData cd = new CiudadanoData();
        VacunaData vd = new VacunaData();
        CitaVacunacion cv = new CitaVacunacion();

//      (`codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado`)
        String SQL_BUSCAR = "SELECT * FROM citavacunacion WHERE persona=?  AND estado=1";
        
        try {

            PreparedStatement PS = CON.prepareStatement(SQL_BUSCAR);

            PS.setInt(1, pers.getIdCiudadano());

            ResultSet RS = PS.executeQuery();

            if (RS.next()) {

                cv.setIdCita(RS.getInt(1));
                cv.setPersona(pers);
                cv.setCodigoRefuerzo(RS.getInt(3));
                cv.setFechaHoraCita(RS.getString(4));
                cv.setCentroVacunacion(RS.getString(5));
                cv.setFechaHoraColocada(LocalDate.now());
                cv.setEstado(RS.getBoolean(8));
                
                JOptionPane.showMessageDialog(null, "Cita encontrada.");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla citaVacunacion");

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(null, "No existe turno para la persona ingresada.");

        }

        return cv;

    }
}
