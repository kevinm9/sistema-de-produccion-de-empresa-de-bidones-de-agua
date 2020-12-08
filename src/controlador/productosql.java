
package controlador;

import modelo.producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class productosql extends conexion {

    producto producto = new producto();

//insertar resgistro 
    public void insertarproducto(producto producto) {

        
        String sql = "INSERT INTO producto(codigo_producto, nombre_producto, costo_producto, precio_producto, material_producto, presentacion_producto, peso_producto, capacidad_producto, descripcion_producto)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            if (this.getConexion() != null) {
                if (!hayproducto(producto.getCODIGO_PRODUCTO())) {
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    ps.setString(1, producto.getCODIGO_PRODUCTO());
                    ps.setString(2, producto.getNOMBRE_PRODUCTO());
                    ps.setString(3, producto.getCOSTO_PRODUCTO());
                    ps.setString(4, producto.getPRECIO_PRODUCTO());
                    ps.setString(5, producto.getMATERIAL_PRODUCTO());
                    ps.setString(6, producto.getPRESENTACION_PRODUCTO());
                    ps.setString(7, producto.getPESO_PRODUCTO());
                    ps.setString(8, producto.getCAPACIDAD_PRODUCTO());
                    ps.setString(9, producto.getDESCRIPCION_PRODUCTO());
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Datos ingresados", "Exito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                     JOptionPane.showMessageDialog(null, "ya existen un registro con ese mismo dato", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al ingresar", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }

    }
    
//verifica si hay un registro dependiente de su un campo de texto
    public boolean hayproducto(String codigo) {

        String sql = "select * from producto where codigo_producto=?;";

        try {
            if (this.getConexion() != null) {
                PreparedStatement ps = this.getConexion().prepareStatement(sql);

                ps.setString(1, codigo);

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                     JOptionPane.showMessageDialog(null, "Dato encontrado", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }
            } else {
               JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Datos no encontrados", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;

    }
    
   //listar de todos los registro de la tabla
    public List<producto> MostrarTodos() {
        List<producto> lp = new ArrayList<>();
        String sql = "select * from producto;";
        try {
            if (this.getConexion() != null) {
                PreparedStatement ps = this.getConexion().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    producto p = new producto();
                    
                    p.setID_PRODUCTO(rs.getInt("ID_PRODUCTO"));
                    p.setCODIGO_PRODUCTO(rs.getString("CODIGO_PRODUCTO"));
                    p.setNOMBRE_PRODUCTO(rs.getString("NOMBRE_PRODUCTO"));
                    p.setCOSTO_PRODUCTO(rs.getString("COSTO_PRODUCTO"));
                    p.setPRECIO_PRODUCTO(rs.getString("PRECIO_PRODUCTO"));
                    p.setMATERIAL_PRODUCTO(rs.getString("MATERIAL_PRODUCTO"));
                    p.setPRESENTACION_PRODUCTO(rs.getString("PRESENTACION_PRODUCTO"));
                    p.setPESO_PRODUCTO(rs.getString("PESO_PRODUCTO"));
                    p.setCAPACIDAD_PRODUCTO(rs.getString("CAPACIDAD_PRODUCTO"));
                    p.setDESCRIPCION_PRODUCTO(rs.getString("DESCRIPCION_PRODUCTO"));
                    
                    lp.add(p);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al visualizar datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return lp;
    }
 
//verifica si hay un registro dependiente de su id 
    public boolean haymaquinaid(int id) {
        String sql = "select PRODUCTO from PRODUCTO where ID_PRODUCTO=?;";
        try {
            if (this.getConexion() != null) {
                PreparedStatement ps = this.getConexion().prepareStatement(sql);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    //devuelve verdadero si encontro un registro de la consulta
                    JOptionPane.showMessageDialog(null, "Dato encontrado", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no encontrados", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    
//actualiza la informacion de un objeto por un campo de  texto
    public void actualizarproducto(producto producto) {

        String sql = "UPDATE producto SET codigo_producto=?, nombre_producto=?, costo_producto=?, precio_producto=?, material_producto=?, presentacion_producto=?, peso_producto=?, capacidad_producto=?, descripcion_producto=? WHERE ID_PRODUCTO=?;";

        
        try {
            if (this.getConexion() != null) {
                if (haymaquinaid(producto.getID_PRODUCTO())) {
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);

                    ps.setString(1, producto.getCODIGO_PRODUCTO());
                    ps.setString(2, producto.getNOMBRE_PRODUCTO());
                    ps.setString(3, producto.getCOSTO_PRODUCTO());
                    ps.setString(4, producto.getPRECIO_PRODUCTO());
                    ps.setString(5, producto.getMATERIAL_PRODUCTO());
                    ps.setString(6, producto.getPRESENTACION_PRODUCTO());
                    ps.setString(7, producto.getPESO_PRODUCTO());
                    ps.setString(8, producto.getCAPACIDAD_PRODUCTO());
                    ps.setString(9, producto.getDESCRIPCION_PRODUCTO());
                    

                    ps.setInt(10, producto.getID_PRODUCTO());

                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dato no actualizado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
//elima registro de una tabla por su id
    public void eliminarproducto(int id) {

        String sql = "delete from producto where ID_PRODUCTO=?;";
        try {
            if (this.getConexion() != null) {
                if (haymaquinaid(id)) {
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    ps.setInt(1, id);
                    ps.executeUpdate();
                      JOptionPane.showMessageDialog(null, "Datos Eliminados Correctamente", "Confirmacion", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Ocurrio un problema al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
//obtener un el objeto con los registros de la tabla por su id 
    public producto obtenerproductoid(int id) {
        producto p = new producto();
        String sql = "select * from PRODUCTO where ID_PRODUCTO=?;";
        try {
            if (this.getConexion() != null) {
                if (haymaquinaid(id)) {
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    ps.setInt(1, id);
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {

                        p.setID_PRODUCTO(rs.getInt(1));
                        p.setCODIGO_PRODUCTO(rs.getString(2));
                        p.setNOMBRE_PRODUCTO(rs.getString(3));
                        p.setCOSTO_PRODUCTO(rs.getString(4));
                        p.setPRECIO_PRODUCTO(rs.getString(5));
                        p.setMATERIAL_PRODUCTO(rs.getString(6));
                        p.setPRESENTACION_PRODUCTO(rs.getString(7));
                        p.setPESO_PRODUCTO(rs.getString(8));
                        p.setCAPACIDAD_PRODUCTO(rs.getString(9));
                        p.setDESCRIPCION_PRODUCTO(rs.getString(10));
                        

                    }
                } else {
                    p = null;
                }
            } else {
               JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos no encontrados", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return p;
    }

    
    
}
