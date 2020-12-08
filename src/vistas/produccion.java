
package vistas;





import controlador.conexion;
import controlador.maquinasql;
import controlador.produccionsql;
import controlador.productosql;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
import modelo.maquina;
import modelo.producto;


public class produccion extends javax.swing.JInternalFrame {

  
    conexion conexion = new conexion();
 
    
    productosql productosql = new productosql();
    maquinasql maquinasql = new maquinasql();
    produccionsql produccionsql = new produccionsql();
    
    producto producto = new producto();
    maquina maquina = new maquina();
    
     List<producto> listaproducto = new ArrayList<producto>();
     List<maquina> listamaquina = new ArrayList<maquina>();
     
    public produccion() {
        initComponents();
        conexion = new conexion();
        aliniciar();
    }

     public void aliniciar() {
         
Date date = new Date();
DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
String fechasistema = (""+dateFormat.format(date));
String horasistema = (""+hourFormat.format(date));
   
        this.TXTFECHA_PRODUCCION.setText(fechasistema);
        this.TXTHORA_PRODUCCION.setText(horasistema);
         
//llenar  comobox de la tabla maquina
        DefaultComboBoxModel modelomaquina = new DefaultComboBoxModel();
         listamaquina = maquinasql.MostrarTodos();
         for (int i = 0; i < listamaquina.size(); i++) {
             modelomaquina.addElement(listamaquina.get(i).toString());
         }
        COMBOIDMAQUINA.setModel(modelomaquina);
        
//llenar  comobox de la tabla productos
        DefaultComboBoxModel modeloproducto = new DefaultComboBoxModel();
         listaproducto = productosql.MostrarTodos();
         for (int i = 0; i < listaproducto.size(); i++) {
             modeloproducto.addElement(listaproducto.get(i).toString());
         }
        COMBOIDPRODUCTO.setModel(modeloproducto);
       
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        COMBOIDMAQUINA = new javax.swing.JComboBox<>();
        COMBOIDPRODUCTO = new javax.swing.JComboBox<>();
        TXTFECHA_PRODUCCION = new javax.swing.JTextField();
        TXTCANTIDAD_PRODUCCION = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTORDEN_PRODUCCION = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btcerrar = new javax.swing.JButton();
        btproducir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TXTHORA_PRODUCCION = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);
        setTitle("PRODUCCION");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        COMBOIDMAQUINA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "que" }));
        COMBOIDMAQUINA.setSelectedIndex(-1);
        COMBOIDMAQUINA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                COMBOIDMAQUINAItemStateChanged(evt);
            }
        });
        COMBOIDMAQUINA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOIDMAQUINAActionPerformed(evt);
            }
        });
        COMBOIDMAQUINA.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                COMBOIDMAQUINAPropertyChange(evt);
            }
        });
        jPanel1.add(COMBOIDMAQUINA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 280, -1));

        COMBOIDPRODUCTO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        COMBOIDPRODUCTO.setSelectedIndex(-1);
        COMBOIDPRODUCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOIDPRODUCTOActionPerformed(evt);
            }
        });
        jPanel1.add(COMBOIDPRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 280, -1));

        TXTFECHA_PRODUCCION.setText("00/00//0000");
        TXTFECHA_PRODUCCION.setEnabled(false);
        TXTFECHA_PRODUCCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFECHA_PRODUCCIONActionPerformed(evt);
            }
        });
        jPanel1.add(TXTFECHA_PRODUCCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 80, -1));

        TXTCANTIDAD_PRODUCCION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCANTIDAD_PRODUCCIONKeyTyped(evt);
            }
        });
        jPanel1.add(TXTCANTIDAD_PRODUCCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 280, 30));

        jLabel1.setText("NUMERO DE ORDEN :#");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setText("MAQUINA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel3.setText("PRODUCTO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel4.setText("FECHA:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel5.setText("CANTIDAD:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        TXTORDEN_PRODUCCION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTORDEN_PRODUCCIONKeyTyped(evt);
            }
        });
        jPanel1.add(TXTORDEN_PRODUCCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 280, -1));

        jPanel2.setBackground(java.awt.Color.blue);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRODUCCION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, -1));

        btcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actions-project-development-close-icon.png"))); // NOI18N
        btcerrar.setText("cerrar");
        btcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 100, 50));

        btproducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_technology-machine-electronic-device-20_4026440.png"))); // NOI18N
        btproducir.setText("producir");
        btproducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btproducirActionPerformed(evt);
            }
        });
        jPanel1.add(btproducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 130, 50));

        jLabel6.setText("HORA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        TXTHORA_PRODUCCION.setText("00:00:00");
        TXTHORA_PRODUCCION.setEnabled(false);
        TXTHORA_PRODUCCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTHORA_PRODUCCIONActionPerformed(evt);
            }
        });
        jPanel1.add(TXTHORA_PRODUCCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 100, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Limpiar() {
        this.TXTORDEN_PRODUCCION.setText("");
        this.TXTCANTIDAD_PRODUCCION.setText("");

    }
    
    
    
    private void btproducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btproducirActionPerformed
       
        
        try {
      
            if (conexion.getConexion() != null) {

                String VTXTORDEN_PRODUCCION = this.TXTORDEN_PRODUCCION.getText();    
                int VIDMAQUINA_PRODUCCION = listamaquina.get(COMBOIDMAQUINA.getSelectedIndex()).getID_MAQUINARIA();
                String VTXTFECHA_PRODUCCION = this.TXTFECHA_PRODUCCION.getText();
                String VTXTHORA_PRODUCCION = this.TXTHORA_PRODUCCION.getText();
                int VIDPRODUCTO_PRODUCCION = listaproducto.get(COMBOIDPRODUCTO.getSelectedIndex()).getID_PRODUCTO();
                int VTXTCANTIDAD_PRODUCCION = Integer.parseInt(this.TXTCANTIDAD_PRODUCCION.getText());
                
                if ((COMBOIDMAQUINA.getSelectedItem().toString().isEmpty())
                        || (COMBOIDPRODUCTO.getSelectedItem().toString().isEmpty())
                        || (TXTORDEN_PRODUCCION.getText().isEmpty())
                        || (TXTFECHA_PRODUCCION.getText().isEmpty())
                        || (TXTHORA_PRODUCCION.getText().isEmpty())
                        || (TXTCANTIDAD_PRODUCCION.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Ingrese opcion correcta", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                
                    produccionsql.insertarproduccion(VTXTORDEN_PRODUCCION, VIDMAQUINA_PRODUCCION, VTXTFECHA_PRODUCCION, VTXTHORA_PRODUCCION, VIDPRODUCTO_PRODUCCION, VTXTCANTIDAD_PRODUCCION);
                    
                    Limpiar();
                }
            } else {
                 JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(null, "No existen datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
      
        
        
        
    }//GEN-LAST:event_btproducirActionPerformed

    private void btcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcerrarActionPerformed

        try {
            if (conexion.getConexion() != null) {
                dispose();
                conexion.CloseConexion();
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btcerrarActionPerformed

    private void TXTORDEN_PRODUCCIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTORDEN_PRODUCCIONKeyTyped

        char c = evt.getKeyChar();
        if (this.TXTORDEN_PRODUCCION.getText().length() <= 9) {
            if ((c < '0' || c > '9') && !(c == KeyEvent.VK_BACK_SPACE)) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }
        } else {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limite maximo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_TXTORDEN_PRODUCCIONKeyTyped

    private void TXTCANTIDAD_PRODUCCIONKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCANTIDAD_PRODUCCIONKeyTyped

        char c = evt.getKeyChar();
        if (this.TXTCANTIDAD_PRODUCCION.getText().length() <= 3) {
            if ((c < '0' || c > '9') && !(c == KeyEvent.VK_BACK_SPACE)) {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            } else {

            }
        } else {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Limite maximo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCANTIDAD_PRODUCCIONKeyTyped

    private void TXTFECHA_PRODUCCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFECHA_PRODUCCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFECHA_PRODUCCIONActionPerformed

    private void COMBOIDPRODUCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOIDPRODUCTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOIDPRODUCTOActionPerformed

    private void COMBOIDMAQUINAPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_COMBOIDMAQUINAPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOIDMAQUINAPropertyChange

    private void COMBOIDMAQUINAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOIDMAQUINAActionPerformed

    }//GEN-LAST:event_COMBOIDMAQUINAActionPerformed

    private void COMBOIDMAQUINAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOIDMAQUINAItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOIDMAQUINAItemStateChanged

    private void TXTHORA_PRODUCCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTHORA_PRODUCCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTHORA_PRODUCCIONActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOIDMAQUINA;
    private javax.swing.JComboBox<String> COMBOIDPRODUCTO;
    private javax.swing.JTextField TXTCANTIDAD_PRODUCCION;
    private javax.swing.JTextField TXTFECHA_PRODUCCION;
    private javax.swing.JTextField TXTHORA_PRODUCCION;
    private javax.swing.JTextField TXTORDEN_PRODUCCION;
    private javax.swing.JButton btcerrar;
    private javax.swing.JButton btproducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
