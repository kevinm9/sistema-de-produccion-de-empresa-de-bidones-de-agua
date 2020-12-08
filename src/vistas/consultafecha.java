/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


import controlador.conexion;

import controlador.consultassql;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class consultafecha extends javax.swing.JInternalFrame {

  
    public consultafecha() {
        initComponents();
       
        aliniciar();
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
                
                
                ArrayList<Object[]> lista = consulta.consultafecha(TXTFECHA.getText());
                
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TXTFECHA = new javax.swing.JTextField();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 320));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/research.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 80, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CODIGO DE MAQUINA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 20));

        TXTFECHA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(TXTFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 220, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         if (this.TXTFECHA.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Ingrese un datos ", "Error", JOptionPane.ERROR_MESSAGE);
           
        } else {
              mostrartabla();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTFECHA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablastock;
    // End of variables declaration//GEN-END:variables

    private void aliniciar() {
        
      Date date = new Date();

DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
String fechasistema = (""+dateFormat.format(date));

        this.TXTFECHA.setText(fechasistema);
    
    }

  
    
   
}
