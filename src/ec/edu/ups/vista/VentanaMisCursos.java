/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorAlumno;
import ec.edu.controlador.ControladorCurso;
import ec.edu.controlador.ControladorDocente;
import ec.edu.ups.modelo.Actividad;
import ec.edu.ups.modelo.Alumno;
import ec.edu.ups.modelo.Curso;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author ariel
 */
public class VentanaMisCursos extends javax.swing.JInternalFrame {

    private ControladorAlumno controladorAlumno;
    private ControladorCurso controladorCurso;
    private ControladorDocente controladorDocente;
    
    private VentanaAplicaciones ventanaAplicaciones;
    
    public VentanaMisCursos(ControladorAlumno controladorAlumno, ControladorCurso controladorCurso, ControladorDocente controladorDocente) {
        initComponents();
        
        this.controladorAlumno = controladorAlumno;
        this.controladorCurso = controladorCurso;
        this.controladorDocente = controladorDocente;
        this.ventanaAplicaciones = new VentanaAplicaciones();
    }
    
    public void llenarListaAlumnos(List<Alumno> alumnos) {
        DefaultListModel modelo = new DefaultListModel();
        alumnos.forEach(alumno -> modelo.addElement(alumno.toString()));
        jListAlumnos.setModel(modelo);
    }
    
    public void llenarListaActividades(List<Actividad> actividades) {
        DefaultListModel modelo = new DefaultListModel();
        actividades.forEach(actividad -> modelo.addElement(actividad));
        jListActividades.setModel(modelo);
    }
    
    public void llenarComboBox(List<Curso> cursos) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(cursos.toArray());
        jComboBoxCursos.setModel(modelo);
        
    }
    
    public void limpiar() {
        jListActividades.removeAll();
        jListAlumnos.removeAll();;
        jButtonObtenerAplicaciones.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxCursos = new javax.swing.JComboBox<>();
        jLabelNombre1 = new javax.swing.JLabel();
        jButtonMostratDatos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAlumnos = new javax.swing.JList<>();
        jButtonAgregarAlumno = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListActividades = new javax.swing.JList<>();
        jButtonAgregarActividad = new javax.swing.JButton();
        jButtonObtenerAplicaciones = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "  Mis Cursos  ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 18))); // NOI18N

        jLabelNombre1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelNombre1.setText("Escoja un Curso");

        jButtonMostratDatos.setText("Mostrar Datos");
        jButtonMostratDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostratDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNombre1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonMostratDatos)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMostratDatos)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "  Alumnos  ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 18))); // NOI18N

        jScrollPane1.setViewportView(jListAlumnos);

        jButtonAgregarAlumno.setText("Agregar Alumno");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAgregarAlumno)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregarAlumno)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "  Actividades  ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 18))); // NOI18N

        jListActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListActividadesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListActividades);

        jButtonAgregarActividad.setText("Agregar Actividad");

        jButtonObtenerAplicaciones.setText("Obtener Aplicaciones");
        jButtonObtenerAplicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObtenerAplicacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonObtenerAplicaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAgregarActividad)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregarActividad)
                    .addComponent(jButtonObtenerAplicaciones))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButtonMostratDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostratDatosActionPerformed
        // TODO add your handling code here:
        Curso cursoSeleccionado = (Curso) jComboBoxCursos.getSelectedItem();
        llenarListaAlumnos(cursoSeleccionado.getAlumnos());
        llenarListaActividades(cursoSeleccionado.getActividades());
    }//GEN-LAST:event_jButtonMostratDatosActionPerformed

    private void jListActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListActividadesMouseClicked
        // TODO add your handling code here:
        jButtonObtenerAplicaciones.setEnabled(true);
        
    }//GEN-LAST:event_jListActividadesMouseClicked

    private void jButtonObtenerAplicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObtenerAplicacionesActionPerformed
        // TODO add your handling code here:
        Actividad actividadSeleccionada = controladorDocente.getDocenteLogeado().buscarActividad(jListActividades.getSelectedValue());
        actividadSeleccionada.obtenerApps();
        ventanaAplicaciones.cargarDatosTabla(actividadSeleccionada);
        ventanaAplicaciones.setVisible(true);
    }//GEN-LAST:event_jButtonObtenerAplicacionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarActividad;
    private javax.swing.JButton jButtonAgregarAlumno;
    private javax.swing.JButton jButtonMostratDatos;
    private javax.swing.JButton jButtonObtenerAplicaciones;
    private javax.swing.JComboBox<String> jComboBoxCursos;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JList<String> jListActividades;
    private javax.swing.JList<String> jListAlumnos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
