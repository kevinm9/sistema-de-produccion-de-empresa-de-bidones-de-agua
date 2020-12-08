
package vistas;

import controlador.conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class menu extends javax.swing.JFrame {


    
     /*cra variables de las clases de vistas*/
    //producto
    nuevoproducto ventananuevoproducto;
    editarproducto ventanaeditarproducto;

       //maquinarias
    nuevamaquina ventananuevamaquina;
    editarmaquina ventanaeditarproveedor;
           
    //consulta produccion
    consultaproduccion consultaproduccion;
    
    //produccion
    produccion ventanaproduccion;
    consultaproducto ventanaconsultaproducto;
    consultamaquina ventanaconsultamaquina;
     consultafecha ventanaconsultafecha;
    
    //infomracion
    informacion ventanainformacion;
   
  
    
    /*cra variables de las clases conxion*/
    conexion conexion;
    //mensaje
    mensaje ventanamensaje;
    
    
  

    public menu() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        /*creauna nueva conexion*/
        conexion = new conexion();
        iniciarconexion();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuproveedores = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        menuproductos = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        menuinventario = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGUA CALUMA");
        setIconImage(getIconImage());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wwww.png"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(670, 310, 700, 290);

        menuproveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_technology-machine-electronic-device-04_4026458.png"))); // NOI18N
        menuproveedores.setText("MAQUINARIAS");
        menuproveedores.setEnabled(false);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_new-file_85332.png"))); // NOI18N
        jMenuItem5.setText("INSERTAR NUEVA MAQUINARIA");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuproveedores.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_file-exe_285685.png"))); // NOI18N
        jMenuItem6.setText("CONTROL DE MAQUINARIAS");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuproveedores.add(jMenuItem6);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_edit-paste_118923.png"))); // NOI18N
        jMenuItem11.setText("GENERAR REPORTE");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuproveedores.add(jMenuItem11);

        menuBar.add(menuproveedores);

        menuproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_resolutions-18_897234.png"))); // NOI18N
        menuproductos.setText("PRODUCTOS");
        menuproductos.setEnabled(false);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_new-file_85332.png"))); // NOI18N
        jMenuItem2.setText("INSERTAR NUEVO PRODUCTO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuproductos.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_file-exe_285685.png"))); // NOI18N
        jMenuItem1.setText("CONTROL DE PRODUCTOS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuproductos.add(jMenuItem1);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_edit-paste_118923.png"))); // NOI18N
        jMenuItem12.setText("GENERAR REPORTE");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuproductos.add(jMenuItem12);

        menuBar.add(menuproductos);

        menuinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_technology-machine-electronic-device-24_4026436.png"))); // NOI18N
        menuinventario.setText("PRODUCCION");
        menuinventario.setEnabled(false);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_technology-machine-electronic-device-24_4026436.png"))); // NOI18N
        jMenuItem10.setText("PRODUCIR");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuinventario.add(jMenuItem10);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/research.png"))); // NOI18N
        jMenuItem3.setText("CONSULTA DE PRODUCCION");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuinventario.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/research.png"))); // NOI18N
        jMenuItem4.setText("CONSULTA POR CODIGO DE PRODUCTO");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuinventario.add(jMenuItem4);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/research.png"))); // NOI18N
        jMenuItem7.setText("CONSULTA POR CODIGO DE MAQUINARIA");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuinventario.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/research.png"))); // NOI18N
        jMenuItem8.setText("CONSULTA POR FECHA ");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuinventario.add(jMenuItem8);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_edit-paste_118923.png"))); // NOI18N
        jMenuItem13.setText("GENERAR REPORTE");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuinventario.add(jMenuItem13);

        menuBar.add(menuinventario);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        jMenu8.setText("INFORMACION");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pregunta.png"))); // NOI18N
        jMenuItem9.setText("ACERCA DEL PROGRAMA");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        menuBar.add(jMenu8);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GMAIL.png"))); // NOI18N
        jMenu2.setText("MENSAJERIA");

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GMAIL.png"))); // NOI18N
        jMenuItem14.setText("ENVIAR MENSAJE");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        menuBar.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        jMenu1.setText("SALIR");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenu1MouseEntered(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        ventananuevoproducto = new nuevoproducto();
        this.desktopPane.add(ventananuevoproducto);
        ventananuevoproducto.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 
        ventanaeditarproducto = new editarproducto();
        this.desktopPane.add(ventanaeditarproducto);
        ventanaeditarproducto.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        
        ventananuevamaquina = new nuevamaquina();
        this.desktopPane.add(ventananuevamaquina);
        ventananuevamaquina.show();
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
               ventanaeditarproveedor = new editarmaquina();
        this.desktopPane.add(ventanaeditarproveedor);
        ventanaeditarproveedor.show();
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
              ventanainformacion = new informacion();
        this.desktopPane.add(ventanainformacion);
        ventanainformacion.show();
        
       
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        
        
        int op = JOptionPane.showConfirmDialog(this, "Esta seguro que desea salir", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
              System.exit(0);
            } 
        
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        ventanaproduccion = new produccion();
        this.desktopPane.add(ventanaproduccion);
        ventanaproduccion.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        consultaproduccion = new consultaproduccion();
        this.desktopPane.add(consultaproduccion);
        consultaproduccion.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         ventanaconsultaproducto = new consultaproducto();
        this.desktopPane.add(ventanaconsultaproducto);
        ventanaconsultaproducto.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       
        
          ventanaconsultamaquina = new consultamaquina();
        this.desktopPane.add(ventanaconsultamaquina);
        ventanaconsultamaquina.show();      
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
             ventanaconsultafecha = new consultafecha();
        this.desktopPane.add(ventanaconsultafecha);
        ventanaconsultafecha.show();     
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

 
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
          //llamamos al reporte
     
        
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       
 
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        
        ventanamensaje = new mensaje();
        this.desktopPane.add(ventanamensaje);
        ventanamensaje.show(); 
        
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    
    @Override
public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imagenes/icono.png"));


   return retValue;
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuinventario;
    private javax.swing.JMenu menuproductos;
    private javax.swing.JMenu menuproveedores;
    // End of variables declaration//GEN-END:variables

    public void iniciarconexion() {
        
      try {
            if (conexion.getConexion() != null) {
JOptionPane.showMessageDialog(null, "Conectado la base de datos satisfactoriamente.\nBienvenido al sistema de **AGUA CALUMA** ", "Conexion", JOptionPane.INFORMATION_MESSAGE);
                this.menuproductos.setEnabled(true);
                this.menuproveedores.setEnabled(true);
              this.menuinventario.setEnabled(true);
            }
        } catch (Exception e) {
JOptionPane.showMessageDialog(null, "Error en Conexión con la base de datos, se desahabilitaron las opciones del programa", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }

}