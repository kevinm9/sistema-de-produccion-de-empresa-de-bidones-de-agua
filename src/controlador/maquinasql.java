package controlador;

import modelo.maquina;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class maquinasql extends conexion {

    maquina maquina = new maquina();

    //insertar resgistro en la tabla
    public void insertarmaquina(maquina maquina) {
        //sentencia sql insert
        String sql = "INSERT INTO maquinaria(codigo_maquinaria, nombre_maquinaria, capacidad_maquinaria, peso_maquinaria, energia_maquinaria, descripcion_maquinaria)VALUES (?, ?, ?, ?, ?, ?);";

        try {
            //verificar la conexion
            if (this.getConexion() != null) {
                //verificar si hay un registro repetido
                if (!haymaquina(maquina.getCODIGO_MAQUINARIA())) {
                    //prepara la sentencia sql
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    //insertar la variables de las cajas de texto en el registro de la tabla 
                    ps.setString(1, maquina.getCODIGO_MAQUINARIA());
                    ps.setString(2, maquina.getNOMBRE_MAQUINARIA());
                    
                   
                    
                    ps.setString(3, maquina.getCAPACIDAD_MAQUINARIA());
                    ps.setString(4, maquina.getPESO_MAQUINARIA());
                    ps.setString(5, maquina.getENERGIA_MAQUINARIA());
                    ps.setString(6, maquina.getDESCRIPCION_MAQUINARIA());

                    //ejecuta la sentencia sql ya cargada con los datos 
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
            System.out.println(ex);
        }

    }

//verifica si hay un registro dependiente de su un campo de texto devuelve verdadero o falso si se lo encuntra en la consulta realizada
    public boolean haymaquina(String codigo) {
        //sentencia sql select de la tabla con where del campo q se comparara para bsucar un  registro
        String sql = "select * from maquinaria where CODIGO_MAQUINARIA=?;";

        try {
            //verificar la conexion
            if (this.getConexion() != null) {
                //prepara la sentencia sql
                PreparedStatement ps = this.getConexion().prepareStatement(sql);
                //manda a la sentencia sql la variable del metodo 
                ps.setString(1, codigo);
                //ejecuta la sentencia sql
                ResultSet rs = ps.executeQuery();
                //devuelve si hay un registro en la tabla
                while (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Dato encontrado", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    //devuelve verdadero verdadero encuntra un registro en la consulta
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos no encontrados", "Error", JOptionPane.ERROR_MESSAGE);
        }
//devuelve verdadero falso si no encuntra un registro en la consulta
        return false;

    }

    //verifica si hay un registro dependiente de su id en la consulta realizada devuelve verdadero o falso
    public boolean haymaquinaid(int id) {
        //sentencia sql 
        String sql = "select * from maquinaria where ID_MAQUINARIA=?;";
        try {
            //verificar la conexion
            if (this.getConexion() != null) {
                //prepara la sentencia sql 
                PreparedStatement ps = this.getConexion().prepareStatement(sql);
                //llena la sentencia con el dato de la funcion
                ps.setInt(1, id);
                //ejecuta la sentencia 
                ResultSet rs = ps.executeQuery();
                //verifica si hay un registro de la consulta
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
        //devuelve falso si no encontro un registro de la consulta
        return false;
    }

    //listar de todos los registro de la tabla, metodo de lista q devuelve la lista de objetos
    public List<maquina> MostrarTodos() {
        //creamos una lista de tipo del objeto 
        List<maquina> lp = new ArrayList<maquina>();
        //sentendia sql para mostrar todos los registro de la tabla
        String sql = "select * from maquinaria;";

        try {
            //verificamos si hay coneccion 
            if (this.getConexion() != null) {
                //cargamos la sentendia sql 
                PreparedStatement ps = this.getConexion().prepareStatement(sql);
                //recopiamos la informacion  
                ResultSet rs = ps.executeQuery();
                //recoremos los registro de la tabla
                while (rs.next()) {
                    //creamos un objeto
                    maquina nuevamaquina = new maquina();

                    //le agreamos al objeto la informacion q se toma de cada registro de la tabla
                    nuevamaquina.setID_MAQUINARIA(rs.getInt("ID_MAQUINARIA"));
                    nuevamaquina.setCODIGO_MAQUINARIA(rs.getString("CODIGO_MAQUINARIA"));
                    nuevamaquina.setNOMBRE_MAQUINARIA(rs.getString("NOMBRE_MAQUINARIA"));
                    nuevamaquina.setCAPACIDAD_MAQUINARIA(rs.getString("CAPACIDAD_MAQUINARIA"));
                    nuevamaquina.setPESO_MAQUINARIA(rs.getString("PESO_MAQUINARIA"));
                    nuevamaquina.setENERGIA_MAQUINARIA(rs.getString("ENERGIA_MAQUINARIA"));
                    nuevamaquina.setDESCRIPCION_MAQUINARIA(rs.getString("DESCRIPCION_MAQUINARIA"));

                    //se añade el objeto a la lista de objeto
                    lp.add(nuevamaquina);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al visualizar datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //retornbamos la lista de objectos llena
        return lp;
    }

    //elima registro de una tabla por su id
    public void eliminarmaquina(int id) {
//sentencia para borrar registro
        String sql = "delete from maquinaria where id_maquinaria=?;";
        try {
            //verifica si hay conexion
            if (this.getConexion() != null) {
                //metodo para ver si el objeto se encuentra en la base de datos
                if (haymaquinaid(id)) {
                     //preparar sentencia sql
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    //registrar los datos de la funcion en la sentencia
                    ps.setInt(1, id);
                    //ejecutar la sentencia para eliminar
                    ps.executeUpdate();
                    //mensaje de datos eliminado
                    JOptionPane.showMessageDialog(null, "Datos Eliminados Correctamente", "Confirmacion", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al eliminar", "Error", JOptionPane.ERROR_MESSAGE);
             //informe de error
            System.out.println(e);
        }
    }

    //actualiza la informacion de un objeto por un campo de  texto
    public void actualizarmaquina(maquina maquina) {
        //prepara sentencia sql para actualizar update
        String sql = "UPDATE maquinaria SET codigo_maquinaria=?, nombre_maquinaria=?, capacidad_maquinaria=?, peso_maquinaria=?, energia_maquinaria=?, descripcion_maquinaria=? WHERE id_maquinaria=?;";

        try {
            //verifica la conexion
            if (this.getConexion() != null) {
                //verifica si existe el registro esta en la tabla primero
                if (haymaquinaid(maquina.getID_MAQUINARIA())) {
                    //prepara la sentencia sql
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    //insertar la variables de las cajas de texto en el registro de la tabla 
                    ps.setString(1, maquina.getCODIGO_MAQUINARIA());
                    ps.setString(2, maquina.getNOMBRE_MAQUINARIA());
                    ps.setString(3, maquina.getCAPACIDAD_MAQUINARIA());
                    ps.setString(4, maquina.getPESO_MAQUINARIA());
                    ps.setString(5, maquina.getENERGIA_MAQUINARIA());
                    ps.setString(6, maquina.getDESCRIPCION_MAQUINARIA());
                    //este asigna el dato para que verifica el where 
                    ps.setInt(7, maquina.getID_MAQUINARIA());

                    //ejecuta la sentencia sql ya cargada con los datos 
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dato No actualizado", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
    }

//obtener un el objeto con sus registros de la tabla por su id 
    public maquina obtenermaquina(int id) {
        maquina maquinaobtenida = new maquina();
        //consulta sql
        String sql = "select * from maquinaria where id_maquinaria=?;";
        try {
            //verificar si hay conexion con la base de datos
            if (this.getConexion() != null) {
                //verificar id del objecto en la base de datos
                if (haymaquinaid(id)) {
                    //preparar sentencia sql 
                    PreparedStatement ps = this.getConexion().prepareStatement(sql);
                    //rellenar sentencia sql con datos del metodo 
                    ps.setInt(1, id);
                    //ejecutar sentencia
                    ResultSet rs = ps.executeQuery();
                    //recoremos los registros de la base de dato y llenamos con eso a nuestro objecto
                    while (rs.next()) {
                        maquinaobtenida.setID_MAQUINARIA(rs.getInt(1));
                        maquinaobtenida.setCODIGO_MAQUINARIA(rs.getString(2));
                        maquinaobtenida.setNOMBRE_MAQUINARIA(rs.getString(3));
                        maquinaobtenida.setCAPACIDAD_MAQUINARIA(rs.getString(4));
                        maquinaobtenida.setPESO_MAQUINARIA(rs.getString(5));
                        maquinaobtenida.setENERGIA_MAQUINARIA(rs.getString(6));
                        maquinaobtenida.setDESCRIPCION_MAQUINARIA(rs.getString(7));

                    }
                } else {
                    //devolvemo un objecto null si no hay informacion
                    maquinaobtenida = null;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Datos no encontrados", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        //devolvemos el objecto lleno de informacion de la base de datos
        
        return maquinaobtenida;
    }

}
