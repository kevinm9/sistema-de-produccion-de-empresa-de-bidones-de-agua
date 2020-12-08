
package controlador;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class consultassql extends conexion{
    
    

      //listar de todos los registro de la tabla
    //consulta los registro de produccion
    public ArrayList<Object[]> consultaproduccion() {
        
        ArrayList<Object[]> datos=new ArrayList<>();
        String sql = "select * from consultaproduccion";
        
        try {
            if (this.getConexion() != null) {
                
                PreparedStatement ps = this.getConexion().prepareStatement(sql);//ps=getConexion().prepareStatement("select s_dni,s_apellidos,s_nombres from socios");
                
                ResultSet rs = ps.executeQuery(); //rs=ps.executeQuery();
                
                ResultSetMetaData rsm=rs.getMetaData(); //rsm=rs.getMetaData();

                
             List<Object> objlista = new ArrayList<>(); //creacion de objecto q se sobrecargara con datos de la consulta
                
                
                while (rs.next()) {

                    Object[] filas = new Object[rsm.getColumnCount()];

                    for (int i = 0; i < filas.length; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }

                    datos.add(filas);
                }

                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al visualizar datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return datos;
    }

    
       //listar de todos los registro de la tabla
    //consulta los registro de produccion
    public ArrayList<Object[]> consultaproducto(String codigo) {
        
        ArrayList<Object[]> datos=new ArrayList<>();
        String sql = "select * from consultaproduccion where codigo_producto=?;";
        
        try {
            if (this.getConexion() != null) {
                
                PreparedStatement ps = this.getConexion().prepareStatement(sql);//ps=getConexion().prepareStatement("select s_dni,s_apellidos,s_nombres from socios");
                
                ps.setString(1, codigo);
                
                ResultSet rs = ps.executeQuery(); //rs=ps.executeQuery();
                
                ResultSetMetaData rsm=rs.getMetaData(); //rsm=rs.getMetaData();

                
             List<Object> objlista = new ArrayList<>(); //creacion de objecto q se sobrecargara con datos de la consulta
                
                
                while (rs.next()) {

                    Object[] filas = new Object[rsm.getColumnCount()];

                    for (int i = 0; i < filas.length; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }

                    datos.add(filas);
                }

                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe, Error al visualizar datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return datos;
    }

    
         //listar de todos los registro de la tabla
    //consulta los registro de maquina
    public ArrayList<Object[]> consultamaquina(String codigo) {
        
        ArrayList<Object[]> datos=new ArrayList<>();
        String sql = "select * from consultaproduccion where codigo_maquinaria=?;";
        
        try {
            if (this.getConexion() != null) {
                
                PreparedStatement ps = this.getConexion().prepareStatement(sql);//ps=getConexion().prepareStatement("select s_dni,s_apellidos,s_nombres from socios");
                
                ps.setString(1, codigo);
                
                ResultSet rs = ps.executeQuery(); //rs=ps.executeQuery();
                
                ResultSetMetaData rsm=rs.getMetaData(); //rsm=rs.getMetaData();

                
             List<Object> objlista = new ArrayList<>(); //creacion de objecto q se sobrecargara con datos de la consulta
                
                
                while (rs.next()) {

                    Object[] filas = new Object[rsm.getColumnCount()];

                    for (int i = 0; i < filas.length; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }

                    datos.add(filas);
                }

                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe, Error al visualizar datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return datos;
    }

             //listar de todos los registro de la tabla
    //consulta los registro de fecha
    public ArrayList<Object[]> consultafecha(String fecha) {
        
        ArrayList<Object[]> datos=new ArrayList<>();
        String sql = "select * from consultaproduccion where fecha_produccion=?;";
        
        try {
            if (this.getConexion() != null) {
                
                PreparedStatement ps = this.getConexion().prepareStatement(sql);//ps=getConexion().prepareStatement("select s_dni,s_apellidos,s_nombres from socios");
                
                ps.setString(1, fecha);
                
                ResultSet rs = ps.executeQuery(); //rs=ps.executeQuery();
                
                ResultSetMetaData rsm=rs.getMetaData(); //rsm=rs.getMetaData();

                
             List<Object> objlista = new ArrayList<>(); //creacion de objecto q se sobrecargara con datos de la consulta
                
                
                while (rs.next()) {

                    Object[] filas = new Object[rsm.getColumnCount()];

                    for (int i = 0; i < filas.length; i++) {
                        filas[i] = rs.getObject(i + 1);

                    }

                    datos.add(filas);
                }

                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe, Error al visualizar datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return datos;
    }

    
    
    
}
