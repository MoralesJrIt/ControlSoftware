/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.controlsoftware;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Vendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vendedor
     */
    BaseDeDatos bd=new BaseDeDatos();
    int y;
    public Vendedor() {
         super("Usuario: "+new BaseDeDatos().valor("select user from usuario where cod_user=" +ControlSoftware.us)+", Sucursal: "+new BaseDeDatos().valor("select company from company where id_company=" +ControlSoftware.cia));
       
        initComponents();
         
        sueldo.setText("0.0");
        deducciones.setText("0.0");
        sueldoneto.setText("0.0");
       
//         jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png")));
//        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png")));
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
        jLabel4 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        direccion = new javax.swing.JTextArea();
        nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sueldoneto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deducciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sueldo");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha ingreso");

        direccion.setColumns(20);
        direccion.setRows(5);
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(direccion);

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dirección");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono");

        sueldoneto.setEditable(false);
        sueldoneto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sueldonetoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sueldonetoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldonetoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sueldo neto");

        deducciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deduccionesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deduccionesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deduccionesKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Deducciones");

        sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sueldoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sueldoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("INGRESO DE VENDEDOR");

        jPanel3.setBackground(new java.awt.Color(195, 180, 225));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back24.png"))); // NOI18N
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save24.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(sueldoneto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(88, 88, 88)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(telefono)
                                .addComponent(deducciones, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sueldoneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTROLSOFTWARE - COPYRIGHT 2023 - ING. JUNIOR MORALES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 116, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        bd.EjecutarConsultas("INSERT INTO `vendedor`(`vendedor`, `tipo_comision`, `fecha_ingreso`, `sueldo`, `deducciones`, `sueldo_neto`, `estado`, `direccion`, `telefono`, `cia`) VALUES ('"+nombre.getText()+"','1','"+Date_Format.format(fecha.getDate())+"','"+sueldo.getText()+"','"+deducciones.getText()+"','"+sueldoneto.getText()+"','1','"+direccion.getText()+"','"+telefono.getText()+"','"+ControlSoftware.cia+"')");
        JOptionPane.showMessageDialog(null,"Vendedor ingresado con éxito");
         
            Controlvendedores l = new Controlvendedores();
            Dimension internalFrameSize = l.getSize();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            l.setLocation((screenSize.width - internalFrameSize.width) / 2,
                    (screenSize.height - internalFrameSize.height) / 2);
            DESKSOFTWARE.escritorio.add(l);
            l.show();
            dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();
        if (!(key == '0' || key == '1' || key == '2' || key == '3' || key == '4' || key == '5' || key == '6' || key == '7' || key == '8' || key == '9' || key == '.')) {
            evt.consume();
        }
         if (sueldo.getText().length() > 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_sueldoKeyTyped

    private void sueldoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 8) {
            if (sueldo.getText().isEmpty()) {
                sueldo.setText("0.0");
            }
        }
        double i=0;
        i=Double.parseDouble(sueldo.getText());
        double j=0;
        j=Double.parseDouble(deducciones.getText());
        double k=i-j;
        
        sueldoneto.setText(""+k);
    }//GEN-LAST:event_sueldoKeyReleased

    private void deduccionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deduccionesKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();
        if (!(key == '0' || key == '1' || key == '2' || key == '3' || key == '4' || key == '5' || key == '6' || key == '7' || key == '8' || key == '9' || key == '.')) {
            evt.consume();
        }
          if (deducciones.getText().length() > 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_deduccionesKeyTyped

    private void deduccionesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deduccionesKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == 8) {
            if (deducciones.getText().isEmpty()) {
                deducciones.setText("0.0");
            }
        }
         double i=0;
        i=Double.parseDouble(sueldo.getText());
        double j=0;
        j=Double.parseDouble(deducciones.getText());
        double k=i-j;
        
        sueldoneto.setText(""+k);
    }//GEN-LAST:event_deduccionesKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
           Controlvendedores l = new Controlvendedores();
            Dimension internalFrameSize = l.getSize();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            l.setLocation((screenSize.width - internalFrameSize.width) / 2,
                    (screenSize.height - internalFrameSize.height) / 2);
            DESKSOFTWARE.escritorio.add(l);
            l.show();
            dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == evt.VK_V)) {
            // Evitar la acción de pegar
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyPressed

    private void sueldoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == evt.VK_V)) {
            // Evitar la acción de pegar
            evt.consume();
        }
    }//GEN-LAST:event_sueldoKeyPressed

    private void sueldonetoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldonetoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldonetoKeyReleased

    private void sueldonetoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldonetoKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == evt.VK_V)) {
            // Evitar la acción de pegar
            evt.consume();
        }
    }//GEN-LAST:event_sueldonetoKeyPressed

    private void deduccionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deduccionesKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == evt.VK_V)) {
            // Evitar la acción de pegar
            evt.consume();
        }
    }//GEN-LAST:event_deduccionesKeyPressed

    private void telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == evt.VK_V)) {
            // Evitar la acción de pegar
            evt.consume();
        }
    }//GEN-LAST:event_telefonoKeyPressed

    private void direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == evt.VK_V)) {
            // Evitar la acción de pegar
            evt.consume();
        }
    }//GEN-LAST:event_direccionKeyPressed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
         if (nombre.getText().length() > 254) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void sueldonetoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldonetoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        if (!(key == '0' || key == '1' || key == '2' || key == '3' || key == '4' || key == '5' || key == '6' || key == '7' || key == '8' || key == '9' || key == '.')) {
            evt.consume();
        }
         if (sueldoneto.getText().length() > 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_sueldonetoKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        // TODO add your handling code here:
          if (telefono.getText().length() > 254) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        // TODO add your handling code here:
          if (direccion.getText().length() > 254) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_direccionKeyTyped

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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deducciones;
    private javax.swing.JTextArea direccion;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField sueldoneto;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}