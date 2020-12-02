/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorAlumno;
import ec.edu.controlador.ControladorCurso;
import ec.edu.ups.modelo.Alumno;
import ec.edu.ups.modelo.Curso;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VentanaRegistrarAlumno extends javax.swing.JInternalFrame {

    private ControladorAlumno controladorAlumno;
    private ControladorCurso controladorCurso;

    public VentanaRegistrarAlumno(ControladorAlumno controladorAlumno, ControladorCurso controladorCurso) {
        initComponents();
        this.controladorAlumno = controladorAlumno;
        this.controladorCurso = controladorCurso;
    }

    public void limpiar() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldCedula.setText("");
        jTextFieldEdad.setText("");
    }

    public void llenarComboBox(List<Curso> cursos) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(cursos.toArray());
        jComboBoxCurso.setModel(modelo);
        jComboBoxCurso.addItem("No asignar Curso");
        jComboBoxCurso.setSelectedIndex(cursos.size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelUsuario1 = new javax.swing.JLabel();
        jLabelUsuario2 = new javax.swing.JLabel();
        jLabelUsuario3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabelUsuario4 = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jSpinnerGenero = new javax.swing.JSpinner();
        jButtonGuardar = new javax.swing.JButton();
        jLabelUsuario5 = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabelUsuario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario.setText("Nombre:");

        jLabelUsuario1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario1.setText("Apellido:");

        jLabelUsuario2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario2.setText("Edad:");

        jLabelUsuario3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario3.setText("Genero:");

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelUsuario4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario4.setText("Cedula:");

        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSpinnerGenero.setModel(new javax.swing.SpinnerListModel(new String[] {"Masculino", "Femenino"}));

        jButtonGuardar.setBackground(new java.awt.Color(108, 174, 74));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelUsuario5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario5.setText("Asignar al Curso ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario1)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelUsuario2)
                            .addComponent(jLabelUsuario3)
                            .addComponent(jLabelUsuario4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerGenero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelUsuario5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario1)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario2)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario3)
                    .addComponent(jSpinnerGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario4)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario5)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:

        var nombre = jTextFieldNombre.getText();
        var apellido = jTextFieldApellido.getText();
        var edad = jTextFieldEdad.getText();
        var genero = jSpinnerGenero.getValue().toString();
        var cedula = jTextFieldCedula.getText();

        if (nombre.equals("") || apellido.equals("") || edad.equals("") || genero.equals("") || cedula.equals("")) {
            JOptionPane.showMessageDialog(this, "Por Favor rellene todos los campos");
        } else {
            if (edad.matches("^[0-9 ]+$")) {

                Alumno alumno = new Alumno(controladorAlumno.generarId(), nombre, apellido, Integer.valueOf(edad), genero, cedula);

                if (jComboBoxCurso.getSelectedItem() instanceof Curso) {
                    Curso cursoEscogido = controladorCurso.buscar((Curso) jComboBoxCurso.getSelectedItem());

                    cursoEscogido.agregarAlumno(alumno);
                    controladorCurso.actualizar(cursoEscogido);

                    limpiar();
                }
                controladorAlumno.crear(alumno);
                JOptionPane.showMessageDialog(this, "Alumno agregado con exito");

            } else {
                JOptionPane.showMessageDialog(this, "Por Favor ingrese datos numericos en el campo edad");
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxCurso;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JLabel jLabelUsuario2;
    private javax.swing.JLabel jLabelUsuario3;
    private javax.swing.JLabel jLabelUsuario4;
    private javax.swing.JLabel jLabelUsuario5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerGenero;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
