
package vac.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class MiConexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "vacunar23";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    private MiConexion() {}
public static Connection getConexion() {
        
        if (connection == null) {
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                
                JOptionPane.showMessageDialog(null, "Se conecto correctamente");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
            }
        }
        return connection;
    }
}
