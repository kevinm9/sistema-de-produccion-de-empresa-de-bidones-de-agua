/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDREA
 */
public class produccionsql extends conexion{
    
     //insertar resgistro en la tabla
    public void insertarproduccion(String ORDEN,int MAQUINA,String FECHA,String HORA,int PRODUCTO,int CANTIDAD) {
        //sentencia sql insert
        String sql = "INSERT INTO produccion(orden_produccion, idmaquina_produccion, fecha_produccion, hora_produccion, idproducto_produccion, cantidad_produccion)VALUES (?, ?, ?, ?, ?, ?);";

        try {
            //verificar la conexion
            if (this.getConexion() != null) {
                //verificar si hay un registro repetido
               
                    //prepara la sentencia sql
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    //insertar la variables de las cajas de texto en el registro de la tabla 
                    ps.setString(1, ORDEN);
                    ps.setInt(2, MAQUINA);
                    ps.setString(3, FECHA);
                    ps.setString(4, HORA);
                    ps.setInt(5, PRODUCTO);
                    ps.setInt(6, CANTIDAD);
                  
                    

                    //ejecuta la sentencia sql ya cargada con los datos 
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Datos ingresados", "Exito", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al ingresar", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }

    }
    
    
}
