/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.Materia;
import Persistencia.materiaData;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class MateriaVista extends javax.swing.JInternalFrame {
    private materiaData md;
    /**
     * Creates new form MateriaVista
     */
    public MateriaVista() {
        initComponents();
        md = new materiaData();
        
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
        jTid = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTcuatrimestre = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
        jBnew = new javax.swing.JButton();
        jBdelete = new javax.swing.JButton();
        jBsave = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        JBbuscar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(95, 165, 25));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materias");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cuatrimestre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");

        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

        jBnew.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBnew.setForeground(new java.awt.Color(0, 0, 0));
        jBnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new archive.png"))); // NOI18N
        jBnew.setText("Nuevo");
        jBnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnewActionPerformed(evt);
            }
        });

        jBdelete.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBdelete.setForeground(new java.awt.Color(0, 0, 0));
        jBdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-64.png"))); // NOI18N
        jBdelete.setText("Eliminar");
        jBdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdeleteActionPerformed(evt);
            }
        });

        jBsave.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBsave.setForeground(new java.awt.Color(0, 0, 0));
        jBsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check icon.png"))); // NOI18N
        jBsave.setText("Guardar");
        jBsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsaveActionPerformed(evt);
            }
        });

        jBexit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBexit.setForeground(new java.awt.Color(0, 0, 0));
        jBexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit icon.png"))); // NOI18N
        jBexit.setText("Salir");
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });

        JBbuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JBbuscar.setForeground(new java.awt.Color(0, 0, 0));
        JBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon search.png"))); // NOI18N
        JBbuscar.setText("Buscar");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jBnew, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jBdelete)
                        .addGap(43, 43, 43)
                        .addComponent(jBsave)
                        .addGap(57, 57, 57)
                        .addComponent(jBexit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(43, 43, 43)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jTid))
                            .addGap(88, 88, 88)
                            .addComponent(JBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRestado)
                                        .addComponent(jTcuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBbuscar))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTcuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5))
                    .addComponent(jRestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnew)
                    .addComponent(jBdelete)
                    .addComponent(jBsave)
                    .addComponent(jBexit))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRestadoActionPerformed

    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jBexitActionPerformed

    private void jBnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnewActionPerformed
        jTnombre.setText("");
        jTid.setText("");
        jTcuatrimestre.setText("");
        
    }//GEN-LAST:event_jBnewActionPerformed

    private void jBsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaveActionPerformed
        Materia m = new Materia();
        
        try {
            int i = Integer.parseInt(jTid.getText());
            String nombre = jTnombre.getText();
            String cuatrimestre = jTcuatrimestre.getText();
            
            if(nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$") && cuatrimestre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")){
                boolean e = jRestado.isSelected();
                m.setId_materia(i);
                m.setNombre_materia(nombre);
                m.setCuatrimestre(cuatrimestre);
                m.setEstado(e);
                md.guardarMateria(m);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese solo caracteres!");
            }
        } catch (NumberFormatException e) {
        }
        
        
    }//GEN-LAST:event_jBsaveActionPerformed

    private void jBdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeleteActionPerformed
        
        try {
            int i = Integer.parseInt(jTid.getText());
            Materia m = md.buscarMateria(i);
            
            if(m != null){
                jTid.setText(String.valueOf(m.getId_materia()));
                jTnombre.setText(m.getNombre_materia());
                jTcuatrimestre.setText(m.getCuatrimestre());
                jRestado.setSelected(m.isEstado());
                md.bajaLogica(i);
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error!");
        }
        
        
    }//GEN-LAST:event_jBdeleteActionPerformed

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        try {
            int i = Integer.parseInt(jTid.getText());
            Materia m = md.buscarMateria(i);
            
            if(m != null){
                String nombre = m.getNombre_materia();
                String cuatrimestre = m.getCuatrimestre();
                jTnombre.setText(nombre);
                jTcuatrimestre.setText(cuatrimestre);
                jRestado.setSelected(m.isEstado());
                        
            }
               
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error!");
        }
    }//GEN-LAST:event_JBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton jBdelete;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBnew;
    private javax.swing.JButton jBsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcuatrimestre;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
