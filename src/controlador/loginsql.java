/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class loginsql extends conexion{
    
     public boolean consultarusuario(String usuario ,String clave) {
        
        
        String sql = "select * from usuario where nombre_usuario=? and clave_usuario=?;";
        
        try {
            if (this.getConexion() != null) {
                
                PreparedStatement ps = this.getConexion().prepareStatement(sql);//ps=getConexion().prepareStatement("select s_dni,s_apellidos,s_nombres from socios");
                
                ps.setString(1, usuario);
                ps.setString(2, clave);
                
                ResultSet rs = ps.executeQuery(); //rs=ps.executeQuery();
                
         
    
                
                while (rs.next()) {

            return true;

                }

                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe, Error al visualizar datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        return false;
    }

    
      public void insertarusuario(String nombre, String clave) {
        //sentencia sql insert
        String sql = "INSERT INTO usuario( nombre_usuario, clave_usuario)VALUES (?,?);";

        try {
            //verificar la conexion
            if (this.getConexion() != null) {
                //verificar si hay un registro repetido
               
                    //prepara la sentencia sql
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    //insertar la variables de las cajas de texto en el registro de la tabla 
                    ps.setString(1, nombre);
                    ps.setString(2, clave);
             
                    

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
