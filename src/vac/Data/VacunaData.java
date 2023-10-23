package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vac.Conexion.MiConexion;
import vac_Entidades.Laboratorio;
import vac_Entidades.Vacuna;

public class VacunaData {

    private Connection CON = null;

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

    public void eliminarVacuna(int idVacuna) {

        String SQL_ELIMINAR = "UPDATE vacuna SET estado=0 WHERE idVacuna=?";
        try {

            PreparedStatement PS = CON.prepareStatement(SQL_ELIMINAR);
            PS.setInt(1, idVacuna);

            int FILA = PS.executeUpdate();

            if (FILA == 1) {
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla Vacuna.");

        }

    }

    public ArrayList<Vacuna> buscarvacuna() {

        ArrayList<Vacuna> vacu = new ArrayList();
        String SQL_BUSCAR = "SELECT * FROM vacuna WHERE colocada = 0 AND estado=1";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_BUSCAR);
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {
                Vacuna vac = new Vacuna();
                vac.setIdVacuna(RS.getInt(1));
                vac.setNoSerieDosis(RS.getString(2));
                vac.setMarca(RS.getString(3));
                vac.setMedida(RS.getDouble(4));
                vac.setFechaCaduca(LocalDate.parse(RS.getString(5)));
                vac.setColocada(RS.getBoolean(6));
                vac.setEstado(RS.getBoolean(7));
                vacu.add(vac);

            }
            PS.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar a la tabla Vacuna.");
        }
        return vacu;
    }

}
