/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorRector;
import ec.edu.ups.modelo.Rector;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaRectroresRegistrados extends javax.swing.JFrame {

    private ControladorRector controladorRector;
    
    public VentanaRectroresRegistrados(ControladorRector controladorRector) {
        initComponents();
        
        this.controladorRector = controladorRector;
    }
    
    public void limpiar() {
        jTextFieldBusqueda.setText("");
    }
    
    public void cargarDatosTabla(List<Rector> rectores) {
        DefaultTableModel modelo = (DefaultTableModel) jTableRectores.getModel();
        modelo.setRowCount(0);
        
        for (Rector r : rectores) {
            Object[] rowData = {r.getId(), r.getNombre(), r.getApellido(), r.getCedula(), r.getInstitucion()};
            modelo.addRow(rowData);
        }
        jTableRectores.setModel(modelo);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonMostrarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRectores = new javax.swing.JTable();
        jComboBoxBusqueda = new javax.swing.JComboBox<>();

        jPanelBuscar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        jLabel1.setText("Rectores Registrados");

        jTextFieldBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonMostrarTodos.setText("Mostrar todos");
        jButtonMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTodosActionPerformed(evt);
            }
        });

        jTableRectores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Cedula", "Institucion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableRectores);
        if (jTableRectores.getColumnModel().getColumnCount() > 0) {
            jTableRectores.getColumnModel().getColumn(0).setResizable(false);
            jTableRectores.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableRectores.getColumnModel().getColumn(1).setResizable(false);
            jTableRectores.getColumnModel().getColumn(2).setResizable(false);
            jTableRectores.getColumnModel().getColumn(3).setResizable(false);
            jTableRectores.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTableRectores.getColumnModel().getColumn(4).setResizable(false);
        }

        jComboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "Apellido", "Cedula", "Institucion" }));

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                                .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMostrarTodos))))
                    .addGroup(jPanelBuscarLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonMostrarTodos)
                    .addComponent(jComboBoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
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
                    cargarDatosTabla(controladorRector.buscarPorId(Integer.valueOf(busqueda)));
                } else {
                    JOptionPane.showMessageDialog(this, "Porfavor ingrese un valor numerico");
                }
            } else if(parametroBusqueda.equals("Nombre")) {
                cargarDatosTabla(controladorRector.buscarPorNombre(busqueda));
            } else if (parametroBusqueda.equals("Apellido")) {
                cargarDatosTabla(controladorRector.buscarPorApellido(busqueda));
            } else if (parametroBusqueda.equals("Cedula")) {
                cargarDatosTabla(controladorRector.buscarPorCedula(busqueda));
            } else {
                cargarDatosTabla(controladorRector.buscarPorInstitucion(busqueda));
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodosActionPerformed
        // TODO add your handling code here:
        cargarDatosTabla(controladorRector.getListado());
    }//GEN-LAST:event_jButtonMostrarTodosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonMostrarTodos;
    private javax.swing.JComboBox<String> jComboBoxBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRectores;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
