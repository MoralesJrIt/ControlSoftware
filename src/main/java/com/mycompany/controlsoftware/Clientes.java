/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.controlsoftware;

import java.awt.Color;
import java.awt.Font;

import javax.swing.UIManager;

import javax.swing.table.JTableHeader;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Productos
     */
    BaseDeDatos bd = new BaseDeDatos();

    public Clientes() {
        super("Usuario: " + new BaseDeDatos().valor("select user from usuario where cod_user=" + ControlSoftware.us) + ", Sucursal: " + new BaseDeDatos().valor("select company from company where id_company=" + ControlSoftware.cia));
        UIManager.put("TableHeaderUI", "javax.swing.plaf.basic.BasicTableHeaderUI");

        initComponents();

        try {
            bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.cia=" + ControlSoftware.cia, Productos);
        } catch (Exception e) {
        }

        theader();
        //jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh72.png")));
        //jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add72.png")));
        //jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit72.png")));
        //jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back72.png")));
        //jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/address.png")));
         Productos.setAutoCreateRowSorter(true);
        buscar.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Productos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buscar = new javax.swing.JTextField();
        dni = new javax.swing.JRadioButton();
        rtn = new javax.swing.JRadioButton();
        activo = new javax.swing.JCheckBox();
        nombre = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setAutoscrolls(true);

        Productos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        Productos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Productos.setSelectionBackground(new java.awt.Color(0, 0, 0));
        Productos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Productos.getTableHeader().setReorderingAllowed(false);
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProductosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Productos);

        jPanel2.setBackground(new java.awt.Color(195, 180, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back24.png"))); // NOI18N
        jButton6.setText("REGRESAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/address24.png"))); // NOI18N
        jButton7.setText("VIÑETA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit24.png"))); // NOI18N
        jButton3.setText("MODIFICAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add24.png"))); // NOI18N
        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh24.png"))); // NOI18N
        jButton1.setText("RECARGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jPanel1.setBackground(new java.awt.Color(195, 180, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "FILTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("BUSCAR");

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 0, 0));
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });

        dni.setBackground(new java.awt.Color(195, 180, 225));
        buttonGroup1.add(dni);
        dni.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));
        dni.setText("POR DNI");

        rtn.setBackground(new java.awt.Color(195, 180, 225));
        buttonGroup1.add(rtn);
        rtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rtn.setForeground(new java.awt.Color(0, 0, 0));
        rtn.setText("POR RTN");

        activo.setBackground(new java.awt.Color(195, 180, 225));
        activo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        activo.setForeground(new java.awt.Color(0, 0, 0));
        activo.setText("SOLO ACTIVOS");

        nombre.setBackground(new java.awt.Color(195, 180, 225));
        buttonGroup1.add(nombre);
        nombre.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setSelected(true);
        nombre.setText("POR NOMBRE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(dni, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(activo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dni)
                            .addComponent(activo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CARTERA DE CLIENTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel3)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(0, 588, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String perm = "15";
        if (!bd.versiesta("select * from role_usuario inner join role on role.id=role_usuario.roleid inner join usuario on usuario.cod_user=role_usuario.usuarioid inner join role_permiso on role_permiso.roleid=role.id inner join permisos on permisos.id=role_permiso.permisoid where permisos.id=" + perm + " and role_usuario.cia=" + ControlSoftware.cia + " and usuario.cod_user=" + ControlSoftware.us)) {
            JOptionPane.showMessageDialog(null, "Usted no tiene acceso a ingresar clientes.");
            return;
        }
        nuevocliente l = new nuevocliente(1);
        Dimension internalFrameSize = l.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        l.setLocation((screenSize.width - internalFrameSize.width) / 2,
                (screenSize.height - internalFrameSize.height) / 2);
        DESKSOFTWARE.escritorio.add(l);
        l.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void theader() {
        JTableHeader header = Productos.getTableHeader();
        header.setOpaque(true);
        header.setBackground(new Color(195, 180, 225));
        Font font = new Font("SansSerif", Font.BOLD, 12);
        header.setFont(font);
        header.setForeground(Color.BLACK);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        if (!buscar.getText().isEmpty()) {

            if (activo.isSelected() && dni.isSelected()) {
                bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.estado=1 and c.identidad like '%" + buscar.getText() + "%' and c.cia=" + ControlSoftware.cia, Productos);
            }
            if (activo.isSelected() && rtn.isSelected()) {
                bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.estado=1 and c.rtn like '%" + buscar.getText() + "%' and c.cia=" + ControlSoftware.cia, Productos);
            }
            if (activo.isSelected() && nombre.isSelected()) {
                bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.estado=1 and c.nombre like '%" + buscar.getText() + "%' and c.cia=" + ControlSoftware.cia, Productos);
            }
            if (!activo.isSelected() && dni.isSelected()) {
                bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.identidad like '%" + buscar.getText() + "%'and c.cia=" + ControlSoftware.cia, Productos);
            }
            if (!activo.isSelected() && rtn.isSelected()) {
                bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.rtn like '%" + buscar.getText() + "%' and c.cia=" + ControlSoftware.cia, Productos);
            }
            if (!activo.isSelected() && nombre.isSelected()) {
                bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.nombre like '%" + buscar.getText() + "%' and c.cia=" + ControlSoftware.cia, Productos);
            }
        } else if (activo.isSelected() && buscar.getText().isEmpty()) {
            bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.estado=1 and c.cia=" + ControlSoftware.cia, Productos);
        } else {
            bd.LlenarTabla("select c.idcliente as COD, c.NOMBRE AS NOMBRE, c.RTN AS RTN, c.IDENTIDAD AS ID, c.DIRECCION AS DIRECCION, d.DEPARTAMENTO AS DEPTO, ci.CIUDAD AS CIUDAD, c.NUMEROTELEFONO AS TEL from clientes c inner join departamento d on c.departamento=d.id_departamento inner join ciudad ci on ci.id_ciudad=c.ciudad where c.cia=" + ControlSoftware.cia, Productos);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String perm = "16";
        if (!bd.versiesta("select * from role_usuario inner join role on role.id=role_usuario.roleid inner join usuario on usuario.cod_user=role_usuario.usuarioid inner join role_permiso on role_permiso.roleid=role.id inner join permisos on permisos.id=role_permiso.permisoid where permisos.id=" + perm + " and role_usuario.cia=" + ControlSoftware.cia + " and usuario.cod_user=" + ControlSoftware.us)) {
            JOptionPane.showMessageDialog(null, "Usted no tiene acceso a modificar clientes.");
            return;
        }
        if (Productos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada!");
            return;
        }

        modificarcliente l = new modificarcliente("" + Productos.getValueAt(Productos.getSelectedRow(), 0));
        Dimension internalFrameSize = l.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        l.setLocation((screenSize.width - internalFrameSize.width) / 2,
                (screenSize.height - internalFrameSize.height) / 2);
        DESKSOFTWARE.escritorio.add(l);
        l.show();
        dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked


    }//GEN-LAST:event_ProductosMouseClicked

    private void ProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMousePressed


    }//GEN-LAST:event_ProductosMousePressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ModuloClientes l = new ModuloClientes();
        Dimension internalFrameSize = l.getSize();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        l.setLocation((screenSize.width - internalFrameSize.width) / 2,
                (screenSize.height - internalFrameSize.height) / 2);
        DESKSOFTWARE.escritorio.add(l);
        l.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_buscarKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String perm = "17";
        if (!bd.versiesta("select * from role_usuario inner join role on role.id=role_usuario.roleid inner join usuario on usuario.cod_user=role_usuario.usuarioid inner join role_permiso on role_permiso.roleid=role.id inner join permisos on permisos.id=role_permiso.permisoid where permisos.id=" + perm + " and role_usuario.cia=" + ControlSoftware.cia + " and usuario.cod_user=" + ControlSoftware.us)) {
            JOptionPane.showMessageDialog(null, "Usted no tiene acceso a generar viñetas.");
            return;
        }
        if (Productos.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada!");
            return;
        }

        String id_cliente = "" + Productos.getValueAt(Productos.getSelectedRow(), 0);

        try {
            BaseDeDatos con = new BaseDeDatos();
            Connection conn = con.getConexion();
            // Cargar el reporte desde el archivo .jasper
            String path = "/vinetareporte.jasper";
            InputStream inputStream = getClass().getResourceAsStream(path);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(inputStream);

            Map<String, Object> parametros = new HashMap<>();
            parametros.put("cliente", id_cliente);
            parametros.put("cia", ControlSoftware.cia);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, conn);

            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Error al generar el reporte: " + ex.getMessage());
        }

    }//GEN-LAST:event_jButton7ActionPerformed
    private static float calculateRequiredHeight(Element element, float availableWidth) throws DocumentException {
        ColumnText ct = new ColumnText(null);
        ct.setSimpleColumn(new Rectangle(availableWidth, 0));
        ct.addElement(element);
        ct.go(true);
        return ct.getYLine();
    }

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
            java.util.logging.Logger.getLogger(Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Productos;
    private javax.swing.JCheckBox activo;
    private javax.swing.JTextField buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton dni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nombre;
    private javax.swing.JRadioButton rtn;
    // End of variables declaration//GEN-END:variables
}