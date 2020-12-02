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
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author ariel
 */
public class VentanaGeneral extends javax.swing.JFrame {
    
    private ControladorRector controladorRector;
    private ControladorDocente controladorDocente;
    private ControladorAlumno controladorAlumno;
    private ControladorCurso controladorCurso;
    
    private VentanaGestionDocentes ventanaGestionDocentes;
    private VentanaRegistroDocente ventanaRegistroDocente;
    private VentanaRegistroCurso ventanaRegistroCurso;
    private VentanaCursosRegistrados ventanaCursosRegistrados;
    private VentanaRegistrarActividad ventanaRegistrarActividad;
    private VentanaRegistrarAlumno ventanaRegistrarAlumno;
    private VentanaGestionAlumnos ventanaGestionAlumnos;
    private VentanaGestionActividades ventanaGestionActividades;
    private VentanaMisCursos ventanaMisCursos;

    public VentanaGeneral(ControladorRector controladorRector, ControladorDocente controladorDocente, ControladorAlumno controladorAlumno, ControladorCurso controladorCurso) {
        initComponents();
        
        this.controladorRector = controladorRector;
        this.controladorDocente = controladorDocente;
        this.controladorAlumno = controladorAlumno;
        this.controladorCurso = controladorCurso;
        
        ventanaGestionDocentes = new VentanaGestionDocentes(controladorDocente);
        ventanaRegistroDocente = new VentanaRegistroDocente(controladorDocente);
        ventanaRegistroCurso = new VentanaRegistroCurso(controladorCurso);
        ventanaCursosRegistrados = new VentanaCursosRegistrados(controladorCurso, controladorDocente);
        ventanaRegistrarActividad = new VentanaRegistrarActividad(controladorCurso, controladorDocente);
        ventanaRegistrarAlumno = new VentanaRegistrarAlumno(controladorAlumno,controladorCurso);
        ventanaGestionAlumnos = new VentanaGestionAlumnos(controladorAlumno);
        ventanaGestionActividades = new VentanaGestionActividades(controladorDocente);
        ventanaMisCursos = new VentanaMisCursos(controladorAlumno, controladorCurso,controladorDocente);
        
    }

    public JMenuItem getJMenuItemActualizarDatos() {
        return JMenuItemActualizarDatos;
    }

    public void setJMenuItemActualizarDatos(JMenuItem JMenuItemActualizarDatos) {
        this.JMenuItemActualizarDatos = JMenuItemActualizarDatos;
    }

    public JMenu getjMenuGestionActividades() {
        return jMenuGestionActividades;
    }

    public JMenu getjMenuGestionAlumnos() {
        return jMenuGestionAlumnos;
    }

    public JMenu getjMenuGestionClases() {
        return jMenuGestionClases;
    }

    public JMenu getjMenuGestionDocentes() {
        return jMenuGestionDocentes;
    }

    public JMenuItem getjMenuItemMisCursos() {
        return jMenuItemMisCursos;
    }

    public JMenuItem getjMenuItemAdministrarCursos() {
        return jMenuItemAdministrarCursos;
    }

    public JMenuItem getjMenuItemAgregarCurso() {
        return jMenuItemAgregarCurso;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneEscritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        JMenuInicio = new javax.swing.JMenu();
        jMenuGestionDocentes = new javax.swing.JMenu();
        jMenuItemAgregarDocente = new javax.swing.JMenuItem();
        jMenuItemDocentesRegistrados = new javax.swing.JMenuItem();
        jMenuGestionClases = new javax.swing.JMenu();
        jMenuItemAgregarCurso = new javax.swing.JMenuItem();
        jMenuItemAdministrarCursos = new javax.swing.JMenuItem();
        jMenuItemMisCursos = new javax.swing.JMenuItem();
        jMenuGestionAlumnos = new javax.swing.JMenu();
        jMenuItemAgregarAlumno = new javax.swing.JMenuItem();
        jMenuItemAdministrarAlumnos = new javax.swing.JMenuItem();
        jMenuGestionActividades = new javax.swing.JMenu();
        jMenuItemAgregarActividad = new javax.swing.JMenuItem();
        jMenuItemAdministrarActividades = new javax.swing.JMenuItem();
        JMenuItemSalir = new javax.swing.JMenuItem();
        JMenuAjustes = new javax.swing.JMenu();
        JMenuItemCambiarColor = new javax.swing.JMenuItem();
        JMenuAdministrar = new javax.swing.JMenu();
        JMenuItemActualizarDatos = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItemEliminarCuenta = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPaneEscritorioLayout = new javax.swing.GroupLayout(jDesktopPaneEscritorio);
        jDesktopPaneEscritorio.setLayout(jDesktopPaneEscritorioLayout);
        jDesktopPaneEscritorioLayout.setHorizontalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPaneEscritorioLayout.setVerticalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        JMenuInicio.setMnemonic('f');
        JMenuInicio.setText("Inicio");

        jMenuGestionDocentes.setText("Gestionar Docentes");

        jMenuItemAgregarDocente.setText("Agregar Docente");
        jMenuItemAgregarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarDocenteActionPerformed(evt);
            }
        });
        jMenuGestionDocentes.add(jMenuItemAgregarDocente);

        jMenuItemDocentesRegistrados.setText("Administrar Docentes");
        jMenuItemDocentesRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDocentesRegistradosActionPerformed(evt);
            }
        });
        jMenuGestionDocentes.add(jMenuItemDocentesRegistrados);

        JMenuInicio.add(jMenuGestionDocentes);

        jMenuGestionClases.setText("Gestionar Cursos");

        jMenuItemAgregarCurso.setText("Agregar Curso");
        jMenuItemAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarCursoActionPerformed(evt);
            }
        });
        jMenuGestionClases.add(jMenuItemAgregarCurso);

        jMenuItemAdministrarCursos.setText("Administrar Cursos");
        jMenuItemAdministrarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministrarCursosActionPerformed(evt);
            }
        });
        jMenuGestionClases.add(jMenuItemAdministrarCursos);

        jMenuItemMisCursos.setText("Mis Cursos");
        jMenuItemMisCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMisCursosActionPerformed(evt);
            }
        });
        jMenuGestionClases.add(jMenuItemMisCursos);

        JMenuInicio.add(jMenuGestionClases);

        jMenuGestionAlumnos.setText("Gestionar Alumnos");

        jMenuItemAgregarAlumno.setText("Agregar Alumno");
        jMenuItemAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarAlumnoActionPerformed(evt);
            }
        });
        jMenuGestionAlumnos.add(jMenuItemAgregarAlumno);

        jMenuItemAdministrarAlumnos.setText("Administrar Alumnos");
        jMenuItemAdministrarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministrarAlumnosActionPerformed(evt);
            }
        });
        jMenuGestionAlumnos.add(jMenuItemAdministrarAlumnos);

        JMenuInicio.add(jMenuGestionAlumnos);

        jMenuGestionActividades.setText("Gestionar Actividades");

        jMenuItemAgregarActividad.setText("Agregar Actividad");
        jMenuItemAgregarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarActividadActionPerformed(evt);
            }
        });
        jMenuGestionActividades.add(jMenuItemAgregarActividad);

        jMenuItemAdministrarActividades.setText("Administrar Actividades");
        jMenuItemAdministrarActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministrarActividadesActionPerformed(evt);
            }
        });
        jMenuGestionActividades.add(jMenuItemAdministrarActividades);

        JMenuInicio.add(jMenuGestionActividades);

        JMenuItemSalir.setMnemonic('x');
        JMenuItemSalir.setText("Salir");
        JMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSalirActionPerformed(evt);
            }
        });
        JMenuInicio.add(JMenuItemSalir);

        menuBar.add(JMenuInicio);

        JMenuAjustes.setMnemonic('e');
        JMenuAjustes.setText("Ajustes");

        JMenuItemCambiarColor.setMnemonic('t');
        JMenuItemCambiarColor.setText("Cambiar color de Fondo");
        JMenuAjustes.add(JMenuItemCambiarColor);

        menuBar.add(JMenuAjustes);

        JMenuAdministrar.setMnemonic('h');
        JMenuAdministrar.setText("Administrar Cuenta");

        JMenuItemActualizarDatos.setMnemonic('c');
        JMenuItemActualizarDatos.setText("Actualizar Datos");
        JMenuAdministrar.add(JMenuItemActualizarDatos);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Cambiar Contraseña");
        JMenuAdministrar.add(aboutMenuItem);

        jMenuItemEliminarCuenta.setText("Eliminar mi Cuenta");
        JMenuAdministrar.add(jMenuItemEliminarCuenta);

        menuBar.add(JMenuAdministrar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JMenuItemSalirActionPerformed

    private void jMenuItemAgregarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarDocenteActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaRegistroDocente);
        ventanaRegistroDocente.limpiar();
        ventanaRegistroDocente.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarDocenteActionPerformed

    private void jMenuItemDocentesRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDocentesRegistradosActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaGestionDocentes);
        ventanaGestionDocentes.cargarDatosTabla(controladorDocente.getListado());
        ventanaGestionDocentes.setVisible(true);
    }//GEN-LAST:event_jMenuItemDocentesRegistradosActionPerformed

    private void jMenuItemAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarCursoActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaRegistroCurso);
        ventanaRegistroCurso.limpiar();
        ventanaRegistroCurso.llenarComboBox(controladorDocente.getListado());
        ventanaRegistroCurso.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarCursoActionPerformed

    private void jMenuItemAdministrarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministrarCursosActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaCursosRegistrados);
        ventanaCursosRegistrados.limpiar();
        ventanaCursosRegistrados.cargarDatosTabla(controladorCurso.getListado());
        ventanaCursosRegistrados.llenarComboBox(controladorDocente.getListado());
        ventanaCursosRegistrados.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdministrarCursosActionPerformed

    private void jMenuItemAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarAlumnoActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaRegistrarAlumno);
        ventanaRegistrarAlumno.limpiar();
        ventanaRegistrarAlumno.llenarComboBox(controladorCurso.getCursosDe(controladorDocente.getDocenteLogeado()));
        ventanaRegistrarAlumno.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarAlumnoActionPerformed

    private void jMenuItemAdministrarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministrarAlumnosActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaGestionAlumnos);
        ventanaGestionAlumnos.limpiar();
        ventanaGestionAlumnos.cargarDatosTabla(controladorAlumno.getListado());
        ventanaGestionAlumnos.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdministrarAlumnosActionPerformed

    private void jMenuItemAgregarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarActividadActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaRegistrarActividad);
        ventanaRegistrarActividad.limpiar();
        ventanaRegistrarActividad.llenarComboBox(controladorCurso.getCursosDe(controladorDocente.getDocenteLogeado()));
        ventanaRegistrarActividad.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgregarActividadActionPerformed

    private void jMenuItemAdministrarActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministrarActividadesActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaGestionActividades);
        ventanaGestionActividades.cargarDatosTabla(controladorDocente.getDocenteLogeado().getActividades());
        ventanaGestionActividades.limpiar();
        ventanaGestionActividades.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdministrarActividadesActionPerformed

    private void jMenuItemMisCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMisCursosActionPerformed
        // TODO add your handling code here:
        jDesktopPaneEscritorio.add(ventanaMisCursos);
        ventanaMisCursos.llenarComboBox(controladorCurso.getCursosDe(controladorDocente.getDocenteLogeado()));
        ventanaMisCursos.limpiar();
        ventanaMisCursos.setVisible(true);
    }//GEN-LAST:event_jMenuItemMisCursosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAdministrar;
    private javax.swing.JMenu JMenuAjustes;
    private javax.swing.JMenu JMenuInicio;
    private javax.swing.JMenuItem JMenuItemActualizarDatos;
    private javax.swing.JMenuItem JMenuItemCambiarColor;
    private javax.swing.JMenuItem JMenuItemSalir;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane jDesktopPaneEscritorio;
    private javax.swing.JMenu jMenuGestionActividades;
    private javax.swing.JMenu jMenuGestionAlumnos;
    private javax.swing.JMenu jMenuGestionClases;
    private javax.swing.JMenu jMenuGestionDocentes;
    private javax.swing.JMenuItem jMenuItemAdministrarActividades;
    private javax.swing.JMenuItem jMenuItemAdministrarAlumnos;
    private javax.swing.JMenuItem jMenuItemAdministrarCursos;
    private javax.swing.JMenuItem jMenuItemAgregarActividad;
    private javax.swing.JMenuItem jMenuItemAgregarAlumno;
    private javax.swing.JMenuItem jMenuItemAgregarCurso;
    private javax.swing.JMenuItem jMenuItemAgregarDocente;
    private javax.swing.JMenuItem jMenuItemDocentesRegistrados;
    private javax.swing.JMenuItem jMenuItemEliminarCuenta;
    private javax.swing.JMenuItem jMenuItemMisCursos;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
