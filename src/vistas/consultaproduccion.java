/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import controlador.conexion;

import controlador.consultassql;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class consultaproduccion extends javax.swing.JInternalFrame {

  
    public consultaproduccion() {
        initComponents();
        mostrartabla();
        
    }

  
    
    conexion conexion = new conexion();
    consultassql consulta = new consultassql();
    DefaultTableModel tabla = new DefaultTableModel();
    
      public void mostrartabla() {

          try {
            if (conexion.getConexion() != null) {
                tabla.setColumnCount(0);
                tabla.setRowCount(0);
                this.tablastock.setModel(tabla);
 
                tabla.addColumn("ORDEN");
                tabla.addColumn("COD");
                tabla.addColumn("MAQUINA");
                tabla.addColumn("FECHA");
                tabla.addColumn("HORA");
                tabla.addColumn("COD");
                tabla.addColumn("PRODUCTO");
                tabla.addColumn("CANTIDAD");
                
                ArrayList<Object[]> lista = consulta.consultaproduccion();
                
                for (int i = 0; i <lista.size(); i++) {
                tabla.addRow(lista.get(i));
                }




                
            } else {
 JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
 System.out.println(e.getMessage());
        }    
        
          
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablastock = new javax.swing.JTable();

        setClosable(true);
        setTitle("CONTROL DE PRODUCCION");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablastock.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablastock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablastock);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablastock;
    // End of variables declaration//GEN-END:variables

  
    
   
}
