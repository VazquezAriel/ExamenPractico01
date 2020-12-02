/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorCurso;
import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Docente;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VentanaRegistroCurso extends javax.swing.JInternalFrame {

    private ControladorCurso controladorCurso;

    public VentanaRegistroCurso(ControladorCurso controladorCurso) {
        initComponents();
        this.controladorCurso = controladorCurso;
    }

    public void limpiar() {
        jTextFieldID.setText(String.valueOf(controladorCurso.generarId()));
        jTextFieldNombre.setText("");
    }

    public void llenarComboBox(List<Docente> docentes) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(docentes.toArray());
        jComboBoxDocente.setModel(modelo);
        jComboBoxDocente.addItem("No asignar Docente");
        jComboBoxDocente.setSelectedIndex(docentes.size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelUsuario1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jComboBoxDocente = new javax.swing.JComboBox<>();
        jLabelUsuario2 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabelUsuario.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario.setText("Nombre:");

        jButtonGuardar.setBackground(new java.awt.Color(108, 174, 74));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelUsuario1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario1.setText("ID:");

        jTextFieldID.setEditable(false);
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelUsuario2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelUsuario2.setText("Docente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelUsuario1)
                    .addComponent(jLabelUsuario2))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario1)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario2))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
        if (!jTextFieldNombre.getText().equals("")) {
            if (jComboBoxDocente.getSelectedItem() instanceof Docente) {
                if (controladorCurso.crear(new Curso(controladorCurso.generarId(), jTextFieldNombre.getText(), (Docente) jComboBoxDocente.getSelectedItem()))) {
                    JOptionPane.showMessageDialog(this, "Curso agregado con exito");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Ha ocurrido un error porfavor vuelva a intentarlo");
                }
            } else {
                if (controladorCurso.crear(new Curso(controladorCurso.generarId(), jTextFieldNombre.getText()))) {
                    JOptionPane.showMessageDialog(this, "Curso agregado con exito");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Ha ocurrido un error porfavor vuelva a intentarlo");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxDocente;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JLabel jLabelUsuario2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
