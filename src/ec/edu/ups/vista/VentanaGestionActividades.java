/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorDocente;
import ec.edu.ups.modelo.Actividad;
import ec.edu.ups.modelo.Curso;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaGestionActividades extends javax.swing.JInternalFrame {

    private ControladorDocente controladorDocente;

    public VentanaGestionActividades(ControladorDocente controladorDocente) {
        initComponents();
        this.controladorDocente = controladorDocente;
    }

    public void cargarDatosTabla(List<Actividad> actividades) {
        DefaultTableModel modelo = (DefaultTableModel) jTableActividades.getModel();
        modelo.setRowCount(0);

        for (Actividad a : actividades) {
            Object[] rowData = {a.getNombre()};
            modelo.addRow(rowData);
        }
        jTableActividades.setModel(modelo);
    }

    public Actividad getActividadSeleccionada() {
        return controladorDocente.getDocenteLogeado().buscarActividad((String) jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 0));
    }

    public Actividad getCursoSeleccionado() {
        return controladorDocente.getDocenteLogeado().buscarActividad((String) jTableActividades.getValueAt(jTableActividades.getSelectedRow(), 0));
    }
    
    public void limpiar() {
        jTextArea1.setText("");
        jTextFieldNombre.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabelNombre1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableActividades = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabelNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextFieldBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar Cambios");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabelNombre1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelNombre1.setText("Descripcion:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTableActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de la Actividad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableActividadesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableActividades);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNombre))
                    .addComponent(jLabelNombre1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardar)))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNombre1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:

        var busqueda = jTextFieldBusqueda.getText();
        if (busqueda.equals("")) {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese rellene el cuadro de busqueda");
        } else {
            Actividad actividadEncontrada = controladorDocente.getDocenteLogeado().buscarActividad(jTextFieldBusqueda.getText());
            DefaultTableModel modelo = (DefaultTableModel) jTableActividades.getModel();
            modelo.setRowCount(0);
            Object[] rowData = {actividadEncontrada.getNombre()};
            modelo.addRow(rowData);
            jTableActividades.setModel(modelo);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        if (controladorDocente.getDocenteLogeado().actualizarActividad(getActividadSeleccionada(), jTextFieldNombre.getText(), jTextArea1.getText())) {
            
            JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");
            cargarDatosTabla(controladorDocente.getDocenteLogeado().getActividades());
        } else {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error porfavor vuelva a intentarlo");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTableActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableActividadesMouseClicked
        // TODO add your handling code here:
        jTextFieldNombre.setText(getActividadSeleccionada().getNombre());
        jTextArea1.setText(getActividadSeleccionada().getDescripcion());
    }//GEN-LAST:event_jTableActividadesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableActividades;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
