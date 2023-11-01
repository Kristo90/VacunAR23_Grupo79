package vac.Data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vac.Conexion.MiConexion;
import vac_Entidades.CitaVacunacion;
import vac_Entidades.Ciudadano;
import vac_Entidades.Vacuna;

public class ConsultaData {

    private Connection CON = null;
    public ConsultaData() {

        CON = MiConexion.getConexion();
    }
//  ⦁	Se lista mensualmente, todas las citas vencidas, cumplidas, o canceladas.
    public void listaMensual() {

//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
        String SQL_MENSSUAL = "SELECT * FROM citavacunacion WHERE estado IN (vencida, cumplida, cancelada) AND DATE (fechaHoraCita) <= CURDATE()";

        try {

            PreparedStatement PS = CON.prepareStatement(SQL_MENSSUAL);

            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                int codCita = RS.getInt("codCita");
                String persona = RS.getString("persona");
                int codRefuerzo = RS.getInt("CodRefuerzo");

            }

        } catch (SQLException ex) {

            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

//    ⦁	Listar diariamente, todos los centros de vacunación, y la cantidad de dosis aplicadas en cada uno.
    public void listarCitas() {

//      SELECT `codCita`, `persona`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `fechaHoraColoca`, `dosis`, `estado` FROM `citavacunacion` WHERE 1
//        SELECT * FROM `citavacunacion` WHERE 1
        try {
            String SQL_CENTRO = "SELECT centroVacunacion, COUNT(*) AS cantidadDosisAplicadas"
                    + "FROM citavacunacion"
                    + "WHERE fechaHoraCita BETWEEN CURDATE() AND DATE_ADD(CURDAT(), INTERVAL 1 DAT)"
                    + "GROUP BY centroVacunacion";

            PreparedStatement PS = CON.prepareStatement(SQL_CENTRO);

            ResultSet RS = PS.executeQuery();

            while (RS.next()) {

                String centroVac = RS.getString("centroVacinacion");
                int cantidadDosis = RS.getInt("cantidadDosisAplicadas");

            }

            RS.close();

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<String[]> listarCentroA(String CVac) {
        ArrayList<String[]> lista = new ArrayList();
        

//       	Para un centro especifico, listar las vacunas aplicadas, con número de serie y DNI del ciudadano receptor.
        String sql = "SELECT centroVacunacion,vacuna.nroSerieDosis, ciudadano.dni FROM citavacunacion INNER JOIN vacuna ON vacuna.idVacuna = citavacunacion.dosis INNER JOIN ciudadano ON ciudadano.idCiudadano= citavacunacion.persona WHERE fechaHoraColoca IS NOT  NULL AND centroVacunacion= ?";
        try {

            PreparedStatement PS = CON.prepareStatement(sql);
            PS.setString(1, CVac);
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {
                String[] fila = new String[3];
                
                fila[0] = RS.getString("centroVacunacion");
                fila[1] = RS.getString("nroSerieDosis");
                fila[2] = RS.getString("dni");
                lista.add(fila);
                

            }

            PS.close();

        } catch (SQLException ex) {
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
public ArrayList<String[]> aplicadasxFechaxVacunatorio(LocalDate date){
  ArrayList<String[]>lista=new ArrayList();
  
  
  String sql="SELECT centroVacunacion AS Vacunatorio,COUNT(dosis) AS Vacunas_Aplicadas FROM citavacunacion WHERE fechaHoraColoca=? GROUP BY centroVacunacion;";
  try{  
  PreparedStatement PS = CON.prepareStatement(sql);
            PS.setDate(1,Date.valueOf(date));
            ResultSet RS = PS.executeQuery();

            while (RS.next()) {
                String[]fila=new String[2];
                
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                
                lista.add(fila);
                for (String[] row : lista){
                    for(String fil:row){
                    System.out.print(fil+" ");
                        System.out.println(" ");
                    }
                }
            }
            PS.close();
  }catch  (SQLException ex) {
            Logger.getLogger(ConsultaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    return lista;  
}
}
