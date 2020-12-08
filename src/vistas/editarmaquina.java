
package vistas;



import modelo.maquina;
import controlador.conexion;

import controlador.maquinasql;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class editarmaquina extends javax.swing.JInternalFrame {
    
    conexion conexion = new conexion();

    
    maquinasql maquinasql = new maquinasql();
    maquina maquina = new maquina();

    
    DefaultTableModel tabla = new DefaultTableModel();
    
    

    public editarmaquina() {
        initComponents();
        conexion = new conexion();
        limpiarcampos();
       deshabilitar();
    }
    
 public void mostrartabla() {

          try {
            if (conexion.getConexion() != null) {
                tabla.setColumnCount(0);
                tabla.setRowCount(0);
                this.tablamaquina.setModel(tabla);
 
   
                
                tabla.addColumn("ID_MAQUINARIA");
                tabla.addColumn("CODIGO_MAQUINARIA");
                tabla.addColumn("NOMBRE_MAQUINARIA");
                tabla.addColumn("CAPACIDAD_MAQUINARIA");
                tabla.addColumn("PESO_MAQUINARIA");
                tabla.addColumn("ENERGIA_MAQUINARIA");
                tabla.addColumn("DESCRIPCION_MAQUINARIA");
        
                
                Object[] datos = new Object[7];
                
                List<maquina> lis = maquinasql.MostrarTodos();
                        
                for (maquina  li : lis) {
                    datos[0] = li.getID_MAQUINARIA();
                    datos[1] = li.getCODIGO_MAQUINARIA();
                    datos[2] = li.getNOMBRE_MAQUINARIA();
                    datos[3] = li.getCAPACIDAD_MAQUINARIA();
                    datos[4] = li.getPESO_MAQUINARIA();
                    datos[5] = li.getENERGIA_MAQUINARIA();
                    datos[6] = li.getDESCRIPCION_MAQUINARIA();
                    tabla.addRow(datos);
                }
                
            } else {
 JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
 System.out.println(e);
        }    
        
          
    }


public void limpiarcampos() {
    
  
        this.TXTCODIGO_MAQUINARIA.setText("");
        this.TXTNOMBRE_MAQUINARIA.setText("");
        this.TXTCAPACIDAD_MAQUINARIA.setText("");
        this.TXTPESO_MAQUINARIA.setText("");
        this.TXTENERGIA_MAQUINARIA.setText("");
        this.TXTDESCRIPCION_MAQUINARIA.setText("");
     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btactualizar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btcerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TXTDESCRIPCION_MAQUINARIA = new javax.swing.JTextField();
        TXTENERGIA_MAQUINARIA = new javax.swing.JTextField();
        TXTPESO_MAQUINARIA = new javax.swing.JTextField();
        TXTCAPACIDAD_MAQUINARIA = new javax.swing.JTextField();
        TXTNOMBRE_MAQUINARIA = new javax.swing.JTextField();
        TXTCODIGO_MAQUINARIA = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btmostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamaquina = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);
        setTitle("CONTROL DE MAQUINAS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/page-refresh-icon.png"))); // NOI18N
        btactualizar.setText("actualizar");
        btactualizar.setEnabled(false);
        btactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 334, 100, 40));

        bteliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/File-Delete-icon.png"))); // NOI18N
        bteliminar.setText("eliminar");
        bteliminar.setEnabled(false);
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });
        jPanel1.add(bteliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 334, 102, 40));

        btcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actions-project-development-close-icon.png"))); // NOI18N
        btcerrar.setText("cerrar");
        btcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 334, 90, 40));

        jPanel2.setBackground(java.awt.Color.blue);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EDITAR MAQUINA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 31, -1, -1));

        jLabel2.setText("CODIGO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 103, 174, -1));

        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 135, 137, -1));

        jLabel4.setText("CAPACIDAD (HPB):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 160, 116, 24));

        jLabel6.setText("PESO (KG):");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 187, -1, 28));

        jLabel5.setText("CONSUMO DE ENERGIA (KW):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 221, 188, 20));

        jLabel7.setText("DESCRIPCION:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 252, 142, 20));

        TXTDESCRIPCION_MAQUINARIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDESCRIPCION_MAQUINARIAActionPerformed(evt);
            }
        });
        TXTDESCRIPCION_MAQUINARIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTDESCRIPCION_MAQUINARIAKeyTyped(evt);
            }
        });
        jPanel1.add(TXTDESCRIPCION_MAQUINARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 252, 153, -1));

        TXTENERGIA_MAQUINARIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTENERGIA_MAQUINARIAActionPerformed(evt);
            }
        });
        TXTENERGIA_MAQUINARIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTENERGIA_MAQUINARIAKeyTyped(evt);
            }
        });
        jPanel1.add(TXTENERGIA_MAQUINARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 221, 153, -1));

        TXTPESO_MAQUINARIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPESO_MAQUINARIAActionPerformed(evt);
            }
        });
        TXTPESO_MAQUINARIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPESO_MAQUINARIAKeyTyped(evt);
            }
        });
        jPanel1.add(TXTPESO_MAQUINARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 190, 153, -1));

        TXTCAPACIDAD_MAQUINARIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCAPACIDAD_MAQUINARIAActionPerformed(evt);
            }
        });
        TXTCAPACIDAD_MAQUINARIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCAPACIDAD_MAQUINARIAKeyTyped(evt);
            }
        });
        jPanel1.add(TXTCAPACIDAD_MAQUINARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 159, 153, -1));

        TXTNOMBRE_MAQUINARIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNOMBRE_MAQUINARIAActionPerformed(evt);
            }
        });
        TXTNOMBRE_MAQUINARIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNOMBRE_MAQUINARIAKeyTyped(evt);
            }
        });
        jPanel1.add(TXTNOMBRE_MAQUINARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 131, 153, -1));

        TXTCODIGO_MAQUINARIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCODIGO_MAQUINARIAActionPerformed(evt);
            }
        });
        TXTCODIGO_MAQUINARIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTCODIGO_MAQUINARIAKeyTyped(evt);
            }
        });
        jPanel1.add(TXTCODIGO_MAQUINARIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 100, 153, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btmostrar.setText("Mostrar o actualizar tabla");
        btmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmostrarActionPerformed(evt);
            }
        });
        jPanel5.add(btmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 31));

        jScrollPane1.setAutoscrolls(true);

        tablamaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablamaquina.setAutoscrolls(false);
        tablamaquina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablamaquinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablamaquina);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 650, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmostrarActionPerformed

        mostrartabla();

        }

        private void jTableEntrenadorMouseClicked(java.awt.event.MouseEvent evt) {
    }//GEN-LAST:event_btmostrarActionPerformed

        
            public void deshabilitar() {
        this.TXTCODIGO_MAQUINARIA.setEnabled(false);        
        this.TXTNOMBRE_MAQUINARIA.setEnabled(false);
        this.TXTCAPACIDAD_MAQUINARIA.setEnabled(false);
        this.TXTPESO_MAQUINARIA.setEnabled(false);
        this.TXTENERGIA_MAQUINARIA.setEnabled(false);
        this.TXTDESCRIPCION_MAQUINARIA.setEnabled(false);
      
        this.btactualizar.setEnabled(false);
  this.bteliminar.setEnabled(false);
    
        
    }
        public void habilitar() {
    this.TXTCODIGO_MAQUINARIA.setEnabled(true);   
     this.TXTNOMBRE_MAQUINARIA.setEnabled(true);
        this.TXTCAPACIDAD_MAQUINARIA.setEnabled(true);
        this.TXTPESO_MAQUINARIA.setEnabled(true);
        this.TXTENERGIA_MAQUINARIA.setEnabled(true);
        this.TXTDESCRIPCION_MAQUINARIA.setEnabled(true);

        this.btactualizar.setEnabled(true);
        this.bteliminar.setEnabled(true);

    }
        
        
    private void tablamaquinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamaquinaMouseClicked

        int fila = this.tablamaquina.getSelectedRow();

        

        int idobjtabla = (int) this.tablamaquina.getValueAt(fila, 0);
       
        try {
            if (conexion.getConexion() != null) {
                habilitar();
              

                maquina = maquinasql.obtenermaquina(idobjtabla);

               

                this.TXTCODIGO_MAQUINARIA.setText(maquina.getCODIGO_MAQUINARIA());
                this.TXTNOMBRE_MAQUINARIA.setText(maquina.getNOMBRE_MAQUINARIA());
                this.TXTCAPACIDAD_MAQUINARIA.setText(maquina.getCAPACIDAD_MAQUINARIA());
                this.TXTPESO_MAQUINARIA.setText(String.valueOf(maquina.getPESO_MAQUINARIA())); 
                this.TXTENERGIA_MAQUINARIA.setText(maquina.getENERGIA_MAQUINARIA());
                this.TXTDESCRIPCION_MAQUINARIA.setText(maquina.getDESCRIPCION_MAQUINARIA());
          

            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión. Revisa tu conexion", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
        System.out.println(ex);
        }
    }//GEN-LAST:event_tablamaquinaMouseClicked

    private void TXTCODIGO_MAQUINARIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCODIGO_MAQUINARIAKeyTyped

         if (this.TXTCODIGO_MAQUINARIA.getText().length() >= 6) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Limite maximo de 6 caracteres", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
  
        
        
    }//GEN-LAST:event_TXTCODIGO_MAQUINARIAKeyTyped

    private void TXTCODIGO_MAQUINARIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCODIGO_MAQUINARIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCODIGO_MAQUINARIAActionPerformed

    private void TXTNOMBRE_MAQUINARIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNOMBRE_MAQUINARIAKeyTyped

              char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !(c == KeyEvent.VK_SPACE) && !(c == KeyEvent.VK_BACK_SPACE)) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        if (this.TXTNOMBRE_MAQUINARIA.getText().length() >= 20) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Limite maximo de 20 caracteres", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_TXTNOMBRE_MAQUINARIAKeyTyped

    private void TXTNOMBRE_MAQUINARIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNOMBRE_MAQUINARIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNOMBRE_MAQUINARIAActionPerformed

    private void TXTCAPACIDAD_MAQUINARIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCAPACIDAD_MAQUINARIAKeyTyped
      if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.' ){
            evt.consume();
  }        if(evt.getKeyChar()=='.'&&TXTCAPACIDAD_MAQUINARIA.getText().contains(".")){
          evt.consume();
 }if (this.TXTCAPACIDAD_MAQUINARIA.getText().length() >= 6) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Limite maximo de 6 caracteres", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
  
    }//GEN-LAST:event_TXTCAPACIDAD_MAQUINARIAKeyTyped

    private void TXTCAPACIDAD_MAQUINARIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCAPACIDAD_MAQUINARIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCAPACIDAD_MAQUINARIAActionPerformed

    private void TXTPESO_MAQUINARIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPESO_MAQUINARIAKeyTyped

              
         if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.' ){
            evt.consume();
  }        if(evt.getKeyChar()=='.'&&TXTPESO_MAQUINARIA.getText().contains(".")){
          evt.consume();
 }if (this.TXTPESO_MAQUINARIA.getText().length() >= 6) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Limite maximo de 6 caracteres", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
  
        
    }//GEN-LAST:event_TXTPESO_MAQUINARIAKeyTyped

    private void TXTPESO_MAQUINARIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPESO_MAQUINARIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPESO_MAQUINARIAActionPerformed

    private void TXTENERGIA_MAQUINARIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTENERGIA_MAQUINARIAKeyTyped

           
        if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.' ){
            evt.consume();
  }        if(evt.getKeyChar()=='.'&&TXTENERGIA_MAQUINARIA.getText().contains(".")){
          evt.consume();
 }if (this.TXTENERGIA_MAQUINARIA.getText().length() >= 6) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Limite maximo de 6 caracteres", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
  
        
    }//GEN-LAST:event_TXTENERGIA_MAQUINARIAKeyTyped

    private void TXTENERGIA_MAQUINARIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTENERGIA_MAQUINARIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTENERGIA_MAQUINARIAActionPerformed

    private void TXTDESCRIPCION_MAQUINARIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTDESCRIPCION_MAQUINARIAKeyTyped

        
        if (this.TXTDESCRIPCION_MAQUINARIA.getText().length() >= 25) {
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Limite maximo de 25 caracteres", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_TXTDESCRIPCION_MAQUINARIAKeyTyped

    private void TXTDESCRIPCION_MAQUINARIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDESCRIPCION_MAQUINARIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDESCRIPCION_MAQUINARIAActionPerformed

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

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed

        try {
            int op = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                maquinasql.eliminarmaquina(maquina.getID_MAQUINARIA());

                deshabilitar();
                limpiarcampos();
                mostrartabla();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Datos no encontrados", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarActionPerformed

        try {
            if (conexion.getConexion() != null) {
                if ((this.TXTCODIGO_MAQUINARIA.getText().isEmpty())
                    || (this.TXTNOMBRE_MAQUINARIA.getText().isEmpty())
                    || (this.TXTCAPACIDAD_MAQUINARIA.getText().isEmpty())
                    || (this.TXTPESO_MAQUINARIA.getText().isEmpty())
                    || (this.TXTENERGIA_MAQUINARIA.getText().isEmpty())
                    || (this.TXTDESCRIPCION_MAQUINARIA.getText().isEmpty())) {
                    //incorrecto
                    JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos o llene los campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    maquina.setCODIGO_MAQUINARIA(TXTCODIGO_MAQUINARIA.getText());
                    maquina.setNOMBRE_MAQUINARIA(TXTNOMBRE_MAQUINARIA.getText());
                    maquina.setCAPACIDAD_MAQUINARIA(TXTCAPACIDAD_MAQUINARIA.getText());
                    maquina.setPESO_MAQUINARIA(TXTPESO_MAQUINARIA.getText());
                    maquina.setENERGIA_MAQUINARIA(TXTENERGIA_MAQUINARIA.getText());
                    maquina.setDESCRIPCION_MAQUINARIA(TXTDESCRIPCION_MAQUINARIA.getText());

                    maquinasql.actualizarmaquina(maquina);

                    deshabilitar();
                    limpiarcampos();
                    mostrartabla();

                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en Conexión PostgreSQL 9.0 ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en los datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());

        }
    }//GEN-LAST:event_btactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTCAPACIDAD_MAQUINARIA;
    private javax.swing.JTextField TXTCODIGO_MAQUINARIA;
    private javax.swing.JTextField TXTDESCRIPCION_MAQUINARIA;
    private javax.swing.JTextField TXTENERGIA_MAQUINARIA;
    private javax.swing.JTextField TXTNOMBRE_MAQUINARIA;
    private javax.swing.JTextField TXTPESO_MAQUINARIA;
    private javax.swing.JButton btactualizar;
    private javax.swing.JButton btcerrar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btmostrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablamaquina;
    // End of variables declaration//GEN-END:variables
}
