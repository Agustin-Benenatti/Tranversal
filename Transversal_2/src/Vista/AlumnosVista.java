/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.Alumno;
import Persistencia.alumnoData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import java.time.ZoneId;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class AlumnosVista extends javax.swing.JInternalFrame {
    private alumnoData ad;
    private DefaultTableModel tabla;
    
    
    
    /**
     * Creates new form Alumnos
     */
    public AlumnosVista()
    {
       
        initComponents();
        ad = new alumnoData();
        tabla = new DefaultTableModel();
        tablaDeAlumnos();
        llenarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jrestado = new javax.swing.JRadioButton();
        jBnew = new javax.swing.JButton();
        jBdelete = new javax.swing.JButton();
        jBsave = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        JBuscar = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(95, 165, 25));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario Alumnos");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de Nacimiento:");

        jBnew.setForeground(new java.awt.Color(0, 0, 0));
        jBnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new archive.png"))); // NOI18N
        jBnew.setText("Nuevo");
        jBnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnewActionPerformed(evt);
            }
        });

        jBdelete.setForeground(new java.awt.Color(0, 0, 0));
        jBdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-64.png"))); // NOI18N
        jBdelete.setText("Eliminar");
        jBdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeleteActionPerformed(evt);
            }
        });

        jBsave.setForeground(new java.awt.Color(0, 0, 0));
        jBsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check icon.png"))); // NOI18N
        jBsave.setText("Guardar");
        jBsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsaveActionPerformed(evt);
            }
        });

        jBexit.setForeground(new java.awt.Color(0, 0, 0));
        jBexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit icon.png"))); // NOI18N
        jBexit.setText("Salir");
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });

        JBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JBuscar.setForeground(new java.awt.Color(0, 0, 0));
        JBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon search.png"))); // NOI18N
        JBuscar.setText("Buscar");
        JBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(406, 406, 406))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jBnew, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jBdelete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTdni, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jrestado)
                                            .addComponent(jTapellido, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(63, 63, 63)
                                        .addComponent(JBuscar)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBsave)
                                .addGap(163, 163, 163)
                                .addComponent(jBexit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBuscar))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jrestado)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBnew)
                            .addComponent(jBdelete)
                            .addComponent(jBsave)
                            .addComponent(jBexit))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarActionPerformed

        try {
            int D = Integer.parseInt(jTdni.getText());
            Alumno a = ad.buscarDni(D);
            if(a != null){
                String Nombre = a.getNombre();
                String Apellido = a.getApellido();
                jTnombre.setText(Nombre);
                jTapellido.setText(Apellido);
                jrestado.setSelected(a.isEstado());
                jdcFecha.setDate(Date.valueOf(a.getFecha_nacimiento()));

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error no se puede ingresar caracteres");
        }

    }//GEN-LAST:event_JBuscarActionPerformed

    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        this.setVisible(false);
        System.exit(0);
        JOptionPane.showMessageDialog(this, "Se cerro la sesion!");
    }//GEN-LAST:event_jBexitActionPerformed

    private void jBsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaveActionPerformed

        Alumno alumno = new Alumno();

        try {

            int dni = Integer.parseInt(jTdni.getText());
            String apellido = jTapellido.getText();
            String nombre = jTnombre.getText();

            if(apellido.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]+$") && nombre.matches("^[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]+$")){
                LocalDate fecha = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                boolean estado = jrestado.isSelected();

                alumno.setDni(dni);
                alumno.setApellido(apellido);
                alumno.setNombre(nombre);
                alumno.setFecha_nacimiento(fecha);
                alumno.setEstado(estado);

                Alumno a = ad.buscarDni(dni);

                if(a != null){
                    ad.actualizarAlumno(alumno);
                    JOptionPane.showMessageDialog(null, "Alumno modificado "+a.getApellido()+" "+a.getNombre());
                }else{
                    ad.guardar(alumno);
                    JOptionPane.showMessageDialog(null, "Se ha agregado al alumno:  "+a.getApellido()+" "+a.getNombre());
                }

            }

        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_jBsaveActionPerformed

    private void jBdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeleteActionPerformed
        try {
            int D = Integer.parseInt(jTdni.getText());
            Alumno a = ad.buscarDni(D);
            if (a != null ){
                jTdni.setText(String.valueOf(a.getDni()));
                jTapellido.setText(a.getApellido());
                jTnombre.setText(a.getNombre());
                jrestado.setSelected(a.isEstado());
                jdcFecha.setDate(Date.valueOf(a.getFecha_nacimiento()));
                ad.bajaLogica(D);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }

    }//GEN-LAST:event_jBdeleteActionPerformed

    private void jBnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnewActionPerformed
        jTdni.setText("");
        jTnombre.setText("");
        jTapellido.setText("");
        JOptionPane.showMessageDialog(this, "Se limpiaron los campos");
    }//GEN-LAST:event_jBnewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBuscar;
    private javax.swing.JButton jBdelete;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBnew;
    private javax.swing.JButton jBsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTnombre;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrestado;
    // End of variables declaration//GEN-END:variables

    public void tablaDeAlumnos(){
     tabla.addColumn("id");
     tabla.addColumn("nombre");
     tabla.addColumn("apellido");
     tabla.addColumn("Fecha Nac");
     tabla.addColumn("estado");
     
     jTable.setModel(tabla);
     
    }
    
    public void llenarTabla(){
        List<Alumno> a = ad.listaDeAlumnos();
        for (Alumno alumno : a) {
            tabla.addRow(new Object[]{
            alumno.getId_alumno(),
                alumno.getNombre(),
                alumno.getApellido(),
                alumno.getFecha_nacimiento(),
                alumno.isEstado()
            });
            
        }
    
    }

}
