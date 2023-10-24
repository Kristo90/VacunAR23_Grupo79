package vac.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vac.Conexion.MiConexion;
import vac_Entidades.Ciudadano;
import vac_Entidades.Laboratorio;

public class CiudadanoData {

    Ciudadano pers = new Ciudadano();

    private Connection CON = null;

    Laboratorio lab = new Laboratorio();

    public CiudadanoData() {
        CON = MiConexion.getConexion();
    }

    public void inscribirCiudadano(Ciudadano pers) {

        String SQL_INSCRIBIR = "INSERT INTO ciudadano (dni, nombre, apellido, email, celular, patologia, ambitoTrabajo, estado)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_INSCRIBIR, Statement.RETURN_GENERATED_KEYS);

            PS.setInt(1, pers.getDni());
            PS.setString(2, pers.getNombre());
            PS.setString(3, pers.getApellido());
            PS.setString(4, pers.getEmail());
            PS.setString(5, pers.getCelular());
            PS.setString(6, pers.getPatologia());
            PS.setString(7, pers.getAmbtrabajo());
            PS.setBoolean(8, pers.isEstado());
            PS.executeUpdate();

            ResultSet RS = PS.getGeneratedKeys();

            if (RS.next()) {
                pers.setIdCiudadano(RS.getInt(1));//Si falla poner 1 en lugar de idCiudadano
                JOptionPane.showMessageDialog(null, "Se inscribió correctamente");
                System.out.println(pers.getIdCiudadano());
            }

            PS.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "La persona ya existe en la Base de Datos");

        }
    }

    public Ciudadano buscarCiudadano(int dni) {

        Ciudadano PERS = new Ciudadano();

        String SQL_BUSCAR = "SELECT idCiudadano, nombre, apellido, email, celular, patologia, ambitoTrabajo, estado FROM ciudadano WHERE dni=?";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_BUSCAR);
            PS.setInt(1, dni);

            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                PERS.setIdCiudadano(RS.getInt(1));
                PERS.setNombre(RS.getNString(2));
                PERS.setApellido(RS.getNString(3));
                PERS.setEmail(RS.getString(4));
                PERS.setCelular(RS.getNString(5));
                PERS.setPatologia(RS.getNString(6));
                PERS.setAmbtrabajo(RS.getNString(7));
                PERS.setEstado(RS.getBoolean(8));

                JOptionPane.showMessageDialog(null, "Persona encontrada");
            
                

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "NO se puede conectar a la tabla Ciudadano");

        }

        return PERS;
    }

    public void bajaCiudadano(int dni) {

        String SQL_ELIMINAR = "UPDATE ciudadano SET estado = 0 WHERE dni = ? ";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_ELIMINAR);
            PS.setInt(1, dni);

            int fila = PS.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó a la persona del programa VacunAr23");
            }

            PS.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla ciudadano");

        } catch (NumberFormatException ex) {

        }
    }

    public void actualizarCiudadano(Ciudadano pers) {

        String SQL_ACTUALIZAR = "UPDATE ciudadano SET nombre=?, apellido=?, email=?, celular=?, patologia=?, ambitoTrabajo=?, estado=? WHERE dni = ? ";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_ACTUALIZAR);

            PS.setString(1, pers.getNombre());
            PS.setString(2, pers.getApellido());
            PS.setString(3, pers.getEmail());
            PS.setString(4, pers.getCelular());
            PS.setString(5, pers.getPatologia());
            PS.setString(6, pers.getAmbtrabajo());
            PS.setBoolean(7, pers.isEstado());
            PS.setInt(8, pers.getDni());

            int fila = PS.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Se actualizó la información del ciudadano");

            }

            PS.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla ciudadano");

        }
    }

    public List<Ciudadano> listaCiudadano() {

        ArrayList<Ciudadano> LISTA = new ArrayList();

        String SQL_LISTA = "SELECT nombre, apellido FROM ciudadano WHERE estado = 1";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_LISTA);
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                String nombre = RS.getString("nombre");
                String apellido = RS.getString("apellido");

                Ciudadano ciu = new Ciudadano(nombre, apellido);

                LISTA.add(ciu);
            }

        } catch (SQLException ex) {

            Logger.getLogger(CiudadanoData.class.getName()).log(Level.SEVERE, null, ex);

        }

        return LISTA;

    }

}
