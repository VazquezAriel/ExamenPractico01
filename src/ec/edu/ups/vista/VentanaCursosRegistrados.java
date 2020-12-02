/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorCurso;
import ec.edu.controlador.ControladorDocente;
import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Docente;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaCursosRegistrados extends javax.swing.JInternalFrame {

    private ControladorCurso controladorCurso;
    private ControladorDocente controladorDocente;

    public VentanaCursosRegistrados(ControladorCurso controladorCurso, ControladorDocente controladorDocente) {
        initComponents();

        this.controladorCurso = controladorCurso;
        this.controladorDocente = controladorDocente;
    }

    public void limpiar() {
        jTextFieldBusqueda.setText("");
        jTextFieldNombre.setText("");
    }

    public void cargarDatosTabla(List<Curso> cursos) {
        DefaultTableModel modelo = (DefaultTableModel) jTableCursos.getModel();
        modelo.setRowCount(0);

        for (Curso c : cursos) {
            Object[] rowData = {c.getId(), c.getNombre(), c.getDocente()};
            modelo.addRow(rowData);
        }
        jTableCursos.setModel(modelo);
    }

    public void llenarComboBox(List<Docente> docentes) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(docentes.toArray());
        jComboBoxDocente.setModel(modelo);
    }
    
    public Curso getCursoSeleccionado() {
        return  controladorCurso.buscar(new Curso(Integer.valueOf(jTableCursos.getValueAt(jTableCursos.getSelectedRow(), 0).toString())));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCursos = new javax.swing.JTable();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jComboBoxBusqueda = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabelNombre1 = new javax.swing.JLabel();
        jComboBoxDocente = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabelNombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTableCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Docente Asignado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCursos);
        if (jTableCursos.getColumnModel().getColumnCount() > 0) {
            jTableCursos.getColumnModel().getColumn(0).setMinWidth(30);
            jTableCursos.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableCursos.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableCursos.getColumnModel().getColumn(1).setResizable(false);
            jTableCursos.getColumnModel().getColumn(2).setResizable(false);
        }

        jTextFieldBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jComboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar Todo", "Nombre", "ID" }));

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
        jLabelNombre1.setText("Docente Asignado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonGuardar)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNombre1)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBoxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre1)
                    .addComponent(jComboBoxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:

        var busqueda = jTextFieldBusqueda.getText();
        if (busqueda.equals("")) {
            JOptionPane.showMessageDialog(this, "Porfavor ingrese rellene el cuadro de busqueda");
        } else {
            var parametroBusqueda = jComboBoxBusqueda.getSelectedItem().toString();
            if (parametroBusqueda.equals("ID")) {
                if (busqueda.matches("^[0-9 ]+$")) {
                    cargarDatosTabla(controladorCurso.buscarPorId(Integer.valueOf(busqueda)));
                } else {
                    JOptionPane.showMessageDialog(this, "Porfavor ingrese un valor numerico");
                }
            } else if (parametroBusqueda.equals("Nombre")) {
                cargarDatosTabla(controladorCurso.buscarPorNombre(busqueda));
            } else if (parametroBusqueda.equals("Mostrar Todo")){
                cargarDatosTabla(controladorCurso.getListado());
            }
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTableCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCursosMouseClicked
        // TODO add your handling code here:
        jTextFieldNombre.setText(getCursoSeleccionado().getNombre());
        jComboBoxDocente.setSelectedItem(getCursoSeleccionado().getDocente());
    }//GEN-LAST:event_jTableCursosMouseClicked

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        if (controladorCurso.actualizar(new Curso(getCursoSeleccionado().getId(), jTextFieldNombre.getText(), (Docente)jComboBoxDocente.getSelectedItem()))) {
            JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");
            cargarDatosTabla(controladorCurso.getListado());
        } else {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error porfavor vuelva a intentarlo");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxBusqueda;
    private javax.swing.JComboBox<String> jComboBoxDocente;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCursos;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
