/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.controlador.ControladorAlumno;
import ec.edu.controlador.ControladorCurso;
import ec.edu.controlador.ControladorDocente;
import ec.edu.controlador.ControladorRector;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    public static String rutaRectores= "C:/Users/ariel/Documents/ProgramasConArchivos/Examen1(ProgramacionAplicada)/rectores.dat";
    public static String rutaDocentes = "C:/Users/ariel/Documents/ProgramasConArchivos/Examen1(ProgramacionAplicada)/docentes.dat";
    public static String rutaAlumnos = "C:/Users/ariel/Documents/ProgramasConArchivos/Examen1(ProgramacionAplicada)/alumnos.dat";
    public static String rutaCursos = "C:/Users/ariel/Documents/ProgramasConArchivos/Examen1(ProgramacionAplicada)/cursos.dat";
    
    private ControladorRector controladorRector;
    private ControladorDocente controladorDocente;
    private ControladorCurso controladorCurso;
    private ControladorAlumno controladorAlumno;

    private VentanaLogeo ventanaLogeo;
    private VentanaRegistroRector ventanaRegistroRector;
    private VentanaRectroresRegistrados ventanaRectroresRegistrados;
    
    public VentanaPrincipal() {
        initComponents();
        
        controladorRector = new ControladorRector();
        controladorDocente = new ControladorDocente();
        controladorAlumno = new ControladorAlumno();
        controladorCurso = new ControladorCurso();
        
        ventanaLogeo = new VentanaLogeo(controladorDocente, controladorRector, controladorAlumno, controladorCurso);
        ventanaRegistroRector = new VentanaRegistroRector(controladorRector);
        ventanaRectroresRegistrados = new VentanaRectroresRegistrados(controladorRector);
        
        try {
            controladorRector.cargarDatos(rutaRectores);
            controladorDocente.cargarDatos(rutaDocentes);
            controladorCurso.cargarDatos(rutaCursos);
            controladorAlumno.cargarDatos(rutaAlumnos);
        }catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jButtonIniciarSecion = new javax.swing.JButton();
        jButtonRegistrarRector = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonRectoresRegistrados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setText("Administracion escolar");

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salon-de-clases.png"))); // NOI18N

        jButtonIniciarSecion.setBackground(new java.awt.Color(153, 204, 0));
        jButtonIniciarSecion.setText("Iniciar Secion");
        jButtonIniciarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSecionActionPerformed(evt);
            }
        });

        jButtonRegistrarRector.setBackground(new java.awt.Color(95, 153, 178));
        jButtonRegistrarRector.setText("Registrar nuevo Rector");
        jButtonRegistrarRector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarRectorActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(200, 41, 44));
        jButtonSalir.setText("Salir");

        jButtonRectoresRegistrados.setBackground(new java.awt.Color(0, 153, 204));
        jButtonRectoresRegistrados.setText("Rectores Registrados");
        jButtonRectoresRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRectoresRegistradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIniciarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarRector, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRectoresRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImagen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonIniciarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRegistrarRector, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRectoresRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void jButtonIniciarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSecionActionPerformed
        // TODO add your handling code here:
        ventanaLogeo.setVisible(true);
        ventanaLogeo.limpiar();
    }//GEN-LAST:event_jButtonIniciarSecionActionPerformed

    private void jButtonRegistrarRectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarRectorActionPerformed
        // TODO add your handling code here:
        ventanaRegistroRector.setVisible(true);
        ventanaRegistroRector.limpiar();
    }//GEN-LAST:event_jButtonRegistrarRectorActionPerformed

    private void jButtonRectoresRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRectoresRegistradosActionPerformed
        // TODO add your handling code here:
        ventanaRectroresRegistrados.setVisible(true);
        ventanaRectroresRegistrados.limpiar();
        ventanaRectroresRegistrados.cargarDatosTabla(controladorRector.getListado());
    }//GEN-LAST:event_jButtonRectoresRegistradosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            controladorRector.guardarDatos(rutaRectores);
            controladorDocente.guardarDatos(rutaDocentes);
            controladorCurso.guardarDatos(rutaCursos);
            controladorAlumno.guardarDatos(rutaAlumnos);
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSecion;
    private javax.swing.JButton jButtonRectoresRegistrados;
    private javax.swing.JButton jButtonRegistrarRector;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
