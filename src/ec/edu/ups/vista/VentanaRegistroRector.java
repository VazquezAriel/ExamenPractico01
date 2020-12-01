/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorRector;
import ec.edu.ups.modelo.Rector;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VentanaRegistroRector extends javax.swing.JFrame {

    ControladorRector controladorRector;
    
    public VentanaRegistroRector(ControladorRector controladorRector) {
        initComponents();
        
        this.controladorRector = controladorRector;
    }

    public void limpiar() {
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldEdad.setText("");
        jTextFieldCedula.setText("");
        jTextFieldUsuario.setText("");
        jTextFieldContraseña.setText("");
        jTextFieldInstitucion.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jLabelUsuario5 = new javax.swing.JLabel();
        jLabelUsuario6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelUsuario7 = new javax.swing.JLabel();
        jTextFieldInstitucion = new javax.swing.JTextField();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setText("Nuevo Rector");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/director-de-escuela (1).png"))); // NOI18N

        jLabelUsuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario.setText("Nombre:");

        jLabelUsuario1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario1.setText("Apellido:");

        jLabelUsuario2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario2.setText("Edad:");

        jLabelUsuario3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario3.setText("Genero:");

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelUsuario4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario4.setText("Cedula:");

        jTextFieldCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSpinnerGenero.setModel(new javax.swing.SpinnerListModel(new String[] {"Masculino", "Femenino"}));

        jLabelUsuario5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario5.setText("Usuario:");

        jLabelUsuario6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario6.setText("Contraseña:");

        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonGuardar.setBackground(new java.awt.Color(108, 174, 74));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(204, 51, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelUsuario7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabelUsuario7.setText("Institucion:");

        jTextFieldInstitucion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelUsuario7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldInstitucion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsuario1)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelUsuario2)
                            .addComponent(jLabelUsuario3)
                            .addComponent(jLabelUsuario4)
                            .addComponent(jLabelUsuario5)
                            .addComponent(jLabelUsuario6)
                            .addComponent(jButtonCancelar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldApellido)
                                    .addComponent(jTextFieldNombre)
                                    .addComponent(jTextFieldEdad)
                                    .addComponent(jTextFieldCedula)
                                    .addComponent(jSpinnerGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonGuardar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario3)
                    .addComponent(jSpinnerGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario4)
                    .addComponent(jTextFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario7)
                    .addComponent(jTextFieldInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario5)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario6)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonGuardar))
                .addGap(20, 20, 20))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        
        var nombre = jTextFieldNombre.getText();
        var apellido = jTextFieldApellido.getText();
        var edad = jTextFieldEdad.getText();
        var genero = jSpinnerGenero.getValue().toString();
        var cedula = jTextFieldCedula.getText();
        var usuario = jTextFieldUsuario.getText();
        var contraseña = jTextFieldContraseña.getText();
        var institucion = jTextFieldInstitucion.getText();
        
        if (nombre.equals("") || apellido.equals("") || edad.equals("") || genero.equals("") || cedula.equals("") || usuario.equals("") || contraseña.equals("") || institucion.equals("")) {
            JOptionPane.showMessageDialog(this, "Por Favor rellene todos los campos");
        } else {
            if (edad.matches("^[0-9 ]+$")) {
                if (controladorRector.crear(new Rector(usuario, contraseña, institucion, controladorRector.generarId(), nombre, apellido, Integer.valueOf(edad), genero, cedula))) {
                    JOptionPane.showMessageDialog(this, "Rector agregado con exito");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Ha ocurrido un error porfavor vuelva a intentarlo");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por Favor ingrese datos numericos en el campo edad");
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JLabel jLabelUsuario2;
    private javax.swing.JLabel jLabelUsuario3;
    private javax.swing.JLabel jLabelUsuario4;
    private javax.swing.JLabel jLabelUsuario5;
    private javax.swing.JLabel jLabelUsuario6;
    private javax.swing.JLabel jLabelUsuario7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerGenero;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldInstitucion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
