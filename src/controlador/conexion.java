
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    private Connection conexion = null;

    public conexion() {
        try {

            Class.forName("org.postgresql.Driver");

           
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/aguacaluma", "postgres", "sistemas");
            
            if (conexion != null) {
                System.out.println("Conexión Exitosa con la base de datos PostgreSQL 9.0");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos.\nSe deshabilitaron algunas opciones del programa", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error en Conexión con la base de datos PostgreSQL 9.0, " + ex);
            

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void CloseConexion() {
        try {
            conexion.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
        }
    }
}
